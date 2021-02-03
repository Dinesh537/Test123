package Actions_Package;



import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingFrame_test1 {

	@Test
	public void frameHandling()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		int noOfFrames =frames.size();
		
		Assert.assertEquals(noOfFrames,1);
		
		
		
	for(WebElement ele :frames)
		{
		System.out.println(ele.getAttribute("id"));
		
		driver.switchTo().frame(ele);		
		//driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]"));
		
	
	}
	

}
}