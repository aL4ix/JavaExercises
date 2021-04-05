package ch02.ex04;

//For some reason IntHolder doesn't exist in my environment..
//But I deducted the class :)
class IntHolder {
    public int value;

    public IntHolder(int value) {
        this.value = value;
    }
}

public class Ch02Ex04 {
    public static void swapInt(IntHolder i1, IntHolder i2) {
        int temp = i2.value;
        i2.value = i1.value;
        i1.value = temp;
    }

    public static void main(String[] args) {
        System.out.println(Ch02Ex04.class.getSimpleName());
        IntHolder i1 = new IntHolder(1);
        IntHolder i2 = new IntHolder(2);
        System.out.println(i1.value);
        System.out.println(i2.value);
        swapInt(i1, i2);
        System.out.println("Swapping values");
        System.out.println(i1.value);
        System.out.println(i2.value);
    }
}
