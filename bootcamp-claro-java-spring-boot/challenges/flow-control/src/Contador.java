import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);

        System.out.println("Type the first param:");
        Integer param1 = terminal.nextInt();
        System.out.println("Type the second param");
        Integer param2 = terminal.nextInt();

        try {
            count( param1, param2 );
        } catch (ParametrosInvalidosException e) {
            System.out.println("The second parameter must be greater than the first.");
        }
        
        terminal.close();

    }

    static void count( Integer param1, Integer param2 ) throws ParametrosInvalidosException {
        if ( param1 > param2 ) {
            throw new ParametrosInvalidosException();
        }

        int count = param2 - param1;
        for ( int i = 0; i < count; i++ ) {
            System.out.println(String.format("Running iteration: %s ", i));
        }
    }
}

class ParametrosInvalidosException extends Exception { }

