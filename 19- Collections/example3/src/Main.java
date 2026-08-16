import java.util.HashMap;
public class Main {
    public static void main(String[] args){
        HashMap<Integer,String> lists = new HashMap<Integer, String>();
        lists.put(1,"Ali");
        lists.put(2,"Ayşe");
        lists.put(3,"Mehmet");
        lists.put(4,"Zeynep");
        lists.remove(2);
        lists.put(5,"Ahmet");
        for (int hashMap: lists.keySet()){
            System.out.println("No: " + hashMap + " Ad: " + lists.get(hashMap));
        }
    }
}
