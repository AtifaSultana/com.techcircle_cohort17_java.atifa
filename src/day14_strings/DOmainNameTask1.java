package day14_strings;

public class DOmainNameTask1 {

	public static void main(String[] args) {
		
	//	String email = "first.lastName@domainName.com";

        
//      "John.smith@yahoo.com"  // output = yahoo
//      "shafkat.ali@techcirclesolutions.org" // techcirclesolutions
//      "john.doe@aws.com" // aws
//      "Mike.tran@github.com" // github      
//      Write a java program to find the domain name of given emails
		
		
//		String email1 = "john.smith@yahoo.com";
//	    String domain = email1.substring(11,16);
//	    System.out.println(domain);	    
//	    String email2 = "shafkat.ali@techcirclesolutions.org";
//	    String domain2 = email2.substring(12,31);
//	    System.out.println(domain2);		    
//	    String email3 = "john.doe@aws.com";
//	    String domain3 = email3.substring(9,12);
//	    System.out.println(domain3);
		
	    
	    
        
        //String email = "first.lastName@domainName.com";
        
        
//        "John.smith@yahoo.com"  // output = yahoo
//        "shafkat.ali@techcirclesolutions.org" // techcirclesolutions
//        "john,doe@aws.com" // aws
//        "Mike.tran@github.com" // github
        
//        Write a java program to find the domain name of given email
        
        String email = "Mike.tran@github.com";
        int domainStart = email.indexOf("@");
//        int ending = email.lastIndexOf(" ");
//        String domain = email.substring(domainStart+1, ending);
//        System.out.println(domain);
        
        int indexOfAt = email.indexOf('@');
        
//        int lastIndexOfDot = email.lastIndexOf('.');
//        
//        
//        String str2 = email.substring(indexOfAt+1,lastIndexOfDot);
        
        
        int lastIndexOfDot = email.indexOf('.',indexOfAt);
        
        
        String str2 = email.substring(indexOfAt+1,lastIndexOfDot);
        
        System.out.println(str2);
	    
	    
	    
		
		
		
	}

}
