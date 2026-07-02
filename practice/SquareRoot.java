//3. Square root
import java.util.Scanner;


public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        double a = sc.nextDouble();
        double sqroot = Math.sqrt(a);
        System.out.println("Square Root of given number is: "+sqroot);
    }
    
}
