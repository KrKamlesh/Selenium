

package JavascriptConcept;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownatBottom {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
     	driver.get("http://demo.guru99.com/test/guru99home/");
     	JavascriptExecutor js=(JavascriptExecutor)driver;
     	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

}

