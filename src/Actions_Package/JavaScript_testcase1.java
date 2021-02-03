package Actions_Package;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScript_testcase1 {

	@Test
	public void frameHandling()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int noOfFrames = frames.size();
		System.out.println(noOfFrames);
		for(WebElement ele :frames)
		{
			System.out.println(ele.getAttribute("id"));
		}
		
		driver.switchTo().frame("frame2");		
		driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]"));
	}
	
}
