package Seleniumpractise.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paralleltesting {
	WebDriver driver;
	@Parameters("Browser")
	@Test
	public void parallelBrowser(String browsername)
	{
		
		
      
		if(browsername.equalsIgnoreCase("chrome"))
	{
			System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
			 driver=new ChromeDriver();
	}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		//driver.manage().window().maximize();
		driver.get("https://www.naukri.com/mnjuser/homepage");
		String url=driver.getCurrentUrl();
		System.out.println(url);
	

}}
