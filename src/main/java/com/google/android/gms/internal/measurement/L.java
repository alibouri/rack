package com.google.android.gms.internal.measurement;

import java.util.Iterator;

public final class l implements Iterator {
    public final Iterator X;

    public l(Iterator iterator0) {
        this.X = iterator0;
    }

    @Override
    public final boolean hasNext() {
        return this.X.hasNext();
    }

    @Override
    public final Object next() {
        Object object0 = this.X.next();
        return new q(((String)object0));
    }
}

