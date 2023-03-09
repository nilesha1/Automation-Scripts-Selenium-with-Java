package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open url
		driver.get("http://uitestpractice.com/Students/Switchto");
	
		//click on btn so that alert can pop-up
		//driver.findElement(By.xpath("//button[@id='alert']")).click();
		//driver.findElement(By.xpath("//button[@id='confirm']")).click();
		driver.findElement(By.xpath("//button[@id='prompt']")).click();

		//switch to alert window and to press Ok/ cancel/ give some input 
		driver.switchTo().alert().sendKeys("user1");
		driver.switchTo().alert().accept();   // use accept() to confirm alert or press OK on alert.
		//driver.switchTo().alert().dismiss();  // use dismiss() to cancel alert

		
	}

}
