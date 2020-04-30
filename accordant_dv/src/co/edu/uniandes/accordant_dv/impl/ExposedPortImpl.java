/**
 */
package co.edu.uniandes.accordant_dv.impl;

import co.edu.uniandes.accordant_dv.Accordant_dvPackage;
import co.edu.uniandes.accordant_dv.ExposedPort;
import co.edu.uniandes.accordant_dv.Pod;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exposed Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ExposedPortImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ExposedPortImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ExposedPortImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ExposedPortImpl#getPort <em>Port</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ExposedPortImpl#getExposes <em>Exposes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExposedPortImpl extends MinimalEObjectImpl.Container implements ExposedPort {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExposes() <em>Exposes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pod> exposes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExposedPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_dvPackage.Literals.EXPOSED_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.EXPOSED_PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.EXPOSED_PORT__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.EXPOSED_PORT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.EXPOSED_PORT__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pod> getExposes() {
		if (exposes == null) {
			exposes = new EObjectResolvingEList<Pod>(Pod.class, this, Accordant_dvPackage.EXPOSED_PORT__EXPOSES);
		}
		return exposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Accordant_dvPackage.EXPOSED_PORT__NAME:
				return getName();
			case Accordant_dvPackage.EXPOSED_PORT__PROTOCOL:
				return getProtocol();
			case Accordant_dvPackage.EXPOSED_PORT__TARGET:
				return getTarget();
			case Accordant_dvPackage.EXPOSED_PORT__PORT:
				return getPort();
			case Accordant_dvPackage.EXPOSED_PORT__EXPOSES:
				return getExposes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Accordant_dvPackage.EXPOSED_PORT__NAME:
				setName((String)newValue);
				return;
			case Accordant_dvPackage.EXPOSED_PORT__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case Accordant_dvPackage.EXPOSED_PORT__TARGET:
				setTarget((String)newValue);
				return;
			case Accordant_dvPackage.EXPOSED_PORT__PORT:
				setPort((Integer)newValue);
				return;
			case Accordant_dvPackage.EXPOSED_PORT__EXPOSES:
				getExposes().clear();
				getExposes().addAll((Collection<? extends Pod>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Accordant_dvPackage.EXPOSED_PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Accordant_dvPackage.EXPOSED_PORT__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case Accordant_dvPackage.EXPOSED_PORT__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case Accordant_dvPackage.EXPOSED_PORT__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case Accordant_dvPackage.EXPOSED_PORT__EXPOSES:
				getExposes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Accordant_dvPackage.EXPOSED_PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Accordant_dvPackage.EXPOSED_PORT__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case Accordant_dvPackage.EXPOSED_PORT__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case Accordant_dvPackage.EXPOSED_PORT__PORT:
				return port != PORT_EDEFAULT;
			case Accordant_dvPackage.EXPOSED_PORT__EXPOSES:
				return exposes != null && !exposes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(", target: ");
		result.append(target);
		result.append(", port: ");
		result.append(port);
		result.append(')');
		return result.toString();
	}

} //ExposedPortImpl
