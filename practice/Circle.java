//1. Addition
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner pi = new Scanner(System.in);
        System.out.println("Enter Radius of a circle: ");
        double r = pi.nextDouble();
        System.out.println("Area of a circle is: "+(Math.PI*(r*r)));           
    }
    
}
