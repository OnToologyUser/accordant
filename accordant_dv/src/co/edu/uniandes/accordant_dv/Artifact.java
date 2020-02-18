/**
 */
package co.edu.uniandes.accordant_dv;

import co.edu.uniandes.accordant_fv.Component;
import co.edu.uniandes.accordant_fv.Connector;
import co.edu.uniandes.accordant_rq.ArchDecision;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.Artifact#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Artifact#getProps <em>Props</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Artifact#getComp <em>Comp</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Artifact#getConn <em>Conn</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Artifact#getDecision <em>Decision</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getArtifact_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Artifact#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Props</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Props</em>' attribute.
	 * @see #setProps(String)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getArtifact_Props()
	 * @model
	 * @generated
	 */
	String getProps();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Artifact#getProps <em>Props</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Props</em>' attribute.
	 * @see #getProps()
	 * @generated
	 */
	void setProps(String value);

	/**
	 * Returns the value of the '<em><b>Comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp</em>' reference.
	 * @see #setComp(Component)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getArtifact_Comp()
	 * @model
	 * @generated
	 */
	Component getComp();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Artifact#getComp <em>Comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp</em>' reference.
	 * @see #getComp()
	 * @generated
	 */
	void setComp(Component value);

	/**
	 * Returns the value of the '<em><b>Conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conn</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conn</em>' reference.
	 * @see #setConn(Connector)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getArtifact_Conn()
	 * @model
	 * @generated
	 */
	Connector getConn();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Artifact#getConn <em>Conn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conn</em>' reference.
	 * @see #getConn()
	 * @generated
	 */
	void setConn(Connector value);

	/**
	 * Returns the value of the '<em><b>Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision</em>' reference.
	 * @see #setDecision(ArchDecision)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getArtifact_Decision()
	 * @model
	 * @generated
	 */
	ArchDecision getDecision();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Artifact#getDecision <em>Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision</em>' reference.
	 * @see #getDecision()
	 * @generated
	 */
	void setDecision(ArchDecision value);

} // Artifact
