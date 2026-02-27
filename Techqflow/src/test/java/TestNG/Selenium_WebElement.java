package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_WebElement {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement image=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[1]/div/div/div/div/img"));
		File Screenshot=image.getScreenshotAs(OutputType.FILE);
		File LoginTrg=new File("C:\\Users\\HP\\eclipse-workspace\\Techqflow\\Screenshots\\Fashion2.jpg");
		FileUtils.copyFile(Screenshot, LoginTrg);
	}

}

