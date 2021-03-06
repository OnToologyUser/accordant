/*
 * generated by Xtext 2.18.0.M3
 */
package co.edu.uniandes.accordant_dv.serializer;

import co.edu.uniandes.accordant_dv.services.AdvlGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class AdvlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AdvlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Artifact_RightCurlyBracketKeyword_4_1_a;
	protected AbstractElementAlias match_Artifact_RightCurlyBracketKeyword_4_1_p;
	protected AbstractElementAlias match_Device_RightCurlyBracketKeyword_4_1_a;
	protected AbstractElementAlias match_Device_RightCurlyBracketKeyword_4_1_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AdvlGrammarAccess) access;
		match_Artifact_RightCurlyBracketKeyword_4_1_a = new TokenAlias(true, true, grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_4_1());
		match_Artifact_RightCurlyBracketKeyword_4_1_p = new TokenAlias(true, false, grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_4_1());
		match_Device_RightCurlyBracketKeyword_4_1_a = new TokenAlias(true, true, grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_4_1());
		match_Device_RightCurlyBracketKeyword_4_1_p = new TokenAlias(true, false, grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_4_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Artifact_RightCurlyBracketKeyword_4_1_a.equals(syntax))
				emit_Artifact_RightCurlyBracketKeyword_4_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Artifact_RightCurlyBracketKeyword_4_1_p.equals(syntax))
				emit_Artifact_RightCurlyBracketKeyword_4_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Device_RightCurlyBracketKeyword_4_1_a.equals(syntax))
				emit_Device_RightCurlyBracketKeyword_4_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Device_RightCurlyBracketKeyword_4_1_p.equals(syntax))
				emit_Device_RightCurlyBracketKeyword_4_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '}'*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'Artifact' name=ID
	 *     (rule start) (ambiguity) 'connector' ':' conn=[Connector|ID]
	 *     (rule start) (ambiguity) 'decision' ':' decision=[ArchDecision|ID]
	 *     (rule start) (ambiguity) 'props' ':' props=EString
	 *     (rule start) (ambiguity) 'technology' ':' technology=EString
	 *     (rule start) (ambiguity) (rule start)
	 *     comp=[Component|ID] (ambiguity) 'Artifact' name=ID
	 *     comp=[Component|ID] (ambiguity) 'connector' ':' conn=[Connector|ID]
	 *     comp=[Component|ID] (ambiguity) 'decision' ':' decision=[ArchDecision|ID]
	 *     comp=[Component|ID] (ambiguity) 'props' ':' props=EString
	 *     comp=[Component|ID] (ambiguity) 'technology' ':' technology=EString
	 *     comp=[Component|ID] (ambiguity) (rule end)
	 *     conn=[Connector|ID] (ambiguity) 'Artifact' name=ID
	 *     conn=[Connector|ID] (ambiguity) 'connector' ':' conn=[Connector|ID]
	 *     conn=[Connector|ID] (ambiguity) 'decision' ':' decision=[ArchDecision|ID]
	 *     conn=[Connector|ID] (ambiguity) 'props' ':' props=EString
	 *     conn=[Connector|ID] (ambiguity) 'technology' ':' technology=EString
	 *     conn=[Connector|ID] (ambiguity) (rule end)
	 *     name=ID '{' (ambiguity) 'Artifact' name=ID
	 *     name=ID '{' (ambiguity) 'connector' ':' conn=[Connector|ID]
	 *     name=ID '{' (ambiguity) 'decision' ':' decision=[ArchDecision|ID]
	 *     name=ID '{' (ambiguity) 'props' ':' props=EString
	 *     name=ID '{' (ambiguity) 'technology' ':' technology=EString
	 *     name=ID '{' (ambiguity) (rule end)
	 *     props=EString (ambiguity) 'Artifact' name=ID
	 *     props=EString (ambiguity) 'connector' ':' conn=[Connector|ID]
	 *     props=EString (ambiguity) 'decision' ':' decision=[ArchDecision|ID]
	 *     props=EString (ambiguity) 'props' ':' props=EString
	 *     props=EString (ambiguity) 'technology' ':' technology=EString
	 *     props=EString (ambiguity) (rule end)
	 *     technology=EString (ambiguity) 'Artifact' name=ID
	 *     technology=EString (ambiguity) 'connector' ':' conn=[Connector|ID]
	 *     technology=EString (ambiguity) 'decision' ':' decision=[ArchDecision|ID]
	 *     technology=EString (ambiguity) 'props' ':' props=EString
	 *     technology=EString (ambiguity) 'technology' ':' technology=EString
	 *     technology=EString (ambiguity) (rule end)
	 */
	protected void emit_Artifact_RightCurlyBracketKeyword_4_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '}'+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 *     decision=[ArchDecision|ID] (ambiguity) 'Artifact' name=ID
	 *     decision=[ArchDecision|ID] (ambiguity) 'connector' ':' conn=[Connector|ID]
	 *     decision=[ArchDecision|ID] (ambiguity) 'decision' ':' decision=[ArchDecision|ID]
	 *     decision=[ArchDecision|ID] (ambiguity) 'props' ':' props=EString
	 *     decision=[ArchDecision|ID] (ambiguity) 'technology' ':' technology=EString
	 *     decision=[ArchDecision|ID] (ambiguity) (rule end)
	 */
	protected void emit_Artifact_RightCurlyBracketKeyword_4_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '}'*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'Device' name=ID
	 *     (rule start) (ambiguity) 'cpu' ':' cpu=EInt
	 *     (rule start) (ambiguity) 'memory' ':' mem=EInt
	 *     (rule start) (ambiguity) 'storage' ':' storage=EInt
	 *     (rule start) (ambiguity) 'type' ':' type=TypeDevice
	 *     (rule start) (ambiguity) (rule start)
	 *     cpu=EInt (ambiguity) 'Device' name=ID
	 *     cpu=EInt (ambiguity) 'cpu' ':' cpu=EInt
	 *     cpu=EInt (ambiguity) 'memory' ':' mem=EInt
	 *     cpu=EInt (ambiguity) 'storage' ':' storage=EInt
	 *     cpu=EInt (ambiguity) 'type' ':' type=TypeDevice
	 *     cpu=EInt (ambiguity) (rule end)
	 *     host=EString (ambiguity) 'Device' name=ID
	 *     host=EString (ambiguity) 'cpu' ':' cpu=EInt
	 *     host=EString (ambiguity) 'memory' ':' mem=EInt
	 *     host=EString (ambiguity) 'storage' ':' storage=EInt
	 *     host=EString (ambiguity) 'type' ':' type=TypeDevice
	 *     host=EString (ambiguity) (rule end)
	 *     name=ID '{' (ambiguity) 'Device' name=ID
	 *     name=ID '{' (ambiguity) 'cpu' ':' cpu=EInt
	 *     name=ID '{' (ambiguity) 'memory' ':' mem=EInt
	 *     name=ID '{' (ambiguity) 'storage' ':' storage=EInt
	 *     name=ID '{' (ambiguity) 'type' ':' type=TypeDevice
	 *     name=ID '{' (ambiguity) (rule end)
	 *     storage=EInt (ambiguity) 'Device' name=ID
	 *     storage=EInt (ambiguity) 'cpu' ':' cpu=EInt
	 *     storage=EInt (ambiguity) 'memory' ':' mem=EInt
	 *     storage=EInt (ambiguity) 'storage' ':' storage=EInt
	 *     storage=EInt (ambiguity) 'type' ':' type=TypeDevice
	 *     storage=EInt (ambiguity) (rule end)
	 *     type=TypeDevice (ambiguity) 'Device' name=ID
	 *     type=TypeDevice (ambiguity) 'cpu' ':' cpu=EInt
	 *     type=TypeDevice (ambiguity) 'memory' ':' mem=EInt
	 *     type=TypeDevice (ambiguity) 'storage' ':' storage=EInt
	 *     type=TypeDevice (ambiguity) 'type' ':' type=TypeDevice
	 *     type=TypeDevice (ambiguity) (rule end)
	 */
	protected void emit_Device_RightCurlyBracketKeyword_4_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '}'+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 *     mem=EInt (ambiguity) 'Device' name=ID
	 *     mem=EInt (ambiguity) 'cpu' ':' cpu=EInt
	 *     mem=EInt (ambiguity) 'memory' ':' mem=EInt
	 *     mem=EInt (ambiguity) 'storage' ':' storage=EInt
	 *     mem=EInt (ambiguity) 'type' ':' type=TypeDevice
	 *     mem=EInt (ambiguity) (rule end)
	 */
	protected void emit_Device_RightCurlyBracketKeyword_4_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
