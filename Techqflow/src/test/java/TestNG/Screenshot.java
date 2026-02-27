package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		TakesScreenshot Ts=(TakesScreenshot)driver;
		File loginPage=Ts.getScreenshotAs(OutputType.FILE);
		File loginTrg=new File("C:\\Users\\HP\\eclipse-workspace\\Techqflow\\Screenshots\\amazon2.png");
		FileUtils.copyFile(loginPage, loginTrg);
	}
}
