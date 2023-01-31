package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		//open web page
		driver.get("https://www.saucedemo.com/");

		//locate username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		//locate password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");

		//locate login Button
		driver.findElement(By.className("submit-button")).click();

		/*
		//using tagName
		//driver.findElement.(By.tagName("input")).sendKeys("password");
		// here, input tag is used for multiple fields. So it will consider 1st input tag of username field.

		//click on hyperlink
		//driver.findElement(By.linkText("HyperLinked Text"));

		//Locate Sauce Labs Bolt T-shirt
		List <WebElement> elementList = driver.findElements(By.partialLinkText("Sauce"));
		System.out.println("Element size: "+ elementList.size());

		//sauce will locate only first product, even if there is multiple matching products
		*/

	
	}

}


