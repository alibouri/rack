package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class i0 extends AbstractList implements z, RandomAccess {
    public final y X;

    public i0(y y0) {
        this.X = y0;
    }

    @Override
    public final Object get(int v) {
        return (String)this.X.get(v);
    }

    @Override  // com.google.protobuf.z
    public final z h() {
        return this;
    }

    @Override
    public final Iterator iterator() {
        Iterator iterator0 = new h0();  // initializer: Ljava/lang/Object;-><init>()V
        iterator0.X = this.X.iterator();
        return iterator0;
    }

    @Override  // com.google.protobuf.z
    public final Object j(int v) {
        return this.X.Y.get(v);
    }

    @Override  // com.google.protobuf.z
    public final List k() {
        return Collections.unmodifiableList(this.X.Y);
    }

    @Override
    public final ListIterator listIterator(int v) {
        ListIterator listIterator0 = new g0();  // initializer: Ljava/lang/Object;-><init>()V
        listIterator0.X = this.X.listIterator(v);
        return listIterator0;
    }

    @Override  // com.google.protobuf.z
    public final void n(e e0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return this.X.Y.size();
    }
}

