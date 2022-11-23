import java.util.*;
public class SwapTwoNumbers {
    public static void main(String[] args) {
		int a, b, c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value in a :");
        a=sc.nextInt();
        System.out.println("Enter Value in b :");
        b=sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("Now Values in a is:" +a);
        System.out.println("Now Values in b is:" +b);
        sc.close();
	}
}
