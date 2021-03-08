package BatchTesting;

import org.testng.annotations.Test;

public class PaymentTest {
	
	@Test
	public void paymentInDollar()
	{
		System.out.println("payment is done in Dollar");
	}
	
	@Test
	public void paymentInRS()
	{
		System.out.println("payment is done in Rupees");
	}

}
