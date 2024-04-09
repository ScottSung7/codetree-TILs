import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Number[] numbers = new Number[length];
        for(int i = 0; i < length; i++){
            int num = sc.nextInt();
            numbers[i] = new Number(num, i+1);
        }

        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++){
            Number number = numbers[i];
            number.newPosition = i+1;
        }

        List<Number> list = Arrays.asList(numbers);

        Comparator<Number> positionComparator = Comparator.comparingInt(num -> num.position);

        Collections.sort(list, positionComparator);

        for(int i =0; i < list.size(); i++){
            Number number = list.get(i);
            System.out.print(number.newPosition + " ");
        }


        //숫자 순으로 정렬
        //그 다음은 num
        //new Num 
 
    }
}
class Number implements Comparable<Number>{
    int num;
    int position;
    int newPosition;

    Number(int num, int position){
        this.num = num;
        this.position = position;
    }
    @Override
    public int compareTo(Number number){
        if(this.num == number.num){
            return this.position - number.position;
        }
        return this.num - number.num;
    }
}