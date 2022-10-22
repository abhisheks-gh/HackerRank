import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        // Sum of lengths of A and B
        System.out.println(A.length() + B.length());
        if (A.charAt(0) > B.charAt(0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String capitalizedA = A.toUpperCase();
        String capitalizedB = B.toUpperCase();
        System.out.println( capitalizedA.charAt(0) + A.substring(1, A.length()) + " " + capitalizedB.charAt(0)
                    + B.substring(1, B.length()));
        sc.close();
    }
}