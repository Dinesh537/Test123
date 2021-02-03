package TestNG_Framework;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class TestNg_Parameters {
	
	@Parameters({"userId"})
	@Test
	public void readParam(String userId)
	{
		System.out.println(userId);
	}

}
