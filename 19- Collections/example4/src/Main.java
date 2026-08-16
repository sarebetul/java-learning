import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<String,String> sozluk = new HashMap<String, String>();
        sozluk.put("Car","Araba");
        sozluk.put("House","Ev");
        sozluk.put("Phone","Telefon");
        sozluk.put("School","Okul");
        System.out.println( sozluk.get("Phone"));
        sozluk.remove("House");
        sozluk.put("Tree","Ağaç");
        for (String item:sozluk.keySet()){
            System.out.println("Elemaan-" + item + " Değer-" + sozluk.get(item));
        }
    }
}
