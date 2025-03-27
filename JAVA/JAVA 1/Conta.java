import java.util.Scanner;

class ContaBancaria {
    private String titular;
    private double saldo;
    private int numeroConta;

    public ContaBancaria(String titular, int numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void exibirInformacoes() {
        System.out.println("\n--- Informações da Conta ---");
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo Atual: R$" + saldo);
    }
}

public class Conta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(titular, numeroConta, saldoInicial);
        conta.exibirInformacoes();

        System.out.print("\nDigite o valor a depositar: ");
        double deposito = scanner.nextDouble();
        conta.depositar(deposito);
        System.out.print("\nDigite o valor a sacar: ");
        double saque = scanner.nextDouble();
        conta.sacar(saque);




        conta.exibirSaldo();
        scanner.close();
    }
}
