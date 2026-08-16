import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList numbers = new ArrayList();

        numbers.add(1);          // Listeye eleman ekler.
        numbers.add(10);         // Yeni eleman ekler.
        numbers.add("Ankara");   // Farklı veri tipi de eklenebilir (Object olarak tutulur).

        System.out.println(numbers.size());   // Listedeki eleman sayısını döndürür.

        numbers.set(2,100);      // Belirtilen indisteki elemanı değiştirir.

        numbers.remove(0);       // Belirtilen indisteki elemanı siler.

        numbers.clear();         // Listedeki tüm elemanları siler.

        System.out.println(numbers.get(0));   // 0. indisteki elemanı getirir.
        // (clear() sonrası hata verir.)

        for(Object i : numbers){ // Listedeki tüm elemanları dolaşır.
            System.out.println(i);
        }

    }
}