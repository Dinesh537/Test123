package Actions_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_testcase1 {
		// TODO Auto-generated method stub
		
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.she-jobs.com/");
		
		WebElement conversations = driver.findElement(By.xpath("//a[contains(text(),' Conversations ')]"));
		Thread.sleep(5000);
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(conversations).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Digital magazine ')]")).click();
		
	}

}
