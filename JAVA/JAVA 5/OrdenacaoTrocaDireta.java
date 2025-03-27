public class OrdenacaoTrocaDireta {
    public static void ordenarDecrescente(int[] numeros) {
        int tamanho = numeros.length;
        boolean houveTroca;
        for (int i = 0; i < tamanho - 1; i++) {
            houveTroca = false;
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]) { 
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                    houveTroca = true;
                }
            }
            if (!houveTroca) break;
        }
    }

    public static void main(String[] args) {
        int[] valores = {8, 3, 7, 2, 9, 1};
        ordenarDecrescente(valores);
        for (int num : valores) {
            System.out.print(num + " ");
        }
    }
}