package junitExample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitExampleSequence {

	@BeforeClass
	public static void beforeclassmethod()
	{
		System.out.println("You are in beforeclassmethod");
	}
	
	@Before
	public void beforemethod()
	{
		System.out.println("You are in beforemethod");
	}
	
	@Test
	public void Testmethod()
	{
		System.out.println("You are in Testmethod");
	}
	
	@After
	public void aftermethod()
	{
		System.out.println("You are in aftermethod");
	}
	
	@AfterClass
	public static void afterclassmethod()
	{
		System.out.println("You are in afterclassmethod");
	}
}
