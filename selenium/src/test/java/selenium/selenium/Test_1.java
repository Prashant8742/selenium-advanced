package selenium.selenium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_1 {

	@Test
	public void setUp() throws Exception {					
		
        //Variable declaration
		
		//String
        String string1="Hello World";					
        String string2="Hello World"; 
        String string3="test1";					
        String string4="test1";	
        String string5=null;
        String string6="Selenium!!";
        
        //Array
        int[] array1 = { 6, 5, 12 };					
        int[] array2 = { 6, 5, 12 };	
       
       //integer 
        int variable1=1;					
        int	variable2=2;
        
        
       
      //Assert statements	
        
        assertEquals(string1,string2);	
        
        assertNotEquals(string1,string6);	
        
        assertSame(string3, string4);	
        
        assertNotSame(string1, string3);
        
        assertNotNull(string1);			
        
        assertNull(string5);	
        
        assertTrue(variable1<variable2);		
        
        assertArrayEquals(array1, array2);	
        
        assertFalse(variable1>variable2);
		    		
	       
	}
		        			
}
	

