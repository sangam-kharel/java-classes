//6. 
import java.util.*;
public class VowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char a = sc.next().charAt(0);
        switch(a)
        {
            case 'a': case 'e': case'i': case 'o': case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonent");
                break;
        }
    }
    
}
