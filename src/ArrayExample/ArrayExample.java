package ArrayExample;

public class ArrayExample {
    public static void main(String[] args) {
        int[][] y = {{1,2},{3,4,5,6},{7,8,9},{10,11,12,13,14}}; //array of arrays

        for (int i = 0; i < y.length; i++){
            for (int j = 0; j < y[i].length; j++){
                IBIO.output(y[i][j]);
            }
        }
        IBIO.output(y[3][2]);
    }
}
