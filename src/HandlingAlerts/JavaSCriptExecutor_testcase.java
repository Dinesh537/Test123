package HandlingAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JavaSCriptExecutor_testcase {
	
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		
		 driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/home");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement ele = driver.findElement(By.xpath("//a[@data-name='flights']"));
		
		js.executeScript("arguments[0].click()", ele);
		js.executeScript("arguments[0].setAttribute('style','background:red; border:2px solid yellow ')", ele);
		
		js.executeScript("arguments[0].click()", ele);

		
		
		
	}
	

}
