package Seleniumpractise.Selenium;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups = { "smoke" })
	public void loginbyGmail() {
		System.out.println("Login to the application by Gmal");
	}

	@Test(groups = { "smoke", "sanity" })
	public void loginbyFacebook() {
		System.out.println("Login to the application by Facebook");
	}

	@Test(groups = { "smoke" })
	public void loginbyTwitter() {
		System.out.println("Login to the application by Twitter");

	}

	@Test(groups = { "smoke" })
	public void loginbyHotmail() {
		System.out.println("Login to the application by Hotmail");

	}

	@Test(groups = { "smoke", "sanity" })
	public void loginbyYahoo() {
		System.out.println("Login to the application by Yahoo");

	}

}
