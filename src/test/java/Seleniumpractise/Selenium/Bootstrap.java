package Seleniumpractise.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		List<WebElement> welt=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		int len=welt.size();
		for(WebElement el:welt)
		{
			String bootval=el.getAttribute("innerHTML");
			if(bootval.contentEquals("HTML"))
			{
				System.out.println(bootval);
				el.click();
				break;
			}
		}
		
		
	/*	
		for(int i=0;i<len;i++)
		{
			WebElement value=welt.get(i);
			String dropdownValue=value.getAttribute("innerHTML");
			if(dropdownValue.contentEquals("JavaScript"))
			{
			System.out.println(dropdownValue);
			value.click();
			}*/
		}
	}


