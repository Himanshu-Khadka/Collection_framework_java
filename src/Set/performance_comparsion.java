import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class performance_comparsion {

    public static void main(String[] args) {

        long startTime , endTime;

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linearHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        startTime = System.nanoTime();
        for(int i = 1; i<=10000; i++){
            hashSet.add(i);
        }
        endTime = System.nanoTime();

        System.out.println("Finished Processing time for hashSet : " + (endTime - startTime)/1000000+"ms");

        startTime = System.nanoTime();
        for(int i = 1; i<=10000; i++){
            linearHashSet.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Finished Processing time for LinearHashSet: "+(endTime - startTime)/1000000+"ms");

        startTime = System.nanoTime();
        for(int i = 1; i<=10000; i++){
            treeSet.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Finished Processing time for TreeSet: "+(endTime - startTime)/1000000+"ms");
    }
}
