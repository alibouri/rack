package com.google.protobuf;

import sun.misc.Unsafe;

public final class k0 extends m0 {
    public final int b;

    public k0(Unsafe unsafe0, int v) {
        this.b = v;
        super(unsafe0);
    }

    @Override  // com.google.protobuf.m0
    public final boolean c(long v, Object object0) {
        if(this.b != 0) {
            return n0.g ? n0.h(v, object0) != 0 : n0.i(v, object0) != 0;
        }
        return n0.g ? n0.h(v, object0) != 0 : n0.i(v, object0) != 0;
    }

    @Override  // com.google.protobuf.m0
    public final byte d(long v, Object object0) {
        if(this.b != 0) {
            return n0.g ? n0.h(v, object0) : n0.i(v, object0);
        }
        return n0.g ? n0.h(v, object0) : n0.i(v, object0);
    }

    @Override  // com.google.protobuf.m0
    public final double e(long v, Object object0) {
        return Double.longBitsToDouble(this.h(v, object0));
    }

    @Override  // com.google.protobuf.m0
    public final float f(long v, Object object0) {
        return Float.intBitsToFloat(this.g(v, object0));
    }

    @Override  // com.google.protobuf.m0
    public final void k(Object object0, long v, boolean z) {
        if(this.b != 0) {
            if(n0.g) {
                n0.l(object0, v, ((byte)z));
                return;
            }
            n0.m(object0, v, ((byte)z));
            return;
        }
        if(n0.g) {
            n0.l(object0, v, ((byte)z));
            return;
        }
        n0.m(object0, v, ((byte)z));
    }

    @Override  // com.google.protobuf.m0
    public final void l(Object object0, long v, byte b) {
        if(this.b != 0) {
            if(n0.g) {
                n0.l(object0, v, b);
                return;
            }
            n0.m(object0, v, b);
            return;
        }
        if(n0.g) {
            n0.l(object0, v, b);
            return;
        }
        n0.m(object0, v, b);
    }

    @Override  // com.google.protobuf.m0
    public final void m(Object object0, long v, double f) {
        if(this.b != 0) {
            this.p(v, Double.doubleToLongBits(f), object0);
            return;
        }
        this.p(v, Double.doubleToLongBits(f), object0);
    }

    @Override  // com.google.protobuf.m0
    public final void n(Object object0, long v, float f) {
        if(this.b != 0) {
            this.o(Float.floatToIntBits(f), v, object0);
            return;
        }
        this.o(Float.floatToIntBits(f), v, object0);
    }

    @Override  // com.google.protobuf.m0
    public final boolean s() {
        return false;
    }
}

