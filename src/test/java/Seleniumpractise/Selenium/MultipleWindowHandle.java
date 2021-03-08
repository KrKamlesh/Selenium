package Seleniumpractise.Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		
		String parentwindow=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		Iterator <String> it=s1.iterator();
		while(it.hasNext())
		{
			String childwindow=it.next();
			if(!childwindow.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(childwindow);
				String chiturl=driver.getCurrentUrl();
				System.out.println(chiturl);
				driver.quit()
				;
			}
		}
		driver.switchTo().window(parentwindow);
		String paretwindow=driver.getCurrentUrl();
		System.out.println(paretwindow);
		
	}

}
