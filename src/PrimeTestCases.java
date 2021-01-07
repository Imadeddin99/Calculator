import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class PrimeTestCases {


	private int number1;
	private boolean result;
	static int num=0;
	
	public PrimeTestCases(int number1,boolean result) {
		this.number1=number1;
		this.result=result;
		
	}
	
	@BeforeClass
	public static void print() {
		System.out.println("Prime Check Operation");
	}
	
	
	@Parameters
	public static Collection parameterGenerator() {
		return Arrays.asList(new Object[][] {
			{5,true},
			{2,true},
			{12,false},
			{1,false},
			{0,false},
			{-5,false}
		});
	}
	
	@AfterClass
	public static void printLines() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

	}
	
	
	@Test
	public void test() {
		System.out.println("TestCase#"+num+":  Expected :"+(result)+ "   Value:"+Calculator.isPrime(number1));
        num++;
		assertEquals(result,Calculator.isPrime(number1));
		
		
	}
	/*
	@Test(expected=java.lang.Error.class)
	public void test2() {
		String number1="Hello";
		assertEquals(result,Calculator.squar(number1));
		
		
	}*/
}
