package HandlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleAlert_test1 {

	@Test
	public void alertHandling()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/home");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('welcome.selenium')");
		driver.switchTo().alert().accept();
		//driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
		
		WebElement ele = driver.findElement(By.xpath("//a[@data-name='flights']"));
		js.executeScript("arguments[0].style.border='3px solid red'",ele);
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;')", ele);

		js.executeScript("arguments[0].click()",ele);
		//js.executeScript("alert('hello')");
		
	}
	
}
