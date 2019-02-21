package junitExample;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RuleExample {

	@Rule
	public ExpectedException exceptionmessage = ExpectedException.none();
	
	@Test
	public void temp()
	{
		String value1="Jitendra";
		String value2="gupta";
		if(value1==value2)
		{
			System.out.println("match");	
		}else
		{
			System.out.println(exceptionmessage.reportMissingExceptionWithMessage("mismatch"));
			
		}
		
	}
}
