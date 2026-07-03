//4. Odd Even
import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = sc.nextInt();
        if(a%2==0)
        {
            System.out.println("The given number is Even");
        }
        else
        {
            System.out.println("The given number is Odd");
        }
    }
    
}
