package day10_loopstasks;

public class Task06 {

	public static void main(String[] args) {
		/* valid browsers: chrome, firefox, opera, safari, edge, ie
		String str = "chrome"
		Output: CHROME BROWSER IS SELECTED */

		// can use if or switch statement
		String browser = "chrome";
		switch (browser) {
		case "Chrome":
		    System.out.println("CHROME BROWSER IS SELECTED");
		    break;
		case "Safari":
		    System.out.println("SAFARI BROWSER IS SELECTED");
		    break;
		case "Firefox":
		    System.out.println("Firefox BROWSER IS SELECTED");
		    break;
		case "Opera":
		    System.out.println("Opera BROWSER IS SELECTED");
		    break;
		case "Edge":
		    System.out.println("Edge BROWSER IS SELECTED");
		    break;
		case "ie":
		    System.out.println("ie BROWSER IS SELECTED");
		    break;
		default:
		    System.out.println("Ivalid browser");
		}
		}	
	}


