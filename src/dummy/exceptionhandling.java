package dummy;

public class exceptionhandling {
    public static void main(String[] args) {

        try {

            int divideByZero = 5 / 0;
            System.out.println(divideByZero);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " );
        }
        finally {
            System.out.println("This is the finally block");
        }


    }
}
