package Recursion;


public class RecursionExample {
    public static void numsTo(int n) {
        //base case : where the recursion stops
        if (n==11){
            return;
        }
        //recursive stop
        numsTo(n+1);
        IBIO.output(n);
    }

    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        //n! = n * (n-1)!
        //a_n = n * a_{n-1}
        return n * factorial(n-1);
    }

    public static int sum(int n){
        if (n==1){
            return 1;
        }

        return n+sum(n-1);
    }

    public static int Fibonacci(int n){
        if (n==1){
            return 1;
        }
        if (n==2){
            return 1;
        }
           return Fibonacci(n-1)+Fibonacci(n-2);
    }


    public static void main(String[] args) {
        int x = Fibonacci(5);
        IBIO.output(x);
    }
}

