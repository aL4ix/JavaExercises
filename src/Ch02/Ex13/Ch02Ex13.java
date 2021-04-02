package Ch02.Ex13;

//import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.Arrays;

public class Ch02Ex13 {
    public static void main(String[] args) throws Exception {
        System.out.println(Ch02Ex13.class.getSimpleName());
        /*
        try (CSVReader reader = new CSVReader(new FileReader("src/Ch02/Ex13/mycsv.csv"))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                System.out.println(Arrays.toString(nextLine));
            }
        }*/
    }
}
