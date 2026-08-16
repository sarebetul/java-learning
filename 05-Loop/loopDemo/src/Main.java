public class Main{
    public static void main(String[] args){
        //for
        System.out.println("Numbers from 1 to 10: ");
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("Odd numbers from 1 to 10: ");
        for(int i=1; i<10; i+=2){
            System.out.println(i);
        }
        System.out.println("Even numbers from 1 to 10: ");
        for(int i=2; i<10; i+=2){
            System.out.println(i);
        }
        System.out.println("for loop finished");

        //while
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        System.out.println("while loop finished");

        //do-while
        int j=1;
        do{
            System.out.println(j);
            j+=2;
        }while(j<10);
            System.out.println("do-while loop finished"); 
    }
}