package Bb;

import Ub.e;
import Ub.g;
import java.util.Iterator;

public final class w implements g {
    public final int a;
    public final Object b;

    public w(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // Ub.g
    public final Iterator iterator() {
        switch(this.a) {
            case 0: {
                return ((Iterable)this.b).iterator();
            }
            case 1: {
                return new e(this);
            }
            default: {
                return (Iterator)this.b;
            }
        }
    }
}

