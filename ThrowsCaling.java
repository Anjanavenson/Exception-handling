public class ThrowsCaling {
    public static void main(String[] args) {
        try {
            ThrowsKeyword.divide(10,0);
        }
        catch (ArithmeticException ae){
            System.out.println("The given number returns an infinity value");
        }
    }
}
