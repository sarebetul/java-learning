import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args){
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ankara");
        cities.add("İstanbul");
        cities.add("Bursa");
        cities.add("İzmir");
        cities.remove("Bursa");
        cities.add("Antalya");
        Collections.sort(cities);
        for(String city : cities){
            System.out.println(city);
        }
    }
}
