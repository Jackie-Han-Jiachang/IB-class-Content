package Recursion;

public class Fibonacci {
    //iterative way

    public int fibo(int n){
        int first = 1;
        int second = 1;
        for (int i = 0; i < (n-1)/2 ; i++) {
            first += second;
            second += first;
        }
        if (n % 2 == 0){
            return second;
        }else{
            return first;
        }
    }
}
