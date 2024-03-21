import Model.Cliente;
import TabelaHash.TabelaHash;

public class Main {
    public static void main(String[] args) {
        TabelaHash<Cliente> tabelaClientes = new TabelaHash<Cliente>(18);
        Cliente cliente1 =  new Cliente("João","99999999999","joaoao@gmail.com","(99)99999999");
        tabelaClientes.add(cliente1);

        tabelaClientes.toString();


    }
}