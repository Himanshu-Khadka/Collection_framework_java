import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class list_iterator {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        ListIterator iterator = list.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

   
}
