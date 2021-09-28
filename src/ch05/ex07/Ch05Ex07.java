package ch05.ex07;

import java.io.IOException;

public class Ch05Ex07 {
    public static void main(String[] args) throws IOException {
        System.out.println(Ch05Ex07.class.getSimpleName());
        /*
Explain why
try (Scanner in = new Scanner(Paths.get("/usr/share/dict/words"));
PrintWriter out = new PrintWriter(outputFile)) {
    while (in.hasNext())
    out.println(in.next().toLowerCase());
}

is better than

Scanner in = new Scanner(Paths.get("/usr/share/dict/words"));
PrintWriter out = new PrintWriter(outputFile);
try (in; out) {
    while (in.hasNext())
    out.println(in.next().toLowerCase());
}

The scope of the variables is limited in the first one, which means after the try section finishes the variables won't
be accessible, while if the second way, the resources are closed but still on scope, still usable, but closed.
         */
    }
}
