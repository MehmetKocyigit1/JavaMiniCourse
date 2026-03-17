public class Main {
   public static void main(String[] args) {

      int[] temps = {22, 25, 19, 24, 20, 23, 21}; // temperatures for 7 days
      int sum = 0;

      // Using for-each loop to sum all temperatures
      for(int t : temps) {
         sum += t;
      }

      // Calculate average as double to preserve decimal
      double avg = sum / (double)temps.length;
      System.out.println("Weekly average temperature: " + avg);

   }
}