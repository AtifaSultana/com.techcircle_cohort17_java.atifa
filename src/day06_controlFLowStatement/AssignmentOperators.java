package day06_controlFLowStatement;

public class AssignmentOperators {

	public static void main(String[] args) {
		
 //=, += ,  -+ , *= . /=
        
        int a = 5;
        
//        a += 50; 
        
        a  = a + 50;
        
        System.out.println(a); // 55
        
        a -= 40; // a = a - 40;
        
        System.out.println(a); // 15
        
        a *= 10; // 150
        // a = a * 10
        
        System.out.println(a);
        
        a /= 5; // a = a / 5
        
        System.out.println(a); // 30
        
        String str = "";
        char letter = 'a';
        
        System.out.println(str);
        
        str+=letter;
        
        System.out.println(str); // a30
        str+=a;//
        System.out.println(str);

	}

}
