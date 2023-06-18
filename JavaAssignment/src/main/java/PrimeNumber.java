//Print the prime numbers of 2 to 100
public class PrimeNumber {

    public void primeNumber(){

        int prime = 0;
        boolean flag;
        for (int i =2; i<=100; i++){
            flag = false;
            for(int j= 2; j<i; j++){
                if(i%j == 0){
                    flag = true;
                }
            }
            if(!flag) System.out.print(i+" ");
        }
    }
}
