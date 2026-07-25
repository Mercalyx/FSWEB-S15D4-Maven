package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkintechList<E> extends ArrayList<E> {

    @Override
    public boolean add(E e) {
        if (this.contains(e)) {
            return false;
        }
        return super.add(e);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public void sort() {
        Collections.sort((List) this);
    }

    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        if (removed) {
            this.sort();
        }
        return removed;
    }
}