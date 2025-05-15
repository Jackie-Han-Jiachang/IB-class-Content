package InterestingThings;

public class transpose {

    public static void transposeMatrix(int[][] matrix){
        //{1,2,3}
        //{4,5,6}
        //{7,8,9}

        for(int i = 0; i < matrix.length; i++){
            for(int j = i+1; j < matrix[i].length; j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        transposeMatrix(a);

        for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[i].length; j++) { 
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

