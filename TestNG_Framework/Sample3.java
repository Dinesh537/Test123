package TestNG_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
public class Sample3 {
	
	
	@DataProvider(name="test-data")
	public Object[][] dataProvFunc(){
		return new Object[][] {{"Automation Tester","Plano"},{"Java Developer","Frisco"},{"SAS Admin","Dallas"}};
	}
	
	@Test(dataProvider="test-data")
	public void testSheJobs(String jobTitle, String Loc)	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.she-jobs.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Job Title or Keywords']")).sendKeys(jobTitle);
		driver.findElement(By.xpath("//input[@formcontrolname='location']")).sendKeys(Loc);
		
		
		
	}
}