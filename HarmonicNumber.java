import java.util.*;
public class HarmonicNumber {
    public static void main(String[] args) {
        int n;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter nth value Of Harmonic Number:");
           n = sc.nextInt();
           sc.close();
           if (n > 0) {
               for (int count = 1; count <= n; count++) {
                   System.out.print(1 + "/" + count + " " + "+" + " ");
               }
           } else {
               System.out.println("Invalid Input ");
           }
   }
}
