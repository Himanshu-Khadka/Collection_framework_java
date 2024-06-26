
/**
 * Implement a function that removes all the occurance of a secefic element from list
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class list_two {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList(Arrays.asList(1,3,2,1,54,22,1,7,98,003,2,1,23,44,22));
        System.out.println(removeElement(list, 1));
    }

    public static List<Integer> removeElement(List<Integer> list , int element){
        // List<Integer> result = new LinkedList<>();

        for(int i = 0; i<list.size(); i++){
            if (list.get(i) == element) {
                list.remove(i);
            }
        }

        return list;
    }
}
