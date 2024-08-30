import java.util.Scanner;
public class swap2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a =s.nextInt();
        System.out.println("Enter the value of b : ") ;      
         int b =s.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }
    
}
