import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementCommands {

	public static void main(String[] args) {
		webElementCommands obj=new webElementCommands();
		obj.registration("nan@gmail.com");
		obj.registration("div@gmail.com");
		obj.registration("test@gmail.com");
	}
	public void registration(String emailid) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini.devi\\OneDrive - Happiest Minds Technologies Pvt Ltd\\Testing-Training\\selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/");
		WebElement textbox=driver.findElement(By.name("emailid"));
		textbox.click();
		textbox.sendKeys(emailid);
		
		WebElement submit_btn=driver.findElement(By.name("btnLogin"));
		submit_btn.click();
		
		WebElement userid_val=driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]"));
		String userid=userid_val.getText();
		
		WebElement password_cal=driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[2]"));
		String password=password_cal.getText();
		
		System.out.println("User Id: "+userid+ " password :"+password);
	}

}
