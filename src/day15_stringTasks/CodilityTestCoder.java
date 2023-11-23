package day15_stringTasks;

public class CodilityTestCoder {

	public static void main(String[] args) {
		package day15_StringTask;

		public class CodilityTestCoders {

		    public static void main(String[] args) {

		        String str1  = "Codility";
		        String str2 = "Test";
		        String str3 = "Coders";
		        String message = "";
		        
		        for (int i = 1 ; i <= 30 ; i++) {
		        
		            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
		                message += str1;
		                message += str2;
		                message += str3;
		            }else if (i % 2 == 0 && i % 3 == 0) {
		                message += str1;
		                message += str2;
		            }else if (i % 3 == 0 && i % 5 == 0) {
		                message += str2;
		                message += str3;
		            }else if (i % 2 == 0 && i % 5 == 0) {
		                message += str1;
		                message += str3;
		            }else if (i % 2 == 0) {
		                message += str1;
		            }else if (i % 3 == 0) {
		                message += str2;
		            }else if (i % 5 == 0) {
		                message += str3;
		            }
		            
		            if (message.length() == 0) {
		                System.out.println(i);
		            }else {
		                System.out.println(message);
		            }
		            
		            
		            message = "";
		            
		            
		            
		            
		            
		        }
		        
		        
		        
		        
//		        for (int i = 1 ; i <= 30 ; i++) {
//		            
//		            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
//		                System.out.println(str1 + str2 + str3);
//		            }else if (i % 2 == 0 && i % 3 == 0) {
//		                System.out.println(str1 + str2);
//		            }else if (i % 3 == 0 && i % 5 == 0) {
//		                System.out.println(str2 + str3);
//		            }else if (i % 2 == 0 && i % 5 == 0) {
//		                System.out.println(str1 + str3);
//		            }else if (i % 2 == 0) {
//		                System.out.println(str1);
//		            }else if (i % 3 == 0) {
//		                System.out.println(str2);
//		            }else if (i % 5 == 0) {
//		                System.out.println(str3);
//		            }
//		            else {
//		                System.out.println(i);
//		            }
//		            
//		        }
		        
		        
		        
		        
		    }

		}
	}

}
