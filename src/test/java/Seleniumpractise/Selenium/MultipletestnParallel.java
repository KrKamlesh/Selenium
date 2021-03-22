package Seleniumpractise.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipletestnParallel {
	
	@Test
	public void launch1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
	}
	
	
	@Test
	public void launch2()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
	}

	@Test
	public void launch3()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
	}
}
