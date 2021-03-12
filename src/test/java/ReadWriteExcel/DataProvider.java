package ReadWriteExcel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class DataProvider {
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Test
	public void logintest()
	{
		
	}
	
	//@Dataprovider
	public String[][] getdata()
	{
		String logindata[][]={{"Kamleshkmr2@gmail.com","7090913878@k","Valid"},
				              {"Kamleshkm@gmail.com","451262","Invalid"},
				              {"Kamleshk@gmail.com","222jjj","Invalid"},
				              {" Kamles@gmail.com","4555jkk","Invalid"}};
		return logindata;  
	}

}
