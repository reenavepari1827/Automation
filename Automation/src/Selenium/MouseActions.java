package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		//Context click
		Actions act=new Actions(driver);
		WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(right).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[2]/span")).click();
		driver.switchTo().alert().accept();
	}

}
