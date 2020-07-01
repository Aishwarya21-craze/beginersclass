import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utiity.captureScreenshot;

public class Login {
	static WebDriver driver;
	@BeforeClass
	public void beforeclassexample() {
		System.out.println("Before class");
	}
	
	
	@Test(groups= {"Smoke","Regression"},priority=1)
	public void Validatelogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini.devi\\OneDrive - Happiest Minds Technologies Pvt Ltd\\Testing-Training\\selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/login.html");
		 WebElement email = driver.findElement(By.id("email"));
	    	email.sendKeys("aishu01@getnada.com");
	    	WebElement pass = driver.findElement(By.id("passwd")); 
	    	pass.sendKeys("Test@123");
	    	driver.findElement(By.id("SubmitLogin")).click();
	    	String succesmsgfromscreen=driver.findElement(By.xpath("/html/body/div[3]/div/div/h3")).getText();
	    	if(succesmsgfromscreen.contentEquals("Successfully Logged in...")) {
	    		System.out.println("login successfully");
	    	}
	    	else {
	    		System.out.println(" Login is Not successful");
	    	}
	}

	
	@AfterTest
	public void closebrowser() {
		driver.quit();
	}
	@AfterClass
	public void afterclassexample() {
		System.out.println("After class");
	}
}
