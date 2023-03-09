package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollpage {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		// 1. Scroll vertically down by 500 pixels
		// js.executeScript("window.scrollBy(0,500)"); 	


		// 2. till the bottom of the webpage 
		// js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	
		// 3. Scroll till visibility of web element
		 WebElement element = driver.findElement(By.linkText("BMI Calculator"));
		 js.executeScript("arguments[0].scrollIntoView()" , element );

	 
		// 4. Horizontal scroll on the web page
		// WebElement element = driver.findElement(By.linkText("BMI Calculator"));
	    // js.executeScript("arguments[0].scrollIntoView()" , element );

		
	}

}
