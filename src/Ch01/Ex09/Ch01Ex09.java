package Ch01.Ex09;

public class Ch01Ex09 {
	public static void main(String[] args) {
		System.out.println("Ch1Ex09 comparing strings with ==");
		String world = "World";
		StringBuffer sb = new StringBuffer("World");
		System.out.println(world == sb.toString());
	}
}
