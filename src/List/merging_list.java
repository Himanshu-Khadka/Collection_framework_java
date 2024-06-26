import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * create a method to merge two list in one without using a addAll
 */
public class merging_list {
    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> listTwo = new ArrayList<>(Arrays.asList(6,7,8,9,10));

        System.out.println("Merged List: "+mergeLists(listOne, listTwo));
    }

    public static List<Integer> mergeLists(List<Integer> listOne, List<Integer> listTwo){
        List<Integer> mergerdList = new LinkedList<Integer>(listOne);

        for(int i = 0; i<listTwo.size(); i++){
            mergerdList.add(listTwo.get(i));
        }

        return mergerdList;
    }
}
