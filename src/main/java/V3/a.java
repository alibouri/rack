package v3;

import Ab.t;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.H;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import w.h0;
import w.j0;

public final class a extends j implements Function2 {
    public int c0;
    public final boolean d0;
    public final boolean e0;
    public final h f0;
    public final r3.a g0;
    public final int h0;
    public final boolean i0;
    public final float j0;
    public final l k0;
    public final boolean l0;
    public final MutableState m0;

    public a(boolean z, boolean z1, h h0, r3.a a0, int v, boolean z2, float f, l l0, boolean z3, MutableState mutableState0, g g0) {
        this.d0 = z;
        this.e0 = z1;
        this.f0 = h0;
        this.g0 = a0;
        this.h0 = v;
        this.i0 = z2;
        this.j0 = f;
        this.k0 = l0;
        this.l0 = z3;
        this.m0 = mutableState0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((a)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new a(this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        boolean z1;
        Object object1 = Eb.a.X;
        Object object2 = t.a;
        h0 h00 = h0.X;
        h h0 = this.f0;
        MutableState mutableState0 = this.m0;
        boolean z = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                if(!z || ((Boolean)mutableState0.getValue()).booleanValue() || !this.e0) {
                    z1 = z;
                }
                else {
                    this.c0 = 1;
                    r3.a a0 = (r3.a)h0.g0.getValue();
                    if(h0.c0.getValue() != null) {
                        throw new ClassCastException();
                    }
                    int v = Float.compare(((Number)h0.d0.getValue()).floatValue(), 0.0f);
                    float f = 1.0f;
                    if(v >= 0 || a0 != null) {
                        if(a0 == null) {
                            f = 0.0f;
                        }
                        else if(v >= 0) {
                            f = 0.0f;
                        }
                    }
                    z1 = z;
                    v3.g g0 = new v3.g(h0, ((r3.a)h0.g0.getValue()), f, 1, ((boolean)((f == ((Number)h0.i0.getValue()).floatValue() ? 1 : 0) ^ 1)), null);
                    h0.l0.getClass();
                    Object object3 = H.c(new j0(h00, h0.l0, g0, null), this);
                    if(object3 != object1) {
                        object3 = object2;
                    }
                    if(object3 != object1) {
                        object3 = object2;
                    }
                    if(object3 == object1) {
                        return object1;
                    }
                }
                break;
            }
            case 1: {
                f.b0(object0);
                z1 = z;
                break;
            }
            case 2: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        mutableState0.setValue(Boolean.valueOf(z1));
        if(!z1) {
            return object2;
        }
        float f1 = ((Number)h0.i0.getValue()).floatValue();
        this.c0 = 2;
        int v1 = h0.e();
        h0.getClass();
        d d0 = new d(h0, v1, this.h0, this.i0, this.j0, this.g0, f1, this.l0, false, this.k0, null);
        h0.l0.getClass();
        Object object4 = H.c(new j0(h00, h0.l0, d0, null), this);
        if(object4 != object1) {
            object4 = object2;
        }
        return object4 == object1 ? object1 : object2;
    }
}

