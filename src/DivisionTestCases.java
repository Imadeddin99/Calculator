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
public class DivisionTestCases {

	private double number1;
	private double number2;
	private double result;
    static int num=0;
	
	public DivisionTestCases(double number1,double number2,double result) {
		this.number1=number1;
		this.number2=number2;
		this.result=result;
	}
	
	@BeforeClass
	public static void print() {
		System.out.println("Division Operation");
	}
	
	
	@Parameters
	public static Collection parameterGenerator() {
		return Arrays.asList(new Object[][] {
			{5,7,0.714},
			{2.4,5.3,0.452},
			{5,-2,-2.5},
			{-5.4,2.6,-2.076}
			
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
		System.out.println("TestCase#"+num+":  Expected :"+(result)+ "   Value:"+Calculator.divide(number1, number2));
num++;
		assertEquals(result,Calculator.divide(number1, number2),0.005);
		
		
	}
	/*
	@Test(expected=java.lang.Error.class)
	public void test2() {
		String number1="sswew";
		String number2="Hello";
		assertEquals(number1+number2,Calculator.divide(number1, number2));
		
		
	}*/
	
	@Test(expected=ArithmeticException.class)
	public void test3() {
		double number1=5.8;
		double number2=0;
		assertEquals(number1+number2,Calculator.divide(number1, number2),0.05);
		
	}
	
	
	
}
