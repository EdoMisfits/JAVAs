import java.util.Scanner;

public class NumeroNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
        } while (numero >= 0);

        System.out.println("Número negativo inserido, encerrando o programa.");
        scanner.close();
    }
}
