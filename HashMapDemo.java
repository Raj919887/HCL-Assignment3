package assignment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<>();

        HashMap<Integer, String> map2 = new HashMap<>(10);

        HashMap<Integer, String> map3 = new HashMap<>(10, 0.75f);

        HashMap<Integer, String> map4 = new HashMap<>(map1);

        map1.put(1, "Apple");
        map1.put(2, "Banana");
        map1.put(3, "Mango");

        System.out.println("Value for key 2: " + map1.get(2));

        System.out.println("Size: " + map1.size());

        System.out.println("Is Empty: " + map1.isEmpty());

        System.out.println("Contains key 1: " + map1.containsKey(1));

        System.out.println("Contains value Mango: " + map1.containsValue("Mango"));

        map1.remove(3);

        map1.putIfAbsent(3, "Orange");

        map1.replace(1, "Grapes");

        Set<Integer> keys = map1.keySet();
        System.out.println("Keys: " + keys);

        Collection<String> values = map1.values();
        System.out.println("Values: " + values);

        Set<Map.Entry<Integer, String>> entries = map1.entrySet();
        System.out.println("Entries: " + entries);

        System.out.print("Using forEach: ");
        map1.forEach((k, v) -> System.out.print(k + "=" + v + " "));
        System.out.println();

        HashMap<Integer, String> mapClone = (HashMap<Integer, String>) map1.clone();

        System.out.println("Cloned Map: " + mapClone);
        System.out.println("Final HashMap: " + map1);
    }
}

