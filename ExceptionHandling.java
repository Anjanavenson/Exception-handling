import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 2 numbers:");
        float c = 0;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
             c = a / b;

        }catch (ArithmeticException ex){
            throw new ArithmeticException(ex.getMessage());
        }


    }
}
