import java.util.Arrays;

//Write a program that will find your key is found in the given array using binary search method
//numbers=[1,6,9,3,5,4,7]
//key=5
public class BinarySearch {
    public void binarySearch(){
        int[] array = {1,6,9,3,5,4,7};
        int left =  0;
        int right = array.length - 1;
        int key = 5;
        int flag = 0;
        Arrays.sort(array);
        System.out.println("Sorted Array :"+Arrays.toString(array));
        while (left <= right){
            int mid = (left + right )/2;
            if (array[mid] == key){
                flag++;
                break;
            }
           else if ( array[mid] < key){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }

        if (flag == 1) System.out.println("key found");
        else System.out.println("key not found");

    }
}
