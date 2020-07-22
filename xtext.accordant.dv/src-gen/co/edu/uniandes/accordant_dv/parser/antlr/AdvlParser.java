/*
 * generated by Xtext 2.18.0.M3
 */
package co.edu.uniandes.accordant_dv.parser.antlr;

import co.edu.uniandes.accordant_dv.parser.antlr.internal.InternalAdvlParser;
import co.edu.uniandes.accordant_dv.services.AdvlGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class AdvlParser extends AbstractAntlrParser {

	@Inject
	private AdvlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAdvlParser createParser(XtextTokenStream stream) {
		return new InternalAdvlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "DeploymentView";
	}

	public AdvlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AdvlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
