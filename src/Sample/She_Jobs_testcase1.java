package Sample;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class She_Jobs_testcase1 {

	@Test
	public static void testWindow() throws InterruptedException, IOException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver;
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			 
			
			
			 TakesScreenshot scrShot =((TakesScreenshot)driver);
             File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
             File DestFile=new File("C:\\Users\\Dinesh\\Documents\\Zoom\\Test.jpeg");
             Files.copy(SrcFile, DestFile);
			
             
             
             
			She_jobs she_jobs = new She_jobs(driver);
            PageFactory.initElements(driver, she_jobs);
            
            she_jobs.Search_txt.sendKeys("Dinesh");
            she_jobs.Search_btn1.click();
			System.out.println("");
}
}