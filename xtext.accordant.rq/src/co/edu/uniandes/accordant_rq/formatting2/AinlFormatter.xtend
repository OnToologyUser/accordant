/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.accordant_rq.formatting2

import co.edu.uniandes.accordant_rq.AnalyzedQS
import co.edu.uniandes.accordant_rq.InputPackage
import co.edu.uniandes.accordant_rq.services.AinlGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class AinlFormatter extends AbstractFormatter2 {
	
	@Inject extension AinlGrammarAccess

	def dispatch void format(InputPackage inputPackage, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		inputPackage.getScenarios.format;
	}

	def dispatch void format(AnalyzedQS analyzedQS, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		analyzedQS.getDecisions.format;
	}
	
	// TODO: implement for Tactic
}
