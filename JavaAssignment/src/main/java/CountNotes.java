//7. Write a program that will break down the amount and count notes for any given amount. Here is the notes in the given array:
//notes=[1000,500,200,100,50,20,10,5,2,1]
import java.util.Scanner;
public class CountNotes {

    public void countNotes(){
        int[] notes = {1000,500,200,100,50,20,10,5,2,1};
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount ");
        int amount = input.nextInt();
        for(int i = 0; i <notes.length; i++){
            int count = 0;
            if (amount >= notes[i]){
                int tem1 = amount;
                int tem2 = notes[i];
                while(tem1 >= tem2 ){
                    tem1 = tem1 - tem2;
                    count++;
                }
                amount = amount - (notes[i]*count);
                if(count != 0) System.out.println(notes[i]+ " "+ count);
            }
        }

    }
}
