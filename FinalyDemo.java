public class FinalyDemo {
    public static void main(String[] args) {
        int a=2, b=0;
        float c=a/b;
        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException ae){
            System.out.println("Check the numbers");
        }
        catch (Exception e){
            System.out.println("Unidentified Error");
        }finally {
            System.out.println("Finally close the program");
        }
    }
}
