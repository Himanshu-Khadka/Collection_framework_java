/**
 * Program to make a union of two sets without using any inbuilt functions
 */

import java.util.Set;
import java.util.HashSet;

 public class union_of_two_set{
    public static void main(String[] args) {
         Set<Integer> set1 = Set.of(1,23,12,11);
         Set<Integer> set2 = Set.of(112,223,122,111);
        
         System.out.println(union(set1, set2));
    }


    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
        java.util.Set<Integer> unionSet = new HashSet<>(set1);
        for(Integer elem : set2){
            unionSet.add(elem);
        }
        return unionSet;
    }
 }