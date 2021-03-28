package Ch01.Ex10;

import java.util.Random;

public class Ch01Ex10 {
	public static void main(String[] args) {
		System.out.println("Ch01Ex10 Random to base 36");
		for(int i=0; i<10; i++) {
			System.out.print(Long.toString(Math.floorMod(new Random().nextLong(), 36), 36));
		}
	}
}
