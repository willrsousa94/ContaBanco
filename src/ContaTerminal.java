import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual o seu nome completo? ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int numConta = scanner.nextInt();

        System.out.println("Quanto gostaria de depositar? ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + numConta + " e seu saldo R$" + saldo + " cjá está disponível para saque");
    }
}
