package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_xpath {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Drivers\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();

		driver.get("http:\\www.saucedemo.com");

		//locate username using single attribute
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

		// locate password using multiple attribute
		driver.findElement(By.xpath("//input[@id='password'][@name='password']")).sendKeys("secret_sauce");

		//locate login button
		driver.findElement(By.xpath("//input[@id='login-button']")).click();

		// AND, OR Expression (remove ] [ )
		// driver.findElement(By.xpath("//input[@id='password' and @name='password']")).sendKeys("secret_sauce").click();
		// driver.findElement(By.xpath("//input[@id='password' or  @name='password']")).sendKeys("secret_sauce").click();


	}

}
