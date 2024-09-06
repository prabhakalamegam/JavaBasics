package BiFunctions;

import java.util.stream.Stream;

/**
 * @author prabha
 */
public class BinaryOperator {

    public static void main(String[] args) {


        // The reduce function uses the functional interface BinaryOperator<T>,
        // which takes two objects of the same type as its inputs

        String result = Stream.of("hello","Java").
                reduce("*",(a,b) -> b + "-" + a);

        // Java-hello-* - o/p
        System.out.println(result);

        // Reduce Using a Function without dash at the end - with lambda

        String result1 =  Stream.of("hello", "Java")
                .reduce("", (a, b) -> combineWithoutTrailingDash(a, b));

        //Java_hello - o/p
        System.out.println(result1);

        // Reduce Using a Function without dash at the end - with method reference

       String result3 =  Stream.of("hello","java").reduce("", BinaryOperator::combineWithoutTrailingDash);

        System.out.println(result3);
    }

    private static String combineWithoutTrailingDash(String a, String b) {

        if (a.isEmpty()) {
            return b;
        }
        return b + "_" + a;
    }
}
