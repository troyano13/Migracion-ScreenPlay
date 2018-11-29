package com.reto.serenity.steps;

import org.fluentlenium.core.annotation.Page;

import com.reto.serenity.pages.RegisterPages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Esta clase contiene los pasos para que los usuarios se registren en la página de vuelos
 * @author Alexandra Toyano
 *
 */
public class RegiterSteps extends ScenarioSteps{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Page
	private RegisterPages registerPage;
	

	@Step
	/**
	 * abre la URL que tiene el navegador
	 */
	public void abrirLaPrincipal(){
		registerPage.open();
		
	}
	/**
	 * permite ir a la pagina de inicio
	 */
	@Step
	public void irRegister(){
		registerPage.irRegister();
	}
	
	/**
	 * En este paso permite registrar los datos para el formulario de registro del usuario
	 */
	@Step
	public void llenarRegistry(){
		
		registerPage.llenarRegister("Ana", "Mariana","3148166863","alexa02132009@gmail.com","calle13a sur 985-3",
				"Medellin","Antioquia","5555","7","Mariana11","123456","123456");
			
	}
	/***
	 * validar que este en la pagina correcta.
	 */
	@Step
	public void valideRegistry(){
		
		registerPage.valideRegistry();
			
	}
	
}
