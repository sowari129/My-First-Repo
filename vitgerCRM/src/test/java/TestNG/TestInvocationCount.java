package TestNG;

import org.testng.annotations.Test;

public class TestInvocationCount 
{
	@Test(invocationCount=2)
	public void Sanke()
	{
	System.out.println("buss buss");
	}
	@Test(invocationCount=1)
	public void cat()
	{
		System.out.println("meow meow");
	}
	@Test(invocationCount=4)
	public void dog()
	{
		System.out.println("bow bow");
	}
}
