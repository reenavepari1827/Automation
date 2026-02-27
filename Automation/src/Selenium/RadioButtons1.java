package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButtons1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://qa-automation-practice.netlify.app/radiobuttons.html");
		driver.manage().window().maximize();
		
		List<WebElement> Radios=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total radio buttons found: " + Radios.size());
		
		//Loop through each radio button and click if enabled
		for (WebElement radio : Radios) {
		    if (radio.isEnabled()) {
		        radio.click();
		        System.out.println("Clicked: " + radio.getAttribute("id"));
		        Thread.sleep(1000);
		    }
		}
	}

}
