import java.util.Scanner;

public class NestedTryBock {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the nunber");
        int a=sc.nextInt();
        try {
            int b=10/a;
            System.out.println("b value is: " +b);
            try{
                if (a==1) {
                    a = a / (a - 1);
                }
                if (a==2) {
                    int[] c = {1, 2, 3};
                    c[5] = 45;
                }
            }
            catch (ArrayIndexOutOfBoundsException aob){
                System.out.println("Enter a number inside the boundary");
            }
        }
        catch (ArithmeticException ae){
            System.out.println("Enter a valid number");
        }
    }
}
