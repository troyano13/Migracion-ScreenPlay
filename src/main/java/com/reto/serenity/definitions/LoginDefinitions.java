package com.reto.serenity.definitions;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.reto.serenity.steps.LoginSteps;

import net.thucydides.core.annotations.Steps;

/***
 * En esta case conecta la narrativa de login.story en el que debe cumplir 
 * con los parrafos given when y then
 * @author Alexandra Troyano P.
 *
 */
public class LoginDefinitions {

	
	@Steps
	private LoginSteps loginSteps;

	@Given("I want to access the page, I go to the user login")
	public void abrirUrl() {
		loginSteps.abrirLaPrincipal();
	}

	@When("I fill in the fields of the form with valid data for login")
	public void iniciarSesion() {
		loginSteps.llenarLogin();
	}

	@Then("the system must allow the entry by pressing the submit button")
	public void validarAcceso() {
		loginSteps.validar();
	}
}
