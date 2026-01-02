package assignment3;

import java.util.Vector;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> v1 = new Vector<>();

        Vector<String> v2 = new Vector<>(5);

        Vector<String> v3 = new Vector<>(5, 2);

        Vector<String> v4 = new Vector<>(Arrays.asList("Car", "Cycle", "Bike"));

        v1.add("Apple");
        v1.add("Banana");

        v1.addElement("Mango");

        v1.add(1, "Orange");

        System.out.println("Size: " + v1.size());

        System.out.println("Capacity: " + v1.capacity());

        System.out.println("Element at index 0: " + v1.get(0));

        v1.set(0, "Grapes");

        v1.remove(2);

        v1.removeElement("Banana");

        System.out.println("Contains Mango: " + v1.contains("Mango"));

        System.out.println("Index of Mango: " + v1.indexOf("Mango"));

        System.out.println("First Element: " + v1.firstElement());

        System.out.println("Last Element: " + v1.lastElement());


        System.out.print("Using Iterator: ");
        Iterator<String> it = v1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();


        Object[] arr = v1.toArray();

        System.out.println("Final Vector: " + v1);
    }
}

