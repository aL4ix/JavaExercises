package Ch03.Ex13;

import java.io.File;
import java.util.Arrays;

public class Ch03Ex13 {
    public static void sort(File[] files) {
        Arrays.sort(files, (f1, f2) -> (f1.isDirectory() == f2.isDirectory()) ? f1.getName().compareTo(f2.getName()) :
                f1.isDirectory() ? -1 : 1);
    }

    public static void main(String[] args) {
        System.out.println(Ch03Ex13.class.getSimpleName());
        String pathname = System.getProperty("user.home");
        File[] files = new File(pathname).listFiles();
        sort(files);
        System.out.println(Arrays.toString(files));
    }
}
