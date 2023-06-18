//9. Write a program that will give following output:
//        1
//        12
//        123
//        1234
//        12345

public class Pattern {

    public void pattern1(){

        for (int i= 1; i<=5; ++i){
            for (int j=1; j<=i; ++j){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern2(){
        for (int i= 5; i>=1; i--){
            for (int j=1; j<=i; ++j){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
