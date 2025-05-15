package Recursion;

public class Search {
    /* pre ib way:
    public static int search(int[] data, int value){
        for (int i = 0; i < data.length; i++){
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }*/

    //low: the lowest index of our range
    //high: the highest index of our range

    /*
    public static int search(int[] data, int value, int low) {
        if (low == data.length) return -1; //404
        if (data[low] == value) return low; // found it
        return search(data, value, low+1); // continue to found
    }
    */
   // 1 2 3 4 5 6 7 8 9 10 11

//    public static int search(int[] data, int value, int low ,int high){
//        int mid = low + (high - low)/2;
//
//        if (low > high){
//            return -1;
//        }
//        if(data[mid] == value){
//            return mid;
//        }
//
//        if (data[mid] < value){
//            return search(data, value, mid+1, high);
//        }else {
//            return search(data, value, low, mid - 1);
//        }
//
//    }

    public static int search(int[] data, int value, int low, int high){
        int mid = (high + low)/2;
        if (low > high){
            return -1;
        }

        if(data[mid] == value){
            return mid;
        }

        if(data[mid] < value){
            return search(data, value, mid + 1, high);
        }else{
            return search(data, value, low, mid - 1);
        }
    }


    public static void main(String[] args) {
        int[] data = {1,2,4,6,9,12};
        int x = search(data, 8,0, data.length);


        IBIO.output(x);
    }
}
