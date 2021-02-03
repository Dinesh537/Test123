package Actions_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {				

    static WebDriver driver;			
		
    public static void main(String args[])					
    {		
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	  driver= new ChromeDriver();		
    	  driver.manage().window().maximize();
         driver.get("http://demo.guru99.com/test/drag_drop.html");
         
         WebElement fromLocation = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
         WebElement toLocation = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
         Point point = toLocation.getLocation();
         int xcord = point.getX();
         int ycord = point.getY();
         
         Actions dragDrop = new Actions(driver);
         dragDrop.dragAndDrop(fromLocation, toLocation).perform();
         
       
         
         System.out.println("x-coord   : " + xcord);
         System.out.println("y-coord   : " + ycord);

         
         
         System.out.println("");
         
				
	}		
}