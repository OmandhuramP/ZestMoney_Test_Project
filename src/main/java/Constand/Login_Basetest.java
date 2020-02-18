package Constand;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

// interface to class should use implements keyword
public abstract class Login_Basetest implements Constandvalue {
 
	//globllay delacre the wwebdriver 
	public WebDriver driver;
	
  //TO open application using the @Before annotation
   @BeforeMethod
  public void  openapplication() {
	//call initialize the driver  and path of webdriver
//   System.setProperty(key,value);
   WebDriverManager.chromedriver().version("80.0.3987.106").setup();
   driver=new ChromeDriver();
   driver.get("https://www.facebook.com/");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
	}
 
 //To close the application use  @After annotation
   @AfterMethod()
   
	 public void Takescreenshort()
		{
			try
			{
				TakesScreenshot ts=(TakesScreenshot)driver;
				File src=ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("./Screenshots/testpage.png"));
			}
			
			
			catch(Exception e)
			{
				System.out.println("while taking screenshot"+e.getMessage());
			}
			
		
		}
}