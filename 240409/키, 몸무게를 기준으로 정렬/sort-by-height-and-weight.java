import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Person[] people = new Person[length];
        for(int i= 0; i < length; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            people[i] = new Person(name, height, weight);
        }

        Arrays.sort(people);

        for(int i = 0; i < people.length; i++){
            Person p = people[i];
            System.out.println(
                p.name + " " + p.height + " " + p.weight
            );
        }

    }
}
class Person implements Comparable<Person>{
    String name;
    int height;
    int weight;

    Person(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person){
        if(this.height == person.height){
            return person.weight - this.weight;
        }
        return this.height - person.height;


    }


}