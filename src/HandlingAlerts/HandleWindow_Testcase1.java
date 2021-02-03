package HandlingAlerts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWindow_Testcase1 {

	@Test
	public static void testWindow() throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver;
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://phptravels.com/demo");
			driver.findElement(By.xpath("//strong[contains(text(),'Demo')]")).isDisplayed();
			driver.findElement(By.xpath("//small[text()='http://www.phptravels.net']")).click();
			driver.findElement(By.xpath("//small[text()='http://www.phptravels.net/admin']")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//strong[text()='iOS']")).isDisplayed();
			
			//String windowName = driver.getWindowHandle();
			Set<String> windowNames = driver.getWindowHandles();
			String title1 = "PHPTRAVELS | Travel Technology Partner";
			String title2= "Administator Login";
			
			for(String win : windowNames)
			{
				String title = driver.switchTo().window(win).getTitle();
				
					if(driver.switchTo().window(win).getTitle().equals(title1))
					break;							
			}
			
		    driver.findElement(By.xpath("(//a[@id='dropdownCurrency'])[2]")).isDisplayed();
		    
		    
		    for(String win : windowNames)
			{
					if(driver.switchTo().window(win).getTitle().equals(title2))
			break;
			}
		    
		    
			driver.findElement(By.xpath("//input[@name='email']")).isDisplayed();
			
			driver.switchTo().alert().dismiss();


}
}