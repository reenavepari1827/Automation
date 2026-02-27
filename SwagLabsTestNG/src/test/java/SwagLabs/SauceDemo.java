package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SauceDemo {
WebDriver driver;
@Test(priority=1)
void OpenBrowser() {
	driver=new EdgeDriver();
}
@Test(priority=2)
void LaunchApp() {
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
}
@Test(priority=3)
void UserLogin() {
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
}
@Test(priority=4)
void AddtoCart() {
	driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
}
@Test(priority=5)
void ViewCart() {
	driver.findElement(By.id("shopping_cart_container")).click();
}
@Test(priority=6)
void Checkout() {
	driver.findElement(By.id("checkout")).click();
 }
@Test(priority=7)
void CheckoutYourInformation() {
	driver.findElement(By.id("first-name")).sendKeys("Reena");
	driver.findElement(By.id("last-name")).sendKeys("Vepari");
	driver.findElement(By.id("postal-code")).sendKeys("500085");
}
@Test(priority=8)
	void Continue() {
		driver.findElement(By.id("continue")).click();
	}
@Test(priority=9)
	void Finish() {
		driver.findElement(By.id("finish")).click();
	}

}

