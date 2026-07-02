//3.
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = sc.nextInt();
        int sum = 0;
        while(a!=0)
        {
            int b = a%10;
            sum=sum*10+b;
            a=a/10;
        }
        System.out.println("Reservse is: "+ sum);
    }
    
}
