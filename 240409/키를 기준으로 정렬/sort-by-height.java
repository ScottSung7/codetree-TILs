import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(bf.readLine());
        List<Student> students = new ArrayList<Student>();
        for(int i = 0; i < length; i++){
            String[] info = bf.readLine().split(" ");
            students.add(new Student(info[0], Integer.parseInt(info[1]), Integer.parseInt(info[2])));
        }

        Comparator<Student> heightComparator = Comparator.comparingInt(st -> st.height);
        Collections.sort(students, heightComparator);
    
        for(int i = 0; i < students.size(); i++){
            Student st = students.get(i);
            System.out.println(st.name + " " + st.height + " " + st.weight);
        }
    }
}
class Student{
    String name;
    int height;
    int weight;

    Student (String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }


}