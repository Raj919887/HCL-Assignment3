package assignment3;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> tm1 = new TreeMap<>();

        TreeMap<Integer, String> tm2 = new TreeMap<>(tm1);

        TreeMap<Integer, String> tm3 = new TreeMap<>(tm1);

        tm1.put(1, "Apple");
        tm1.put(3, "Mango");
        tm1.put(2, "Banana");

        System.out.println("Value for key 2: " + tm1.get(2));

        System.out.println("Size: " + tm1.size());

        System.out.println("Is Empty: " + tm1.isEmpty());

        System.out.println("Contains key 1: " + tm1.containsKey(1));

        System.out.println("Contains value Mango: " + tm1.containsValue("Mango"));

        tm1.remove(3);

        System.out.println("First Key: " + tm1.firstKey());

        System.out.println("Last Key: " + tm1.lastKey());

        Set<Integer> keys = tm1.keySet();
        System.out.println("Keys: " + keys);

        Collection<String> values = tm1.values();
        System.out.println("Values: " + values);

        Set<Map.Entry<Integer, String>> entries = tm1.entrySet();
        System.out.println("Entries: " + entries);

        System.out.println("Higher key than 1: " + tm1.higherKey(1));

        System.out.println("Lower key than 2: " + tm1.lowerKey(2));

        System.out.println("Final TreeMap: " + tm1);
    }
}

