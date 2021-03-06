package TestNG_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.Reporter;
public class Sample2 {
	
	@Parameters({"JobTitle","Location"})
	@Test
	public void testSheJobs(String jobTitle, String Loc)	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.she-jobs.com/");
	    Reporter.log("Navigating to she-jobs site : https://www.she-jobs.com/" );
		
		driver.manage().window().maximize();
		Reporter.log("Maximizing window");
		
		driver.findElement(By.xpath("//input[@placeholder='Job Title or Keywords']")).sendKeys(jobTitle);
		Reporter.log("Enter Job in the job title:" + jobTitle);
		
		driver.findElement(By.xpath("//input[@formcontrolname='location']")).sendKeys(Loc);
		
		WebElement ele=driver.findElement(By.xpath("//h1[@class='text-white mb-3']"));
		String str = ele.getText();
		//Assert.assertNotEquals(str, "Search Diversified Jobs. Now.");
		//Assert.assertNotNull(str);
		
		driver.quit();
	}
}