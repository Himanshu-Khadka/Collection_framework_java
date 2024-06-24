import java.util.HashSet;
import java.util.Set;

public class difference_of_two_set {
    
    public static void main(String[] args) {
        Set<Integer>  set1 = Set.of(1,23,44,105);
        Set<Integer>  set2 = Set.of(1,3,440,105);

        System.out.println("The difference in two set is: " + intersection(set1, set2));

    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> intersectionSet = new HashSet<>(set1);
        for(Integer flag : set2){
            intersectionSet.remove(flag);
        }
        return intersectionSet;
    }
}
