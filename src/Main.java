import Model.Cliente;
import TabelaHash.TabelaHash;

public class Main {
    public static void main(String[] args) {
        TabelaHash tabelaClientes = new TabelaHash(18);
        Cliente cliente1 = new Cliente("João", "08080532170", "joaoao@gmail.com", "(99)99999999");
        tabelaClientes.add(cliente1);
        Cliente cliente2 = new Cliente("João", "1", "joaoao@gmail.com", "(99)99999999");
        tabelaClientes.add(cliente2);

        System.out.println(tabelaClientes);
    }
}