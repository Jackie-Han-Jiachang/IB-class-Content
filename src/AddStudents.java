package VagetableExample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AddStudents {
    public static void main(String[] args) {

        try {
            PrintWriter pw = new PrintWriter(new FileWriter("grades.csv", true));
            pw.println("hello, 20");
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

      
    
}

// file writer

/*        try {
//            FileWriter fw = new FileWriter("grades.csv",true);
//            fw.write("Hello,20\n");
//            fw.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
              }
*/