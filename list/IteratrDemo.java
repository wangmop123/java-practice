package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratrDemo {
    public static void main(String[] args) { 
        List<String> items = new ArrayList<>();
        items.add("one");
        items.add("two");
        items.add("three");
        items.add("four");

    
   
        
        

      
        Iterator<String> iterator = items.iterator();
        while (iterator.hasNext()){
            String item = iterator.next();
            if (item.equals("omne")) {
                iterator.remove();
            }
            System.out.println("the item is " +item);
        }
        for (String item : items) {
            System.out.println("the item is " +item);
        }
        
    }
}
