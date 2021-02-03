package HandlingAlerts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleModal_Testcase1 {

	@Test
	public static void testWindow() throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver;
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/modal-dialogs");
			driver.findElement(By.xpath("//button[@id='showSmallModal']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@id='closeSmallModal']")).click();
			

}
}