package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) 
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/upload-download");
		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\Nilesh\\Desktop\\fileSample.txt");
		
	}

	
	
	
}
