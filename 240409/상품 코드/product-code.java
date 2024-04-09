import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = bf.readLine().split(" ");
        product pro = new product();
        product pro2 = new product(lines[0], lines[1]);

        System.out.println("product "+pro.num+" is "+pro.name);
        System.out.println("product "+pro2.num+" is "+pro2.name);
    }
}
class product {
    String name = "codetree";
    String num = "50";

    product(){}
    product(String name, String num){
        this.name = name;
        this.num = num;
    }
}