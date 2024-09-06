package BiFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/**
 * @author prabha
 */
public class BiFunctionPra {


    // The BiFunction interface allows us to use parameters of different types, with a return value of a third type.

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Dave","John");
        List<Integer> list2 = Arrays.asList(1,2);

        List<String> list3 = new ArrayList<>();

        for (int i =0 ; i <= list1.size() ; i++){
            list3.add(list1.get(i) + list2.get(i));
        }
        List<String> result = listCombiner(list1, list2, (letter, number) -> letter + number);
        System.out.println(list3);

        //generalising this
    }

    private static <T, U, R> List<R> listCombiner
            (List<T> list1, List<U> list2, BiFunction<T, U, R> combiner) {

        List<R> result = new ArrayList<>();
        for(int i=0; i <= list1.size(); i++){
            result.add(combiner.apply(list1.get(i), list2.get(i)));
        }
    }

}
