public class ThrowKeyword {
    public static void main(String[] args) {
        ThrowsKeyword tk1 = new ThrowsKeyword();
        ThrowsKeyword tk2;
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
