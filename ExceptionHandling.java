import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 2 numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        float c=a/b;
        System.out.println(c);
    }
}
