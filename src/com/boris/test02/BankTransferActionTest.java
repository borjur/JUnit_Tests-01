package com.boris.test02;

import com.boris.test01.Bank;
import com.boris.test01.Money;

import junit.framework.TestCase;

public class BankTransferActionTest extends TestCase {
	
	 public void testSettingInputParameters() {
	        BankTransferAction action = new BankTransferAction();
	        action.setSourceAccountId("source");
	        action.setTargetAccountId("target");
	 
	 
	 
     action.setAmount(Money.dollars(100));
     action.execute(new Bank() {
         public void transfer(String sourceAccountId,String targetAccountId,Money amount) {
             assertEquals("source", sourceAccountId);
             assertEquals("target", targetAccountId);
             assertEquals(Money.dollars(100), amount);
         }
     });
 }



}
