public class Main {
  public static void main(String[] args){
    AgeManager manager =  new AgeManager();
    try {
      manager.checkAge(20);
    }catch (AgeException e){
      System.out.println(e.getMessage());
    }
    try {
      manager.checkAge(15);
    }catch (AgeException e){
      System.out.println(e.getMessage());
    }
  }
}
