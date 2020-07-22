/*
 * generated by Xtext 2.18.0.M3
 */
package co.edu.uniandes.accordant_fv.parser.antlr;

import co.edu.uniandes.accordant_fv.parser.antlr.internal.InternalAfvlParser;
import co.edu.uniandes.accordant_fv.services.AfvlGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class AfvlParser extends AbstractAntlrParser {

	@Inject
	private AfvlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAfvlParser createParser(XtextTokenStream stream) {
		return new InternalAfvlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "FunctionalView";
	}

	public AfvlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AfvlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
