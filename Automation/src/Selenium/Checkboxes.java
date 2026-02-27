package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		List<WebElement> CHECK=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(CHECK.size());
		for(int i=1;i<CHECK.size();i++) {
			CHECK.get(i).click();
		}

	}

}
