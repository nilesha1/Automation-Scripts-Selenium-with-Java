package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageWithLink {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com");
		
		driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).click();
		
		//Verify the title of the current page with the expected home page title
		if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("Test Passed");
		}
		
		else
		{
			System.out.println("Test Failed");
		}

	}

}
