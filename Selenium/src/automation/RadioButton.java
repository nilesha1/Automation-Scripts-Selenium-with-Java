package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) 
				{

				System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		
				driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");

				//maximize browser
				driver.manage().window().maximize();
				
				//find radio button webelements on webpage
				List<WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));

				System.out.println("Numbers of radio buttons: " + radioButtonList.size());

				// Click on 1st radio button
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_rblUamOtp_0")).click();
				
				//driver.close();

			}
		}

		
