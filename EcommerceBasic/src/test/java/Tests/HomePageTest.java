package Tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.HomePage;
import pages.ProductPage;
public class HomePageTest  extends BaseTest{
	@Test
	public void testSearch()  {
	  HomePage homePage=new HomePage(driver);
	  homePage.enterProductName("iphone 16pro max");
	  homePage.clickSearchButton(); 
	  homePage.clickProduct();
	 
	  // Switch to the new tab (if opened)
	 
	  for(String window : driver.getWindowHandles()) {
		  driver.switchTo().window(window); 
	  }
	  ProductPage productpage=new ProductPage(driver);
	  String title= productpage.getProductTitle();
	  System.out.println("Product Title: " +  title);
	  Assert.assertTrue(title.toLowerCase().contains("iphone"),"Product title does not contain 'iphone'");  
	}
}


