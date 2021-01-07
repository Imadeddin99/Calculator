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
public class SquareRootTestCases {


	private double number1;
	private double result;
	static int num=0;
	
	public SquareRootTestCases(double number1,double result) {
		this.number1=number1;
		this.result=result;
		
	}
	
	@BeforeClass
	public static void print() {
		System.out.println("Square Root Operation");
	}
	
	
	@Parameters
	public static Collection parameterGenerator() {
		return Arrays.asList(new Object[][] {
			{25,5},
			{2.4,1.549},
			{0.0,0.0}
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
		System.out.println("TestCase#"+num+":  Expected :"+(result)+ "   Value:"+Calculator.squareRoot(number1));
num++;
		assertEquals(result,Calculator.squareRoot(number1),0.005);
		
		
	}
	/*
	@Test(expected=java.lang.Error.class)
	public void test2() {
		String number1="Hello";
		assertEquals(result,Calculator.squar(number1),0.005);
		
		
	}*/
	
	
	@Test(expected=ArithmeticException.class)
	public void test3() {
		double number1=-10;
		assertEquals(result,Calculator.squareRoot(number1),0.005);
	}
	
	
}
