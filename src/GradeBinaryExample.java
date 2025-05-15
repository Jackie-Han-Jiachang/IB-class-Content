import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class GradeBinaryExample {
    public static void main(String[] args) {
        // this program will input a bunch of names (ending in "") and scores.
        // It will populate our grades.gunn file in order sorted by name

        String[] names = {"Alex", "Amber", "Amy", "Benny", "Bob"};
        int[] score = {20    ,50   ,75   ,17   ,22};
        try {
            RandomAccessFile raf = new RandomAccessFile("grades.gunn", "rw");
            for (int i = 0; i < names.length; i++){
                raf.seek(0);
                byte[] bname = (((String)names[i]) + "          ").substring(0,10).getBytes();
                raf.write(bname);
                raf.writeInt(score[i]);

            }

            raf.seek(0);
            byte[] name = "Donald    ".getBytes();
            raf.write(name);
            raf.writeInt(20);
            name = "Kamala    ".getBytes();
            raf.write(name);
            raf.writeInt(50);
            raf.close();
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
