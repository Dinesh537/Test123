package Library;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.io.Files;

public class Utils {
	
	public static ExtentReports extent;
	public static ExtentTest test;
	//public static String folderName;
	
	public void getScreenShot(WebDriver driver, String screenShoteName) throws IOException
	{
        TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		String timestamp= new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	    File destFile= new File(System.getProperty("user.dir") + "/screenshots/"+screenShoteName+"_"+timestamp+".png");
	    Files.copy(srcFile, destFile);
	    
	    Reporter.log("SCREENSHOT :: <a href='"+destFile+"'> <img_src='"+destFile+"' height='100', width='100' />"+screenShoteName+"</a>");

			}

	public void type(WebElement ele, String value) throws IOException
	{
		ele.sendKeys(value);
		test.pass("Entered value :"+value + "in textbox");
			}
	public WebDriver launchBrowser(WebDriver driver,String browserName, String Url)
	{
		try
		{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
	    driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
	    driver = new InternetExplorerDriver();
		}
				
		driver.manage().window().maximize();
		driver.get(Url);
		Reporter.log("Launched "+browserName + " and Navigated to : -------------------------" + Url);
		Reporter.log("\n");
		return driver;
		}
		catch(Exception e)
		{
		System.out.println("Enter correct value for browserName   ::"+ e.getMessage() );
		return driver;
		}
		
	}
	
	public void verifyElementPresent(WebDriver driver, WebElement ele, String screenShotName) throws IOException
	{
		try {
		Utils utils = new Utils();
		ele.isDisplayed();
		utils.highlightElement(driver, ele);
		utils.getScreenShot(driver, screenShotName);
		test.info("Validating element in ghe page");
		test.pass("Element :"+screenShotName+ " is present");
		test.addScreenCaptureFromPath(Utils.takeScreenShot(driver, screenShotName));
		Reporter.log(screenShotName +"-----------------------is present in the page");
		}
		catch(Exception e)
		{
			test.fail(screenShotName+ "  is not present or xpath for the element is not cotrrect");
			
			//Reporter.log(screenShotName +"  is not present in the page");
		}
	}
	
	public void highlightElement(WebDriver driver,WebElement ele)
	{		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background:red; border:2px solid yellow ')", ele);		
	}
	
	public void click(WebElement ele, String element)
	{
		try {
		ele.click();
		Reporter.log("clicked on element :-----------" +element);
		
		}
		catch(Exception e)
		{
			Reporter.log("element not found :-----------" +element);
			Reporter.log(e.getMessage());
		}
	}
	
	public void dropDown(WebElement ele, String value)
	{
	    Select option = new Select(ele);
		option.selectByValue(value);
	}

	public void dropDown(WebElement ele, int value)
	{
	    Select option = new Select(ele);
		option.selectByIndex(value);
	}
	public void dropDownByVisibleText(WebElement ele, String value)
	{
	    Select option = new Select(ele);
		option.selectByVisibleText(value);
	}

	public void validateText(WebElement ele, String text)
	{
		boolean flag = false;
		if(ele.getText().equals(text))
		{
			flag = true;
			Reporter.log("Expected Value and Actual value both are matching");
		}
		Reporter.log("");
		Assert.assertEquals(flag, true);
	}
	
	public static void generateReport(String testCase)
	{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");
	    String folderNameWithTimeStamp = df.format(new Date());
	  
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\drive\\Java_Training\\Selenium_Training\\Reports\\"+testCase+"_"+folderNameWithTimeStamp+".html");
		 
         extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        test = extent.createTest(testCase, "");
      
	}
	


	public static void closeExtentReport() {
		// TODO Auto-generated method stub
		extent.flush();
	}
	
	public static String takeScreenShot(WebDriver driver, String screenShoteName) throws IOException
	{
        TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		String timestamp= new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	    File destFile= new File(System.getProperty("user.dir") + "/screenshots/"+screenShoteName+"_"+timestamp+".png");
	    Files.copy(srcFile, destFile);
	    return destFile.getAbsolutePath();
	  
			}

	
}
