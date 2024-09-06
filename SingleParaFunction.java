package BiFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author prabha
 */
public class SingleParaFunction {
    public static void main(String[] args) {

        List<String> funtions = Arrays.asList("Hello","Java");


        //As we can see, the map uses Function, which takes a single parameter
        // and allows us to perform an operation on that value, returning a new value

        List<String> functonList =  funtions.stream().map( word -> word + "!").collect(Collectors.toList());

        System.out.println(functonList);
    }
}
