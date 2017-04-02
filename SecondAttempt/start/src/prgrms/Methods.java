package prgrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
public static	WebDriver driver = new FirefoxDriver();
	public void adminLogin(){
		
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods obj = new Methods();
		obj.adminLogin();
		driver.close();
	}

}
