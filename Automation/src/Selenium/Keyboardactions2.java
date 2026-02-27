package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Keyboardactions2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputText1")).sendKeys("WELCOME TO SELENIUM");
		Thread.sleep(5000);
		driver.findElement(By.id("inputText2")).sendKeys("WELCOME TO JAVA");
		driver.findElement(By.id("compareButton")).click();
		driver.findElement(By.id("switchButton")).click();
		driver.findElement(By.xpath("//*[@id=\"textCompareForm\"]/div/table/tbody/tr/td[3]/button")).click();
	}

}
