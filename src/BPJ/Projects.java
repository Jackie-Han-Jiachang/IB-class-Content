package BPJ;

import java.util.Scanner;

public class Projects {

    public static String nameThatCelebrity(String name){
        return name.substring(2,name.length()-3);
    } //8 min

    public static String tester(int number){
        if (number % 2 == 0){
            return "even";
        }else{
            return "odd";
        }
    } //3 min

    public static void nameReversal(String name){
        String newName = name.toLowerCase();
        for(int i = newName.length()-1; i >= 0; i--){
            System.out.print(newName.charAt(i));
        }

    } //10 min

    public static void arrayOfHope(){
        char[] ch = new char[26];
        int index = 0;
        for(char i = 65; i <= 90; i++){
            ch[index] = i;
            index += 1;
        }

        for(int i = 0; i < 26; i++){
            System.out.print(ch[i]+", ");
        }
    }//13 min
    public static void main(String[] args) {
        arrayOfHope();

    }
}
