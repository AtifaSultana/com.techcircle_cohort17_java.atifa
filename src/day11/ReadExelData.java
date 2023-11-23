package day11;

public class ReadExelData {

	public static void main(String[] args) {

		 int rowCount = 6;
	        int columnCount = 3;
	        
	        
	        
	        
	        
	        for (int row = 1 ; row <= rowCount; row++) {
	            System.out.println("row #"+row);
	            for (int column = 1 ; column <= columnCount ; column++) {
	                System.out.println("Column #"+column);
	            }
	        }
	        
	        
	        //cell(1,1) , cell(1, 2) , cell(1, 3)
	        
	        for (int row = 1 ; row <= rowCount; row++) {
	            for (int column = 1 ; column <= columnCount ; column++) {
	                System.out.println("cell("+row+", "+column+")");
	            }
	        }
	        
	        
	        
	        
	        for (int row = 1 ; row <= rowCount; row++) {
	            for (int column = 1 ; column <= columnCount ; column++) {
	                System.out.print("cell("+row+", "+column+")\t");
	            }
	            System.out.println();
	        }
	        
	        
	        
	        
	        
	    }

	
		
		
		
	}

