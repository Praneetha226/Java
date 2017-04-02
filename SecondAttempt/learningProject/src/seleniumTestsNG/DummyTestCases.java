package seleniumTestsNG;

import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.testng.Assert;

public class DummyTestCases {
	@Test
	public void testA()
	{
		Assert.assertEquals("Google", "Google");
	}
	@Test
	public void testB()
	{
		Assert.assertEquals("Gmail", "Gmail");
	}
	@Test
	public void testC()
	{
		Assert.assertEquals("Yahoo", "Yahoo");
	}

}
