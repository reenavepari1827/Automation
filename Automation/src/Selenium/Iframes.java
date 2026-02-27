package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframes {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		WebElement Frame1=driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(Frame1);
		driver.findElement(By.name("mytext1")).sendKeys("Reena");
		driver.switchTo().defaultContent();
		WebElement Frame2=driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
		driver.switchTo().frame(Frame2);
		driver.findElement(By.name("mytext2")).sendKeys("Gowthami");
		driver.switchTo().defaultContent();
		WebElement Frame3=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		driver.switchTo().frame(Frame3);
		driver.findElement(By.name("mytext3")).sendKeys("Bunny");
		driver.switchTo().defaultContent();
		WebElement Frame4=driver.findElement(By.xpath("/html/frameset/frameset/frame[3]"));
		driver.switchTo().frame(Frame4);
		driver.findElement(By.name("mytext4")).sendKeys("Sweety");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(Frame3);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"i9\"]/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"i21\"]/div[2]")).click();
		
		
		
		

	}

}
