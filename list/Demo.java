package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();

        items.add("Apple");
        items.add("Banana");
        items.add("Kiwi");
        items.add("Mango");

        Collections.sort(items, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        System.out.println(items);
    }
}