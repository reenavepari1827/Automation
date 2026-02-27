package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputText1")).sendKeys("WELCOME TO SELENIUM");
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(4000);
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		driver.findElement(By.id("compareButton")).click();
		driver.findElement(By.xpath("//*[@id=\"textCompareForm\"]/div/table/tbody/tr/td[1]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("toLowerCaseButton")).click();

	}

}
