public class AgeManager {
    public void checkAge(int age) throws AgeException{
        if(age<18){
            throw new AgeException("You must be at least 18 years old.");
        }else{
            System.out.println("Access granted.");
        }
    }
}
