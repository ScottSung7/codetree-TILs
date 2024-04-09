import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(bf.readLine());
        List<Person> people = new ArrayList<Person>();
        
        for(int i = 0; i< length; i++){
            String[] info = bf.readLine().split(" ");
            people.add(new Person(info[0], info[1], info[2]));
        }
        Comparator<Person> nameComparator = Comparator.comparing(person -> person.name);
        Collections.sort(people, nameComparator.reversed());

        Person p1 = people.get(0);
        System.out.println("name " + p1.name);
        System.out.println("addr " + p1.address);
        System.out.println("city " + p1.place);
        
    }
}
class Person{
    String name;
    String address;
    String place;
    Person(String name, String address, String place){
        this.name = name;
        this.address = address;
        this.place = place;
    }
}