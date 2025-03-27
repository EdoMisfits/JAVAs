import java.util.Scanner;

class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        return (double) a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Resultados:");
        System.out.println("Soma: " + calc.somar(num1, num2));
        System.out.println("Subtração: " + calc.subtrair(num1, num2));
        System.out.println("Multiplicação: " + calc.multiplicar(num1, num2));

        try {
            System.out.println("Divisão: " + calc.dividir(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
