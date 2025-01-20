package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class s implements Iterator {
    public final int X;
    public int Y;
    public final q Z;

    public s(q q0, int v) {
        this.X = v;
        this.Z = q0;
        this.Y = 0;
        super();
    }

    @Override
    public final boolean hasNext() {
        return this.Y < this.Z.X.length();
    }

    @Override
    public final Object next() {
        if(this.X != 0) {
            if(this.Y >= this.Z.X.length()) {
                throw new NoSuchElementException();
            }
            int v = this.Y;
            this.Y = v + 1;
            return new q(String.valueOf(v));
        }
        q q0 = this.Z;
        if(this.Y >= q0.X.length()) {
            throw new NoSuchElementException();
        }
        int v1 = this.Y;
        this.Y = v1 + 1;
        return new q(String.valueOf(q0.X.charAt(v1)));
    }
}

