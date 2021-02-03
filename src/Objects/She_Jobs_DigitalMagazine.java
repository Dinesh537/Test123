package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class She_Jobs_DigitalMagazine {
	
	WebDriver driver;
	
	public She_Jobs_DigitalMagazine(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath="//h2[text()='Digital Magazine']']")
	public WebElement digitalMag_header;
	
	@FindBy(xpath="(//a[text()='Continue read'])[1]")
	public WebElement continueRead_link;
	
		
}
