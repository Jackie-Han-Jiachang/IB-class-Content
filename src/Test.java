import java.util.Arrays;

public class Test {

    public static double findDistance(double x1, double x2, double y1, double y2){
        return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
    }

    public static int maxIndex(int[] inputArray){
        int max = inputArray[0];
        for(int i = 0; i < inputArray.length; i++){
            int test = inputArray[i];
            if (max < test){
                max = test;
            }
        }
        for(int i = 0; i < inputArray.length; i++){
            if (inputArray[i] == max) {
                return i;
            }
        }return -1;
    }

    public static int enhanceMaxIndex(){
        int test = IBIO.inputInt();
        int max = 0;
        int position = 0;
        int index = 0;
        while (test != 0){
            if(test > max){
                max = test;
                position = index;
            }
            index++;
            test = IBIO.inputInt();
        }
        return position;
    }

    public static int numberOfZeros(){
        int totalNumber = IBIO.inputInt();
        int counter = 0;
        for (int i = 0; i < totalNumber; i++){
            int inputNumebr = IBIO.inputInt();
            if (inputNumebr == 0){
                counter++;
            }
        }return counter;
    }

    public static int lostCard(){
        int number = IBIO.inputInt();
        int sum = 0;
        int realSum = ((1 + number) * number)/2;

        for (int i = 0; i < number - 1; i++){
            sum += IBIO.inputInt();
        }
        return realSum - sum;
    }

    public static void bubble_sort(int[] data) {
        int n = data.length;

        for (int pass=0; pass<n - 1; pass++) {
            boolean swapped = false;
            for (int current=0; current<n - 1 - pass; current++) {
                if (data[current] > data[current+1]) {
                    int temp = data[current];
                    data[current] = data[current+1];
                    data[current+1] = temp;
                    swapped = true;
                }
            }
//            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] data = new int[5];
        for(int i = 0; i<data.length; i++){
            data[i] = (int)(Math.random()*100);
        }
        IBIO.output(Arrays.toString(data));
        bubble_sort(data);
        IBIO.output(Arrays.toString(data));
    }
}
