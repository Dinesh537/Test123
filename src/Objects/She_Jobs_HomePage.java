package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;

public class She_Jobs_HomePage {
	
	WebDriver driver;
	
	public She_Jobs_HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath="//img[@alt='logo']")
	public WebElement sheJobs_logo;
	
	@FindAll({@FindBy(xpath="//h1")})
	public WebElement SearchJobs_txt;
	
	@FindBy(xpath="//a[text()='Jobs']")
	public WebElement jobsLink;
	
	@FindBy(xpath="//input[@formcontrolname='keyword']")
	public WebElement jobTitle;
	
	@FindBy(xpath="//input[@formcontrolname='location']")
	public WebElement jobLocation;
	
	@FindAll({@FindBy(xpath="//a[@id='home-tab']"),@FindBy(id="//a[@id='home-tab152']")})
	public WebElement latestJobs_Link;
	
}
