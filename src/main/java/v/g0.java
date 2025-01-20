package v;

import Nb.j;

public final class g0 implements f0 {
    public final Object a;
    public final Object b;

    public g0(Object object0, Object object1) {
        this.a = object0;
        this.b = object1;
    }

    // Deobfuscation rating: LOW(20)
    @Override  // v.f0
    public final boolean a(Enum enum0, Enum enum1) {
        return enum0.equals(this.b()) && enum1.equals(this.c());
    }

    @Override  // v.f0
    public final Object b() {
        return this.a;
    }

    @Override  // v.f0
    public final Object c() {
        return this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof f0) {
            Object object1 = ((f0)object0).b();
            if(j.a(this.a, object1)) {
                Object object2 = ((f0)object0).c();
                return j.a(this.b, object2);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Object object0 = this.b;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v1 * 0x1F + v;
    }
}

