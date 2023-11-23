package day09_loop;

public class ForLoop {

	public static void main(String[] args) {
		
//      syntax:
//      for (create a variable  ;  condition ; update the variable) {
////          code block
//      }
  
  
  int count = 1;
  
  while(count < 11) {
      System.out.println(count);
      count++;
  }
  
  
  for (int i = 1; i <11 ; i++ ) {
      System.out.println(i);
  }
  
  //System.out.println(i);
  
  for (int i = 1; i <11 ; i++ ) {
      System.out.println(i);
      if (i == 5) {
          break;
      }
  }
  
  for (int i = 1 ; i < 20 ; i++) {
      
  //    System.out.println("Hello "+ i);
  
//      key can be an integer or a char or a string
      switch (i) {
      case 1:
          System.out.println("Monday");
          break;
      case 2:
          System.out.println("Tuesday");
          break;
      case 3:
          System.out.println("Wednesday");
          break;
      case 4: //Duplicate case
          System.out.println("Thursday");
          break;
      }
  
      if (i == 5) {
          System.out.println("Friday");
      }
      if (i == 6) {
          System.out.println("Saturday");
      }     
  }
}
}
