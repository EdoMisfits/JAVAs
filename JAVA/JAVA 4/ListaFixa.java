import java.util.Arrays;
import java.util.Scanner;


///////////////EX 3


public class ListaFixa {
    public static void main(String[] args) {
        String[] registros = new String[5];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < registros.length; i++) {
            System.out.print("Informe um nome: ");
            registros[i] = entrada.nextLine();
        }

        System.out.print("Nome para buscar: ");
        String chave = entrada.nextLine();
        boolean achou = false;
        for (String item : registros) {
            if (item != null && item.equalsIgnoreCase(chave)) {
                achou = true;
                break;
            }
        }
        System.out.println(achou ? "Localizado!" : "Não encontrado.");

        System.out.print("Nome para remover: ");
        String excluir = entrada.nextLine();
        for (int i = 0; i < registros.length; i++) {
            if (registros[i] != null && registros[i].equalsIgnoreCase(excluir)) {
                registros[i] = "REMOVIDO";
            }
        }

        Arrays.sort(registros);
        System.out.println("Lista final: " + Arrays.toString(registros));

        entrada.close();
    }
} 
