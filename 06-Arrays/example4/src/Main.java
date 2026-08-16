public class Main {
  public static void main(String[] args){
    int[] numbers = {3,8,15,22,5};
    int largest = numbers[0];
    for(int i=1; i< numbers.length; i++){
      if(largest<numbers[i]){
        largest=numbers[i];
      }
      }
    System.out.println(largest);
    }
}
