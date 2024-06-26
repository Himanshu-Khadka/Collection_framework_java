/**
 * Write a java program to find maximum in the list
 */

 import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class list_three {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(23,22,98,54,22,66,75,7,34));
        System.out.println("The max in the list is : "+findMaximum(list));
    }

    public static int findMaximum(List<Integer> list){
        int max = list.get(0);

        for(int i = 0; i<list.size(); i++){
            if (list.get(i)>max) {
                max = list.get(i);
            }
        }

        return max;
    }
}
