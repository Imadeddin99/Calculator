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
public class MultiplicationTestCases {

	private double number1;
	private double number2;
	private double result;
	static int num=0;
	public MultiplicationTestCases(double number1,double number2,double result) {
		this.number1=number1;
		this.number2=number2;
		this.result=result;
		
	}
	
	@BeforeClass
	public static void print() {
		System.out.println("Multiplication Operation");
	}
	
	
	@Parameters
	public static Collection parameterGenerator() {
		return Arrays.asList(new Object[][] {
			{5,7,35},
			{2.4,5.3,12.72},
			{5,-2,-10},
			{-5.4,2.6,14.04},
			{-5.8,0,0}
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
		System.out.println("TestCase#"+num+":  Expected :"+(result)+ "   Value:"+Calculator.multiply(number1, number2));

		assertEquals(number1*number2,Calculator.multiply(number1, number2),0.005);
		
		
	}
	/*
	@Test(expected=java.lang.Error.class)
	public void test2() {
		String number1="sswew";
		String number2="Hello";
		assertEquals(number1+number2,Calculator.multiply(number1, number2));
		
		
	}*/

}
