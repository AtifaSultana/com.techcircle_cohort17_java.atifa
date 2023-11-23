package day16_4thReview;

public class Task01 {
public static void main(String[] args) {
	
	// $10.99 USD => 10.99
	// $2,000.50 USD => 2,000.50
	// $6.29 USD => 6.29

	// return only string of floating number, not $ or USD
	
	String myPrice = "$8.99 USD"; // => 3,234,234.34

    // return only string of floating number, not $ or USD

    // $ , USD
    // indexOf()
  //    int $ = myPrice.indexOf("$"); // 1
	
    int usd = myPrice.indexOf("USD"); // index of USD
    String result = myPrice.substring(1, usd-1);
    System.out.println(result);
	
  // OR another Method or solution
    
    String str = "$2123.213 USD";
    int b = str.indexOf("$");
    int c = str.indexOf(" ");
            System.out.println(str.substring(b+1,c));
            
            
	
}
}
