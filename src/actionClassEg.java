import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utiity.webelemntcommands;

public class actionClassEg {
	public static void main(String[] args) {
		webelemntcommands obj1=new webelemntcommands();
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nandhini.devi\\OneDrive - Happiest Minds Technologies Pvt Ltd\\Testing-Training\\selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();

                driver.get(baseUrl);           
               // WebElement link_Home = driver.findElement(By.linkText("Home"));
                obj1.click_linktext("Home", driver);
                WebElement td_Home = driver
                        .findElement(By
                        .xpath("//html/body/div"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr"));    
                 
              
                 
                String bgColor = td_Home.getCssValue("background-color");
                System.out.println("Before hover: " + bgColor);        
                Actions obj=new Actions(driver);
                obj.moveToElement(td_Home).build().perform();
                bgColor = td_Home.getCssValue("background-color");
                System.out.println("After hover: " + bgColor);
                driver.close();
        }
}
