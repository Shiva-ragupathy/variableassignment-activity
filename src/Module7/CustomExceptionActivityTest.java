package Module7;

public class CustomExceptionActivityTest {
    public static void main(String[] args) throws CustomExceptionActivity{
        CustomExceptionActivityTest usr = new CustomExceptionActivityTest();
        usr.validateUser("Steve");
        usr.validateUser("Dustin");

    }
    void validateUser(String name) throws CustomExceptionActivity{
        String[] validUsers = {"Steve", "Dustin", "Robin", "Eddie"};
//flag stores 1 if a match is found else it should remain 0
        int flag = 0;
        for (int i = 0; i < 4; i++) {
            //2 - Write code to check if parameter name contains a value which is found in validUsers array and change flag's value accordingly
            if (validUsers[i] == name) {
                flag = 1;
            }
        }
//3 - check if flag is zero, throw CustomExceptionActivity Exception.
//You may also have to declare this exception in the method call using throws.
        if(flag==0){
            throw new CustomExceptionActivity();
        }else {
            System.out.println("Welcome to Payroll program");
        }

        //4 - else if flag is one, print a message "Welcome to Payroll program".

    }

}


