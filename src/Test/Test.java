package Test;

public class Test {
    public static void main(String[] args) {
        int[] temp = new int[3];
        for(int i = 0; i < temp.length; i++){
            temp[i] = i;
        }
        for(int i:temp){
            System.out.println(temp[i]);
        }
        
    }
}
