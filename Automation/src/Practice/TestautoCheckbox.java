package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestautoCheckbox {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> DAYS=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		System.out.println(DAYS.size());
		for(int i=0;i<DAYS.size();i++) {
			DAYS.get(i).click();
		}
	}

}
