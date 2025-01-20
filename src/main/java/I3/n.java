package i3;

import Ab.k;
import Bb.A;
import Nb.j;
import Ob.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

public final class n implements a, Iterable {
    public final Map X;
    public static final n Y;

    static {
        n.Y = new n(A.X);
    }

    public n(Map map0) {
        this.X = map0;
    }

    // Deobfuscation rating: LOW(30)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof n && j.a(this.X, ((n)object0).X);
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override
    public final Iterator iterator() {
        ArrayList arrayList0 = new ArrayList(this.X.size());
        for(Object object0: this.X.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            if(((Map.Entry)object0).getValue() != null) {
                throw new ClassCastException();
            }
            arrayList0.add(new k(s, null));
        }
        return arrayList0.iterator();
    }

    @Override
    public final String toString() {
        return "Parameters(entries=" + this.X + ')';
    }
}

