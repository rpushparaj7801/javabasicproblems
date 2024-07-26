package exception;

public class tryexception {
    public static void main(String[] args) {

        try {
            int a = 10/0;
        }
        catch (Exception e){
            System.out.println("exception occured");
        }
        finally {
            System.out.println("this will execute whether it has exception or not");
        }


    }
}
