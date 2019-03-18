/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.accordant_dv.ide

import co.edu.uniandes.accordant_dv.AdvlRuntimeModule
import co.edu.uniandes.accordant_dv.AdvlStandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class AdvlIdeSetup extends AdvlStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new AdvlRuntimeModule, new AdvlIdeModule))
	}
	
}
