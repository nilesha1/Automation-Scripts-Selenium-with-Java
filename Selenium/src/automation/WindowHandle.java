package automation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Open new tab or window in browser
		driver.get("http://www.google.com/");
		System.out.println("first page: " + driver.getTitle());
		
		//Open new tab in browser
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println("second tab: " + driver.getTitle());

		//get window handles of open windows
		Set <String> windowhandles = driver.getWindowHandles();

		List <String> handles = new ArrayList<String>();
		handles.addAll(windowhandles);
	
		
		/*
		// Switch back to first tab again using index position
		driver.switchTo().window(handles.get(0)); 		//switch to google.com
		System.out.println("First page: "+ driver.getTitle());
		*/

	}

	
}
