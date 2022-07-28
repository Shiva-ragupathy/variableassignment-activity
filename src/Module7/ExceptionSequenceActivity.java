package Module7;

public class ExceptionSequenceActivity {
    public static void main(String[] args) {
        // we need to create object our divide method is not static
        new ExceptionSequenceActivity().divide(25, 3);
    }

    void divide(int num1, int num2) {
        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException a) {
            System.out.println("Division by zero is not allowed");
        }catch (Exception e) {
            System.out.println("Exception!!!");
        }

    }
}

