package CalendarTest;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PicDatefromCalendar {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.get("https://www.redbus.in/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
	
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td[3]")).click();
	
	Thread.sleep(2000);
	
	List<WebElement> date=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));
	int no=date.size();
	System.out.println("the no of data"+no);
	for(int i=0;i<no;i++ )
	{
		String daten=date.get(i).getText();
		
		if(daten.equals("20"))
		{
			date.get(i).click();
			
			break;
		}
	}
	}
}
