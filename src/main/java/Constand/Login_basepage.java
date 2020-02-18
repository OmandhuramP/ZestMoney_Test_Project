package Constand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class Login_basepage {

		public WebDriver driver;

		public Login_basepage(WebDriver driver)
		{
			this.driver=driver;
			
		}
		public boolean verifytitle1(String atitle)
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			try
			{
				wait.until(ExpectedConditions.titleContains(atitle));
				
				String actitle=driver.getTitle();
		        String extitle="Whsetup";
		        Assert.assertEquals(actitle, extitle);
				Reporter.log(atitle + ": title is matching",true);
					}
			catch(Exception e)
			{
				Reporter.log("title is not matching",true);
				Assert.fail();
			}
			return false;
		}

		public void verifyelementpresent(WebElement element)

		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			try
			{
				wait.until(ExpectedConditions.visibilityOf(element));
				Reporter.log("Element is present",true);
			}
			catch (Exception e) {
				Reporter.log("Element is not matching",true);
				Assert.fail();
			}
		}
		
		public boolean verifytitle1(String Index, boolean b) {
			// TODO Auto-generated method stub
			return false;
		
		}
}
