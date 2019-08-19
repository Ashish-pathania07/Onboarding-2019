package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RPNCalculatorTest {
private	RPNCalculator rpnCalculator;
private double actualResult,expectedResult;	
	
@BeforeClass
public static void initOnce() {
	System.out.println("Before Class Method");
}

@Before
	public void init() {
		rpnCalculator=new RPNCalculator();
	}
	@After
	public void cleanUp() {
		rpnCalculator=null;
	}
	
	@AfterClass
	public static void tearDown() {
		System.out.println("After Class Method");
	}
	
	@Test
	public void testSimpleAddition() {
		
		actualResult = rpnCalculator.evaluate( "10 15 +");
		 expectedResult = 25.0;
		
		assertEquals( expectedResult, actualResult, 0.0001);
		
		actualResult = rpnCalculator.evaluate( "10 115 +");
		expectedResult = 125.0;
		
		assertEquals( expectedResult, actualResult, 0.0001);
		}
		
		@Test
		public void testSimpleSubtraction() {
			RPNCalculator rpnCalculator=new RPNCalculator();
			
			 actualResult = rpnCalculator.evaluate( "100 15 -");
			 expectedResult = 85.0;
			
			assertEquals( expectedResult, actualResult, 0.0001);
			
			actualResult = rpnCalculator.evaluate( "10 5 -");
			expectedResult = 5.0;
			
			assertEquals( expectedResult, actualResult, 0.0001);
			}
		@Test
		public void testSimpleMultiplication() {
			
			 actualResult = rpnCalculator.evaluate( "10 2 *");
			 expectedResult = 20.0;
			
			assertEquals( expectedResult, actualResult, 0.0001);
			
			actualResult = rpnCalculator.evaluate( "8 5 *");
			expectedResult = 40.0;
			
			assertEquals( expectedResult, actualResult, 0.0001);
			}
		@Test
		public void testSimpleDivision() {
			
			 actualResult = rpnCalculator.evaluate( "10 2 /");
			 expectedResult = 5.0;
			
			assertEquals( expectedResult, actualResult, 0.0001);
			
			actualResult = rpnCalculator.evaluate( "18 3 /");
			expectedResult = 6.0;
			
			assertEquals( expectedResult, actualResult, 0.0001);
			}
		@Test
		public void testComplex() {
			
			 actualResult = rpnCalculator.evaluate( "10 10 + 100 20 / *");
			 expectedResult = 100.0;
			
			assertEquals( expectedResult, actualResult, 0.0001);
			}

}
