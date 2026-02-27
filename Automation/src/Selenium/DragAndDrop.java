package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement Drag=driver.findElement(By.id("draggable"));
		WebElement Drop=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(Drag, Drop).perform();


	}

}
