package com.google.protobuf;

import java.util.ListIterator;

public final class g0 implements ListIterator {
    public ListIterator X;

    @Override
    public final void add(Object object0) {
        String s = (String)object0;
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.X.hasNext();
    }

    @Override
    public final boolean hasPrevious() {
        return this.X.hasPrevious();
    }

    @Override
    public final Object next() {
        return (String)this.X.next();
    }

    @Override
    public final int nextIndex() {
        return this.X.nextIndex();
    }

    @Override
    public final Object previous() {
        return (String)this.X.previous();
    }

    @Override
    public final int previousIndex() {
        return this.X.previousIndex();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void set(Object object0) {
        String s = (String)object0;
        throw new UnsupportedOperationException();
    }
}

