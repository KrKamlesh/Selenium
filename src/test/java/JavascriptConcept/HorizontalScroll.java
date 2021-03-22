package JavascriptConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalScroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
     	driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
     	WebElement Element = driver.findElement(By.linkText("VBScript"));
     	JavascriptExecutor js=(JavascriptExecutor)driver;
     	js.executeScript("arguments[0].scrollIntoView()", Element);

	}

}
