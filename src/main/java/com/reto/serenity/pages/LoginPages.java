package com.reto.serenity.pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("http://newtours.demoaut.com/mercurysignon.php")
public class LoginPages extends PageObject {

	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	private WebElementFacade linkAlLogin;
	
	@FindBy(name="userName")
	private WebElementFacade txtUser;
	
	@FindBy(name="password")
	private WebElementFacade txtPwd;
	
	@FindBy(name="login")
	private WebElementFacade btnlogin;
	
		
	
	
	public LoginPages(WebDriver driver){
		super(driver);
	}
	
	public void irAlLogin(){
		linkAlLogin.click();
	}
	
	public void llenarLogin(String name, String password){
		
		txtUser.sendKeys(name);
		txtPwd.sendKeys(password);
		btnlogin.click();
	}

	public void llevarOtraPagina() {
		// TODO Auto-generated method stub
		linkAlLogin.click();
		
	}

}
