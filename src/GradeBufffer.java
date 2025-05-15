
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GradeBufffer {
    public static void main(String[] args) throws IOException {
        String name = IBIO.input("Name?");


        String path = "grades.csv";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            boolean done = false;
            while (line != null || !done){
                if (line.startsWith(name + ",")) {
                    IBIO.output(line.substring(line.indexOf(",") + 1));
                    done = true;
                }line = reader.readLine();
            }
            reader.close();

        } catch (FileNotFoundException e){
            IBIO.output("404 NF");
        } catch (IOException e){
            IBIO.output("! Warning !");

        }
    }
}
