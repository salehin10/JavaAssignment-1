//17. Check if the given string is palindrome or not. Palindrome means after reversing a string, it will be same.
import java.util.Scanner;

public class Palindrome{

    public void checkPalindrome(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        int count = 0;
        int j = 0;
        for (int i=str.length()-1; i>=0 ;i--){
            if(Character.toLowerCase(str.charAt(j)) == Character.toLowerCase(str.charAt(i))){
                count++;
            }
            j++;
        }
        if(count == str.length()) System.out.println("True");
        else System.out.println("False");

    }
}
