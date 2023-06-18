import java.util.Arrays;

//Write a program that will find your key is found in the given array using linear search method
//numbers=[1,6,9,3,5,4,7]
//key=5
public class LinearSearch {

    public void linearSearch(){
        int[] array = {1,6,9,3,5,4,7};
        int key = 5;
        int flag = 0;
        Arrays.sort(array);
        for (int i = 0; i< array.length; i++){
            if (array[i] == key){
                flag++;
                break;
            }
        }
        System.out.println("Sorted Array "+Arrays.toString(array));
        if (flag == 1) System.out.format("Key %d found",key);
        else System.out.format("Key %d not found", key);
    }
}
