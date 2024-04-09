import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Student[] students = new Student[length];
        for(int i =0; i <length; i++){
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i] = new Student(height, weight, i+1);
        }
        
        Arrays.sort(students);

        for(int i =0; i < students.length; i++){
            Student st = students[i];
            System.out.println(
                st.height + " " + st.weight + " " + st.num
            );
        }

    }
}
class Student implements Comparable<Student>{
    int height;
    int weight;
    int num;

    Student(int height, int weight, int num){
        this.height = height;
        this.weight = weight;
        this.num = num;
    }
    @Override
    public int compareTo(Student student){
        if(this.height == student.height){
            return student.weight - this.weight;
        }
        return this.height - student.height;

    }
}