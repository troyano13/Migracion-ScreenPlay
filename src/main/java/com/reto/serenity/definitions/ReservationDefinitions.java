package com.reto.serenity.definitions;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.reto.serenity.steps.LoginSteps;
import com.reto.serenity.steps.ReservationSteps;
import com.reto.serenity.steps.SearchSteps;

import net.thucydides.core.annotations.Steps;

/***
 * En esta case conecta la narrativa de reservation.story en el que debe cumplir 
 * con los parrafos given when y then
 * @author Alexandra Troyano P.
 *
 */
public class ReservationDefinitions {

	
	@Steps
	private ReservationSteps reservation;
	
	@Steps
	private SearchSteps search;
	@Steps
	private LoginSteps login;
	


	@Given("I want to make a reservation, I go to flights")
	public void abrirUrl() {
		reservation.abrirLaPrincipal();
		login.llenarLogin();
		
	}

	@When("he finds my destiny")
	public void goToSearch() {
		search.irSearch();
		search.fillSearch();
	}

	@Then("the system must let save my reservation")
	public void FillReserva() {
		reservation.fillReservation();
		System.out.println("FIN!!!!!");
	}
}
