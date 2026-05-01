public class fibonacci {
    public static int fib(int n){
        if(n <= 1){
            return n;
        }
        int first = fib(n - 1);
        int second = fib(n - 2);
        return first + second;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }   
}
