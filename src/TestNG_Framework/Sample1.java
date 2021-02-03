package TestNG_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample1 {
	WebDriver driver;
	@Test
	public void test1() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("Dinesh");
		driver.findElement(By.id("userEmail")).sendKeys("d.m@gmail.com");
	}
	
	@Test
	public void test2() throws InterruptedException
	{
		
		driver.findElement(By.id("currentAddress")).sendKeys("Plano");
		driver.findElement(By.id("permanentAddress")).sendKeys("India");
		driver.findElement(By.cssSelector("textarea[id='permanentAddress']")).sendKeys("America");;
		
		driver.quit();
	
	}
}