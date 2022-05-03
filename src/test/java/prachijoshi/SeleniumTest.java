package prachijoshi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {

	@Test
	public void parent()
	{
		Assert.assertTrue(3>5);
		System.out.println("parent method");
	}
	
	
	
	@Test
	public void methodE()
	{
		System.out.println("Selenium test 1");
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
