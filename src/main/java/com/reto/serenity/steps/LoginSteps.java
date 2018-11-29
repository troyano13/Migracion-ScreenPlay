package com.reto.serenity.steps;

import org.fluentlenium.core.annotation.Page;

import com.reto.serenity.pages.LoginPages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Esta clase contiene los pasos para que los usuarios se registren en el login en la página de vuelos
 * @author Alexandra Toyano
 *
 */
public class LoginSteps extends ScenarioSteps{

	private static final long serialVersionUID = -6980860977949003450L;
	
	@Page
	private LoginPages loginPage;
	
	/**
	 * abre la URL que tiene el navegador
	 */
	@Step
	public void abrirLaPrincipal(){
		loginPage.open();
	}
	
	@Step
	public void irALogin(){
		loginPage.irAlLogin();
	}
	
	/**
	 * permite llenar el forulario para realizar el login
	 *
	 */
	
	@Step
	public void llenarLogin(){
		
		loginPage.llenarLogin("Mariana13", "123456");
			
	}
	
	@Step
	public void llevarOtraPagina(){
		
		loginPage.llevarOtraPagina();
			
	}
	
	@Step
	public void validar(){
		if("http://newtours.demoaut.com/mercuryreservation.php".equals("Hola")){
			loginPage.llevarOtraPagina();
		}
	}
	
}
