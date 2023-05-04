public class FinallyReturnDemo {
    public static void main(String[] args) {
        int a=10, b=0;
        FinallyReturnDemo frd = new FinallyReturnDemo();
        frd.divide(a,b);

    }

    private float divide(int a, int b) {
        try {
            return a/b;
        }
        finally {
            System.out.println("Finally dominates return");
        }
    }
}
