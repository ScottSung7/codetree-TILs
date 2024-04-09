import java.io.*;
import java.util.*;
import java.time.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(bf.readLine());
        List<Weather> list = new ArrayList<Weather>();
        for(int i =0; i<length; i++){
            String[] info = bf.readLine().split(" ");
            
            if(info[2].equals("Rain")){
                list.add(new Weather(LocalDate.parse(info[0]), info[1], info[2]));
            }
        }

        Comparator<Weather> weatherComparator = Comparator.comparing(weather -> weather.time);
        Collections.sort(list, weatherComparator);

        Weather rain = list.get(0);
        System.out.println(rain.time + " " + rain.week + " " + rain.condition);

    }
}
class Weather{

    LocalDate time; 
    String week;
    String condition;

    Weather(LocalDate time, String week, String condition){
        this.time = time;
        this.week = week;
        this.condition = condition;
    }
}