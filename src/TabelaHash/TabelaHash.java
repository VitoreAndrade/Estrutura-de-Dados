package TabelaHash;

import Listas.ListaEstatica;
import Model.Cliente;

import java.util.Objects;

public class TabelaHash {
    private final int tamanho;
    private ListaEstatica<Cliente>[] tabela;

    public TabelaHash(int n) {
        this.tamanho = n;
        clear();
    }

    private int h(String cpf) {
        return Math.abs(cpf.hashCode() % tabela.length) - 1;
    }

    private int h(Cliente cliente) {
        return h(cliente.getCpf());
    }

    public void add(Cliente element) {
        int posicao = h(element);
        if (tabela[posicao] == null) tabela[posicao] = new ListaEstatica<Cliente>();
        tabela[posicao].add(element);
    }

    public void clear() {
        tabela = new ListaEstatica[tamanho];
    }

    public void remove(Cliente element) {
        int posicao = h(element);
        if (tabela[posicao] != null) tabela[posicao].remove(element);
    }

    public Cliente get(String cpf) {
        int posicao = h(cpf);
        for (int i = 0; i < tabela[posicao].size(); i++) {
            if (Objects.equals(tabela[posicao].get(i).getCpf(), cpf)) return tabela[posicao].get(i);
        }
        return null;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < tabela.length; i++) str += tabela[i] + ((i == tabela.length - 1) ? "" : ", ");
        return str + "]";
    }
}
