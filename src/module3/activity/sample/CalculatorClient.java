package module3.activity.sample;

public class CalculatorClient {
    public static void main(String[] args) {

        /*Instantiate Normal Calculator. Note that CALC_TYPE_NORMAL is a public static
         *final variable defined in Calculator class.
         */
        calculator normalCalc = new calculator(calculator.CALC_TYPE_BASIC);

        System.out.println("*** Calculations will be performed using "+normalCalc.getCalculatorType()+ " calculator ***");

        // Add
        int result = normalCalc.add(4, 5);
        System.out.println("1) Add result is " + result);


        // Multiply
        int[] mul = {2, 3, 4};
        result = normalCalc.multiply(mul);
        System.out.println("2) Multiplication result is " + result);


        //Division
        result = normalCalc.divide(10, 2);
        System.out.println("3) Divide result is " + result);


        //Subtraction
        result = normalCalc.subtract(10, 2);
        System.out.println("4) Subtract result is " + result);

    }


}
