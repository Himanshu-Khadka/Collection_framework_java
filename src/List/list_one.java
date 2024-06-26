
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a method to reverse an integer to reversea list of integer wthout using builtin function
 */


public class list_one {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(reverseList(list));
    }

    public static List<Integer> reverseList(List<Integer> list){
        List<Integer> result = new ArrayList<>();
        int currentIndex = 0;
        for(int i = list.size() - 1; i>=0; i--){
            result.add(currentIndex, list.get(i));
            currentIndex++;
        }
        return result;
    }
} 
