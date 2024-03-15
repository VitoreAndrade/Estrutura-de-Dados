package Abstracts;

import Interfaces.ColecaoI;

public abstract class ColecaoA <E> implements ColecaoI<E> {
    protected int count;

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return count;
    }
}
