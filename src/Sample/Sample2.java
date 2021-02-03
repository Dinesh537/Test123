package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.she-jobs.com/");
		driver.findElement(By.xpath("(//li/a[contains(text(),'Jobs')])[1]")).click();
		driver.findElement(By.cssSelector("input[name='keyword']")).sendKeys("Test Automation");
		driver.findElement(By.cssSelector("input[name='location']")).sendKeys("75074");
		
		WebElement experi = driver.findElement(By.xpath("//select[@name='exp']"));
		experi.isDisplayed();
		Select experience = new Select(experi);
		experience.selectByVisibleText("2 - 4");
		
		driver.findElement(By.xpath("//label[text()='Last 7 Days']")).click();
		
		driver.findElement(By.xpath("//a[text()=' Search Jobs']")).click();
		
		driver.findElement(By.xpath("(//h3[contains(text(),'Sorry')])[2]")).isDisplayed();
		
		

	}

}
