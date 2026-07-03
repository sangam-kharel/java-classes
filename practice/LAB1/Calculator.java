//7. Calculator
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select what you want to do: \n");
        System.out.println("1. Addition\n");
        System.out.println("2. Subtraction\n");
        System.out.println("3. Multiplication\n");
        System.out.println("4. Division\n");
        System.out.println("Enter Any two Numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Enter the mode: ");
        int mode = sc.nextInt();
        switch(mode)
        {
            case 1:
                System.out.println("=============Addition=============\n");
                int sum = n1 + n2;
                System.out.println("\t\t"+sum);
                break;
                case 2:
                System.out.println("=============Subtraction=============\n");
                int diff = n1 - n2;
                System.out.println("\t\t"+diff);
                break;
                case 3:
                System.out.println("=============Multiplication=============\n");
                int mul = n1 * n2;
                System.out.println("\t\t"+mul);
                break;
                case 4:
                System.out.println("=============Division=============\n");
                int div = n1 / n2;
                System.out.println("\t\t"+div);
                break;
                default:
                    System.out.println("Invalid Number\nPlease type number from 1 to 4");
                    break;
        }
    }            
}
 

