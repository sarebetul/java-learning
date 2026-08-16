public class Main {
  public static void main(String[] args){
    System.out.println(max(15, 8));
    System.out.println(max(3, 20));
  }
  public static int max(int num1, int num2){
    if(num1<num2){
      return num2;
    }else{
      return num1;
    }
  }
}