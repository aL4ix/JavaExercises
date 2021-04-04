package Ch03.Ex11;

import java.io.File;
import java.io.FileFilter;

public class Ch03Ex11 {
    public static File[] getSubDirs1(String pathname) {
        return new File(pathname).listFiles(x -> x.isDirectory());
    }

    public static File[] getSubDirs2(String pathname) {
        return new File(pathname).listFiles(File::isDirectory);
    }

    public static File[] getSubDirs3(String pathname) {
        return new File(pathname).listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory();
            }
        });
    }

    public static void main(String[] args) {
        System.out.println(Ch03Ex11.class.getSimpleName());
        String pathname = System.getProperty("user.home");
        for (File file : getSubDirs1(pathname)) {
            System.out.println(file);
        }
        for (File file : getSubDirs2(pathname)) {
            System.out.println(file);
        }
        for (File file : getSubDirs3(pathname)) {
            System.out.println(file);
        }
    }
}
