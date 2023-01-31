package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountBrokenlinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize browser
		driver.manage().window().maximize();

		//wait  seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(0, null).
		
		//open url
		driver.get("http://www.deadlinkcity.com/");

		//find hyperlinks
		List<WebElement> hyperlinks_list = driver.findElements(By.tagName("a"));

		for(WebElement element: hyperlinks_list)
		{
		String url= element.getAttribute("href");
		System.out.println(url);
		
		}
		
		
	}
}
