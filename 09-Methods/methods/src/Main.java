public class Main {
    public static void main(String[] args){
        numberPuzzle();
    }

    public static void numberPuzzle(){
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
            sendMessage(willBeSearched);
        }else{
            System.out.println("Number not found");
        }
    }

    public static void sendMessage(int willBeSearched){
        System.out.println("number found: " + willBeSearched);
    }
}