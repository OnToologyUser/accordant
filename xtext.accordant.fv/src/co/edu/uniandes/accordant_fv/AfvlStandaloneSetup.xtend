/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.accordant_fv


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class AfvlStandaloneSetup extends AfvlStandaloneSetupGenerated {

	def static void doSetup() {
		new AfvlStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
