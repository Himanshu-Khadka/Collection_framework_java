/**
 * Given two arrays of integers, write a function to find common elements using sets.
 */


import java.util.HashSet;
import java.util.Set;


public class real_world_problem_three {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        Set<Integer> result = commonElments(arr1, arr2);
        System.out.println("Common Elements are : "+result);
    }

    public static Set<Integer> commonElments(int[] arr1, int[] arr2){
        Set<Integer> result = new HashSet<>();
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    result.add(arr1[i]);
                }
            }
        }

        return result;
    }
}
