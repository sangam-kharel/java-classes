//2. sum of cubes
import java.util.Scanner;
public class SumOfCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double sum = (a*a*a)+(b*b*b)+(c*c*c);
        System.out.println("Sum of the cube of 3 numbers is: "+sum);
    }
    
}
