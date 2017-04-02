package prgrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods1 {
public static	WebDriver driver;
public void launchBrowser(){
	driver = new FirefoxDriver();
}
	public void adminLogin(){
		
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
	}
	
	public void adminLogin(String username, String password){
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods1 obj1 = new Methods1();
		obj1.launchBrowser();
		obj1.adminLogin();
		obj1.adminLogin("admin", "admin@123");
	}
}

