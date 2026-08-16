public class Main {
    public static void main(String[] args){
        int[] numbers = {3,8,15,22,5};
        int count = 0;
        for(int i=0; i< numbers.length; i++){
            if(numbers[i]%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
