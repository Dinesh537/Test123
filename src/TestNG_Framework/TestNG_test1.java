package TestNG_Framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_test1 {

	@BeforeClass
	public void beforeClass()
	{
	System.out.println("beforeClass1");	
	}
	
	@AfterClass
	public void afterClass()
	{
	System.out.println("afterClass1");	
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite1");
	}
	
	@BeforeGroups(value = "Regression")
	public void beforeGroup()
	{
		System.out.println("beforeGroup1");
	}
	
	@AfterGroups(value = "Regression")
	public void afterGroup()
	{
		System.out.println("after Gropu 1");
	}
	
	@BeforeTest
	public void beforeMethod1()
	{
		System.out.println("Before_test1");
	}
	
	@BeforeMethod
	public void beforeMethod2()
	{
		System.out.println("Before_Method1");
	}
	
	@BeforeMethod
	public void beforeMethod3()
	{
		System.out.println("Before_Method2");
	}
	
	@Test(groups= "Regression")
	public void method1()
	{
		System.out.println("test1");
	}
	@Test
	public void method8()
	{
		System.out.println("test2");
	}
	
	@AfterMethod()
	public void afterMethod2()
	{
		System.out.println("after_Method1");
	}
	@AfterMethod
	public void afterMethod3()
	{
		System.out.println("after_Method2");
	}
	@AfterTest
	public void afterMethod1()
	{
		System.out.println("After_test1");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite1");
	}
	
}
