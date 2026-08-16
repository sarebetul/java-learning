public class Main {
    public static void main(String[] args){
        double[] myList = {1.2,1.3,4.3,5.6};
        double sum = 0.0;
        double max = myList[0];
        for(double number:myList){
            sum+=number;
            System.out.println(number);
            if(number>max){
                max=number;
            }
        }
        System.out.println(sum);
        System.out.println(max);
    }
}