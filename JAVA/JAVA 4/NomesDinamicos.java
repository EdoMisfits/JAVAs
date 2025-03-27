import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/////////// EX 4


public class NomesDinamicos {
    public static void main(String[] args) {
        ArrayList<String> elementos = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um nome: ");
            elementos.add(input.nextLine());
        }

        System.out.print("Digite um nome para verificar: ");
        String chave = input.nextLine();
        System.out.println(elementos.contains(chave) ? "Achado!" : "Não consta.");

        System.out.print("Informe um nome para retirar: ");
        String excluir = input.nextLine();
        elementos.remove(excluir);

        Collections.sort(elementos);
        System.out.println("Lista final: " + elementos);

        input.close();
    }
}