package com.reto.serenity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/mercurysignon.php")
public class ReservationPages extends PageObject {

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	private WebElementFacade linkReservation;

	@FindBy(name = "passFirst0")
	private WebElementFacade passFirst;

	@FindBy(name = "passLast0")
	private WebElementFacade passLast;

	@FindBy(name = "pass.0.meal")
	private WebElementFacade selecMeal;

	@FindBy(name = "creditCard")
	private WebElementFacade selectcreditCard;

	@FindBy(name = "creditnumber")
	private WebElementFacade creditnumber;

	@FindBy(name = "cc_exp_dt_mn")
	private WebElementFacade selectExpira;

	@FindBy(name = "cc_exp_dt_yr")
	private WebElementFacade selectExpira2;

	@FindBy(name = "cc_frst_name")
	private WebElementFacade fristName;

	@FindBy(name = "cc_mid_name")
	private WebElementFacade midName;

	@FindBy(name = "ticketLess")
	private WebElementFacade ticketLess;

	@FindBy(name = "billAddress1")
	private WebElementFacade addressReser;

	@FindBy(name = "delAddress2")
	private WebElementFacade addressReser2;

	@FindBy(name = "billCity")
	private WebElementFacade cityReser;

	@FindBy(name = "billState")
	private WebElementFacade stateReser;

	@FindBy(name = "billZip")
	private WebElementFacade billZip;

	@FindBy(name = "billCountry")
	private WebElementFacade billCountry;

	@FindBy(name = "ticketLess")
	private WebElementFacade ticketLess2;

	@FindBy(name = "delAddress1")
	private WebElementFacade delAddress1;

	@FindBy(name = "delAddress2")
	private WebElementFacade delAddress2;

	@FindBy(name = "delCity")
	private WebElementFacade delCity;

	@FindBy(name = "delState")
	private WebElementFacade delState;

	@FindBy(name = "delZip")
	private WebElementFacade delZip;

	@FindBy(name = "delCountry")
	private WebElementFacade delCountry;

	@FindBy(name = "buyFlights")
	private WebElementFacade btnReserv;

	public ReservationPages(WebDriver driver) {
		super(driver);
	}

	public void goToReservation() {
		linkReservation.click();
	}

	

	public void validateReservetion() {
		// TODO Auto-generated method stub

	}
	/****/
	public void llenarInputText(WebElementFacade webElement, String myString) {
		webElement.sendKeys(myString);
	}
	
	public void selectCombo(WebElementFacade selectCombo, String value){
		selectCombo.selectByValue(value);		
	}
	
	public void checkBox(WebElementFacade check){
		check.click();
	}
	
	public void llenarAddressReser(String miDireccion){
		addressReser.sendKeys(miDireccion);
	}
	
	public void llenarCiudad(String miCiudad){
		cityReser.sendKeys(miCiudad);
	}
	
	
	
	/*****/
	
	/*************************/

	public WebElementFacade getLinkReservation() {
		return linkReservation;
	}

	public void setLinkReservation(WebElementFacade linkReservation) {
		this.linkReservation = linkReservation;
	}

	public WebElementFacade getPassFirst() {
		return passFirst;
	}

	public void setPassFirst(WebElementFacade passFirst) {
		this.passFirst = passFirst;
	}

	public WebElementFacade getPassLast() {
		return passLast;
	}

	public void setPassLast(WebElementFacade passLast) {
		this.passLast = passLast;
	}

	public WebElementFacade getSelecMeal() {
		return selecMeal;
	}

	public void setSelecMeal(WebElementFacade selecMeal) {
		this.selecMeal = selecMeal;
	}

	public WebElementFacade getSelectcreditCard() {
		return selectcreditCard;
	}

	public void setSelectcreditCard(WebElementFacade selectcreditCard) {
		this.selectcreditCard = selectcreditCard;
	}

	public WebElementFacade getCreditnumber() {
		return creditnumber;
	}

	public void setCreditnumber(WebElementFacade creditnumber) {
		this.creditnumber = creditnumber;
	}

	public WebElementFacade getSelectExpira() {
		return selectExpira;
	}

	public void setSelectExpira(WebElementFacade selectExpira) {
		this.selectExpira = selectExpira;
	}

	public WebElementFacade getSelectExpira2() {
		return selectExpira2;
	}

	public void setSelectExpira2(WebElementFacade selectExpira2) {
		this.selectExpira2 = selectExpira2;
	}

	public WebElementFacade getFristName() {
		return fristName;
	}

	public void setFristName(WebElementFacade fristName) {
		this.fristName = fristName;
	}

	public WebElementFacade getMidName() {
		return midName;
	}

	public void setMidName(WebElementFacade midName) {
		this.midName = midName;
	}

	public WebElementFacade getTicketLess() {
		return ticketLess;
	}

	public void setTicketLess(WebElementFacade ticketLess) {
		this.ticketLess = ticketLess;
	}

	public WebElementFacade getAddressReser() {
		return addressReser;
	}

	public void setAddressReser(WebElementFacade addressReser) {
		this.addressReser = addressReser;
	}

	public WebElementFacade getAddressReser2() {
		return addressReser2;
	}

	public void setAddressReser2(WebElementFacade addressReser2) {
		this.addressReser2 = addressReser2;
	}

	public WebElementFacade getCityReser() {
		return cityReser;
	}

	public void setCityReser(WebElementFacade cityReser) {
		this.cityReser = cityReser;
	}

	public WebElementFacade getStateReser() {
		return stateReser;
	}

	public void setStateReser(WebElementFacade stateReser) {
		this.stateReser = stateReser;
	}

	public WebElementFacade getBillZip() {
		return billZip;
	}

	public void setBillZip(WebElementFacade billZip) {
		this.billZip = billZip;
	}

	public WebElementFacade getBillCountry() {
		return billCountry;
	}

	public void setBillCountry(WebElementFacade billCountry) {
		this.billCountry = billCountry;
	}

	public WebElementFacade getTicketLess2() {
		return ticketLess2;
	}

	public void setTicketLess2(WebElementFacade ticketLess2) {
		this.ticketLess2 = ticketLess2;
	}

	public WebElementFacade getDelAddress1() {
		return delAddress1;
	}

	public void setDelAddress1(WebElementFacade delAddress1) {
		this.delAddress1 = delAddress1;
	}

	public WebElementFacade getDelAddress2() {
		return delAddress2;
	}

	public void setDelAddress2(WebElementFacade delAddress2) {
		this.delAddress2 = delAddress2;
	}

	public WebElementFacade getDelCity() {
		return delCity;
	}

	public void setDelCity(WebElementFacade delCity) {
		this.delCity = delCity;
	}

	public WebElementFacade getDelState() {
		return delState;
	}

	public void setDelState(WebElementFacade delState) {
		this.delState = delState;
	}

	public WebElementFacade getDelZip() {
		return delZip;
	}

	public void setDelZip(WebElementFacade delZip) {
		this.delZip = delZip;
	}

	public WebElementFacade getDelCountry() {
		return delCountry;
	}

	public void setDelCountry(WebElementFacade delCountry) {
		this.delCountry = delCountry;
	}

	public WebElementFacade getBtnReserv() {
		return btnReserv;
	}

}
