import java.util.Set;

public class sub_set_check {
    public static void main(String[] args) {
        Set<String> name = Set.of("Hari", "shyam","emily", "tony","tom", "kyle" );
        Set<String> male = Set.of("Hari", "tom", "shyam", "tony");

        System.out.println("Is male subset of name: "+ isSubSet(name, male));
        
    }

    public static boolean isSubSet(Set set1, Set set2){
        return set1.containsAll(set2);
    }
}
