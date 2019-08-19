package com.amdocs;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SavingsAccountTest {

	private SavingsAccount account;
	private SavingsAccount accountSpy;
	@Before
	public void setUp() {
		account=new SavingsAccount();
		//partial mocking or spying
		accountSpy =spy(account);
	}
	 
	@After
	public void tearDown() {
		account = null;
		accountSpy = null;
	}
	
	@Test
	public void testWithdrawWhenCurrentBalanceIs5000INR() 
			throws InsufficientBalanceException {
		
		
		
		
		//stubbing - hard coding the response of getBalance method
		doReturn(5000.0).when(accountSpy).getBalance();
		doNothing().when(accountSpy).updateBalanceIntoDB(anyDouble());
		
		//code under Test i.e we are testing withdraw method
		double updatedBalance=accountSpy.withdraw(1000.0);
		double expectedBalance=4000.00;
		
		assertEquals(expectedBalance,updatedBalance,0.0001);
		
		
		//check if getBalance method was invoked exactly 1 time within withdraw method
		verify(accountSpy,times(1)).getBalance();
	
		//check if updateBalanceIntoDB method was invoked exactly once within withdraw
	verify(accountSpy,times(1)).updateBalanceIntoDB(anyDouble());
	}
	
	
  @Test	
	
public void testWithdrawWhenCurrentBalanceIsInsufficient() {
		
		
		boolean exceptionThrown=false;
		
		//stubbing - hard coding the response of getBalance method
		doReturn(5000.0).when(accountSpy).getBalance();
		doNothing().when(accountSpy).updateBalanceIntoDB(anyDouble());
		
		
		try {
			accountSpy.withdraw(10000.0);
		}
		catch(InsufficientBalanceException e) {
			exceptionThrown=true;
		}
		boolean expectedResponse=true;
		
		//code under Test i.e we are testing withdraw method
		
		
		assertEquals(expectedResponse,exceptionThrown);
		
		
		//check if getBalance method was invoked exactly 1 time within withdraw method
		verify(accountSpy,times(1)).getBalance();
	
		//check if updateBalanceIntoDB method was invoked exactly once within withdraw
	verify(accountSpy,times(0)).updateBalanceIntoDB(anyDouble());
	}
}

