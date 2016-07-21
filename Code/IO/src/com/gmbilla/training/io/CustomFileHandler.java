package com.gmbilla.training.io;

import java.io.*;

/**
 * @author Gian Marco Sibilla
 */
public class CustomFileHandler {

    public static void write(String msg, String path, boolean append) {
        try {
            // Opening the file writer:
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter(path, append));

            // Writing the message:
            bufferedWriter.write(msg + "\n");

            // Releasing the writer:
            bufferedWriter.close();

        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }

    public static void write(String msg, String path) {
        write(msg, path, false);
    }

    public static void write(String msg) {
        write(msg, "file.dat");
    }

    public static String read(String path) {
        String fileContent = "";
        try {
            // Creating the reader:
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(path));


            String line;
            // Reading the file one line at a time:
            while(true) {
                line = bufferedReader.readLine();
                // Concatenating the line with the content:
                if (line == null)
                    break;

                fileContent += line + "\n";
            }

            // Releasing the reader:
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.err.println("File not found!");

            fileContent = null;
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());

            fileContent = null;
        }

        return fileContent;
    }

    public static String read() {
        return read("file.dat");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            CustomFileHandler.write("hello world " + i, "test.txt", true);

        String content = CustomFileHandler.read("test.txt");
        System.out.println("File content: '" + content + "'");
    }

}
