import java.util.Scanner;
 public class Problem3 {
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         System.out.print("Enter a number : ");
         int n = s.nextInt();
         if (isPrime(n, 2)) {
             System.out.println(n + " is a prime number");
         } else {
             System.out.println(n + " is not a prime number");
         }
     }

     public static boolean isPrime(int n, int i) {
         if (n <= 1) {
             return false;
         }
         if (i >= Math.sqrt(n)) {
             return true;
         }
         if (n % i == 0) {
             return false;
         }
         return isPrime(n, i + 1);
     }
 }

