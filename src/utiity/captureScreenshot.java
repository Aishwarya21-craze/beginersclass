package utiity;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class captureScreenshot {
public void capturess(String screenshotname,WebDriver driver) {
	TakesScreenshot obj=(TakesScreenshot)driver;
	File source=obj.getScreenshotAs(OutputType.FILE);
	String path="C:\\Users\\Nandhini.devi\\Desktop\\screenshot\\"+screenshotname+".png";
	File destination=new File(path);
	try {
		System.out.println("hello");
		FileUtils.copyFile(source, destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
