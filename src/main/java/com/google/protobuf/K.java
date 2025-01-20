package com.google.protobuf;

import T7.i;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;

public final class k {
    public final Z a;
    public boolean b;
    public static final int c;

    static {
        new k(0);
    }

    public k() {
        this.a = new Z(16);
    }

    public k(int v) {
        Z z0 = new Z(0);
        super();
        this.a = z0;
        this.a();
        this.a();
    }

    public final void a() {
        Z z0;
        if(this.b) {
            return;
        }
        for(int v = 0; true; ++v) {
            z0 = this.a;
            if(v >= z0.Y.size()) {
                break;
            }
            Map.Entry map$Entry0 = z0.c(v);
            if(map$Entry0.getValue() instanceof p) {
                p p0 = (p)map$Entry0.getValue();
                p0.getClass();
                U.c.getClass();
                Class class0 = p0.getClass();
                U.c.a(class0).a(p0);
                p0.q();
            }
        }
        if(!z0.b0) {
            if(z0.Y.size() > 0) {
                z0.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator iterator0 = z0.d().iterator();
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                ((Map.Entry)object0).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if(!z0.b0) {
            z0.Z = z0.Z.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(z0.Z);
            z0.d0 = z0.d0.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(z0.d0);
            z0.b0 = true;
        }
        this.b = true;
    }

    public static void b(f f0, v0 v00, int v, Object object0) {
        if(v00 == v0.c0) {
            f0.J(v, 3);
            ((a)object0).i(f0);
            f0.J(v, 4);
            return;
        }
        f0.J(v, v00.Y);
        switch(v00.ordinal()) {
            case 0: {
                f0.G(Double.doubleToRawLongBits(((double)(((Double)object0)))));
                return;
            }
            case 1: {
                f0.E(Float.floatToRawIntBits(((float)(((Float)object0)))));
                return;
            }
            case 2: {
                f0.M(((long)(((Long)object0))));
                return;
            }
            case 3: {
                f0.M(((long)(((Long)object0))));
                return;
            }
            case 4: {
                f0.H(((int)(((Integer)object0))));
                return;
            }
            case 5: {
                f0.G(((long)(((Long)object0))));
                return;
            }
            case 6: {
                f0.E(((int)(((Integer)object0))));
                return;
            }
            case 7: {
                f0.A(((byte)((Boolean)object0).booleanValue()));
                return;
            }
            case 8: {
                if(object0 instanceof e) {
                    f0.C(((e)object0));
                    return;
                }
                f0.I(((String)object0));
                return;
            }
            case 9: {
                ((a)object0).i(f0);
                return;
            }
            case 10: {
                f0.K(((p)(((a)object0))).h(null));
                ((a)object0).i(f0);
                return;
            }
            case 11: {
                if(object0 instanceof e) {
                    f0.C(((e)object0));
                    return;
                }
                f0.K(((byte[])object0).length);
                f0.B(((byte[])object0), 0, ((byte[])object0).length);
                return;
            }
            case 12: {
                f0.K(((int)(((Integer)object0))));
                return;
            }
            case 13: {
                if(object0 instanceof i) {
                    f0.H(((i)object0).X);
                    return;
                }
                f0.H(((int)(((Integer)object0))));
                return;
            }
            case 14: {
                f0.E(((int)(((Integer)object0))));
                return;
            }
            case 15: {
                f0.G(((long)(((Long)object0))));
                return;
            }
            case 16: {
                int v1 = (int)(((Integer)object0));
                f0.K(v1 >> 0x1F ^ v1 << 1);
                return;
            }
            case 17: {
                long v2 = (long)(((Long)object0));
                f0.M(v2 >> 0x3F ^ v2 << 1);
            }
        }
    }

    @Override
    public final Object clone() {
        Object object0 = new k();
        Z z0 = this.a;
        if(z0.Y.size() <= 0) {
            Iterator iterator0 = z0.d().iterator();
            if(!iterator0.hasNext()) {
                return object0;
            }
            Object object1 = iterator0.next();
            if(((Map.Entry)object1).getKey() != null) {
                throw new ClassCastException();
            }
            ((Map.Entry)object1).getValue();
            throw null;
        }
        Map.Entry map$Entry0 = z0.c(0);
        if(map$Entry0.getKey() != null) {
            throw new ClassCastException();
        }
        map$Entry0.getValue();
        throw null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof k ? this.a.equals(((k)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

