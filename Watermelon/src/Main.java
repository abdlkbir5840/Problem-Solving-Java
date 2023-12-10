
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        if(w<=2){
            System.out.println("NO");
            return;
        }
        if(w%2==0){
            System.out.println("Yes");
        }else System.out.println("NO");
    }
}