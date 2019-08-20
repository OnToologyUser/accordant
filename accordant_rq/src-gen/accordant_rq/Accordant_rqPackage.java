/**
 */
package accordant_rq;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see accordant_rq.Accordant_rqFactory
 * @model kind="package"
 * @generated
 */
public interface Accordant_rqPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "accordant_rq";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uniandes.accordant.requirement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "accordant_rq";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Accordant_rqPackage eINSTANCE = accordant_rq.impl.Accordant_rqPackageImpl.init();

	/**
	 * The meta object id for the '{@link accordant_rq.impl.InputPackageImpl <em>Input Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accordant_rq.impl.InputPackageImpl
	 * @see accordant_rq.impl.Accordant_rqPackageImpl#getInputPackage()
	 * @generated
	 */
	int INPUT_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PACKAGE__SCENARIOS = 1;

	/**
	 * The number of structural features of the '<em>Input Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PACKAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link accordant_rq.impl.QScenarioImpl <em>QScenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accordant_rq.impl.QScenarioImpl
	 * @see accordant_rq.impl.Accordant_rqPackageImpl#getQScenario()
	 * @generated
	 */
	int QSCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO__MEASURE = 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO__MIN_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO__MAX_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO__UNIT = 3;

	/**
	 * The feature id for the '<em><b>QAttribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO__QATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Analyzed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO__ANALYZED = 5;

	/**
	 * The feature id for the '<em><b>Stimulus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO__STIMULUS = 6;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO__ENVIRONMENT = 7;

	/**
	 * The number of structural features of the '<em>QScenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>QScenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link accordant_rq.impl.SensitivityPointImpl <em>Sensitivity Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accordant_rq.impl.SensitivityPointImpl
	 * @see accordant_rq.impl.Accordant_rqPackageImpl#getSensitivityPoint()
	 * @generated
	 */
	int SENSITIVITY_POINT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_POINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_POINT__RATIONALE = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_POINT__CODE = 2;

	/**
	 * The feature id for the '<em><b>Tactic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_POINT__TACTIC = 3;

	/**
	 * The feature id for the '<em><b>Is Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_POINT__IS_RISK = 4;

	/**
	 * The number of structural features of the '<em>Sensitivity Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_POINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sensitivity Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link accordant_rq.impl.TacticImpl <em>Tactic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accordant_rq.impl.TacticImpl
	 * @see accordant_rq.impl.Accordant_rqPackageImpl#getTactic()
	 * @generated
	 */
	int TACTIC = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>QAttribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__QATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Subtactics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__SUBTACTICS = 2;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__RATIONALE = 3;

	/**
	 * The feature id for the '<em><b>Stimulus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__STIMULUS = 4;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__RESPONSE = 5;

	/**
	 * The feature id for the '<em><b>Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__VIEWPOINT = 6;

	/**
	 * The feature id for the '<em><b>Spoint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__SPOINT = 7;

	/**
	 * The number of structural features of the '<em>Tactic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Tactic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link accordant_rq.impl.AnalyzedQSImpl <em>Analyzed QS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accordant_rq.impl.AnalyzedQSImpl
	 * @see accordant_rq.impl.Accordant_rqPackageImpl#getAnalyzedQS()
	 * @generated
	 */
	int ANALYZED_QS = 4;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_QS__POINTS = 0;

	/**
	 * The feature id for the '<em><b>Qs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_QS__QS = 1;

	/**
	 * The feature id for the '<em><b>Reasoning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_QS__REASONING = 2;

	/**
	 * The number of structural features of the '<em>Analyzed QS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_QS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Analyzed QS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_QS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link accordant_rq.QAMetric <em>QA Metric</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accordant_rq.QAMetric
	 * @see accordant_rq.impl.Accordant_rqPackageImpl#getQAMetric()
	 * @generated
	 */
	int QA_METRIC = 5;

	/**
	 * The meta object id for the '{@link accordant_rq.MetricUnit <em>Metric Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accordant_rq.MetricUnit
	 * @see accordant_rq.impl.Accordant_rqPackageImpl#getMetricUnit()
	 * @generated
	 */
	int METRIC_UNIT = 6;

	/**
	 * The meta object id for the '{@link accordant_rq.QAttribute <em>QAttribute</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see accordant_rq.QAttribute
	 * @see accordant_rq.impl.Accordant_rqPackageImpl#getQAttribute()
	 * @generated
	 */
	int QATTRIBUTE = 7;

	/**
	 * Returns the meta object for class '{@link accordant_rq.InputPackage <em>Input Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Package</em>'.
	 * @see accordant_rq.InputPackage
	 * @generated
	 */
	EClass getInputPackage();

	/**
	 * Returns the meta object for the attribute '{@link accordant_rq.InputPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see accordant_rq.InputPackage#getName()
	 * @see #getInputPackage()
	 * @generated
	 */
	EAttribute getInputPackage_Name();

	/**
	 * Returns the meta object for the containment reference '{@link accordant_rq.InputPackage#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scenarios</em>'.
	 * @see accordant_rq.InputPackage#getScenarios()
	 * @see #getInputPackage()
	 * @generated
	 */
	EReference getInputPackage_Scenarios();

	/**
	 * Returns the meta object for class '{@link accordant_rq.QScenario <em>QScenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QScenario</em>'.
	 * @see accordant_rq.QScenario
	 * @generated
	 */
	EClass getQScenario();

	/**
	 * Returns the meta object for the attribute '{@link accordant_rq.QScenario#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure</em>'.
	 * @see accordant_rq.QScenario#getMeasure()
	 * @see #getQScenario()
	 * @generated
	 */
	EAttribute getQScenario_Measure();

	/**
	 * Returns the meta object for the attribute '{@link accordant_rq.QScenario#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see accordant_rq.QScenario#getMinValue()
	 * @see #getQScenario()
	 * @generated
	 */
	EAttribute getQScenario_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link accordant_rq.QScenario#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see accordant_rq.QScenario#getMaxValue()
	 * @see #getQScenario()
	 * @generated
	 */
	EAttribute getQScenario_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link accordant_rq.QScenario#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see accordant_rq.QScenario#getUnit()
	 * @see #getQScenario()
	 * @generated
	 */
	EAttribute getQScenario_Unit();

	/**
	 * Returns the meta object for the attribute '{@link accordant_rq.QScenario#getQAttribute <em>QAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QAttribute</em>'.
	 * @see accordant_rq.QScenario#getQAttribute()
	 * @see #getQScenario()
	 * @generated
	 */
	EAttribute getQScenario_QAttribute();

	/**
	 * Returns the meta object for the reference '{@link accordant_rq.QScenario#getAnalyzed <em>Analyzed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analyzed</em>'.
	 * @see accordant_rq.QScenario#getAnalyzed()
	 * @see #getQScenario()
	 * @generated
	 */
	EReference getQScenario_Analyzed();

	/**
	 * Returns the meta object for the attribute '{@link accordant_rq.QScenario#getStimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus</em>'.
	 * @see accordant_rq.QScenario#getStimulus()
	 * @see #getQScenario()
	 * @generated
	 */
	EAttribute getQScenario_Stimulus();

	/**
	 * Returns the meta object for the attribute '{@link accordant_rq.QScenario#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see accordant_rq.QScenario#getEnvironment()
	 * @see #getQScenario()
	 * @generated
	 */
	EAttribute getQScenario_Environment();

	/**
	 * Returns the meta object for class '{@link accordant_rq.SensitivityPoint <em>Sensitivity Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensitivity Point</em>'.
	 * @see accordant_rq.SensitivityPoint
	 * @generated
	 */
	EClass getSensitivityPoint();

	/**
	 * Returns the meta object for the attribute '{@link accordant_rq.SensitivityPoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see accordant_rq.SensitivityPoint#getName()
	 * @see #getSensitivityPoint()
	 * @generated
	 */
	EAttribute getSensitivityPoint_Name();

	/**
	 * Returns the meta object for the attribute '{@link accordant_rq.SensitivityPoint#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see accordant_rq.SensitivityPoint#getRationale()
	 * @see #getSensitivityPoint()
	 * @generated
	 */
	EAttribute getSensitivityPoint_Rationale();

	/**
	 * Returns the meta object for the attribute '{@link accordant_rq.SensitivityPoint#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see accordant_rq.SensitivityPoint#getCode()
	 * @see #getSensitivityPoint()
	 * @generated
	 */
	EAttribute getSensitivityPoint_Code();

	/**
	 * Returns the meta object for the reference list '{@link accordant_rq.SensitivityPoint#getTactic <em>Tactic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tactic</em>'.
	 * @see accordant_rq.SensitivityPoint#getTactic()
	 * @see #getSensitivityPoint()
	 * @generated
	 */
	EReference getSensitivityPoint_Tactic();

	/**
	 * Returns the meta object for the attribute '{@link accordant_rq.SensitivityPoint#isIsRisk <em>Is Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Risk</em>'.
	 * @see accordant_rq.SensitivityPoint#isIsRisk()
	 * @see #getSensitivityPoint()
	 * @generated
	 */
	EAttribute getSensitivityPoint_IsRisk();

	/**
	 * Returns the meta object for class '{@link accordant_rq.Tactic <em>Tactic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tactic</em>'.
	 * @see accordant_rq.Tactic
	 * @generated
	 */
	EClass getTactic();

	/**
	 * Returns the meta object for the attribute '{@link accordant_rq.Tactic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see accordant_rq.Tactic#getName()
	 * @see #getTactic()
	 * @generated
	 */
	EAttribute getTactic_Name();

	/**
	 * Returns the meta object for the attribute '{@link accordant_rq.Tactic#getQAttribute <em>QAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QAttribute</em>'.
	 * @see accordant_rq.Tactic#getQAttribute()
	 * @see #getTactic()
	 * @generated
	 */
	EAttribute getTactic_QAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link accordant_rq.Tactic#getSubtactics <em>Subtactics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtactics</em>'.
	 * @see accordant_rq.Tactic#getSubtactics()
	 * @see #getTactic()
	 * @generated
	 */
	EReference getTactic_Subtactics();

	/**
	 * Returns the meta object for the attribute '{@link accordant_rq.Tactic#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see accordant_rq.Tactic#getRationale()
	 * @see #getTactic()
	 * @generated
	 */
	EAttribute getTactic_Rationale();

	/**
	 * Returns the meta object for the attribute '{@link accordant_rq.Tactic#getStimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus</em>'.
	 * @see accordant_rq.Tactic#getStimulus()
	 * @see #getTactic()
	 * @generated
	 */
	EAttribute getTactic_Stimulus();

	/**
	 * Returns the meta object for the attribute '{@link accordant_rq.Tactic#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response</em>'.
	 * @see accordant_rq.Tactic#getResponse()
	 * @see #getTactic()
	 * @generated
	 */
	EAttribute getTactic_Response();

	/**
	 * Returns the meta object for the attribute '{@link accordant_rq.Tactic#getViewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Viewpoint</em>'.
	 * @see accordant_rq.Tactic#getViewpoint()
	 * @see #getTactic()
	 * @generated
	 */
	EAttribute getTactic_Viewpoint();

	/**
	 * Returns the meta object for the reference list '{@link accordant_rq.Tactic#getSpoint <em>Spoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Spoint</em>'.
	 * @see accordant_rq.Tactic#getSpoint()
	 * @see #getTactic()
	 * @generated
	 */
	EReference getTactic_Spoint();

	/**
	 * Returns the meta object for class '{@link accordant_rq.AnalyzedQS <em>Analyzed QS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analyzed QS</em>'.
	 * @see accordant_rq.AnalyzedQS
	 * @generated
	 */
	EClass getAnalyzedQS();

	/**
	 * Returns the meta object for the containment reference '{@link accordant_rq.AnalyzedQS#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Points</em>'.
	 * @see accordant_rq.AnalyzedQS#getPoints()
	 * @see #getAnalyzedQS()
	 * @generated
	 */
	EReference getAnalyzedQS_Points();

	/**
	 * Returns the meta object for the reference '{@link accordant_rq.AnalyzedQS#getQs <em>Qs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qs</em>'.
	 * @see accordant_rq.AnalyzedQS#getQs()
	 * @see #getAnalyzedQS()
	 * @generated
	 */
	EReference getAnalyzedQS_Qs();

	/**
	 * Returns the meta object for the attribute '{@link accordant_rq.AnalyzedQS#getReasoning <em>Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reasoning</em>'.
	 * @see accordant_rq.AnalyzedQS#getReasoning()
	 * @see #getAnalyzedQS()
	 * @generated
	 */
	EAttribute getAnalyzedQS_Reasoning();

	/**
	 * Returns the meta object for enum '{@link accordant_rq.QAMetric <em>QA Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>QA Metric</em>'.
	 * @see accordant_rq.QAMetric
	 * @generated
	 */
	EEnum getQAMetric();

	/**
	 * Returns the meta object for enum '{@link accordant_rq.MetricUnit <em>Metric Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metric Unit</em>'.
	 * @see accordant_rq.MetricUnit
	 * @generated
	 */
	EEnum getMetricUnit();

	/**
	 * Returns the meta object for enum '{@link accordant_rq.QAttribute <em>QAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>QAttribute</em>'.
	 * @see accordant_rq.QAttribute
	 * @generated
	 */
	EEnum getQAttribute();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Accordant_rqFactory getAccordant_rqFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link accordant_rq.impl.InputPackageImpl <em>Input Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accordant_rq.impl.InputPackageImpl
		 * @see accordant_rq.impl.Accordant_rqPackageImpl#getInputPackage()
		 * @generated
		 */
		EClass INPUT_PACKAGE = eINSTANCE.getInputPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PACKAGE__NAME = eINSTANCE.getInputPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PACKAGE__SCENARIOS = eINSTANCE.getInputPackage_Scenarios();

		/**
		 * The meta object literal for the '{@link accordant_rq.impl.QScenarioImpl <em>QScenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accordant_rq.impl.QScenarioImpl
		 * @see accordant_rq.impl.Accordant_rqPackageImpl#getQScenario()
		 * @generated
		 */
		EClass QSCENARIO = eINSTANCE.getQScenario();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSCENARIO__MEASURE = eINSTANCE.getQScenario_Measure();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSCENARIO__MIN_VALUE = eINSTANCE.getQScenario_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSCENARIO__MAX_VALUE = eINSTANCE.getQScenario_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSCENARIO__UNIT = eINSTANCE.getQScenario_Unit();

		/**
		 * The meta object literal for the '<em><b>QAttribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSCENARIO__QATTRIBUTE = eINSTANCE.getQScenario_QAttribute();

		/**
		 * The meta object literal for the '<em><b>Analyzed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QSCENARIO__ANALYZED = eINSTANCE.getQScenario_Analyzed();

		/**
		 * The meta object literal for the '<em><b>Stimulus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSCENARIO__STIMULUS = eINSTANCE.getQScenario_Stimulus();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSCENARIO__ENVIRONMENT = eINSTANCE.getQScenario_Environment();

		/**
		 * The meta object literal for the '{@link accordant_rq.impl.SensitivityPointImpl <em>Sensitivity Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accordant_rq.impl.SensitivityPointImpl
		 * @see accordant_rq.impl.Accordant_rqPackageImpl#getSensitivityPoint()
		 * @generated
		 */
		EClass SENSITIVITY_POINT = eINSTANCE.getSensitivityPoint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSITIVITY_POINT__NAME = eINSTANCE.getSensitivityPoint_Name();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSITIVITY_POINT__RATIONALE = eINSTANCE.getSensitivityPoint_Rationale();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSITIVITY_POINT__CODE = eINSTANCE.getSensitivityPoint_Code();

		/**
		 * The meta object literal for the '<em><b>Tactic</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSITIVITY_POINT__TACTIC = eINSTANCE.getSensitivityPoint_Tactic();

		/**
		 * The meta object literal for the '<em><b>Is Risk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSITIVITY_POINT__IS_RISK = eINSTANCE.getSensitivityPoint_IsRisk();

		/**
		 * The meta object literal for the '{@link accordant_rq.impl.TacticImpl <em>Tactic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accordant_rq.impl.TacticImpl
		 * @see accordant_rq.impl.Accordant_rqPackageImpl#getTactic()
		 * @generated
		 */
		EClass TACTIC = eINSTANCE.getTactic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TACTIC__NAME = eINSTANCE.getTactic_Name();

		/**
		 * The meta object literal for the '<em><b>QAttribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TACTIC__QATTRIBUTE = eINSTANCE.getTactic_QAttribute();

		/**
		 * The meta object literal for the '<em><b>Subtactics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TACTIC__SUBTACTICS = eINSTANCE.getTactic_Subtactics();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TACTIC__RATIONALE = eINSTANCE.getTactic_Rationale();

		/**
		 * The meta object literal for the '<em><b>Stimulus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TACTIC__STIMULUS = eINSTANCE.getTactic_Stimulus();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TACTIC__RESPONSE = eINSTANCE.getTactic_Response();

		/**
		 * The meta object literal for the '<em><b>Viewpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TACTIC__VIEWPOINT = eINSTANCE.getTactic_Viewpoint();

		/**
		 * The meta object literal for the '<em><b>Spoint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TACTIC__SPOINT = eINSTANCE.getTactic_Spoint();

		/**
		 * The meta object literal for the '{@link accordant_rq.impl.AnalyzedQSImpl <em>Analyzed QS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accordant_rq.impl.AnalyzedQSImpl
		 * @see accordant_rq.impl.Accordant_rqPackageImpl#getAnalyzedQS()
		 * @generated
		 */
		EClass ANALYZED_QS = eINSTANCE.getAnalyzedQS();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYZED_QS__POINTS = eINSTANCE.getAnalyzedQS_Points();

		/**
		 * The meta object literal for the '<em><b>Qs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYZED_QS__QS = eINSTANCE.getAnalyzedQS_Qs();

		/**
		 * The meta object literal for the '<em><b>Reasoning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYZED_QS__REASONING = eINSTANCE.getAnalyzedQS_Reasoning();

		/**
		 * The meta object literal for the '{@link accordant_rq.QAMetric <em>QA Metric</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accordant_rq.QAMetric
		 * @see accordant_rq.impl.Accordant_rqPackageImpl#getQAMetric()
		 * @generated
		 */
		EEnum QA_METRIC = eINSTANCE.getQAMetric();

		/**
		 * The meta object literal for the '{@link accordant_rq.MetricUnit <em>Metric Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accordant_rq.MetricUnit
		 * @see accordant_rq.impl.Accordant_rqPackageImpl#getMetricUnit()
		 * @generated
		 */
		EEnum METRIC_UNIT = eINSTANCE.getMetricUnit();

		/**
		 * The meta object literal for the '{@link accordant_rq.QAttribute <em>QAttribute</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see accordant_rq.QAttribute
		 * @see accordant_rq.impl.Accordant_rqPackageImpl#getQAttribute()
		 * @generated
		 */
		EEnum QATTRIBUTE = eINSTANCE.getQAttribute();

	}

} //Accordant_rqPackage
