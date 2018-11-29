package com.reto.serenity.definitions;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import com.reto.serenity.steps.LoginSteps;
import com.reto.serenity.steps.SearchSteps;

import net.thucydides.core.annotations.Steps;

/***
 * En esta case conecta la narrativa de search.story en el que debe cumplir 
 * con los parrafos given when y then
 * @author Alexandra Troyano P.
 *
 */
public class SearchDefinitions {

	
	@Steps
	private SearchSteps search;
	@Steps
	private LoginSteps login;

	@Given("I want to look for a flight, I go to the flight tab")
	public void openSearch() {
		search.abrirLaPrincipal();
		login.llenarLogin();
		search.irSearch();
	}

	@When("I find my destiny")
	public void fillSearch() {
		search.fillSearch();
	}

	@Then("the system should display the information attached to the selected")
	public void validarSearch() {
		
		System.out.println("FIN!!!!!");
	}
}
