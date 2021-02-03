package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Library.Utils;
import Objects.She_Jobs_HomePage;

public class SheJobs_testcase2 {
	
	@DataProvider(name = "testData")
	public Object[][] dataMethod()
	{
		return new Object[][] {{"SoftwareEngineer"},{"Automation Tester"}};
	}
	
	@BeforeTest
	public void setUp(ITestContext testContext)
	{
		
		
	}
	
	@Test(dataProvider="testData")
	public void sheJobsHomePage(String val,ITestContext testContext) throws IOException
	{
		 Utils.generateReport(testContext.getName());
		
		Utils utils = new Utils();
		WebDriver driver= null;
		
		driver = utils.launchBrowser(driver, "chrome", "https://www.she-jobs.com/");

		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver123;
		driver123 = new ChromeDriver();
		driver123.manage().window().maximize();
		driver123.get("https://www.she-jobs.com/");
*/
		She_Jobs_HomePage sheJobsHomePage = new She_Jobs_HomePage(driver);
		PageFactory.initElements(driver, sheJobsHomePage);
		
		utils.type(sheJobsHomePage.jobTitle, val);
		utils.verifyElementPresent (driver,sheJobsHomePage.sheJobs_logo, "sheJobsHomePage.sheJobs_logo");
		
		utils.verifyElementPresent(driver, sheJobsHomePage.jobLocation, "sheJobsHomePage.jobLocation");
		
		utils.verifyElementPresent(driver, sheJobsHomePage.jobsLink, "sheJobsHomePage.jobsLink");
		
		
		
		System.out.print("Hi All");
		Utils.closeExtentReport();
	}
	
	@AfterTest()
	public void tearDown()
	{
	
		 
	}

}
