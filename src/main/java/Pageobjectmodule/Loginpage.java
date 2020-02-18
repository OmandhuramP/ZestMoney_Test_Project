package Pageobjectmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constand.Login_Basetest;


public class Loginpage extends Login_Basetest
{
	
	
	@FindBy(xpath="//input[contains(@id,'email')]")
	private WebElement un;
	
	@FindBy(xpath="//input[contains(@id,'pass')]")
	private WebElement pwd;

	@FindBy(xpath="//label[contains(@id,'loginbutton')]")
	private WebElement login;
	

	public Loginpage(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver, this);
		
		}

public void setusername1(String username1, String password1) {

	try {
		un.sendKeys(username1);
		pwd.sendKeys(password1);
		login.click();
		
	} catch (Exception e) {
		
		System.out.println("Incorrect credentials");
	}
	
}}