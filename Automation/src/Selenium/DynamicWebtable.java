package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicWebtable {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//total rows (count rows in tbody)
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"rows\"]/tr"));
		System.out.println("Total Rows : " + rows.size());
		
		//total columns (using header row)
		
		List<WebElement> columns=driver.findElements(By.xpath("//table[@id='taskTable\']//tr[@id='headers']/th"));
		System.out.println("Total Columns : " + columns.size());
		
		//Get the value of a specific cell(example second row,third column)
		
		WebElement cell=driver.findElement(By.xpath("//*[@id=\"rows\"]/tr[2]/td[3]"));
		String Value=cell.getText();
		System.out.println("Value in second row,third column : " + Value);
	}

}
