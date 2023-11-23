package day03;

public class DriversLicense {

	public static void main(String[] args) {
	
		 String customerIdentifier = "T16700185";
         String name = "Maury Justin, William";
         String address = "2300 west broad street richmond, va 23220";
         char sex = 'M';
         char Class = 'D';
         String eyeColor = "brown";
         String DateOfBirth = "07/15/1958";
         String endorsement = "none";
         double height = 6.3;
         String restrictions = "none";
         String expiration = "07/15/2025";
         
         System.out.println(customerIdentifier);
         System.out.println(name);
         System.out.println(address);
         System.out.println(sex);
         System.out.println(Class);
         System.out.println(eyeColor);
         System.out.println(DateOfBirth);
         System.out.println(endorsement);
         System.out.println(height);
         System.out.println(restrictions);
         System.out.println(expiration);
        
        // another method
        String ID = "T16700185";
        String name1 = "Maury";
        String name2 = "Justin,William";
        String address1 = "2300 West broad street";
        String address2 = "Richmond,VA 23220";
        char male = 'M';
        char classes = 'D';
        String dateOfBirth = "07/15/1958";
        String Eyes = "BRO";
        String enf = "NONE";
        String lnOri = "09/26/2017";

        System.out.println(   ID+ "\n" + name1 + "\n" + name2 + "\n" + address1 + "\n"+ address2 + "\n"+ male + "\t" + classes +"\t"+ dateOfBirth + "\n" + Eyes + "\t"+ enf +"\t" +lnOri);
        
//Create a program that prompts the user to enter their name and age, 
//and then displays a message that says "Hello, [name]. 
//You are [age] years old." Use appropriate variable names, such as "name" and "age".
        
        String yourName = "Oguzhan";
        int yourAge = 21;    
        System.out.println("Hello "+yourName+",\nyou are "+yourAge+" years old.");
        
        // another way
        String NameAge = "Please enter your name and age.";
        System.out.println(NameAge);
        
        String Name = "Paola";
        int Age = 21;
        
        System.out.println(Name);
        System.out.println(Age);
        
        System.out.println("Hello,"+Name+" you are "+Age+" years old."); //we havent learned scanner the + is called scanner
        
        System.out.print("Hello ");
        System.out.print(Name);
        System.out.print(" you are ");
        System.out.print(Age);
        System.out.print(" years old.");
	}

}
