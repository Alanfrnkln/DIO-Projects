import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência! ");
        System.out.print("Usuário: ");
        int numero = sc.nextInt();
        System.out.print("Agencia: ");
        sc.nextLine();
        String agencia = sc.nextLine();
        System.out.print("Nome Cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta "
                + numero
                + " e seu saldo $"
                + String.format("%.2f", saldo) + " já está disponível para saque.");
        sc.close();
    }
}
