package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class She_jobs {
	
	@FindAll({@FindBy(xpath="//input[@name='q']")})
	public WebElement Search_txt;
	
	@FindBy(xpath="(//input[@value='Google Search'])[1]")
	public WebElement Search_btn;
	
	@FindAll({@FindBy(xpath="(//input[@value='Google Search'])[1]"),@FindBy(className="gNO859b")})
	public WebElement Search_btn1;
	
	WebDriver lDriver;
	
	public She_jobs(WebDriver lDriver)
	{
		this.lDriver = lDriver;
	}
	

}
