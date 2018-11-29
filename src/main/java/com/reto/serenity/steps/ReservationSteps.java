package com.reto.serenity.steps;

import org.fluentlenium.core.annotation.Page;

import com.reto.serenity.pages.LoginPages;
import com.reto.serenity.pages.ReservationPages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Esta clase contiene los pasos para que los usuarios la reserva del vuelo 
 * @author Alexandra Toyano
 *
 */
public class ReservationSteps extends ScenarioSteps{

	private static final long serialVersionUID = -6980860977949003450L;
	
	@Page
	private ReservationPages reservation;
	
	/**
	 * abre la URL que tiene el navegador
	 */
	@Step
	public void abrirLaPrincipal(){
		reservation.open();
	}
	
	@Step
	public void goToReservation (){
		reservation.goToReservation();
	}
	
	@Step
	public void fillReservation(){
		
		reservation.llenarInputText(reservation.getPassFirst(), "mariana");
		reservation.llenarInputText(reservation.getPassLast(),"martinez");
		reservation.selectCombo(reservation.getSelecMeal(),"KSML");
		reservation.selectCombo(reservation.getSelectcreditCard(),"BA");
		reservation.llenarInputText(reservation.getCreditnumber(), "5555555");
		/*reservation.selectCombo(reservation.getSelectExpira(),"05");
		reservation.selectCombo(reservation.getSelectExpira2(),"2001");
		reservation.llenarInputText(reservation.getFristName(), "Maria");*/
		reservation.llenarInputText(reservation.getMidName(), "lola");
		reservation.checkBox(reservation.getTicketLess());
		reservation.llenarInputText(reservation.getTicketLess(), "Maria");
		
		reservation.llenarAddressReser("Calle B Cra C");
		reservation.llenarCiudad("Medellín");
		
		reservation.getBtnReserv().click();
		
		
		
		
			
	}
	
	@Step
	public void ValidateReservetion(){
		
		
			
	}
	
}
