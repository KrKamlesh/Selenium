package Seleniumpractise.Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadpPropertyFile {
	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"E:\\Naveen_Automation\\" + "Selenium\\src\\test\\java\\Seleniumpractise\\Selenium\\Config.properties");

		prop.load(fis);
		String browername = prop.getProperty("Browser");

		if (browername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}

}
