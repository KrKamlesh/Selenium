package Log4jConcept;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practise1 {
	
	Logger log=org.apache.log4j.LogManager.getLogger(Practise1.class);
	WebDriver drver;
	
	@BeforeMethod
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
	log.info("Chromerserver is get heated");
	WebDriver driver=new ChromeDriver();
	log.info("Chrome browser is launched ");
	driver.manage().window().maximize();
	log.info("Browser is get maximized ");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	log.info("wait for 20 seconds ");
	driver.get("https://www.naukri.com/mnjuser/homepage");
	log.info("naukri url is heated  ");
	
}
	@Test
	public void verifyPageTitle()
	{
		
		System.out.println("this is for test");
	}
	
@AfterMethod
public void teardown()
{
	drver.close();
	
}

}
