package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement element= driver.findElement(By.id("input-country"));
		Select dropdown = new Select(element);
		
		
		dropdown.selectByVisibleText("India");
		//dropdown.selectByValue("20");
		//dropdown.selectByIndex(3);   


if(dropdown.isMultiple())
	{
		System.out.println("Dropdown can select multiple options");
	}
else
	{
		System.out.println("Dropdown can not select multiple options");
	}



List <WebElement> alldropdownoptions = dropdown.getOptions();
System.out.println("Total Options: " + alldropdownoptions.size());

	for(WebElement el : alldropdownoptions)
	{
		System.out.println(el.getText());
	}

		
	}

}
