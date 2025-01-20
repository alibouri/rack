package M0;

import Ab.c;
import G0.G;
import Ob.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class j implements a, Iterable {
    public final LinkedHashMap X;
    public boolean Y;
    public boolean Z;

    public j() {
        this.X = new LinkedHashMap();
    }

    public final Object a(t t0) {
        Object object0 = this.X.get(t0);
        if(object0 == null) {
            throw new IllegalStateException("Key not present: " + t0 + " - consider getOrElse or getOrNull");
        }
        return object0;
    }

    public final void c(t t0, Object object0) {
        LinkedHashMap linkedHashMap0 = this.X;
        if(object0 instanceof M0.a && linkedHashMap0.containsKey(t0)) {
            Object object1 = linkedHashMap0.get(t0);
            Nb.j.d(object1, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            String s = ((M0.a)object0).a;
            if(s == null) {
                s = ((M0.a)object1).a;
            }
            c c0 = ((M0.a)object0).b;
            if(c0 == null) {
                c0 = ((M0.a)object1).b;
            }
            linkedHashMap0.put(t0, new M0.a(s, c0));
            return;
        }
        linkedHashMap0.put(t0, object0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof j)) {
            return false;
        }
        if(!Nb.j.a(this.X, ((j)object0).X)) {
            return false;
        }
        return this.Y == ((j)object0).Y ? this.Z == ((j)object0).Z : false;
    }

    @Override
    public final int hashCode() {
        int v = this.X.hashCode();
        int v1 = 0x4D5;
        int v2 = this.Y ? 0x4CF : 0x4D5;
        if(this.Z) {
            v1 = 0x4CF;
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final Iterator iterator() {
        return this.X.entrySet().iterator();
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.Y) {
            stringBuilder0.append("mergeDescendants=true");
            s = ", ";
        }
        else {
            s = "";
        }
        if(this.Z) {
            stringBuilder0.append(s);
            stringBuilder0.append("isClearingSemantics=true");
            s = ", ";
        }
        for(Object object0: this.X.entrySet()) {
            t t0 = (t)((Map.Entry)object0).getKey();
            Object object1 = ((Map.Entry)object0).getValue();
            stringBuilder0.append(s);
            stringBuilder0.append(t0.a);
            stringBuilder0.append(" : ");
            stringBuilder0.append(object1);
            s = ", ";
        }
        return G.p(this) + "{ " + stringBuilder0 + " }";
    }
}

