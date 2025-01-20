package q;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class f implements Iterable {
    public c X;
    public c Y;
    public final WeakHashMap Z;
    public int b0;

    public f() {
        this.Z = new WeakHashMap();
        this.b0 = 0;
    }

    public c a(Object object0) {
        c c0;
        for(c0 = this.X; c0 != null && !c0.X.equals(object0); c0 = c0.Z) {
        }
        return c0;
    }

    public Object c(Object object0, Object object1) {
        c c0 = this.a(object0);
        if(c0 != null) {
            return c0.Y;
        }
        c c1 = new c(object0, object1);
        ++this.b0;
        c c2 = this.Y;
        if(c2 == null) {
            this.X = c1;
            this.Y = c1;
            return null;
        }
        c2.Z = c1;
        c1.b0 = c2;
        this.Y = c1;
        return null;
    }

    public Object d(Object object0) {
        c c0 = this.a(object0);
        if(c0 == null) {
            return null;
        }
        --this.b0;
        WeakHashMap weakHashMap0 = this.Z;
        if(!weakHashMap0.isEmpty()) {
            for(Object object1: weakHashMap0.keySet()) {
                ((e)object1).a(c0);
            }
        }
        c c1 = c0.b0;
        if(c1 == null) {
            this.X = c0.Z;
        }
        else {
            c1.Z = c0.Z;
        }
        c c2 = c0.Z;
        if(c2 == null) {
            this.Y = c1;
        }
        else {
            c2.b0 = c1;
        }
        c0.Z = null;
        c0.b0 = null;
        return c0.Y;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof f)) {
            return false;
        }
        if(this.b0 != ((f)object0).b0) {
            return false;
        }
        Iterator iterator0 = this.iterator();
        Iterator iterator1 = ((f)object0).iterator();
        while(((b)iterator0).hasNext() && ((b)iterator1).hasNext()) {
            Map.Entry map$Entry0 = (Map.Entry)((b)iterator0).next();
            Object object1 = ((b)iterator1).next();
            if(map$Entry0 == null && object1 != null || map$Entry0 != null && !map$Entry0.equals(object1)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return !((b)iterator0).hasNext() && !((b)iterator1).hasNext();
    }

    @Override
    public final int hashCode() {
        Iterator iterator0 = this.iterator();
        int v;
        for(v = 0; ((b)iterator0).hasNext(); v += ((Map.Entry)((b)iterator0).next()).hashCode()) {
        }
        return v;
    }

    @Override
    public final Iterator iterator() {
        Iterator iterator0 = new b(this.X, this.Y, 0);
        this.Z.put(iterator0, Boolean.FALSE);
        return iterator0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("[");
        Iterator iterator0 = this.iterator();
        while(((b)iterator0).hasNext()) {
            stringBuilder0.append(((Map.Entry)((b)iterator0).next()).toString());
            if(((b)iterator0).hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

