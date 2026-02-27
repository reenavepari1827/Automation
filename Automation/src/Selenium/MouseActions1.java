package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions1 {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		//Doubleclick
		Actions act=new Actions(driver);
		WebElement Double=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(Double).perform();
		driver.switchTo().alert().accept();
		
		

	}

}
