package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {
	WebDriver driver;	
	
	@Before
	public void launchBrowser() {
		// Create Object and Set Property		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		// Set Url
		driver.get("https://objectspy.space/");
		//Maximize
		driver.manage().window().maximize();
		//Delete Cookies
		driver.manage().deleteAllCookies();
		//Define Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	@Test
	 public void learnElementlocators() throws InterruptedException {
		//By Name 
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		 
		 //Upload file if you have INPUT Tag
		 //Other than Input Tag use Robot Class
		// driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\19723\\OneDrive\\Desktop\\MixMax\\CCMC\\ccmc_barcode @ Divasha Pangeni");
		//By Link Text
//		 driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
//		//Wait
//		 Thread.sleep(5000);
//		 //Navigate back
//		 driver.navigate().back();
//		// By Partial Link Text
//		// driver.findElement(By.partialLinkText("TF-API")).click();
//		// driver.findElement(By.partialLinkText("Product")).click();
		 
		// CSS Selector
		 driver.findElement(By.cssSelector("input#sex-0")).click();
		//driver.findElement(By.cssSelector("input[value='7']")).click();
		 driver.findElement(By.cssSelector("input[type='radio'][id='exp-3']")).click();
		 
	// Using Xpath
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Raju");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pangeni");
		 driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("abc123");
		 driver.findElement(By.xpath("//input[@id='sex-0']")).click();
		 driver.findElement(By.xpath("//input[@id='exp-6']")).click();
//		 driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
//		 driver.findElement(By.xpath("//strong[contains(text(),'Link Test : Page Change')]")).click();
		 
	}
	
	public void tearDown() {
		driver.close();
	//	driver.quit();
		
	}
}
