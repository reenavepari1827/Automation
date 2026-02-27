package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
	 WebDriver driver;
	    By searchInput = By.id("twotabsearchtextbox");
	    By searchButton = By.id("nav-search-submit-button");
	    By Product = By.linkText("iPhone 16 Pro Max 1 TB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Leap in Battery Life. Works with AirPods; White Titanium");
	  
	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }
	    public void enterProductName(String productName) {
	        driver.findElement(searchInput).sendKeys(productName);
	    }
	    public void clickSearchButton() {
	        driver.findElement(searchButton).click();
	    }
	    public void clickProduct() {
	    	driver.findElement(Product).click();
	    }   
}

