package com.reto.serenity.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/mercurysignon.php")
public class SearchPages2 extends PageObject {

	@FindBy(name = "outFlight")
	private List<WebElementFacade> frameFlight;

	@FindBy(name = "inFlight")
	private List<WebElementFacade> frameFlight2;

	@FindBy(name = "reserveFlights")
	private WebElementFacade btnReser;

	public SearchPages2(WebDriver driver) {
		super(driver);
	}


	public void fillSearch2(String paramCheck1, String check2) {

		for (WebElementFacade check : frameFlight) {
			if (check.getValue().equals(paramCheck1)) {
				check.click();
			}
		}
		for (WebElementFacade check : frameFlight2) {
			if (check.getValue().equals(check2)) {
				check.click();
			}
		}
		btnReser.click();
	}

	public void llevarOtraPagina() {
		// TODO Auto-generated method stub

	}

}
