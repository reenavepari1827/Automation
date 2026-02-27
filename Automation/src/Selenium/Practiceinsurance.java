package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practiceinsurance {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		driver.manage().window().maximize();
		Select Title=new Select(driver.findElement(By.id("user_title")));
		Title.selectByValue("Miss");
		driver.findElement(By.id("user_firstname")).sendKeys("tom");
		driver.findElement(By.id("user_surname")).sendKeys("jerry");
		driver.findElement(By.id("user_phone")).sendKeys("908******9");
		Select Year=new Select(driver.findElement(By.id("user_dateofbirth_1i")));
		Year.selectByValue("1990");
		Select Month=new Select(driver.findElement(By.id("user_dateofbirth_2i")));
		Month.selectByValue("5");
		Select Date=new Select(driver.findElement(By.id("user_dateofbirth_3i")));
		Date.selectByValue("27");
		driver.findElement(By.id("licencetype_f")).click();
		Select License_Period=new Select(driver.findElement(By.id("user_licenceperiod")));
		License_Period.selectByValue("4");
		Select Occupation=new Select(driver.findElement(By.id("user_occupation_id")));
		Occupation.selectByVisibleText("Doctor");
		driver.findElement(By.id("user_address_attributes_street")).sendKeys("skystreet");
		driver.findElement(By.id("user_address_attributes_city")).sendKeys("Hyderabad");
		driver.findElement(By.id("user_address_attributes_county")).sendKeys("India");
		driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("500frk");
		driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("tom@abc.com");
		driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("tom@123");
		driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("tom@123");
		driver.findElement(By.name("submit")).click();






	}

}
