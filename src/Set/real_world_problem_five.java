
/**
 * Create a Person class with name and age attributes. Write methods to perform
 * set operations like union, intersection, and difference on sets of Person objects.
 */

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//Person Class
class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    //Oveerriding equals method for Person class

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    //hashCode() method in Java is used to generate a hash code for an objec
    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }

    //intersection of person
    public static Set<Person> union(Set<Person> persons1, Set<Person> persons2){
        Set<Person> union = new  HashSet<>(persons1);
        union.addAll(persons2);
        return union;
    }

    public static Set<Person> intercetion(Set<Person> persons1, Set<Person> persons2){
        Set<Person> intercetion = new HashSet<>(persons1);
        intercetion.retainAll(persons2);
        return intercetion;
    }

    public static Set<Person> difference(Set<Person> persons1, Set<Person> persons2){
        Set<Person> difference = new HashSet<>(persons1);
        difference.removeAll(persons2);
        return difference;
    }


}

public class real_world_problem_five {
    public static void main(String[] args) {
        Set<Person> persons1 = new HashSet<>();
        persons1.add(new Person("John", 25));
        persons1.add(new Person("Alice", 30));
        persons1.add(new Person("Bob", 35));
        
        Set<Person> persons2 = new HashSet<>();
        persons2.add(new Person("Alice", 30));
        persons2.add(new Person("Bob", 35));
        persons2.add(new Person("Charlie", 40));

        System.out.println("Union: " + Person.union(persons1, persons2));
        System.out.println("Intersection: " + Person.intercetion(persons1, persons2));
        System.out.println("Difference: " + Person.difference(persons1, persons2));


    }
}