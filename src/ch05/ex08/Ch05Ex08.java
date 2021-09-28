package ch05.ex08;

public class Ch05Ex08 {
    public static void main(String[] args) {
        System.out.println(Ch05Ex08.class.getSimpleName());
        /*
        This is what I see in the OpenJDK 11 source code

        try {
                ((Closeable)source).close();
            } catch (IOException ioe) {
                lastException = ioe;
            }

         So if an exception happens it's stored in lastException, then there is a getter called ioException() that
         returns that exception.
         This is different from suppressing exceptions by embedding it in another one because this is basically
         storing the exception and putting it away so the user can get it later.
         */
    }
}
