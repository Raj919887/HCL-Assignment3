package assignment3;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class HashTableDemo {

    public static void main(String[] args) {

        Hashtable<Integer, String> ht1 = new Hashtable<>();

        Hashtable<Integer, String> ht2 = new Hashtable<>(10);

        Hashtable<Integer, String> ht3 = new Hashtable<>(10, 0.75f);

        Hashtable<Integer, String> ht4 = new Hashtable<>(ht1);

        ht1.put(1, "Apple");
        ht1.put(2, "Banana");
        ht1.put(3, "Mango");

        System.out.println("Value for key 2: " + ht1.get(2));

        System.out.println("Size: " + ht1.size());

        System.out.println("Is Empty: " + ht1.isEmpty());

        System.out.println("Contains key 1: " + ht1.containsKey(1));

        System.out.println("Contains value Mango: " + ht1.containsValue("Mango"));

        ht1.remove(3);

        ht1.putIfAbsent(3, "Orange");

        ht1.replace(1, "Grapes");

        Set<Integer> keys = ht1.keySet(); // Using set
        System.out.println("Keys: " + keys);

        Collection<String> values = ht1.values(); // Using collection
        System.out.println("Values: " + values);

        Set<Map.Entry<Integer, String>> entries = ht1.entrySet(); // Using set
        System.out.println("Entries: " + entries);

        ht1.forEach((k, v) -> System.out.println(k + " = " + v)); // lambda expession

        Hashtable<Integer, String> htClone =
                (Hashtable<Integer, String>) ht1.clone();

        System.out.println("Cloned Hashtable: " + htClone);
        System.out.println("Final Hashtable: " + ht1);
    }
}

