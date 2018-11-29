package com.reto.serenity.pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("http://newtours.demoaut.com/mercurysignon.php")
public class RegisterPages extends PageObject {

	@FindBy(xpath="/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]")
	private WebElementFacade linkResgister;
	
	@FindBy(name="firstName")
	private WebElementFacade txtFirstName;
	
	@FindBy(name="lastName")
	private WebElementFacade txtLastName;
	
	@FindBy(name="phone")
	private WebElementFacade txtphone;
	
	@FindBy(id="userName")
	private WebElementFacade txtEmail;
	
	@FindBy(name="address1")
	private WebElementFacade txtAddress;
	
	@FindBy(name="city")
	private WebElementFacade txtCity;
	
	@FindBy(name="state")
	private WebElementFacade txtState;
	
	@FindBy(name="postalCode") 
	private WebElementFacade txtCodePostal;
		
	@FindBy(name="country")
	private WebElementFacade selectCountry;
	
	@FindBy(id="email")
	private WebElementFacade txtUser;
	
	@FindBy(name="password") 
	private WebElementFacade txtPassword;
	
	@FindBy(name="confirmPassword") 
	private WebElementFacade txtConfirmPass;

	@FindBy(name="register")
	private WebElementFacade btnSubmit;
	
	
		
	
	
	public RegisterPages(WebDriver driver){
		super(driver);
	}
	
	public void irRegister(){
		linkResgister.click();
	}
	
	/***
	 * Almacena en el sistema los siguientes valores
	 * @param name
	 * @param password
	 * @param phone
	 * @param email
	 * @param address
	 * @param city
	 * @param state
	 * @param codePostal
	 * @param valorCountry
	 * @param user
	 * @param password2
	 * @param confirmPass
	 */
	public void llenarRegister(String name, String password, String phone, String email, String address,
			String city,String state,String codePostal, String valorCountry, String user, String password2, String confirmPass){
		
		txtFirstName.sendKeys(name);
		txtLastName.sendKeys(password);
		txtphone.sendKeys(phone);
		txtEmail.sendKeys(email);
		txtAddress.sendKeys(address);
		txtCity.sendKeys(city);
		txtState.sendKeys(state);
		txtCodePostal.sendKeys(codePostal);
		selectCountry.selectByValue(valorCountry);
		txtUser.sendKeys(user);
		txtPassword.sendKeys(password2);
		txtConfirmPass.sendKeys(confirmPass);
		
		btnSubmit.click();
	}

	public void valideRegistry() {
		
		final String urlRegistryExito = "http://newtours.demoaut.com/create_account_success.php";
		final String urlActual = getDriver().getCurrentUrl();
		
		//Assert.assertEquals("si se realizo el regsitro", urlRegistryExito, urlActual);
	}
	

}
