package day06_controlFLowStatement;

public class IfStatement {

	public static void main(String[] args) {
		
//		Syntax;
//		    if (condition) {
//		    	true block
//		    }else { 
//		    	false block
//		    }
		    	
		 
        int count = 2;
        int total = 4;
        
        if (count < 3) {
            total = 0;
        }else {
            total += count;
        }
        
        System.out.println(total);
        
        
        
        String str = "";
        
        int value = 90;
        
        if (value % 2 == 1) {
            str = "Odd";
        }else {
            str = "Even";
        }
        
        System.out.println(value +" is an "+ str + " number.");
        
        
		    
		
		
		
		
	}

}
