package Seleniumpractise.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshots {

	public static void main(String[] args) throws IOException, InterruptedException
		{
	
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//Login to naukri
		driver.findElement(By.id("usernameField")).sendKeys("Kamleshkmr12@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("7090913878");
		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
		
		TakesScreenshot src= ((TakesScreenshot)driver);
		Thread.sleep(30000);
		File srcfile=src.getScreenshotAs(OutputType.FILE);
		File destfile=new File("‪C:\\Users\\Kamlesh\\Desktop\\Screenshot folder");
		FileUtils.copyFile(srcfile, destfile);
		

	}

}
