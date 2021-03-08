

package Seleniumpractise.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_SignUp 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test1");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Result1");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Testpassword1");
		
		WebElement day=driver.findElement(By.xpath("//Select[@id='day']"));
		Select sel =new Select(day);
		sel.selectByValue("4");
		
		WebElement month=driver.findElement(By.xpath("//Select[@id='month']"));
		Select sel1 =new Select(month);
		sel1.selectByVisibleText("Mar");
		
		
		WebElement year=driver.findElement(By.xpath("//Select[@id='year']"));
		Select sel2 =new Select(year);
		sel2.selectByIndex(29);
		
		driver.findElement(By.xpath("//input[@type='radio'and @value='2']")).click();
		
		driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _6o _6v']")).click();
	}

}
