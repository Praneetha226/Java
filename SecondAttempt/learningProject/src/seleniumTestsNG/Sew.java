package seleniumTestsNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sew {
	@Test
	public void verifyTitle(){
	WebDriver driver = new FirefoxDriver();   
	driver.get("https://www.gmail.com");
	String pageTitle = driver.getTitle();
	Assert.assertEquals(pageTitle, "Gmail");
	}
}
