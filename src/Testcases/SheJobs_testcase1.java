package Testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.google.common.io.Files;

import Library.Utils;
import Objects.She_Jobs_DigitalMagazine;
import Objects.She_Jobs_HomePage;

public class SheJobs_testcase1 {
	
	@Test
	@Parameters({"browserName"})
	public void sheJobsHomePage(String browserName, ITestContext testContext) throws IOException
	{
		Utils utils = new Utils();
		WebDriver driver= null;
	
	
		driver = utils.launchBrowser(driver, browserName, "https://www.she-jobs.com/");

		She_Jobs_HomePage sheJobsHomePage = new She_Jobs_HomePage(driver);
		PageFactory.initElements(driver, sheJobsHomePage);
		
		She_Jobs_DigitalMagazine digitalMagazine = new She_Jobs_DigitalMagazine(driver);
		PageFactory.initElements(driver, digitalMagazine);
		
		utils.verifyElementPresent (driver,sheJobsHomePage.sheJobs_logo, "sheJobsHomePage.sheJobs_logo");
		//utils.click(sheJobsHomePage.jobsLink, "sheJobsHomePage.jobsLink");
		
		utils.verifyElementPresent(driver, sheJobsHomePage.jobLocation, "sheJobsHomePage.jobLocation");
		
		utils.verifyElementPresent(driver, sheJobsHomePage.jobsLink, "sheJobsHomePage.jobsLink");
		
		
	    //utils.dropDown(sheJobsHomePage.sheJobs_logo, "test");
		utils.validateText(sheJobsHomePage.SearchJobs_txt, "Search Diversified Jobs. Now.");
		
		/*sheJobsHomePage.jobTitle.sendKeys("Automation Engineer");
		utils.getScreenShot(driver,"test1");
		
		sheJobsHomePage.jobLocation.sendKeys("Plano");
		utils.getScreenShot(driver,"test2");
	
		
		sheJobsHomePage.jobsLink.isDisplayed();
	
		sheJobsHomePage.latestJobs_Link.isDisplayed();
		*/
	
		
	}
	
}
