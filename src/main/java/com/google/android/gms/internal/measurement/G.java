package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import k1.d;
import k1.f;

public final class g implements Iterator {
    public final int X;
    public int Y;
    public Iterable Z;

    public g() {
        this.X = 1;
        super();
    }

    public g(e e0) {
        this.X = 0;
        super();
        this.Z = e0;
        this.Y = 0;
    }

    @Override
    public final boolean hasNext() {
        return this.X == 0 ? this.Y < ((e)this.Z).u() : this.Y < ((f)this.Z).c0.size();
    }

    @Override
    public final Object next() {
        if(this.X != 0) {
            Object object0 = (d)((f)this.Z).c0.get(this.Y);
            ++this.Y;
            return object0;
        }
        int v = this.Y;
        e e0 = (e)this.Z;
        if(v >= e0.u()) {
            throw new NoSuchElementException("Out of bounds index: " + this.Y);
        }
        int v1 = this.Y;
        this.Y = v1 + 1;
        return e0.s(v1);
    }
}

