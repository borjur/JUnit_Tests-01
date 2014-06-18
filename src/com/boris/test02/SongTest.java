package com.boris.test02;

import junit.framework.TestCase;

public class SongTest extends TestCase { 
	
	// testing getters
	//------------------------------------------------------------
    public void testDurationInMinutes() {
        Song song = new Song("Bicyclops", "Fleck", 260);
        assertEquals(4.333333d, song.getDurationInMinutes(),
            0.000001d);
    }
    
    
    // test a setter
    //--------------------------------------------------------------------
   /* public void testSetProperty() {
        Bean bean = new Bean();
        bean.setProperty(newPropertyValue);
        assertEquals(newPropertyValue, bean.getProperty());
    } 
    */
    
    
    
    
    
}