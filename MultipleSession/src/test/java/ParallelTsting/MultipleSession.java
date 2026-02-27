package ParallelTsting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleSession {
  WebDriver driver;
  @Test(priority=1)
  public void executeSessionOne() {
	  driver=new EdgeDriver();
	  driver.get("https://demo.guru99.com/V4");  
  }
  @Test(priority=2)
  public void executeSessionTwo() {
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/V4");  
  }
  @Test(priority=3)
  public void executeSessionThree() {
	  driver=new FirefoxDriver();
	  driver.get("https://demo.guru99.com/V4");  
  }
}
