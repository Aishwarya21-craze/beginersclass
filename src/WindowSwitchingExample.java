import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitchingExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini.devi\\OneDrive - Happiest Minds Technologies Pvt Ltd\\Testing-Training\\selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		Set<String> s1=driver.getWindowHandles();
		Object[] windowslist=s1.toArray();
		System.out.println(windowslist.length);
		int totalnoofwindow=windowslist.length;
		for(int i=0;i<totalnoofwindow;i++) {
			System.out.println(windowslist[i]);
			driver.switchTo().window(windowslist[i].toString());
			System.out.println(driver.getTitle());
			if(!driver.getTitle().equals("Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com")) {
				driver.close();
			}
		}
		

	}

}
