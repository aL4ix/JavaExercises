package Ch02.Ex03;

import java.util.ArrayList;
import java.util.List;

class Mutator {
    int number;

    Mutator() {
        number = 0;
    }

    int increaseByOne() {
        return number++;
    }
}

class Accessor {
    int number;

    Accessor(int number) {
        this.number = number;
    }

    void multiplyList(List<Integer> list) {
        for (int i=0; i<list.size(); i++) {
            list.set(i, list.get(i) * number);
        }
    }
}

public class Ch02Ex03 {
    public static void main(String[] args) {
        System.out.println(Ch02Ex03.class.getSimpleName());
        Accessor accessor = new Accessor(3);
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));
        accessor.multiplyList(list);
        System.out.println(list);
        Mutator mutator = new Mutator();
        System.out.println(mutator.increaseByOne());
        System.out.println(mutator.increaseByOne());
        System.out.println(mutator.increaseByOne());
    }
}

