public class Main {
   public static void main(String[] args)
   {
      for(int i = 1; i <= 5; i++) {       // outer loop for rows
         for(int j = 1; j <= 5; j++) {   // inner loop for columns
            System.out.print((i*j) + "\t");
         }
         System.out.println();            // move to next row
      }
   }
}