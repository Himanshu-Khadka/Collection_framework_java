/**
 * Write a function to check if a given string has all unique characters.
 */

import java.util.Set;
import java.util.HashSet;

 public class real_world_problem_two {
 
    public static void main(String[] args) {
        String strOne = "hello";
        String strTwo = "world";

        System.out.println("The word "+strOne+" has duplicates : " + hasUniqueCharacters(strOne));
        System.out.println("The word "+strTwo+" has duplicates : " + hasUniqueCharacters(strTwo));
    }

    public static boolean hasUniqueCharacters(String str){
        Set<Character> charSet = new HashSet<>();
        for(char c: str.toCharArray()){
            if(!charSet.add(c)){
                return false;
            }
        }
        return true;
    }
 }