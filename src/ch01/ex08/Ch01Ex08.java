package ch01.ex08;

import java.util.Arrays;
import java.util.Scanner;

public class Ch01Ex08 {
	public static void main(String[] args) {
		System.out.println("Ch01Ex08 Give me a string");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(Arrays.toString(str.split(" ")));
	}
}
