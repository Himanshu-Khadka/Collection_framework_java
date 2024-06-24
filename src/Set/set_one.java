/**
 * Testing out set in java
 * 
 * Set is a Collection that does not allow the duplication of objects, it is immutable and it does not guaranty the order of the set
 * Except for the LinkedHashSet and TreeSet. 
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class set_one{
    public static void main(String[] args) {
        java.util.Set<String> set = new HashSet<String>();

        set.add("Nepal");
        set.add("Canada");
        set.add("USA");


        System.out.println("The set Contains : "+set);

        System.out.println("Removing USA from set ...");

        set.remove("USA");

        System.out.println("The set after removing USA : "+set);
        System.out.println("Lets clear the Set ...");
        set.clear();
        System.out.println("The new Set is : "+set);


        //Creating set using set of
        Set<String> newSetOfCars = Set.of("Mercedes", "Audi", "RR", "Toyota");

        //Displaying new Set of Cars
        System.out.println("Set of Cars : "+newSetOfCars);
        System.out.println("Do We have RR: "+ newSetOfCars.contains("RR"));
        System.out.println("Do we have RR and Mercedes: "+newSetOfCars.containsAll(Set.of("RR", "Mercedes")));


        String[] arrayOfCars = newSetOfCars.toArray(new String[newSetOfCars.size()]);
        System.out.println("Array of Cars : "+Arrays.toString(arrayOfCars));
    }
}