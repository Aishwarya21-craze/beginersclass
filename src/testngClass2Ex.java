import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testngClass2Ex {
	ExtentReports report;
	ExtentTest test;
@BeforeClass
public void createReport() {
	report=new ExtentReports("C:\\Users\\Nandhini.devi\\OneDrive - Happiest Minds Technologies Pvt Ltd\\Testing-Training\\myreport.html");
}
@Test(groups= {"Regression"})
public void firsttest() {
	test=report.startTest("firsttest");
	
	test.log(LogStatus.PASS, "Login Page displayed successfully-1");
	test.log(LogStatus.PASS, "Login Page displayed successfully-2");
	test.log(LogStatus.PASS, "Login Page displayed successfully-3");
	System.out.println("Test1");
	report.endTest(test);
}
@Test(groups= {"Regression"})
public void secondtest() {
	test=report.startTest("secondtest");
	test.log(LogStatus.FAIL, "Login Page second page displayed successfully-2");
	System.out.println("Test2");
	report.endTest(test);
}
@Test(groups= {"Smoke","Regression"})
public void thirdtest() {
	test=report.startTest("secondtest");

	test.log(LogStatus.SKIP, "Login Page third page displayed successfully-2");
	System.out.println("Test3");
	report.endTest(test);
}

@AfterClass
public void savereport() {
	report.flush();
	report.close();
}
}
