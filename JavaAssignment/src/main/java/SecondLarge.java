//11. Find out the second largest element of the given array
//numbers=[5,3,9,7,4,1,8]
import java.util.Arrays;
public class SecondLarge {

    public void secondLarge(){
        int[] numbers = {5,3,9,7,4,1,8};
        Arrays.sort(numbers);
        System.out.println("Numbers : "+Arrays.toString(numbers));
        System.out.println("The second large number :"+numbers[numbers.length-2]);
    }
}
