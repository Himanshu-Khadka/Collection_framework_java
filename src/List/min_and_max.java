
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class min_and_max {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(43,12,22,15,11,7,98));
        System.out.println("The min in list is : "+min(list));
        System.out.println("The max in list is : "+max(list));
    }

    private static int min(List<Integer> list){
        int min = list.get(0);

        for(int temp:list){
            if (min > temp) {
                min = temp;
            }
        }
        return min;
    }

    private static int max(List<Integer> list){
        int max = list.get(0);

        for(int temp:list){
            if (max < temp) {
                max = temp;
            }
        }
        return max;
    }
}
