/**
 */
package co.edu.uniandes.accordant_rq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arch Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_rq.ArchDecision#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.ArchDecision#getRationale <em>Rationale</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.ArchDecision#getCode <em>Code</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.ArchDecision#getAppliedTactics <em>Applied Tactics</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.ArchDecision#isIsRisk <em>Is Risk</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.ArchDecision#isIsSensitivityPoint <em>Is Sensitivity Point</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.ArchDecision#getAqs <em>Aqs</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getArchDecision()
 * @model
 * @generated
 */
public interface ArchDecision extends EObject {
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
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getArchDecision_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.ArchDecision#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getArchDecision_Rationale()
	 * @model
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.ArchDecision#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getArchDecision_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.ArchDecision#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Applied Tactics</b></em>' reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_rq.Tactic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Tactics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Tactics</em>' reference list.
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getArchDecision_AppliedTactics()
	 * @model
	 * @generated
	 */
	EList<Tactic> getAppliedTactics();

	/**
	 * Returns the value of the '<em><b>Is Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Risk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Risk</em>' attribute.
	 * @see #setIsRisk(boolean)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getArchDecision_IsRisk()
	 * @model
	 * @generated
	 */
	boolean isIsRisk();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.ArchDecision#isIsRisk <em>Is Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Risk</em>' attribute.
	 * @see #isIsRisk()
	 * @generated
	 */
	void setIsRisk(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Sensitivity Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Sensitivity Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sensitivity Point</em>' attribute.
	 * @see #setIsSensitivityPoint(boolean)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getArchDecision_IsSensitivityPoint()
	 * @model
	 * @generated
	 */
	boolean isIsSensitivityPoint();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.ArchDecision#isIsSensitivityPoint <em>Is Sensitivity Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sensitivity Point</em>' attribute.
	 * @see #isIsSensitivityPoint()
	 * @generated
	 */
	void setIsSensitivityPoint(boolean value);

	/**
	 * Returns the value of the '<em><b>Aqs</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.accordant_rq.AnalyzedQS#getDecisions <em>Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aqs</em>' container reference.
	 * @see #setAqs(AnalyzedQS)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getArchDecision_Aqs()
	 * @see co.edu.uniandes.accordant_rq.AnalyzedQS#getDecisions
	 * @model opposite="decisions" required="true" transient="false"
	 * @generated
	 */
	AnalyzedQS getAqs();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.ArchDecision#getAqs <em>Aqs</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aqs</em>' container reference.
	 * @see #getAqs()
	 * @generated
	 */
	void setAqs(AnalyzedQS value);

} // ArchDecision
