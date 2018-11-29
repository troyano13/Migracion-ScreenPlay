package com.reto.serenity.definitions;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


import com.reto.serenity.steps.RegiterSteps;

import net.thucydides.core.annotations.Steps;
/***
 * En esta case conecta la narrativa de registr.story en el que debe cumple 
 * con los parrafos given when y then
 * @author Alexandra Troyano P.
 *
 */
public class RegisterDefinitions {

	@Steps
	private RegiterSteps register;

	@Given("I have chosen to register, Login to user registration")
	public void abrirRegistro() {
		register.abrirLaPrincipal();
		register.irRegister();
	}

	@When("I completely fill out the registration form")
	public void iniciarSesion() {
		register.llenarRegistry();
	}

	@Then("I press the submit button, the system must save the user's information")
	public void validarAcceso() {
		register.valideRegistry();

		System.out.println("FIN!!!!!");
	}

}
