/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.accordant_rq.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import xtext.accordant.rq.ui.internal.RqActivator;

public class AinlUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return RqActivator.getInstance().getInjector("co.edu.uniandes.accordant_rq.Ainl");
	}

}