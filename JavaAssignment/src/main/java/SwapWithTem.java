// 1.Suppose, a=10 and b=20. Now swap the value using a temp variable. Output: a=20, b=10
public class SwapWithTem {
    public void swapWithTemVariable(){
        int a = 10;
        int b = 20;
        int c = 0;

        c = a;
        a = b;
        b = c;

        System.out.println("a = "+a+" b = "+b);
    }
}
