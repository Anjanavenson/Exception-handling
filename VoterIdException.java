public class VoterIdException extends Exception{
    public VoterIdException(int age){
        System.out.println("Your age is "+age);
    }
    public static void verifyAge(int age){
        if (age<18){
            try{
                throw new VoterIdException(age);
            }catch (Exception e){
                System.out.println("Please check ur age.");
            }
        }
        else
            System.out.println("You are eligible for voting");
    }
}
