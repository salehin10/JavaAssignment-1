//14. Find out the duplicate numbers in the given array and in which position they are found.
//numbers=[1,2,3,1,2,4,5,6,4]

public class DuplicateValue {
    public void duplicateValue(){
        int[] numbers = {1,2,3,1,2,4,5,6,4};

        for(int i=0; i<numbers.length; i++){
            for(int j= i+1; j<numbers.length ;j ++){
                if(numbers[i] == numbers[j]){
                    System.out.println("Duplicate value : "+numbers[i]+" is at index "+ j);
                }
            }
        }

    }
}
