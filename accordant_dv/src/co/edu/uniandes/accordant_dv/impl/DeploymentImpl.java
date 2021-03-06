/**
 */
package co.edu.uniandes.accordant_dv.impl;

import co.edu.uniandes.accordant_dv.Accordant_dvPackage;
import co.edu.uniandes.accordant_dv.Deployment;
import co.edu.uniandes.accordant_dv.DeploymentModel;
import co.edu.uniandes.accordant_dv.DeploymentView;
import co.edu.uniandes.accordant_dv.Pod;

import co.edu.uniandes.accordant_rq.ArchDecision;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentImpl#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentImpl#getMaxSurge <em>Max Surge</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentImpl#getMaxUnavail <em>Max Unavail</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentImpl#getPods <em>Pods</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentImpl#getModel <em>Model</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentImpl#getDv <em>Dv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends MinimalEObjectImpl.Container implements Deployment {
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
	 * The default value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicas()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLICAS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicas()
	 * @generated
	 * @ordered
	 */
	protected int replicas = REPLICAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSurge() <em>Max Surge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSurge()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SURGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxSurge() <em>Max Surge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSurge()
	 * @generated
	 * @ordered
	 */
	protected int maxSurge = MAX_SURGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxUnavail() <em>Max Unavail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUnavail()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_UNAVAIL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxUnavail() <em>Max Unavail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUnavail()
	 * @generated
	 * @ordered
	 */
	protected int maxUnavail = MAX_UNAVAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPods() <em>Pods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPods()
	 * @generated
	 * @ordered
	 */
	protected EList<Pod> pods;

	/**
	 * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected String strategy = STRATEGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDecision() <em>Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecision()
	 * @generated
	 * @ordered
	 */
	protected ArchDecision decision;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final DeploymentModel MODEL_EDEFAULT = DeploymentModel.ONPREMISES;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected DeploymentModel model = MODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_dvPackage.Literals.DEPLOYMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.DEPLOYMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReplicas() {
		return replicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplicas(int newReplicas) {
		int oldReplicas = replicas;
		replicas = newReplicas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.DEPLOYMENT__REPLICAS, oldReplicas, replicas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxSurge() {
		return maxSurge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSurge(int newMaxSurge) {
		int oldMaxSurge = maxSurge;
		maxSurge = newMaxSurge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.DEPLOYMENT__MAX_SURGE, oldMaxSurge, maxSurge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxUnavail() {
		return maxUnavail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxUnavail(int newMaxUnavail) {
		int oldMaxUnavail = maxUnavail;
		maxUnavail = newMaxUnavail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.DEPLOYMENT__MAX_UNAVAIL, oldMaxUnavail, maxUnavail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pod> getPods() {
		if (pods == null) {
			pods = new EObjectContainmentWithInverseEList<Pod>(Pod.class, this, Accordant_dvPackage.DEPLOYMENT__PODS, Accordant_dvPackage.POD__DEPL_OWNER);
		}
		return pods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrategy(String newStrategy) {
		String oldStrategy = strategy;
		strategy = newStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.DEPLOYMENT__STRATEGY, oldStrategy, strategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchDecision getDecision() {
		if (decision != null && decision.eIsProxy()) {
			InternalEObject oldDecision = (InternalEObject)decision;
			decision = (ArchDecision)eResolveProxy(oldDecision);
			if (decision != oldDecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Accordant_dvPackage.DEPLOYMENT__DECISION, oldDecision, decision));
			}
		}
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchDecision basicGetDecision() {
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecision(ArchDecision newDecision) {
		ArchDecision oldDecision = decision;
		decision = newDecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.DEPLOYMENT__DECISION, oldDecision, decision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentModel getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(DeploymentModel newModel) {
		DeploymentModel oldModel = model;
		model = newModel == null ? MODEL_EDEFAULT : newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.DEPLOYMENT__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentView getDv() {
		if (eContainerFeatureID() != Accordant_dvPackage.DEPLOYMENT__DV) return null;
		return (DeploymentView)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDv(DeploymentView newDv, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDv, Accordant_dvPackage.DEPLOYMENT__DV, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDv(DeploymentView newDv) {
		if (newDv != eInternalContainer() || (eContainerFeatureID() != Accordant_dvPackage.DEPLOYMENT__DV && newDv != null)) {
			if (EcoreUtil.isAncestor(this, newDv))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDv != null)
				msgs = ((InternalEObject)newDv).eInverseAdd(this, Accordant_dvPackage.DEPLOYMENT_VIEW__DEPLOYMENTS, DeploymentView.class, msgs);
			msgs = basicSetDv(newDv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.DEPLOYMENT__DV, newDv, newDv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Accordant_dvPackage.DEPLOYMENT__PODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPods()).basicAdd(otherEnd, msgs);
			case Accordant_dvPackage.DEPLOYMENT__DV:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDv((DeploymentView)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Accordant_dvPackage.DEPLOYMENT__PODS:
				return ((InternalEList<?>)getPods()).basicRemove(otherEnd, msgs);
			case Accordant_dvPackage.DEPLOYMENT__DV:
				return basicSetDv(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Accordant_dvPackage.DEPLOYMENT__DV:
				return eInternalContainer().eInverseRemove(this, Accordant_dvPackage.DEPLOYMENT_VIEW__DEPLOYMENTS, DeploymentView.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Accordant_dvPackage.DEPLOYMENT__NAME:
				return getName();
			case Accordant_dvPackage.DEPLOYMENT__REPLICAS:
				return getReplicas();
			case Accordant_dvPackage.DEPLOYMENT__MAX_SURGE:
				return getMaxSurge();
			case Accordant_dvPackage.DEPLOYMENT__MAX_UNAVAIL:
				return getMaxUnavail();
			case Accordant_dvPackage.DEPLOYMENT__PODS:
				return getPods();
			case Accordant_dvPackage.DEPLOYMENT__STRATEGY:
				return getStrategy();
			case Accordant_dvPackage.DEPLOYMENT__DECISION:
				if (resolve) return getDecision();
				return basicGetDecision();
			case Accordant_dvPackage.DEPLOYMENT__MODEL:
				return getModel();
			case Accordant_dvPackage.DEPLOYMENT__DV:
				return getDv();
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
			case Accordant_dvPackage.DEPLOYMENT__NAME:
				setName((String)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT__REPLICAS:
				setReplicas((Integer)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT__MAX_SURGE:
				setMaxSurge((Integer)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT__MAX_UNAVAIL:
				setMaxUnavail((Integer)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT__PODS:
				getPods().clear();
				getPods().addAll((Collection<? extends Pod>)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT__STRATEGY:
				setStrategy((String)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT__DECISION:
				setDecision((ArchDecision)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT__MODEL:
				setModel((DeploymentModel)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT__DV:
				setDv((DeploymentView)newValue);
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
			case Accordant_dvPackage.DEPLOYMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Accordant_dvPackage.DEPLOYMENT__REPLICAS:
				setReplicas(REPLICAS_EDEFAULT);
				return;
			case Accordant_dvPackage.DEPLOYMENT__MAX_SURGE:
				setMaxSurge(MAX_SURGE_EDEFAULT);
				return;
			case Accordant_dvPackage.DEPLOYMENT__MAX_UNAVAIL:
				setMaxUnavail(MAX_UNAVAIL_EDEFAULT);
				return;
			case Accordant_dvPackage.DEPLOYMENT__PODS:
				getPods().clear();
				return;
			case Accordant_dvPackage.DEPLOYMENT__STRATEGY:
				setStrategy(STRATEGY_EDEFAULT);
				return;
			case Accordant_dvPackage.DEPLOYMENT__DECISION:
				setDecision((ArchDecision)null);
				return;
			case Accordant_dvPackage.DEPLOYMENT__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case Accordant_dvPackage.DEPLOYMENT__DV:
				setDv((DeploymentView)null);
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
			case Accordant_dvPackage.DEPLOYMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Accordant_dvPackage.DEPLOYMENT__REPLICAS:
				return replicas != REPLICAS_EDEFAULT;
			case Accordant_dvPackage.DEPLOYMENT__MAX_SURGE:
				return maxSurge != MAX_SURGE_EDEFAULT;
			case Accordant_dvPackage.DEPLOYMENT__MAX_UNAVAIL:
				return maxUnavail != MAX_UNAVAIL_EDEFAULT;
			case Accordant_dvPackage.DEPLOYMENT__PODS:
				return pods != null && !pods.isEmpty();
			case Accordant_dvPackage.DEPLOYMENT__STRATEGY:
				return STRATEGY_EDEFAULT == null ? strategy != null : !STRATEGY_EDEFAULT.equals(strategy);
			case Accordant_dvPackage.DEPLOYMENT__DECISION:
				return decision != null;
			case Accordant_dvPackage.DEPLOYMENT__MODEL:
				return model != MODEL_EDEFAULT;
			case Accordant_dvPackage.DEPLOYMENT__DV:
				return getDv() != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", replicas: ");
		result.append(replicas);
		result.append(", maxSurge: ");
		result.append(maxSurge);
		result.append(", maxUnavail: ");
		result.append(maxUnavail);
		result.append(", strategy: ");
		result.append(strategy);
		result.append(", model: ");
		result.append(model);
		result.append(')');
		return result.toString();
	}

} //DeploymentImpl
