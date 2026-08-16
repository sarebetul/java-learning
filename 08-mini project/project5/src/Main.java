public class Main {
    public static void main(String[] args){
        int[] numbers = new int[] {1,2,5,7,9,0};
        int willBeSearched = 5;
        boolean found = false;
        for(int number : numbers){
            if(number == willBeSearched){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Number found");
        }else{
            System.out.println("Number not found");
        }
    }
}