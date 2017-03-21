//package gmail.com.keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keywords {

	static FirefoxDriver driver;
	public void openbrowser() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		
	}
	
	public void input(String testData, String objectName) {
		driver.findElement(By.xpath(objectName)).sendKeys(testData);
		
	}
	public void click(String objectName) {
		driver.findElement(By.xpath(objectName)).click();
		
	}

	public void navigate(String testData) {
		driver.get(testData);
		
	}
	
	

}
