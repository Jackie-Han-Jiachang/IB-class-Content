package Test;

public class FindBiggest {
   private int max;
   private int temp;

   public int findMax(){
       max = IBIO.inputInt();

       for(int i = 0; i < 9; i++){
           temp = IBIO.inputInt();
           if (max < temp){
               max = temp;
           }
       }
       return max;
   }
}
