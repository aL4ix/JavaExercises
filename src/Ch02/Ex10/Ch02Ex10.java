package Ch02.Ex10;

import java.util.Collections;
import java.util.List;
import java.util.Random;

class RandomNumbers {
    private static Random random = new Random();

    public static int randomElement(int[] array) {
        int length = array.length;
        return length > 0 ? array[random.nextInt(length)] : 0;
    }

    public static int randomElement(List<Integer> list) {
        int size = list.size();
        return size > 0 ? list.get(random.nextInt(size)) : 0;
    }
}

public class Ch02Ex10 {
    public static void main(String[] args) {
        System.out.println(Ch02Ex10.class.getSimpleName());
        System.out.println(RandomNumbers.randomElement(new int[]{}));
        System.out.println(RandomNumbers.randomElement(new int[]{1, 2, 3}));
        System.out.println(RandomNumbers.randomElement(Collections.emptyList()));
        System.out.println(RandomNumbers.randomElement(List.of(1, 2, 3)));
        /*
        These methods can't be inside int[] or ArrayList<Integer> because they would need to be inside those classes
         */
    }
}
