public class Main {
  public static void main(String[] args){
    int[] numbers = {10,20,30,40,50};
    int count = 0;
    for(int i=0; i< numbers.length; i++){
      count+=numbers[i];
    }
    int average =  (count/ numbers.length);
    System.out.println(average);
  }
}
