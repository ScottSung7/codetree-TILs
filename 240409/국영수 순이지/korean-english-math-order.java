import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(bf.readLine());
        Student[] students = new Student[length];
        for(int i = 0; i < length; i++){
            String[] info = bf.readLine().split(" ");
            int kor = Integer.parseInt(info[1]);
            int eng = Integer.parseInt(info[2]);
            int math = Integer.parseInt(info[3]);
            students[i] = new Student(info[0], kor, eng, math);
        }

        Arrays.sort(students);

        for(int i =0; i < students.length; i++){
            
            Student student = students[i];
            System.out.println(
                student.name + " " +
                student.kor + " " + 
                student.eng + " " + 
                student.math
            );
        }
    }
}
class Student implements Comparable<Student>{
    String name;
    int kor;
    int eng;
    int math;

    Student(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student student){
        if(this.kor == student.kor){
            if(this.eng == student.eng){
                return student.math - this.math;
            }
            return student.eng - this.eng;
        }
        return student.kor - this.kor;
    }



}