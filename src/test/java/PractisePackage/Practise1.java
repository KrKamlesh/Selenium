package PractisePackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practise1 {

	
		@Parameters("browser")
		@Test
		public void test1(String browsername)
		{
			if(browsername.equalsIgnoreCase("chrome"))
			{
			System.out.println("Chrome browser is up and runing");
			}
			else if(browsername.equalsIgnoreCase("firefox"))
			{
				System.out.println("firefox browser is up and runing");
				
			}
		
		}}
		
		
	
