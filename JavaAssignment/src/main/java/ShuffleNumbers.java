//12. Write a program that will shuffle (values will randomly change their position) from the given array
//numbers=[1,2,3,4,5,6,7,8,9,0]
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ShuffleNumbers {

    public void shuffleNumbers(){

        Integer[] numbers = {1,2,3,4,5,6,7,8,9,0};
        System.out.println("Before : " +Arrays.toString(numbers));
        List<Integer> list = Arrays.asList(numbers);
        Collections.shuffle(list);
        list.toArray(numbers);
        System.out.println("After  : "+Arrays.toString(numbers));
    }
}
