package com.google.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a0 implements Iterator {
    @Override
    public final boolean hasNext() {
        return false;
    }

    @Override
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

