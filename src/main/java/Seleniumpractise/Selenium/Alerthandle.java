package Seleniumpractise.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerthandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\Software2019\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println("Entered URl");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		System.out.println("Clicked on Log in");
		Alert alert=driver.switchTo().alert();
		System.out.println("Switched to Alert pop up");
		alert.accept();
		System.out.println("Clicked on Ok");
		driver.close();
		System.out.println("Window getclosed ");
		
		
	}

}
