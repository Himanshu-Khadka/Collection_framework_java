/**
 * Write a method to find the frequency of each character in a string using a set and a map.
 */
import java.util.Map;
import java.util.HashMap;

public class real_world_problem_four {
    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("HelloWorld"));
    }

    static Map<Character, Integer> frequencyOfCharacters(String str){
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char ch : str.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }
        return freqMap;
    }
}
