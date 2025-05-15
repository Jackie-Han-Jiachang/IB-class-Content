package Recursion;

import java.util.Stack;

public class FactorialExamples {

    public static int fact(int num){
        if (num==1)
            return 1;
            
        return num * fact(num-1);
    }

    public static int fact_stack(int num){
        int counter = 1;
        int n = num;
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i<n; i++){
            s.push(num);
            num -= 1;
        }

        while(!s.isEmpty()){
            counter *= s.pop();
        }
        return counter;
    }
    
    public static void main(String[] args) {
        System.out.println(fact_stack(5));
    }
    
    
}
