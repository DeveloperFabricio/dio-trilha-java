import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu numero da conta:");
        int numberCount = scanner.nextInt();

        System.out.println("Por favor, digite sua agencia:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome:");
        String clientName = scanner.next();

        System.out.println("Por favor, digite seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + clientName + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia +  " conta " + numberCount + " e o seu saldo de " + saldo + " já está disponível para saque. ");
    }

}
