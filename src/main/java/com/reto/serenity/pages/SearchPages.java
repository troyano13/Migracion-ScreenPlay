package com.reto.serenity.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/mercurysignon.php")
public class SearchPages extends PageObject {

	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")
	private WebElementFacade linkSearch;

	@FindBy(name = "tripType")
	private List<WebElementFacade> radioTipo;

	@FindBy(name = "passCount")
	private WebElementFacade selectPassenger;

	@FindBy(name = "fromPort")
	private WebElementFacade selectFrom;

	@FindBy(name = "fromMonth")
	private WebElementFacade selectOn;

	@FindBy(name = "fromDay")
	private WebElementFacade selectFromDay;

	@FindBy(name = "toPort")
	private WebElementFacade selectArriving;

	@FindBy(name = "toMonth")
	private WebElementFacade selectMonth;

	@FindBy(name = "toDay")
	private WebElementFacade selectToDay;

	@FindBy(name = "servClass")
	private List<WebElementFacade> selectServClass;

	@FindBy(name = "airline")
	private WebElementFacade selectAirline;

	@FindBy(name = "findFlights")
	private WebElementFacade btnNext;

	public SearchPages(WebDriver driver) {
		super(driver);
	}

	public void goSearch() {
		linkSearch.click();
	}

	/**
	 * Datos que el usuario desea buscar el vuelo en la pagina
	 * @param tipo
	 * @param passenger
	 * @param from
	 * @param on
	 * @param fromDay
	 * @param arriving
	 * @param month
	 * @param toDay
	 * @param servClass
	 * @param airline
	 */
	public void fillSearch(String tipo, String passenger,String from,String on,String fromDay,String arriving,String month,String toDay,String servClass,String airline){
		
		for(WebElementFacade webradio: radioTipo ){
			if(webradio.getValue().equals(tipo)){
				webradio.click();
			}
		}
		selectPassenger.selectByValue(passenger);
		selectFrom.selectByValue(from);
		selectOn.selectByValue(on);
		selectFromDay.selectByValue(fromDay);
		selectArriving.selectByValue(arriving);
		selectMonth.selectByValue(month);
		selectToDay.selectByValue(toDay);
		for(WebElementFacade webServClass: selectServClass ){
			if(webServClass.getValue().equals(servClass)){
				webServClass.click();
			}
		}
		selectAirline.selectByVisibleText(airline);
		btnNext.click();
		
		
		
	}

	public void validateSearch() {
		// TODO Auto-generated method stub

	}

}
