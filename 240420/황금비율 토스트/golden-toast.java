import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int blength = sc.nextInt();
        int length = sc.nextInt();
        LinkedList<Character> l = new LinkedList<Character>();
        String word = sc.next();
        for(int i = 0; i < blength; i++){
            l.add(word.charAt(i));   
        }   
        ListIterator<Character> it = l.listIterator(l.size());
        
        for(int i = 0; i< length; i++){
            String command = sc.next();
            if(command.equals("L")){
                if(it.hasPrevious()){
                    it.previous();
                }
            }else if(command.equals("R")){
                if(it.hasNext()){
                    it.next();
                }
            }else if(command.equals("D")){
                if(it.hasNext()){
                    it.next();
                    it.remove();
                }
            }else if(command.equals("P")){
                String s = sc.next();
                char c = s.charAt(0);
                it.add(c);
            }
        }

      it = l.listIterator();
        while(it.hasNext())
            System.out.print(it.next());
    
    
    }
}