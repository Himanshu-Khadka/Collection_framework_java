/**
 * This program creates a set that compares the length of the String in the set. 
 */

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class custom_comprator_in_tree_set {
    public static void main(String[] args) {
        Set<String> newSet = new TreeSet<>(Comparator.comparingInt(String :: length));
        newSet.add("Apple");
        newSet.add("Banana");
        newSet.add("Orange");
        newSet.add("Grapes");
        

        System.out.println("Arranged Set: " + newSet);
    }
}
