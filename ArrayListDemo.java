package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        ArrayList<String> list2 = new ArrayList<>(5);

        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Car", "Cycle", "Bike"));

        list1.add("Apple");
        list1.add("Banana");

        list1.add(1, "Mango");

        list1.addAll(list3);

        System.out.println("Element at index 0: " + list1.get(0));

        list1.set(0, "Orange");

        list1.remove(1);

        list1.remove("Bike");

        System.out.println("Size: " + list1.size());

        System.out.println("Is empty: " + list1.isEmpty());

        System.out.println("Contains Apple: " + list1.contains("Apple"));

        System.out.println("Index of Cycle: " + list1.indexOf("Cycle"));

        list1.add("Apple");
        System.out.println("Last index of Apple: " + list1.lastIndexOf("Apple"));

        System.out.print("Using Iterator: ");
        Iterator<String> it = list1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        list1.ensureCapacity(20);

        list1.trimToSize();

        list2.clear();

        Object[] arr = list1.toArray();

        System.out.println("Final ArrayList: " + list1);
    }
}
