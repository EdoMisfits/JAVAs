import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



 ///////////////EX 2
 
 

public class NumerosDinamicos {
    public static void main(String[] args) {
        ArrayList<Integer> dados = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um valor: ");
            dados.add(leitor.nextInt());
        }

        System.out.print("Valor para pesquisar: ");
        int chave = leitor.nextInt();
        System.out.println(dados.contains(chave) ? "Encontrado!" : "Não encontrado.");

        System.out.print("Valor para excluir: ");
        int remover = leitor.nextInt();
        dados.remove(Integer.valueOf(remover));

        Collections.sort(dados);
        System.out.println("Ordem final: " + dados);

        leitor.close();
    }
}