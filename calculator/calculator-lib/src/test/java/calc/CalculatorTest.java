package calc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Peter Veres
 */
public class CalculatorTest {
    
	Calculator underTest;
	
	@Before
	public void setUp() {
		underTest = new Calculator();
	}
	
    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
    	
    	//Given
        System.out.println("add");
        int a = 12;
        int b = 30;
        int expResult = 42;
        
        //When
        int result = underTest.add(a, b);
        
        //Then
        assertEquals(expResult, result);
    }
    
}
