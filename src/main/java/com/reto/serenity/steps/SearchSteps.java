package com.reto.serenity.steps;

import org.fluentlenium.core.annotation.Page;

import com.reto.serenity.pages.LoginPages;
import com.reto.serenity.pages.SearchPages;
import com.reto.serenity.pages.SearchPages2;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Esta clase contiene los pasos para que los usuarios realize la busqueda de vuelo en la página 
 * @author Alexandra Toyano
 *
 */
public class SearchSteps extends ScenarioSteps{

	private static final long serialVersionUID = -6980860977949003450L;
	
	@Page
	private SearchPages searchPage;
	
	@Page
	private SearchPages2 searchPage2;
	
	/**
	 * abre la URL que tiene el navegador
	 */
	
	@Step
	public void abrirLaPrincipal(){
		searchPage.open();
	}
	
	@Step
	public void irSearch(){
		searchPage.goSearch();
	}
	
	/**
	 * permite llenar para realizar la busqueda de vuelo
	 */
	@Step
	public void fillSearch(){
		
		searchPage.fillSearch("oneway", "3","London","5", "20", "New York","6", "20","First","Blue Skies Airlines");
		searchPage2.fillSearch2("Pangea Airlines$362$274$9:17", "Pangea Airlines$632$282$16:37");	
	}
	
	@Step
	public void validateSearch(){
		
		
			
	}
	
}
