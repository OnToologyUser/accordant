/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.accordant_fv.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext


import co.edu.uniandes.accordant_fv.Estimator
import java.net.URL
import org.jpmml.model.PMMLUtil
import org.dmg.pmml.DataType

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AfvlGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		// if(resource.allContents.filter(Estimator)!==null && resource.allContents.filter(Estimator).size>0){
		resource.allContents.toIterable.filter(typeof(Estimator)).forEach [
			fsa.
				generateFile('''edu/uniandes/accordant/«formatJavaPackageName(funcView.name)»/estimator/«formatJavaClassName(name)»Estimator.java''',
					estimatorToJava)
		]

	// }
	// println("deviceToKubeNode")
	// fsa.generateFile(resource.className+".java", estimatorToJava(resource.contents.head as FunctionalView))
	}

	def className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.'))
	}

	def formatJavaClassName(String exp) {
		return exp.replaceAll("-", "_").toLowerCase.toFirstUpper.replaceAll(" ", "")
	}

	def formatJavaPackageName(String exp) {
		return exp.replaceAll("-", "_").toLowerCase.replaceAll(" ", "")
	}

	def estimatorToJava(Estimator estimator) '''
		/*
		 * generated by Accordant
		 */
		
		package edu.uniandes.accordant.«formatJavaPackageName(estimator.funcView.name)».estimator;
		
		import java.io.InputStream;
		import java.net.URL;
		import java.util.ArrayList;
		import java.util.List;
		
		import org.apache.spark.SparkConf;
		import org.apache.spark.api.java.JavaSparkContext;
		import org.apache.spark.ml.Transformer;
		import org.apache.spark.sql.Dataset;
		import org.apache.spark.sql.Row;
		import org.apache.spark.sql.SparkSession;
		import org.apache.spark.sql.types.DataTypes;
		import org.apache.spark.sql.types.StructField;
		import org.apache.spark.sql.types.StructType;
		import org.jpmml.evaluator.Evaluator;
		import org.jpmml.evaluator.EvaluatorBuilder;
		import org.jpmml.evaluator.LoadingModelEvaluatorBuilder;
		import org.jpmml.evaluator.spark.TransformerBuilder;
		
		public class «formatJavaClassName(estimator.name)»Estimator {
		
			public static void main(String[] args) throws Exception {
		
				//TODO add master params code from dv
				SparkConf conf = new SparkConf().setAppName("«formatJavaClassName(estimator.name)»Estimator")
								.setMaster("local[*]");
				
				JavaSparkContext sc = new JavaSparkContext(conf);
				SparkSession sparkSession = new SparkSession(sc.sc());
				InputStream pmmlFile = new URL("«estimator.pmml»")
								.openStream();
				EvaluatorBuilder evaluatorBuilder = new LoadingModelEvaluatorBuilder().load(pmmlFile);
				
				Evaluator evaluator = evaluatorBuilder.build();
				evaluator.verify();
				TransformerBuilder pmmlTransformerBuilder = new TransformerBuilder(evaluator)
								.withTargetCols().exploded(true);
				List<StructField> fields = new ArrayList<StructField>();
				«structField(estimator.pmml)»
				StructType schema = DataTypes.createStructType(fields);
				Transformer pmmlTransformer = pmmlTransformerBuilder.build();
				
				//TODO add input connector code
				Dataset<Row> inputDs = sparkSession.read().schema(schema).csv("src/main/resources/nmac_JFK2_predictors.csv");
				
				Dataset<Row> resultDs = pmmlTransformer.transform(inputDs);
				
				//TODO add output connector code
				resultDs.coalesce(1).write().option("header", "true").mode("overwrite")
												.csv("out/«formatJavaClassName(estimator.name)».csv");
												
				sparkSession.close();
				sc.close();
			}
		}		
	'''

	def structField(String pmml) {
		var struct = "";
		val input = new URL(pmml).openStream();
		val model = PMMLUtil.unmarshal(input);
		if (model !== null) {
			val datad = model.dataDictionary
			for (field : datad.dataFields) {
				struct +=
					"\nfields.add(DataTypes.createStructField(\"" + field.name + "\", DataTypes." +
						parseDTypes(field.dataType) + ", true));"
			}
		}
		return struct;
	}

	def parseDTypes(DataType datatype) {
		switch datatype.name {
      		case "FLOAT": return "FloatType"
			case "INTEGER": return"IntegerType"
			case "DOUBLE": return"DoubleType"
			case "BOOLEAN":return "BooleanType"
			default: return "StringType"
		}
	}
}

