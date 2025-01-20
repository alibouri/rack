package J1;

import Bb.d;
import Bb.p;
import Kb.h;
import Ob.a;
import Ub.g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

public final class v implements a, Iterator {
    public final int X;
    public Iterator Y;
    public final Object Z;

    public v(d d0) {
        this.X = 0;
        super();
        this.Z = new ArrayList();
        this.Y = d0;
    }

    public v(h h0) {
        this.X = 1;
        super();
        this.Z = h0;
        this.Y = ((g)h0.b).iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.Y.hasNext();
    }

    @Override
    public final Object next() {
        if(this.X != 0) {
            Object object0 = this.Y.next();
            return ((Function1)((h)this.Z).c).n(object0);
        }
        Object object1 = this.Y.next();
        Iterator iterator0 = (Iterator)P.X.n(object1);
        ArrayList arrayList0 = (ArrayList)this.Z;
        if(iterator0 != null && iterator0.hasNext()) {
            arrayList0.add(this.Y);
            this.Y = iterator0;
            return object1;
        }
        while(!this.Y.hasNext() && !arrayList0.isEmpty()) {
            this.Y = (Iterator)p.w0(arrayList0);
            Bb.v.j0(arrayList0);
        }
        return object1;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

