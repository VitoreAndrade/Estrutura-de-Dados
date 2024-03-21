package TabelaHash;

import Listas.ListaEstatica;

import static com.sun.beans.introspect.ClassInfo.clear;

public class TabelaHash<E> {
    private final int tamanho;
    private ListaEstatica[] tabela;

    public TabelaHash(int n) {
        this.tamanho = n;
        clear();
    }

    private int h(E x) {
        return x.hashCode() % tabela.length;
    }

    public void add(E element) {
        int posicao = h(element);
        if (tabela[posicao] == null) tabela[posicao] = new ListaEstatica<E>();
        tabela[posicao].add(element);
    }
    public void clear() {
        tabela = new ListaEstatica[tamanho];
    }
    public void remove(E element) {
        int posicao = h(element);
        if (tabela[posicao] != null) tabela[posicao].remove(element);
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < tabela.length; i++) str += tabela[i] + ((i == tabela.length - 1) ? "" : ", ");
        return str + "]";
    }

}
