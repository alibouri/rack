package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class d implements Iterator {
    public final Iterator X;
    public final Iterator Y;

    public d(Iterator iterator0, Iterator iterator1) {
        this.X = iterator0;
        this.Y = iterator1;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean hasNext() {
        return this.X.hasNext() ? true : this.Y.hasNext();
    }

    @Override
    public final Object next() {
        Iterator iterator0 = this.X;
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            return new q(((Integer)object0).toString());
        }
        Iterator iterator1 = this.Y;
        if(!iterator1.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object1 = iterator1.next();
        return new q(((String)object1));
    }
}

