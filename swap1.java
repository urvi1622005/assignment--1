import java.util.Scanner;
public class swap1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = s.nextInt();
        System.out.println("Enter the value of b :");
        int b = s.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a :"+a);
        System.out.println("Value of b :"+b);
        



    

    }
    
}
