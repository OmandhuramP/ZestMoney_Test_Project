package Testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Constand.Login_Basetest;
import Pageobjectmodule.Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginscript extends Login_Basetest {
	
	
		@Test()
	    public void testhomepage() throws Exception
	    {
			WebDriverManager.chromedriver().version("80.0.3987.106").setup();
			Loginpage lp=new Loginpage(driver);
	    	lp.setusername1("Enter the Username","Enter the Password");
	}
}

	