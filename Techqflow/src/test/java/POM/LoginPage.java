package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
  WebDriver driver;
  By Header=By.xpath("//h2");
  By Username=By.name("uid");
  By Password=By.name("password");
  By Submit=By.name("btnLogin");
  String URL=("https://demo.guru99.com/V4/");
  
  public LoginPage(WebDriver driver) {
	  this.driver=driver;
  }

  public void verifyHeader() {
	  String GetHeaderText=driver.findElement(Header).getText();
	  Assert.assertEquals(GetHeaderText, "guru99 Bank","NotMatching");
  }
  
  public void URL() {
	  driver.get(URL);
  }
  
  public void VerifyLogin() {
	  driver.findElement(Username).sendKeys("mngr647969");
	  driver.findElement(Password).sendKeys("nYsetUd");
	  driver.findElement(Submit).click();
	  }
}
