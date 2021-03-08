package Seleniumpractise.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadDataExcel1 {
	static WebDriver driver;
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","E:\\Software2019\\geckodriver.exe");
		 //driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","E:\\Sftwre20\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();
		
		//Get data from excel sheet
		//Xls_Reader reader= new Xls_Reader();
		
		 
		 
		

	}

}
