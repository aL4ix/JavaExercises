package ch05.ex06;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ch05Ex06 {
    public static void a() {
        BufferedReader in = null;
        Path path = FileSystems.getDefault().getPath("LICENSE");
        try {
            in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
            //Read from in
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close(); // Caution—might throw an exception
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void b() {
        BufferedReader in = null;
        Path path = FileSystems.getDefault().getPath("LICENSE");
        try {
            try {
                in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
            } finally {
                if (in != null) {
                    in.close();
                }
            }
            //Read from in
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }
    }

    public static void c() {
        Path path = FileSystems.getDefault().getPath("LICENSE");
        try (BufferedReader in = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            //Read from in
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println(Ch05Ex06.class.getSimpleName());
        a();
        b();
        c();
    }
}
