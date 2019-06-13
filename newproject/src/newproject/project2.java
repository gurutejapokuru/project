package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		
	
		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.24.0-win64\\geckodriver.exe");

	//WebDriver driver= new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		
	driver.get("http://www.ebay.com");
	
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("sunglasses");
	
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	driver.findElement(By.cssSelector("h3[class='s-item__title']")).click();
	

	WebElement address =driver.findElement(By.cssSelector("select[id='msku-sel-1']"))	;
	
	Select abc=new Select(address);
	
	abc.selectByIndex(4);
	

	
	driver.findElement(By.xpath("//a[@id='binBtn_btn']")).click();
	
	driver.findElement(By.xpath("//button[@id='sbin-gxo-btn']")).click();
	
	driver.findElement(By.cssSelector("input[ type='text']")).sendKeys("guruteja");
	
	driver.findElement(By.cssSelector("input[ autocomplete='family-name']")).sendKeys("pokuru");
	
	driver.findElement(By.cssSelector("input[ autocomplete='address-line1']")).sendKeys("parkroad");
	
	
	driver.findElement(By.cssSelector("input[ autocomplete='address-line2']")).sendKeys("unit505,homebush,double bedroom");
	
	driver.findElement(By.cssSelector("input[id='city']")).sendKeys("sydney");
	
	WebElement state=driver.findElement(By.cssSelector("select[autocomplete='address-level1']"));
	
	Select ab=new Select(state);
	
	ab.selectByIndex(2);
	
	driver.findElement(By.cssSelector("input[autocomplete='email']")).sendKeys("gurutejaaus16@gmail.com");
	
	driver.findElement(By.cssSelector("input[class='input-field af-email-confirm']")).sendKeys("gurutejaaus16@gmail.com");
	    driver.findElement(By.cssSelector("input[autocomplete='tel']")).sendKeys("0992992");
	
    driver.findElement(By.cssSelector( "button[ class='btn btn--primary guest-address-btn']")).click();
	

	
	}
	
	

}
