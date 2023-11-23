package day08_2ndreview;

public class ElseIf {

	public static void main(String[] args) {
		
		//if vs else if vs else
		    // if

		    if (false) {
		      System.out.println("this code will be skipped");
		      System.out.println("they will never run");
		    } else {
		      System.out.println("else block will run the if block is skipped");
		    }

		    System.out.println("End of code");


		    System.out.println("\n==== else if ====");
		    // multiple branch if
		    // else if
		    // cannot be standlone, need if

		    int temp = 32;
		    if (temp < 75 && temp >= 68) {
		      System.out.println("The weather is nice");
		    } else if (temp < 68 && temp >= 50) {
		      System.out.println("This is a bit chilly");
		    } else if (temp < 50 && temp >= 40) {
		      System.out.println("I need to get my coat");
		    } else if (temp < 40) {
		      System.out.println("Let's just stay warm at home");
		    } else {
		      System.out.println("This will run, if none of condition" +
		          "in if / elseif () are true");
		    }

		    System.out.println("End of weather program");
		
	}

}
