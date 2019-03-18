/**
 */
package co.edu.uniandes.accordant_dv.impl;

import co.edu.uniandes.accordant_dv.Accordant_dvFactory;
import co.edu.uniandes.accordant_dv.Accordant_dvPackage;
import co.edu.uniandes.accordant_dv.Artifact;
import co.edu.uniandes.accordant_dv.Comparator;
import co.edu.uniandes.accordant_dv.Deployment;
import co.edu.uniandes.accordant_dv.DeploymentView;
import co.edu.uniandes.accordant_dv.Device;
import co.edu.uniandes.accordant_dv.EnvVar;
import co.edu.uniandes.accordant_dv.EstimatorTech;
import co.edu.uniandes.accordant_dv.EventConnTech;
import co.edu.uniandes.accordant_dv.ExecEnvironment;
import co.edu.uniandes.accordant_dv.ExposedPort;
import co.edu.uniandes.accordant_dv.IngestorTech;
import co.edu.uniandes.accordant_dv.Pod;
import co.edu.uniandes.accordant_dv.QAMetric;
import co.edu.uniandes.accordant_dv.Service;
import co.edu.uniandes.accordant_dv.SinkTech;
import co.edu.uniandes.accordant_dv.TransformerTech;
import co.edu.uniandes.accordant_dv.TypeDevice;
import co.edu.uniandes.accordant_dv.Unit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Accordant_dvPackageImpl extends EPackageImpl implements Accordant_dvPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass execEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass podEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exposedPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventConnTechEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ingestorTechEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sinkTechEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum estimatorTechEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transformerTechEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeDeviceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qaMetricEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Accordant_dvPackageImpl() {
		super(eNS_URI, Accordant_dvFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Accordant_dvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Accordant_dvPackage init() {
		if (isInited) return (Accordant_dvPackage)EPackage.Registry.INSTANCE.getEPackage(Accordant_dvPackage.eNS_URI);

		// Obtain or create and register package
		Accordant_dvPackageImpl theAccordant_dvPackage = (Accordant_dvPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Accordant_dvPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Accordant_dvPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAccordant_dvPackage.createPackageContents();

		// Initialize created meta-data
		theAccordant_dvPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAccordant_dvPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Accordant_dvPackage.eNS_URI, theAccordant_dvPackage);
		return theAccordant_dvPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentView() {
		return deploymentViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentView_Name() {
		return (EAttribute)deploymentViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentView_Devs() {
		return (EReference)deploymentViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentView_Deployments() {
		return (EReference)deploymentViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentView_Services() {
		return (EReference)deploymentViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Host() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Type() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Cpu() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Storage() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Mem() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Name() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecEnvironment() {
		return execEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecEnvironment_Artifacts() {
		return (EReference)execEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecEnvironment_Name() {
		return (EAttribute)execEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecEnvironment_Cpu_req() {
		return (EAttribute)execEnvironmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecEnvironment_Mem_req() {
		return (EAttribute)execEnvironmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecEnvironment_Cpu_lim() {
		return (EAttribute)execEnvironmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecEnvironment_Mem_lim() {
		return (EAttribute)execEnvironmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecEnvironment_Image() {
		return (EAttribute)execEnvironmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecEnvironment_Ports() {
		return (EAttribute)execEnvironmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecEnvironment_Vars() {
		return (EReference)execEnvironmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecEnvironment_Commands() {
		return (EAttribute)execEnvironmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_Name() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_Props() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_Component() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_Connector() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_Name() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_Replicas() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_MaxSurge() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_MaxUnavail() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Pods() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_Strategy() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPod() {
		return podEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPod_Name() {
		return (EAttribute)podEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPod_Host() {
		return (EAttribute)podEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPod_RestartPolicy() {
		return (EAttribute)podEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPod_Envs() {
		return (EReference)podEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPod_Node() {
		return (EReference)podEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvVar() {
		return envVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvVar_Name() {
		return (EAttribute)envVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvVar_Value() {
		return (EAttribute)envVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Name() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Ports() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Type() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_ExtAccess() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExposedPort() {
		return exposedPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExposedPort_Name() {
		return (EAttribute)exposedPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExposedPort_Protocol() {
		return (EAttribute)exposedPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExposedPort_Target() {
		return (EAttribute)exposedPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExposedPort_Port() {
		return (EAttribute)exposedPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExposedPort_Exposes() {
		return (EReference)exposedPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventConnTech() {
		return eventConnTechEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIngestorTech() {
		return ingestorTechEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSinkTech() {
		return sinkTechEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEstimatorTech() {
		return estimatorTechEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransformerTech() {
		return transformerTechEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeDevice() {
		return typeDeviceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQAMetric() {
		return qaMetricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparator() {
		return comparatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnit() {
		return unitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accordant_dvFactory getAccordant_dvFactory() {
		return (Accordant_dvFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		deploymentViewEClass = createEClass(DEPLOYMENT_VIEW);
		createEAttribute(deploymentViewEClass, DEPLOYMENT_VIEW__NAME);
		createEReference(deploymentViewEClass, DEPLOYMENT_VIEW__DEVS);
		createEReference(deploymentViewEClass, DEPLOYMENT_VIEW__DEPLOYMENTS);
		createEReference(deploymentViewEClass, DEPLOYMENT_VIEW__SERVICES);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__HOST);
		createEAttribute(deviceEClass, DEVICE__TYPE);
		createEAttribute(deviceEClass, DEVICE__CPU);
		createEAttribute(deviceEClass, DEVICE__STORAGE);
		createEAttribute(deviceEClass, DEVICE__MEM);
		createEAttribute(deviceEClass, DEVICE__NAME);

		execEnvironmentEClass = createEClass(EXEC_ENVIRONMENT);
		createEReference(execEnvironmentEClass, EXEC_ENVIRONMENT__ARTIFACTS);
		createEAttribute(execEnvironmentEClass, EXEC_ENVIRONMENT__NAME);
		createEAttribute(execEnvironmentEClass, EXEC_ENVIRONMENT__CPU_REQ);
		createEAttribute(execEnvironmentEClass, EXEC_ENVIRONMENT__MEM_REQ);
		createEAttribute(execEnvironmentEClass, EXEC_ENVIRONMENT__CPU_LIM);
		createEAttribute(execEnvironmentEClass, EXEC_ENVIRONMENT__MEM_LIM);
		createEAttribute(execEnvironmentEClass, EXEC_ENVIRONMENT__IMAGE);
		createEAttribute(execEnvironmentEClass, EXEC_ENVIRONMENT__PORTS);
		createEReference(execEnvironmentEClass, EXEC_ENVIRONMENT__VARS);
		createEAttribute(execEnvironmentEClass, EXEC_ENVIRONMENT__COMMANDS);

		artifactEClass = createEClass(ARTIFACT);
		createEAttribute(artifactEClass, ARTIFACT__NAME);
		createEAttribute(artifactEClass, ARTIFACT__PROPS);
		createEAttribute(artifactEClass, ARTIFACT__COMPONENT);
		createEAttribute(artifactEClass, ARTIFACT__CONNECTOR);

		deploymentEClass = createEClass(DEPLOYMENT);
		createEAttribute(deploymentEClass, DEPLOYMENT__NAME);
		createEAttribute(deploymentEClass, DEPLOYMENT__REPLICAS);
		createEAttribute(deploymentEClass, DEPLOYMENT__MAX_SURGE);
		createEAttribute(deploymentEClass, DEPLOYMENT__MAX_UNAVAIL);
		createEReference(deploymentEClass, DEPLOYMENT__PODS);
		createEAttribute(deploymentEClass, DEPLOYMENT__STRATEGY);

		podEClass = createEClass(POD);
		createEAttribute(podEClass, POD__NAME);
		createEAttribute(podEClass, POD__HOST);
		createEAttribute(podEClass, POD__RESTART_POLICY);
		createEReference(podEClass, POD__ENVS);
		createEReference(podEClass, POD__NODE);

		envVarEClass = createEClass(ENV_VAR);
		createEAttribute(envVarEClass, ENV_VAR__NAME);
		createEAttribute(envVarEClass, ENV_VAR__VALUE);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEReference(serviceEClass, SERVICE__PORTS);
		createEAttribute(serviceEClass, SERVICE__TYPE);
		createEAttribute(serviceEClass, SERVICE__EXT_ACCESS);

		exposedPortEClass = createEClass(EXPOSED_PORT);
		createEAttribute(exposedPortEClass, EXPOSED_PORT__NAME);
		createEAttribute(exposedPortEClass, EXPOSED_PORT__PROTOCOL);
		createEAttribute(exposedPortEClass, EXPOSED_PORT__TARGET);
		createEAttribute(exposedPortEClass, EXPOSED_PORT__PORT);
		createEReference(exposedPortEClass, EXPOSED_PORT__EXPOSES);

		// Create enums
		eventConnTechEEnum = createEEnum(EVENT_CONN_TECH);
		ingestorTechEEnum = createEEnum(INGESTOR_TECH);
		sinkTechEEnum = createEEnum(SINK_TECH);
		estimatorTechEEnum = createEEnum(ESTIMATOR_TECH);
		transformerTechEEnum = createEEnum(TRANSFORMER_TECH);
		typeDeviceEEnum = createEEnum(TYPE_DEVICE);
		qaMetricEEnum = createEEnum(QA_METRIC);
		comparatorEEnum = createEEnum(COMPARATOR);
		unitEEnum = createEEnum(UNIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(deploymentViewEClass, DeploymentView.class, "DeploymentView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentView_Name(), ecorePackage.getEString(), "name", null, 1, 1, DeploymentView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentView_Devs(), this.getDevice(), null, "devs", null, 1, -1, DeploymentView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentView_Deployments(), this.getDeployment(), null, "deployments", null, 0, -1, DeploymentView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentView_Services(), this.getService(), null, "services", null, 0, -1, DeploymentView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_Host(), ecorePackage.getEString(), "host", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Type(), this.getTypeDevice(), "type", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Cpu(), ecorePackage.getEInt(), "cpu", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Storage(), ecorePackage.getEInt(), "storage", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Mem(), ecorePackage.getEInt(), "mem", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Name(), ecorePackage.getEString(), "name", null, 1, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(execEnvironmentEClass, ExecEnvironment.class, "ExecEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecEnvironment_Artifacts(), this.getArtifact(), null, "artifacts", null, 0, -1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecEnvironment_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecEnvironment_Cpu_req(), ecorePackage.getEFloat(), "cpu_req", null, 0, 1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecEnvironment_Mem_req(), ecorePackage.getEInt(), "mem_req", null, 0, 1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecEnvironment_Cpu_lim(), ecorePackage.getEFloat(), "cpu_lim", null, 0, 1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecEnvironment_Mem_lim(), ecorePackage.getEInt(), "mem_lim", null, 0, 1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecEnvironment_Image(), ecorePackage.getEString(), "image", null, 0, 1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecEnvironment_Ports(), ecorePackage.getEInt(), "ports", null, 0, -1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecEnvironment_Vars(), this.getEnvVar(), null, "vars", null, 0, -1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecEnvironment_Commands(), ecorePackage.getEString(), "commands", null, 0, -1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifact_Name(), ecorePackage.getEString(), "name", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Props(), ecorePackage.getEString(), "props", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Component(), ecorePackage.getEString(), "component", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Connector(), ecorePackage.getEString(), "connector", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeployment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_Replicas(), ecorePackage.getEInt(), "replicas", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_MaxSurge(), ecorePackage.getEInt(), "maxSurge", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_MaxUnavail(), ecorePackage.getEInt(), "maxUnavail", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_Pods(), this.getPod(), null, "pods", null, 1, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_Strategy(), ecorePackage.getEString(), "strategy", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(podEClass, Pod.class, "Pod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPod_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPod_Host(), ecorePackage.getEString(), "host", null, 0, 1, Pod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPod_RestartPolicy(), ecorePackage.getEString(), "restartPolicy", null, 0, 1, Pod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPod_Envs(), this.getExecEnvironment(), null, "envs", null, 1, -1, Pod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPod_Node(), this.getDevice(), null, "node", null, 0, 1, Pod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(envVarEClass, EnvVar.class, "EnvVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvVar_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnvVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvVar_Value(), ecorePackage.getEString(), "value", null, 0, 1, EnvVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Ports(), this.getExposedPort(), null, "ports", null, 1, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Type(), ecorePackage.getEString(), "type", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ExtAccess(), ecorePackage.getEString(), "extAccess", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exposedPortEClass, ExposedPort.class, "ExposedPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExposedPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExposedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExposedPort_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, ExposedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExposedPort_Target(), ecorePackage.getEString(), "target", null, 0, 1, ExposedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExposedPort_Port(), ecorePackage.getEInt(), "port", null, 0, 1, ExposedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExposedPort_Exposes(), this.getPod(), null, "exposes", null, 0, -1, ExposedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eventConnTechEEnum, EventConnTech.class, "EventConnTech");
		addEEnumLiteral(eventConnTechEEnum, EventConnTech.KAFKA);
		addEEnumLiteral(eventConnTechEEnum, EventConnTech.ACTIVEMQ);
		addEEnumLiteral(eventConnTechEEnum, EventConnTech.RABBITMQ);

		initEEnum(ingestorTechEEnum, IngestorTech.class, "IngestorTech");
		addEEnumLiteral(ingestorTechEEnum, IngestorTech.FLUME);

		initEEnum(sinkTechEEnum, SinkTech.class, "SinkTech");
		addEEnumLiteral(sinkTechEEnum, SinkTech.SQOOP);
		addEEnumLiteral(sinkTechEEnum, SinkTech.MONGODB);

		initEEnum(estimatorTechEEnum, EstimatorTech.class, "EstimatorTech");
		addEEnumLiteral(estimatorTechEEnum, EstimatorTech.SPARKMLIB);
		addEEnumLiteral(estimatorTechEEnum, EstimatorTech.SCIKIT_LEARN);
		addEEnumLiteral(estimatorTechEEnum, EstimatorTech.MAHOUT);
		addEEnumLiteral(estimatorTechEEnum, EstimatorTech.OPENSCORING);
		addEEnumLiteral(estimatorTechEEnum, EstimatorTech.JPMML);

		initEEnum(transformerTechEEnum, TransformerTech.class, "TransformerTech");
		addEEnumLiteral(transformerTechEEnum, TransformerTech.SPARK);
		addEEnumLiteral(transformerTechEEnum, TransformerTech.STORM);

		initEEnum(typeDeviceEEnum, TypeDevice.class, "TypeDevice");
		addEEnumLiteral(typeDeviceEEnum, TypeDevice.MEDIUM);
		addEEnumLiteral(typeDeviceEEnum, TypeDevice.LARGE);
		addEEnumLiteral(typeDeviceEEnum, TypeDevice.SMALL);

		initEEnum(qaMetricEEnum, QAMetric.class, "QAMetric");
		addEEnumLiteral(qaMetricEEnum, QAMetric.THROUGHPUT);
		addEEnumLiteral(qaMetricEEnum, QAMetric.LATENCY);
		addEEnumLiteral(qaMetricEEnum, QAMetric.DEADLINE);

		initEEnum(comparatorEEnum, Comparator.class, "Comparator");
		addEEnumLiteral(comparatorEEnum, Comparator.LOWER);
		addEEnumLiteral(comparatorEEnum, Comparator.GREATER);
		addEEnumLiteral(comparatorEEnum, Comparator.EQUALS);
		addEEnumLiteral(comparatorEEnum, Comparator.DIFF);
		addEEnumLiteral(comparatorEEnum, Comparator.GREQ);
		addEEnumLiteral(comparatorEEnum, Comparator.LWEQ);

		initEEnum(unitEEnum, Unit.class, "Unit");
		addEEnumLiteral(unitEEnum, Unit.MILLIS);
		addEEnumLiteral(unitEEnum, Unit.SECONDS);
		addEEnumLiteral(unitEEnum, Unit.MINUTES);
		addEEnumLiteral(unitEEnum, Unit.HOURS);
		addEEnumLiteral(unitEEnum, Unit.TASKS);
		addEEnumLiteral(unitEEnum, Unit.BYTES);
		addEEnumLiteral(unitEEnum, Unit.MSGS);

		// Create resource
		createResource(eNS_URI);
	}

} //Accordant_dvPackageImpl
