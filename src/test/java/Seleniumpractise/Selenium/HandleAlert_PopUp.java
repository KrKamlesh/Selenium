package Seleniumpractise.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert_PopUp {

	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	
	Thread.sleep(2000);
	Alert alt= driver.switchTo().alert();
	String st=alt.getText();
	System.out.println(st);
	alt.accept();
	
	Thread.sleep(2000);
	Alert alt1=driver.switchTo().alert();
	alt1.accept();
}
}