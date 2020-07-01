import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownExample {

	public static void main(String[] args) {
		
		dropDownExample obj=new dropDownExample();
		//obj.login();
		obj.selectoptionsinamazon();
	}
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini.devi\\OneDrive - Happiest Minds Technologies Pvt Ltd\\Testing-Training\\selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/");
		WebElement dd=driver.findElement(By.className("dropdown-toggle"));
		dd.click();
		driver.manage().window().maximize();
		WebElement loginoption=driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[11]/a"));
		loginoption.click();
		
		WebElement emailid_txtbox=driver.findElement(By.id("email"));
		emailid_txtbox.sendKeys("nan@gmail.com");
		
		WebElement password_txtbox=driver.findElement(By.id("passwd"));
		password_txtbox.sendKeys("password123");
		
		WebElement signin_btn=driver.findElement(By.id("SubmitLogin"));
		signin_btn.click();
		
		WebElement sign_successmsg=driver.findElement(By.xpath("/html/body/div[2]/div/div/h3"));
		String msg=sign_successmsg.getText();
		
		System.out.println(msg);
		
		if(msg.equals("Successfully Logged in...")) {
			System.out.println("Login in successfull");
		}
	}
	public void selectoptionsinamazon() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini.devi\\OneDrive - Happiest Minds Technologies Pvt Ltd\\Testing-Training\\selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement dd=driver.findElement(By.id("searchDropdownBox"));
		dd.click();
		Select obj=new Select(dd);
		obj.selectByValue("search-alias=amazon-devices");
	}

}
