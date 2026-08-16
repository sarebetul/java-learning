public class Main {
    public static void main(String[] args){
        int number = 32;
        boolean isPrime = true;
        if(number==1){
            System.out.println("is not a prime number");
        }
        if(number<1){
            System.out.println("invalid number");
            return;
        }
        for(int i=2; i<number; i++){
            if(number%i==0){
                isPrime = false;
            }
        }
        if(isPrime) {
            System.out.println("is a prime number");
        }else{
            System.out.println("is not a prime number");
        }
    }
}
