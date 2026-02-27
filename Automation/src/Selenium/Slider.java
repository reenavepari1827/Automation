package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement Slider1=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		Actions Act=new Actions(driver);
		Act.dragAndDropBy(Slider1, -45, 0).perform();
		
		WebElement Slider2=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		Actions Act1=new Actions(driver);
		Act1.dragAndDropBy(Slider2, -175, 0).perform();

	}

}
