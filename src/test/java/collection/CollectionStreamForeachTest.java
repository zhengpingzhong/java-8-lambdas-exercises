package collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CollectionStreamForeachTest {


    @Test
    public void collectionStreamForeachTest() {
        List<String> list = Arrays.asList("A", "B", "C", "D");
//        Consumer<String> consumer = System.out::print;
//        list.forEach(consumer);
//        System.out.println();
//        list.stream().forEach(consumer);
//        System.out.println();
//        list.parallelStream().forEach(consumer);
//        System.out.println();
        Consumer<String> removeElement = s -> {
            System.out.println(s + " " + list.size());
            if (s != null && s.equals("A")) {
                list.remove("D");
            }
        };

//        list.forEach(removeElement);
//        java.lang.UnsupportedOperationException
//        list.parallelStream().forEach(removeElement);
//        java.lang.UnsupportedOperationException: java.lang.UnsupportedOperationException: remove

        list.forEach(e -> {
            list.set(3, "E");
        });

        list.stream().forEach(e -> {
            list.set(3, "E");
        });
        list.stream().forEach(System.out::print);
    }
}
