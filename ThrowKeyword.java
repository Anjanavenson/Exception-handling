public class ThrowKeyword {
    public static void main(String[] args) {
        ThrowKeyword tk1 = new ThrowKeyword();
        ThrowKeyword tk2;
        try {
            tk1.test();
        }
        catch (NullPointerException npe){
            System.out.println("Caugth second time");
        }
    }
    private void test(){
        try {
            throw new NullPointerException();
        }
        catch (NullPointerException npe){
            System.out.println("Got Npe");
            throw npe;
        }
    }
}
