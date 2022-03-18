package myFunc;

public class MyFunc {
    public int divideAndRoot(int a, int b) {
        if (b == 0){
            return -1;
        }
        if ((a < 0 && b > 0) || (a > 0 && b < 0))
            return -2;
        return (int)Math.sqrt(a / b);
    }
}
