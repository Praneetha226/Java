package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testtest{
		public static void main(String [] args){
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
			String PageTitle = driver.getTitle();
	if(PageTitle.equals("Google")){
	System.out.println("Google Application is launched - Passed");
		}
		else{
		System.out.println("Google Application is not launched");  
		driver.close();
	}
	}
	}
