package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		driver.manage().window().maximize();
		WebElement usertitle=driver.findElement(By.id("user_title"));
		Select Title=new Select(usertitle);
		// By Index
		Title.selectByIndex(2);
		// By Value
		Title.selectByValue("Doctor");
		// By VisibleText
		Title.selectByVisibleText("Duchess");
		// By Contains VisibleText
		Title.selectByContainsVisibleText("General");
		Select Year=new Select(driver.findElement(By.id("user_dateofbirth_1i")));
		Year.selectByIndex(1);
		// for month
		Select Month=new Select(driver.findElement(By.id("user_dateofbirth_2i")));
		Month.selectByValue("4");
		// for Date
		Select Date=new Select(driver.findElement(By.id("user_dateofbirth_3i")));
		Date.selectByVisibleText("7");
		// for License period
		Select License_Period=new Select(driver.findElement(By.id("user_licenceperiod")));
		License_Period.selectByValue("4");
		// for occupation
		Select Occupation=new Select(driver.findElement(By.id("user_occupation_id")));
		Occupation.selectByVisibleText("Doctor");
		
		

	}

}
