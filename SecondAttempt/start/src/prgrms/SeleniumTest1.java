package prgrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
driver.findElement(By.linkText("Gmail")).click();
String url = driver.getCurrentUrl();
System.out.println(url);
driver.get("https://www.google.com/gmail/about/");
driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
String url1 = driver.getCurrentUrl();
System.out.println(url1);
driver.close();
	}

}
