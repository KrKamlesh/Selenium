package Seleniumpractise.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class RightclickDoubleclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	
		//Perform right click on the webelement
		Actions act =new Actions(driver);
		//act.contextClick(driver.findElement(By.xpath("//span[contains(text(),'right click me')]"))).perform();
		
		//Perform double click 
		
		act.doubleClick(driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"))).perform();
		Alert at= driver.switchTo().alert();
		String alttext=at.getText();
		System.out.println(alttext);
		at.accept();
		
		
		
	}

}
