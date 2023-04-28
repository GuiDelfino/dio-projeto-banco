import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        int numero;
        String agencia;
        String nome;
        Double saldo;
        
        numero = Integer.parseInt(sc.nextLine());
        agencia = sc.nextLine();
        nome = sc.nextLine();   
        saldo = Double.parseDouble(sc.nextLine());

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
