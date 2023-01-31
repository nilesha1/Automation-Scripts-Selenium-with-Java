package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Productpage {

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

			// switch to product page (not required for saucedemo.com)
			// String currWindowHandle = driver.getWindowHandle();
			// driver.switchTo().window(currWindowHandle);

			// locate Sauce Lab Bolt T-shirt
			driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();

			
			// Locate & click on Add to Cart button 
			try 
			{
				
				Thread.sleep(3000);
				driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();

			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
