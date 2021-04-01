package ch01.sec01;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        /*
        javac created the .class file in the current folder
        java HelloWorld failed because the .class file is not in ch01/sec01
        javac -d . HelloWorld.java created the file with the complete path ch01/sec01
         */
    }
}
