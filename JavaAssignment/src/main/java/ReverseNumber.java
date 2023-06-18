//13. Take any number as input and print the reverse of the number
//input: 12345
//output: 54321
import java.util.Scanner;

public class ReverseNumber {

    public  void reverseNumber(){
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        int tem = 0;
        while(input!=0){
            tem = input%10;
            System.out.print(tem);
            input /=10;
        }
    }
}
