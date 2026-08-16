public class Main {
    public static void main(String[] args){
        int exam = 82;
        if(exam>=90){
            System.out.println("Excellent");
        }else if(exam>=70){
            System.out.println("Good");
        }else if(exam>=50){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}