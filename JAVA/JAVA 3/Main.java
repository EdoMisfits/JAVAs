public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        paciente1.setNome("Claudio Silva");
        paciente1.setRg("123456789");
        paciente1.setEndereco("Rua Andrade, 100");
        paciente1.setTelefone("99999-9999");
        paciente1.setDataNascimento("01/08/1997");
        paciente1.setProfissao("Engenheiro");

        Paciente paciente2 = new Paciente("Eduardo ");

        Produto produto1 = new Produto();
        produto1.setMarca("Nike");
        produto1.setFabricante("Nike Inc.");
        produto1.setCodBarras("789654123");
        produto1.setPreco(299.99f);

        Produto produto2 = new Produto("Puma", "Puma AG", "123456789", 199.99f);

        paciente1.exibirDados();
        paciente2.exibirDados();

        produto1.exibirDados();
        produto2.exibirDados();
    }
}