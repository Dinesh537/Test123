package Actions_Package;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyboardEvents {
	
	 public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
   	 WebDriver driver= new ChromeDriver();					
     driver.get("https://demoqa.com/text-box");
	 driver.manage().window().maximize();    
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// Enter the Full Name
    WebElement fullName = driver.findElement(By.id("userName"));
    fullName.sendKeys("Mr.Peter Haynes");
    
    //Enter the Email
    WebElement email=driver.findElement(By.id("userEmail"));
    email.sendKeys("PeterHaynes@toolsqa.com");
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    // Enter the Current Address
    WebElement currentAddress=driver.findElement(By.id("currentAddress"));
    currentAddress.sendKeys("43 School Lane London EC71 9GO");
    
    // Copy the Current Address
    currentAddress.sendKeys(Keys.CONTROL+"a");
    currentAddress.sendKeys(Keys.CONTROL+"c");
    
    
    //Press the TAB Key to Switch Focus to Permanent Address
    currentAddress.sendKeys(Keys.TAB);
    
    //Paste the Address in the Permanent Address field
    WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
    permanentAddress.sendKeys(Keys.CONTROL+"v");
    permanentAddress.clear();
  
    
    WebDriverWait wait=new WebDriverWait(driver, 100);
    WebElement permanentAddress1 =wait.until(ExpectedConditions.visibilityOf(permanentAddress));
    WebElement testWait;
    	testWait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "xpath")));
    	testWait.click();



    	
    //driver.close();

}


}
