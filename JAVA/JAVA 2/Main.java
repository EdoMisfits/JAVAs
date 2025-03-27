public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("José Antônio", 40, "jose@email.com");

        Curso curso1 = new Curso("Cdc", 40, 899.99);

        System.out.println("=== Dados do Cliente ===");
        cliente1.mostrarInfo();

        System.out.println("\n=== Dados do Curso ===");
        curso1.mostrarInfo();
    }
}