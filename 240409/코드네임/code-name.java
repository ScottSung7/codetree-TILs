import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Student[] students = new Student[5];
        for(int i =0; i < 5; i++){
            String[] info = bf.readLine().split(" ");
            String name = info[0];
            int score = Integer.parseInt(info[1]);
            students[i] = new Student(name, score);
        }

        Student minStudent = students[3];
        for(int i = 0; i < 5; i++){
            if(students[i].score < minStudent.score){
                minStudent = students[i];
            }
        }

        System.out.println(minStudent.name + " " + minStudent.score);


    }
}
class Student{
    String name;
    int score;
    
    Student(String name, int score){
        this.name = name;
        this.score = score;
    }
    


}