import java.util.Scanner;

public class ArrayNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números armazenados:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}