package Seleniumpractise.Selenium;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class LOg4JConcept {

	
	public static void main(String[] args) {
		
	Logger log=Logger.getLogger("LOg4JConcept");
	DOMConfigurator.configure("Log4j.xml");
	log.info("Launch the browser");
	log.info("Login to naukri");
	log.info("Click to home page on naukri");
		/*System.out.println("Login to the application by emal");
		System.out.println("Login to the application by Facebook");
		System.out.println("Login to the application by Twitter");*/
		
	}
	

}
