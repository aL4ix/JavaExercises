package ch05.ex05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
    close() doesn't seem to throw an exception.
 */
public class Ch05Ex05 {
    public static void main(String[] args) {
        System.out.println(Ch05Ex05.class.getSimpleName());
        try {
            Path path = Paths.get("/usr/share/dict/words");
            Scanner in = new Scanner(path);
            try {
                PrintWriter out = new PrintWriter("output.txt");
                try {
                    while (in.hasNext())
                        out.println(in.next().toLowerCase());
                } finally {
                    out.close();
                }
            } finally {
                in.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}











