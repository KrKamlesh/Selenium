package Seleniumpractise.Selenium;

import org.testng.annotations.Test;

public class HowtoDisableTestcase {

	@Test(enabled=false)
	public void Firsttest()
	{
		System.out.println("This is my first test case");
	}
	@Test
	public void Secondtest()
	{
		System.out.println("This is my seccond test case");
	}
	@Test
	public void Thirdtest()
	{
		System.out.println("This is my third test case");
	}
	@Test(enabled=false)
	public void Fourthtest()
	{
		System.out.println("This is my fourth test case");
	}

}
