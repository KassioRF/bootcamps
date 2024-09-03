import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {        
                
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Pease, enter your name:");
        String clientName = scanner.next();        
        
        System.out.println("Pease, enter the Account number:");
        Integer accountNumber = scanner.nextInt();
        
        System.out.println("Pease, enter the Branch number xxx-x:");
        String  accountBranch = scanner.next();
        
        System.out.println("Now, inform the balance:");
        Double  balance = scanner.nextDouble();

        scanner.close();

        String response = String.format(
            "Hello %s thank you for creating an account with our bank."
            + " Your branch is %s, account number %s"
            + " and your balance of %s is now available for withdrawal."            
            , clientName, accountBranch, accountNumber, balance            
        );

        System.out.println(response);

    }
}
