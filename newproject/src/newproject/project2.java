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
	
	WebElement firstname=driver.findElement(By.id("af-address1"));
	
	
	firstname.sendKeys("guruteja");
	WebElement lastname=driver.findElement(By.cssSelector("span[class='floating-label']"));
	
	lastname.sendKeys("pokuru");
	
	
	

	
	}
	
	

}
