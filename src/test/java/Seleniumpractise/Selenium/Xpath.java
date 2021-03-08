package Seleniumpractise.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*driver.manage().deleteAllCookies();
		//Finding webelement using id 
		driver.findElement(By.id("email")).sendKeys("kamleshkmr12@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("7090913878");
		//driver.findElement(By.name("login")).click();
		WebElement web =driver.findElement(By.tagName("a"));*/
		
		String name=driver.findElement(By.xpath("//*[text()='Google offered in']")).getText();
		System.out.println(name);
		
		
		
		//driver.quit();	
		
	}

}
