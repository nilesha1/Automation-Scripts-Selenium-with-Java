package automation;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class CartPage {

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

					
					driver.findElement(By.id("shopping_cart_container")).click();

					//*************use assert to validate price then Do click on checkout  ***********

					
					driver.findElement(By.id("checkout")).click();
					driver.findElement(By.id("first-name")).sendKeys("ABC");
					driver.findElement(By.id("last-name")).sendKeys("XYZ");
					driver.findElement(By.id("postal-code")).sendKeys("600811");
					driver.findElement(By.id("continue")).click();

					
					//*************use assert to validate product name & price then Do click on checkout  ***********

					driver.findElement(By.id("finish")).click();

					/* **********Validate Success msg "THANK YOU FOR YOUR ORDER"
				(Your order has been dispatched, and will arrive just as fast as the pony can get there!) )
					then click "Back Home" button
					*/
			}

	}
