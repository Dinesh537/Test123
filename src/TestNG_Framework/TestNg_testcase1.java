package TestNG_Framework;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_testcase1 {
	
	@BeforeMethod
	public void beforeMethod1()
	{
		System.out.println("Befor Method");
	}
	
	@Test
	public void method1()
	{
		System.out.println("test1_class1");
	}
	
	@Test	
	public void method3()
	{
		System.out.println("simple method");
		
	}
	
	@Test
	public void method2()
	{
		System.out.println("Welcome");
	}

}
