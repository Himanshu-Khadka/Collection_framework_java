/**
 * Implement a method to remove duplicate int from a list
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
public class metod_to_remove_duplicate_int {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(32,12,53,32,553,12,77,32,11,7,84,12,79,100));
        System.out.println("List with no duplicates is : "+removeDuplicate(list)); 
    }

    //method to remove duplicate
    public static List<Integer> removeDuplicate(List<Integer> list){
        return (new ArrayList<>(new LinkedHashSet<>(list)));
    }
}
