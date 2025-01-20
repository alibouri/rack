package g8;

import E2.a;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

public final class l extends AbstractMap implements Serializable {
    public final Comparator X;
    public k Y;
    public int Z;
    public int b0;
    public final k c0;
    public j d0;
    public j e0;
    public static final a f0;

    static {
        l.f0 = new a(3);
    }

    public l() {
        this.Z = 0;
        this.b0 = 0;
        this.c0 = new k();
        this.X = l.f0;
    }

    public final k a(boolean z, Object object0) {
        k k3;
        int v;
        k k0 = this.Y;
        a a0 = l.f0;
        Comparator comparator0 = this.X;
        if(k0 == null) {
            v = 0;
        }
        else {
            Comparable comparable0 = comparator0 == a0 ? ((Comparable)object0) : null;
            while(true) {
                v = comparable0 == null ? comparator0.compare(object0, k0.d0) : comparable0.compareTo(k0.d0);
                if(v == 0) {
                    return k0;
                }
                k k1 = v >= 0 ? k0.Z : k0.Y;
                if(k1 == null) {
                    break;
                }
                k0 = k1;
            }
        }
        if(!z) {
            return null;
        }
        k k2 = this.c0;
        if(k0 == null) {
            if(comparator0 == a0 && !(object0 instanceof Comparable)) {
                throw new ClassCastException(object0.getClass().getName() + " is not Comparable");
            }
            k3 = new k(null, object0, k2, k2.c0);
            this.Y = k3;
        }
        else {
            k3 = new k(k0, object0, k2, k2.c0);
            if(v < 0) {
                k0.Y = k3;
            }
            else {
                k0.Z = k3;
            }
            this.b(k0, true);
        }
        ++this.Z;
        ++this.b0;
        return k3;
    }

    public final void b(k k0, boolean z) {
    alab1:
        while(k0 != null) {
            k k1 = k0.Y;
            k k2 = k0.Z;
            int v = 0;
            int v1 = k1 == null ? 0 : k1.f0;
            int v2 = k2 == null ? 0 : k2.f0;
            int v3 = v1 - v2;
            if(v3 == -2) {
                k k3 = k2.Y;
                int v4 = k2.Z == null ? 0 : k2.Z.f0;
                if(k3 != null) {
                    v = k3.f0;
                }
                if(v - v4 != -1 && (v - v4 != 0 || z)) {
                    this.f(k2);
                }
                this.e(k0);
                if(z) {
                    return;
                }
            }
            else {
                switch(v3) {
                    case 0: {
                        k0.f0 = v1 + 1;
                        if(z) {
                            return;
                        }
                        break;
                    }
                    case 2: {
                        k k4 = k1.Y;
                        int v5 = k1.Z == null ? 0 : k1.Z.f0;
                        if(k4 != null) {
                            v = k4.f0;
                        }
                        if(v - v5 != 1 && (v - v5 != 0 || z)) {
                            this.e(k1);
                        }
                        this.f(k0);
                        if(z) {
                            return;
                        }
                        break;
                    }
                    default: {
                        k0.f0 = Math.max(v1, v2) + 1;
                        if(!z) {
                            break alab1;
                        }
                    }
                }
            }
            k0 = k0.X;
        }
    }

    public final void c(k k0, boolean z) {
        int v1;
        k k8;
        k k5;
        if(z) {
            k0.c0.b0 = k0.b0;
            k0.b0.c0 = k0.c0;
        }
        k k1 = k0.Y;
        k k2 = k0.Z;
        k k3 = k0.X;
        int v = 0;
        if(k1 != null && k2 != null) {
            if(k1.f0 > k2.f0) {
                for(k k4 = k1.Z; true; k4 = k1.Z) {
                    k5 = k1;
                    k1 = k4;
                    if(k1 == null) {
                        break;
                    }
                }
            }
            else {
                for(k k6 = k2.Y; true; k6 = k2.Y) {
                    k k7 = k2;
                    k2 = k6;
                    k8 = k7;
                    if(k2 == null) {
                        break;
                    }
                }
                k5 = k8;
            }
            this.c(k5, false);
            k k9 = k0.Y;
            if(k9 == null) {
                v1 = 0;
            }
            else {
                v1 = k9.f0;
                k5.Y = k9;
                k9.X = k5;
                k0.Y = null;
            }
            k k10 = k0.Z;
            if(k10 != null) {
                v = k10.f0;
                k5.Z = k10;
                k10.X = k5;
                k0.Z = null;
            }
            k5.f0 = Math.max(v1, v) + 1;
            this.d(k0, k5);
            return;
        }
        if(k1 != null) {
            this.d(k0, k1);
            k0.Y = null;
        }
        else if(k2 == null) {
            this.d(k0, null);
        }
        else {
            this.d(k0, k2);
            k0.Z = null;
        }
        this.b(k3, false);
        --this.Z;
        ++this.b0;
    }

    @Override
    public final void clear() {
        this.Y = null;
        this.Z = 0;
        ++this.b0;
        this.c0.c0 = this.c0;
        this.c0.b0 = this.c0;
    }

    @Override
    public final boolean containsKey(Object object0) {
        k k0 = null;
        if(object0 != null) {
            try {
                k0 = this.a(false, object0);
            }
            catch(ClassCastException unused_ex) {
            }
        }
        return k0 != null;
    }

    public final void d(k k0, k k1) {
        k k2 = k0.X;
        k0.X = null;
        if(k1 != null) {
            k1.X = k2;
        }
        if(k2 != null) {
            if(k2.Y == k0) {
                k2.Y = k1;
                return;
            }
            k2.Z = k1;
            return;
        }
        this.Y = k1;
    }

    public final void e(k k0) {
        k k1 = k0.Y;
        k k2 = k0.Z;
        k k3 = k2.Y;
        k k4 = k2.Z;
        k0.Z = k3;
        if(k3 != null) {
            k3.X = k0;
        }
        this.d(k0, k2);
        k2.Y = k0;
        k0.X = k2;
        int v = 0;
        int v1 = Math.max((k1 == null ? 0 : k1.f0), (k3 == null ? 0 : k3.f0));
        k0.f0 = v1 + 1;
        if(k4 != null) {
            v = k4.f0;
        }
        k2.f0 = Math.max(v1 + 1, v) + 1;
    }

    @Override
    public final Set entrySet() {
        j j0 = this.d0;
        if(j0 == null) {
            j0 = new j(this, 0);
            this.d0 = j0;
        }
        return j0;
    }

    public final void f(k k0) {
        k k1 = k0.Y;
        k k2 = k0.Z;
        k k3 = k1.Y;
        k k4 = k1.Z;
        k0.Y = k4;
        if(k4 != null) {
            k4.X = k0;
        }
        this.d(k0, k1);
        k1.Z = k0;
        k0.X = k1;
        int v = 0;
        int v1 = Math.max((k2 == null ? 0 : k2.f0), (k4 == null ? 0 : k4.f0));
        k0.f0 = v1 + 1;
        if(k3 != null) {
            v = k3.f0;
        }
        k1.f0 = Math.max(v1 + 1, v) + 1;
    }

    @Override
    public final Object get(Object object0) {
        k k0 = null;
        if(object0 != null) {
            try {
                k0 = this.a(false, object0);
            }
            catch(ClassCastException unused_ex) {
            }
        }
        return k0 == null ? null : k0.e0;
    }

    @Override
    public final Set keySet() {
        j j0 = this.e0;
        if(j0 == null) {
            j0 = new j(this, 1);
            this.e0 = j0;
        }
        return j0;
    }

    @Override
    public final Object put(Object object0, Object object1) {
        if(object0 == null) {
            throw new NullPointerException("key == null");
        }
        k k0 = this.a(true, object0);
        Object object2 = k0.e0;
        k0.e0 = object1;
        return object2;
    }

    @Override
    public final Object remove(Object object0) {
        k k0 = null;
        if(object0 != null) {
            try {
                k0 = this.a(false, object0);
            }
            catch(ClassCastException unused_ex) {
            }
        }
        if(k0 != null) {
            this.c(k0, true);
        }
        return k0 == null ? null : k0.e0;
    }

    @Override
    public final int size() {
        return this.Z;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }
}

