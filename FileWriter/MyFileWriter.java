package FileWriter;

import java.io.*;

public class MyFileWriter {

    /*
     * The homework activity is incorrect - we were told to select *two* writers
     * (one for text and one for non-text data) in the first homework assignment.
     * With this in mind, I selected BufferedWriter and BufferedOutputStream. If the
     * goal was to only use one class, then Files becomes the obvious choice as it
     * encompasses both BufferedWriter and BufferedOutputStream. Moreover, the
     * ability to create files is given to the Files object, so in that context
     * Files becomes better. Regardless, I will use BufferedWriter for this exercise
     * and only use Files to generate the new files.
     * 
     * AINT NOBODY ASK
     */

    public static void main(String[] args) throws IOException {
        generateHiddenPasswordFile("hello world");
        generateConfidentialFile("no one will ever see this (except on GitHub) I SAW IT - sohs");
    }

    public static void generateHiddenPasswordFile(String password) throws IOException {

        File passwordFile = new File(".secretpswd.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(passwordFile));

        bw.write(password);
        bw.close();

    }

    public static void generateConfidentialFile(String secrets) throws IOException {
        
        File hiddenFile = new File(".secretfolder/hiddenstuff.dat");
        BufferedWriter bw = new BufferedWriter(new FileWriter(hiddenFile));

        bw.write(secrets);
        bw.close();

    }
}