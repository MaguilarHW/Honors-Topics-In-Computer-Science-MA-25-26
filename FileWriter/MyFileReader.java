package FileWriter;

import java.io.EOFException;

public class MyFileReader {
    public static void main(String[] args) {
        try {
            throw new EOFException();
        } catch (Exception e) {
            int x = 1 / 0;
        }
    }
}
