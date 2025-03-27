import java.util.*;

///////////////EX 1

public class NumerosParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 6; 
        
        List<Integer> numeros = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número inteiro: ");
            int num = scanner.nextInt();
            numeros.add(num);
        }
        
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }
        
        Collections.sort(pares);
        Collections.sort(impares);
        
        System.out.println("Números pares ordenados: " + pares);
        System.out.println("Números ímpares ordenados: " + impares);
        
        scanner.close();
    }
}
