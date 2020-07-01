import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Firstclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini.devi\\OneDrive - Happiest Minds Technologies Pvt Ltd\\Testing-Training\\selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.makemytrip.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();

	}

}
