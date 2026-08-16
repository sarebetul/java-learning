public class Main {
    public static void main(String[] args){
        int[] numbers = {3,8,15,22,5};
        int oddNumberSum = 0;
        for(int i=0; i< numbers.length; i++){
            if(numbers[i]%2!=0){
                oddNumberSum+=numbers[i];
            }
        }
        System.out.println(oddNumberSum);
    }
}
