import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(bf.readLine());
        Student[] students = new Student[length];
        for(int i = 0; i < length; i++){
            int[] info = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            students[i] = new Student(info[0], info[1], i+1);
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
            if(this.weight == student.weight){
                return this.num - student.num;
            }
            return student.weight-this.weight;
        }
        return student.height-this.height;
    }
    
}