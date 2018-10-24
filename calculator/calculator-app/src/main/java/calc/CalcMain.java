package calc;

import java.util.Arrays;

/**
 * Peter Veres
 * 
 */
public class CalcMain {
    
    public static void main(String[] args) {
    	Arrays.asList(args).forEach(CalcMain::println);
    	
        Calculator c = new Calculator();
		println("Solution: " + c.add(30, 12));
    }
    
    private static void println(String value) {
    	System.out.println(value);
    	
    }
}
