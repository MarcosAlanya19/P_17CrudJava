import java.util.Scanner;

public class aFunction {
    public static boolean toTryAgain() {
        System.out.println("\nDesea volver a intentarlo?");
        System.out.println("S / N");
        Scanner value = new Scanner(System.in);
        String response = value.next();
        return (response.equalsIgnoreCase("S"));
    }
}