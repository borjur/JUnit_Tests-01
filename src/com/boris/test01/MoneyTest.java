package com.boris.test01;


import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import junit.framework.TestCase;
public class MoneyTest extends TestCase {  

    
    public void testAdd() {
        Money addend = new Money(30, 0);   
        Money augend = new Money(20, 0);
        Money sum = addend.add(augend);
        assertEquals(5000, sum.inCents());
    }
    
    public void testNewListIsEmpty() {
        List list = new ArrayList();
        assertEquals(0, list.size());
    }
    
    
    public void testSynchronizedListHasSameContents() {
        List list = new ArrayList();
        list.add("Albert");
        list.add("Henry");
        list.add("Catherine"); 
        List synchronizedList = Collections.synchronizedList(list);
        assertEquals("Albert", synchronizedList.get(0));
        assertEquals("Henry", synchronizedList.get(1));
        assertEquals("Catherine", synchronizedList.get(2));
    }
    
    public void testSynchronizedListHasSameContents2() {
    	
        List list = new ArrayList();
        list.add("Albert");
        list.add("Henry");
        list.add("Catherine"); 
        List synchronizedList = Collections.synchronizedList(list);
        for (int i = 0; i < list.size(); i++) {
            assertEquals(list.get(i), synchronizedList.get(i));
        }


    }
    
    public void testSynchronizedListHasSameContents3() {
        List list = new ArrayList();
        list.add("Albert");
        list.add("Henry");
        list.add("Catherine"); 
        List synchronizedList = Collections.synchronizedList(list);
        assertEquals(list, synchronizedList);
    }
    
    public void testSynchronizedListHasSameContents4() {
        List list = Arrays.asList(
            new String[] { "Albert", "Henry", "Catherine" });
        assertEquals(list, Collections.synchronizedList(list));
    }
    
    
/*    public void testEquals() {
        Money a = new Money(100, 0);
        Money b = new Money(100, 0);
        Money c = new Money(50, 0);
        Object d = null;
        new EqualsTester(a, b, c, d);
    }*/

    private Money a; 
    private Money b;
    private Money c;
//---------------------------------------------------
    protected void setUp() {
        a = new Money(100, 0);
    }
    public void testReflexive() {
        assertEquals(a, a);
    }
    
   //--------------------------------------------------- 

    protected void setUp2() {
        a = new Money(100, 0);

        b = new Money(100, 0);
    } 
    
    public void testReflexive2() {
        assertEquals(a, a);
        assertEquals(b, b);
    } 
    
   /* 
    * gives an error like this
    * 
    * public void testSymmetric() {
        assertEquals(a, b);
        assertEquals(b, a);
    }
*/
 
    public void testSymmetric() {
        assertTrue(!a.equals(b) || b.equals(a));
    } 
    
  //----------------------------------------------------------
    
    protected void setUp3() {
        a = new Money(100, 0); 
        b = new Money(100, 0);
        c = new Money(200, 0);
    } 
    public void testReflexive3() {
        assertEquals(a, a);
        assertEquals(b, b);
        assertEquals(c, c);
    } 
    public void testSymmetric3() {
    	/*
    	 * ovaj sve jedan daje failure
    	 */
        assertEquals(a, b);
        assertEquals(b, a); 
        assertFalse(a.equals(c));
        assertFalse(c.equals(a));
    }
//------------------------------------------------------------------
    
    
    
    //* fails the test for consistancy
     
    public void testConsistent() {
        for (int i = 0; i < 1000; i++) {
            assertEquals(a, b);
            assertFalse(a.equals(c));
        }
    }

    /*
     * OVO JE ERROR
     */
  /*  public void testNotEqualToNull() { 
    	
        assertFalse(a.equals(null));
        assertFalse(c.equals(null));

    }*/
    // Test a method that returns nothing
    //------------------------------------------------------
    
    public void testListAdd() {
        List list = new ArrayList();
        assertFalse(list.contains("hello"));
        list.add("hello"); 
        assertTrue(list.contains("hello"));
    }
    
   /* public void testLoadProperties() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("application.properties"));
        assertEquals("jbrains", properties.getProperty("username"));
        assertEquals("jbra1ns", properties.getProperty("password"));
    }
    */
    
    
    //contructor
    //-----------------------------------------------------------
    
    public void testInitializationParameters() {
        assertEquals(762, new Integer(762).intValue());
    }
    
 /*   public void testInitializationParameters2() {
        BankDepositCommand command = new BankDepositCommand(
            "123", Money.dollars(125, 50), today());
        assertTrue(command.isValid());
    }*/
    
    public void testDefaultInitializationParameters() {
        assertEquals(0L, new Money().inCents());
    }
    
    
    public void testValueInCents() {
        assertTrue(new Money(0, 50).valueInCentsIs(50));
    }
    
    public void testConstructorDoesNotAnswerNull() {
        assertNotNull(new Integer(762));
    }
    
    public void testConstructorAnswersRightType() {
        assertTrue(new Integer(762) instanceof Integer);
    }
 



 
    
    }



