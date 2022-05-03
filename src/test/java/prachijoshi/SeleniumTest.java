package prachijoshi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {

	@Test
	public void parent()
	{
		Assert.assertTrue(3>5);
		System.out.println("parent method");
		System.out.println("I have modified for git hub");
		
	}
	
	
	
	@Test
	public void methodE()
	{
		System.out.println("Selenium test 1");
		System.out.println("I have modified for git hub 2");
	}

	@Test
	public void methodF()
	{
		System.out.println("Selenium test 2");
	}
	
	@Test(dependsOnMethods= {"parent"})
	public void child()
	{
		System.out.println("this is dependent method");
	}

}
