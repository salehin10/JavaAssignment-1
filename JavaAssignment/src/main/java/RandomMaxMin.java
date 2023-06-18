import java.util.Arrays;
import java.util.Random;
//Generate random 10 integer numbers in an array and print out all the numbers from array and also print the max and min number from the array
public class RandomMaxMin {

    public void randomMaxMin(){
        int[] array = new int[10];
        Random random = new Random();
        for (int i= 0; i <10; i++){
            array[i] = random.nextInt(50)+1;
        }
        Arrays.sort(array);
        int max = array[9];
        int min = array[0];
        for( int i = 0; i< 10; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\nMax is "+max+ " & Min is "+min);

    }
}
