import java.util.Scanner;
public class hcf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int hcf = 1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
    }
    
}
