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
public class SubtractTestCases {
	private double number1;
	private double number2;
	private double result;
	static int num=0;
	public SubtractTestCases(double number1,double number2,double result) {
		this.number1=number1;
		this.number2=number2;
		this.result=result;
	}
	
	@BeforeClass
	public static void print() {
		System.out.println("Subtraction Operation");
	}
	
	@Parameters
	public static Collection parameterGenerator() {
		return Arrays.asList(new Object[][] {
			{5,7,-2},
			{2.4,5.3,-2.9},
			{5,-2,7},
			{-5.4,2.6,-8},
			{-5.8,0,-5.8}
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
		
		
		System.out.println("TestCase#"+num+":  Expected :"+(number1-number2)+ "   Value:"+Calculator.subtract(number1, number2));
		num++;
		
		assertEquals(result,Calculator.subtract(number1, number2),0.005);
		
		
	}
	
	
	
	/*
	@Test(expected=java.lang.Error.class)
	public void test2() {
		String number1="sswew";
		String number2="Hello";
		assertEquals(number1+number2,Calculator.subtract(number1, number2));
		
		
	}*/
	

}
