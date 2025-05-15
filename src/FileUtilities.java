
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/*

This class contains code to help us read and write files.
It was written in Mr. Gunn's class.

Most this code is modified from:
https://docs.oracle.com/javase/tutorial/essential/io/file.html#:~:text=Learn%20how%20to%20use%20various%20methods%20and%20options%20to%20read,

 */
public class FileUtilities {

    /*
        Read a file from the path( path) and return it
     */
    public static String readFile(String path) {
        Path file = Path.of(path);
        String data = "";
        // Charset charset = StandardCharsets.US_ASCII;  // ASCII
        Charset charset = StandardCharsets.UTF_8; // Unicode
        try {
            BufferedReader reader = Files.newBufferedReader(file, charset);
            String line = reader.readLine();
            while (line != null) {
                data += line + "\n";
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
        return data;
    }

    /*
    This method helps write a text file (path) with the contents in data
     */
    public static void writeFile(String path, String data) {
        Path file = Path.of(path);
        //Charset charset = StandardCharsets.US_ASCII;
        Charset charset = StandardCharsets.UTF_8; // Unicode
        try {
            BufferedWriter writer = Files.newBufferedWriter(file, charset);
            writer.write(data, 0, data.length());
            writer.close();
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}
