public class Main {
   public static double calcPrice(double price, int qty, double discount) {
      // Calculate total after discount
      return price * qty * (1 - discount);
   }
   public static void main(String[] args) {
      // Using the method
      double total = calcPrice(15.5, 3, 0.1);
      System.out.println("Total after discount: $" + total);
   }
}