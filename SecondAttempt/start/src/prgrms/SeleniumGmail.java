package prgrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumGmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		/*driver.get("https://accounts.google.com/ServiceLogin?");
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("hari.praneetha");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("12345");
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();*/
		
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("hari.praneetha");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("pwd")).sendKeys("12345");
		driver.findElement(By.id("signIn")).click();
		driver.close();
	}
}
