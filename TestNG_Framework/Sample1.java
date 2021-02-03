package TestNG_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("Dinesh");
		driver.findElement(By.id("userEmail")).sendKeys("d.m@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Plano");
		driver.findElement(By.id("permanentAddress")).sendKeys("India");
		driver.findElement(By.cssSelector("textarea[id='permanentAddress']")).sendKeys("America");;
		
		
	
	}
}