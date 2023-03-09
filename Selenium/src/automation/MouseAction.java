package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe");
WebDriver driver = new ChromeDriver();

/*
//right click action by Mouse
driver.get("https:demoqa.com/buttons");
WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));

Actions act = new Actions(driver);
act.contextClick(button).perform();  
*/


/*
//double click
driver.get("https:demoqa.com/buttons");
WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));

Actions act = new Actions(driver);
act.doubleClick(button).perform();    // double click method is used to perform doubleClick() action.
*/


/*
//Drag and Drop -- find source and target WebElement 
driver.get("https://testautomationpractice.blogspot.com/");

WebElement source = driver.findElement(By.id("draggable"));
WebElement target = driver.findElement(By.id("droppable"));

Actions act = new Actions(driver);
act.dragAndDrop(source, target).perform();
//dragAndDrop(sourceElement, targetElement);
*/


// Mouse- hover action
driver.get("https://testautomationpractice.blogspot.com/");
WebElement element = driver.findElement(By.id("age"));

Actions act = new Actions(driver);
act.moveToElement(element).perform();


		
		
	}

}
