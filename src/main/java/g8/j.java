package g8;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

public final class j extends AbstractSet {
    public final int X;
    public final l Y;

    public j(l l0, int v) {
        this.X = v;
        this.Y = l0;
        super();
    }

    @Override
    public final void clear() {
        if(this.X != 0) {
            this.Y.clear();
            return;
        }
        this.Y.clear();
    }

    @Override
    public final boolean contains(Object object0) {
        if(this.X != 0) {
            return this.Y.containsKey(object0);
        }
        if(object0 instanceof Map.Entry) {
            l l0 = this.Y;
            l0.getClass();
            Object object1 = ((Map.Entry)object0).getKey();
            k k0 = null;
            k k1 = null;
            if(object1 != null) {
                try {
                    k1 = l0.a(false, object1);
                }
                catch(ClassCastException unused_ex) {
                }
            }
            if(k1 != null) {
                Object object2 = k1.e0;
                Object object3 = ((Map.Entry)object0).getValue();
                if(object2 == object3 || object2 != null && object2.equals(object3)) {
                    k0 = k1;
                }
            }
            return k0 != null;
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        return this.X == 0 ? new i(this.Y, 0) : new i(this.Y, 1);
    }

    @Override
    public final boolean remove(Object object0) {
        boolean z = false;
        if(this.X != 0) {
            l l0 = this.Y;
            l0.getClass();
            k k0 = null;
            if(object0 != null) {
                try {
                    k0 = l0.a(false, object0);
                }
                catch(ClassCastException unused_ex) {
                }
            }
            if(k0 != null) {
                l0.c(k0, true);
            }
            return k0 != null;
        }
        if(object0 instanceof Map.Entry) {
            l l1 = this.Y;
            l1.getClass();
            Object object1 = ((Map.Entry)object0).getKey();
            k k1 = null;
            k k2 = null;
            if(object1 != null) {
                try {
                    k2 = l1.a(false, object1);
                }
                catch(ClassCastException unused_ex) {
                }
            }
            if(k2 != null) {
                Object object2 = k2.e0;
                Object object3 = ((Map.Entry)object0).getValue();
                if(object2 == object3 || object2 != null && object2.equals(object3)) {
                    k1 = k2;
                }
            }
            if(k1 != null) {
                z = true;
                l1.c(k1, true);
            }
        }
        return z;
    }

    @Override
    public final int size() {
        return this.Y.Z;
    }
}

