
import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GradeReporter {
    public static void main(String[] args) throws IOException {
        String name = IBIO.input("Name?");


        String path = "grades.csv";
        int c;
        try {
            FileReader fr = new FileReader(path);
            c = fr.read();
            boolean readingName = true;
            boolean nameFound = false;
            boolean printed = false;
            String nameToken = "";


            while (c != -1 && (!nameFound || !readingName)) {
                    if (c == ',') {
                        readingName = false;
                        nameFound = nameToken.equals(name);
                        nameToken = "";
                    } else if (c == '\n') {
//                        if (printed){
//                            c = -1;
//                        } else
                        readingName = true;
                    } else if (readingName) {
                        nameToken += (char) c;
                    } else if (nameFound) {
                        System.out.print((char) c);
                        printed = true;
                }
                c = fr.read();
            }
            fr.close();
        } catch (FileNotFoundException e){
            IBIO.output("404 NF");
        } catch (IOException e){
            IBIO.output("! Warning !");

        }
    }
}
