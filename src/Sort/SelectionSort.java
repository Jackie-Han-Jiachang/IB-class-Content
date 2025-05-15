package Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void selectionSort(int[] numbers){
        for(int i = 0; i < numbers.length-1; i++){
            int smallestIndex = i;
            //the first number
            int smallest = numbers[smallestIndex];
            for (int j = i+1; j < numbers.length; j++){

                if (smallest > numbers[j]){
                    smallest = numbers[j];
                    smallestIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[smallestIndex];
            numbers[smallestIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = new int[5];
        for(int i = 0; i<data.length; i++){
            data[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(data));
        selectionSort(data);
        System.out.println(Arrays.toString(data));
    }
}
