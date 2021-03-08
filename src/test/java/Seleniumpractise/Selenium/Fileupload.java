package Seleniumpractise.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fileupload {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		// Login to naukri
		driver.findElement(By.id("usernameField")).sendKeys("Kamleshkmr12@gmail.com");
		System.out.println("Entered usrname");

		driver.findElement(By.id("passwordField")).sendKeys("7090913878");
		
		System.out.println("Entered password");

		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
		System.out.println("Clicked on Submit buttoon ");

		// WebDriverWait wait=new WebDriverWait(driver,200);
		// WebElement profilename=(WebElement)
		// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@title='Kamlesh
		// Kumar']")));
		// profilename.click();

		Thread.sleep(30000);
		driver.findElement(By.xpath("//div[@title='Kamlesh Kumar']")).click();
		System.out.println("Clicked on profile ");

		Thread.sleep(30000);
		driver.findElement(By.xpath("//div[@id='lazyAttachCV']/div/div/div[2]/div[2]/div/div/div")).click();
		System.out.println("Clicked on Upload button ");

		Robot r = new Robot();
		Thread.sleep(10000);
		StringSelection s = new StringSelection("C:\\Users\\Kamlesh\\Desktop\\Kamlesh_Resume.doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Thread.sleep(10000);
		System.out.println("Copied the file name ");

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		System.out.println("pasted the file path ");

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_R);
		System.out.println("Released the button");

		r.keyPress(KeyEvent.VK_ENTER);
		System.out.println("Pressed the enter button ");

		System.out.println("Congratulations .....Resume uploaded successfully oon naukri");


		
	}

}
