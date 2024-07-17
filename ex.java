public class ex {
    public static void main(String[] args) {
        int [] numbers;
        numbers=new int[5];
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        numbers[4]=50;
        System.out.println("first number = " +numbers[0]);
        System.out.println("second number = "+numbers[1]);
        System.out.println("third number = "+ numbers[2]);
        System.out.println("fourth number = "+ numbers[3]);
        System.out.println("fifth number = "+numbers[4]);
        int size=numbers.length;
        System.out.println("length of array is " +size);
    }
    
}
