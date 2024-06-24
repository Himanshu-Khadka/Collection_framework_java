import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/**
 * Given a list of integers with duplicates, write a method to
 * return a list with duplicates removed, maintaining the original order.
 */

 public class real_world_problem_one{
    public static void main(String[] args) {
        List<Integer> intList = List.of(14,22,22,87,52,99,101,52);

        System.out.println("Duplicates have been removed from "+intList+ " : "+removeDuplicate(intList));
    }

    public static List<Integer> removeDuplicate(List<Integer> list){
        Set<Integer> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }
 }

