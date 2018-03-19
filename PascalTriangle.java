import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {

   public static void print(int n) {
	   ArrayList<Integer> prev = new ArrayList<>();
	   ArrayList<Integer> newRow = new ArrayList<>();
       for (int i = 0; i < n; i++) {
    	   newRow = pascal(prev,i+1);
    	   prev = newRow;
    	   System.out.print(newRow);     
    	   System.out.println();
       }
      
   }

   public static ArrayList<Integer> pascal(ArrayList<Integer> prev, int numElem) {
       ArrayList<Integer> newRow = new ArrayList<>();
       for (int j = 0; j < numElem; j++){
    	   if (j == 0){
    		   newRow.add(0,1);
    	   }
    	   else if (j == numElem-1){
    		   newRow.add(numElem-1, 1);
    	   }
    	   else {
    		   int elem = (prev.get(j-1) + prev.get(j))%2;
        	   newRow.add(j, elem);  
    	   }
       }
       return newRow;

   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the row number upto which Pascal's triangle has to be printed: ");
       int row = scanner.nextInt();
       print(row);
   }
}
