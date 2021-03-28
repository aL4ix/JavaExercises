package Ch01.Ex11;

import java.util.Scanner;

public class Ch01Ex11 {

	public static void main(String[] args) {
		System.out.println("Ch01Ex11 Give me a string with non-ASCII characters");
		try (Scanner scan = new Scanner(System.in)) {
			String line = scan.nextLine();
			for(int cp : line.codePoints().toArray()) {
				if (cp > 127) {
					System.out.printf("%c U+%04X\n", cp, cp);
				}
			}
		}
	}
}
