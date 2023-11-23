package day06_controlFLowStatement;

public class LogicalOperators {

	public static void main(String[] args) {
		
		// AND (&&)
		// OR (||)
		// NOT (!)
		
// AND (&&) , OR (||) , NOT(!)
        
        boolean conditionA = true;
        boolean conditionB = false;
        boolean conditionC = true;
        
//             true table for &&
        
//        conditionA  conditionB result
//        true        true        true
//        true        false       false
//        false       true        false
//        false       false       false
        
        
        System.out.println( conditionA && conditionB);
        System.out.println( conditionA && conditionC);

        
//         OR (||)
       
//        conditionA  conditionB result
//        true        true        true
//        true        false       true
//        false       true        true
//        false       false       false
        
        System.out.println(conditionA || conditionB);
        System.out.println(conditionA || conditionC);
        System.out.println(conditionB || 4<3);

//        NOT(!)
        
        System.out.println(!conditionA);
        System.out.println(!conditionB);
        System.out.println(!!!!!!!!!!!!conditionA);
		
		
		
		
	}

}
