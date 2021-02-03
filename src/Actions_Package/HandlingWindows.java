package Actions_Package;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingWindows {

	@Test
	public void windowHandling()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
		Set<String> windowHandles= driver.getWindowHandles();
		
		for(String winHandle : windowHandles)
		{
			String switchedWindowTitle=driver.switchTo().window(winHandle).getTitle();
			System.out.println(switchedWindowTitle);
		}
		
		
		
	}		

}
