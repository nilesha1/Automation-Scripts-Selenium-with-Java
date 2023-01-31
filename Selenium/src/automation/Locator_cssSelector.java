package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_cssSelector {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//open webpage
		driver.get("http:\\www.saucedemo.com");

		//locate username 	  -- tag#id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

		//locate password 	  -- tag[attribute=value] 
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");

		//locate login button -- tag.value of class Name
		driver.findElement(By.cssSelector("input.submit-button")).click();

		// value of class  	  -- tag.valueofClass[attribute=value]
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();

	}

}
