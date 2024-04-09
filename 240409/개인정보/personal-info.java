import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 5;
        List<Student> list = new ArrayList<Student>();
        for(int i =0; i < length; i++){
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            list.add(new Student(name, height, weight));
        }

        Comparator<Student> nameComparator = Comparator.comparing(st -> st.name);
        Comparator<Student> heightComparator = Comparator.comparingInt(st -> st.height);

        Collections.sort(list, nameComparator);
        System.out.println("name");
        for(int i = 0; i < list.size(); i++){
            Student st = list.get(i);
            System.out.println(
                st.name + " " + st.height + " " + st.weight
            );
        }
        System.out.println();
        
        Collections.sort(list, heightComparator.reversed());
        System.out.println("height");
        for(int i = 0; i < list.size(); i++){
            Student st = list.get(i);
            System.out.println(
                st.name + " " + st.height + " " + st.weight
            );
        }
  
    }
}

class Student{
    String name;
    int height; 
    double weight;

    Student(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}