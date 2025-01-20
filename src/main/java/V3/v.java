package v3;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import a5.w;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final class v extends j implements Function2 {
    public Throwable c0;
    public int d0;
    public int e0;
    public final Function3 f0;
    public final Context g0;
    public final q h0;
    public final String i0;
    public final String j0;
    public final String k0;
    public final String l0;
    public final MutableState m0;

    public v(Function3 function30, Context context0, q q0, String s, String s1, String s2, String s3, MutableState mutableState0, g g0) {
        this.f0 = function30;
        this.g0 = context0;
        this.h0 = q0;
        this.i0 = s;
        this.j0 = s1;
        this.k0 = s2;
        this.l0 = s3;
        this.m0 = mutableState0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((v)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new v(this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Throwable throwable0;
        int v;
        Object object1 = a.X;
    alab1:
        switch(this.e0) {
            case 0: {
                f.b0(object0);
                v = 0;
                throwable0 = null;
                break;
            }
            case 1: {
                v = this.d0;
                throwable0 = this.c0;
                f.b0(object0);
                goto label_33;
            }
            case 2: {
                try {
                    v = this.d0;
                    throwable0 = this.c0;
                    f.b0(object0);
                    while(true) {
                    label_14:
                        n n0 = (n)this.m0.getValue();
                        synchronized(n0) {
                            Nb.j.f(((r3.a)object0), "composition");
                            if(!((Boolean)n0.b0.getValue()).booleanValue()) {
                                n0.Y.setValue(((r3.a)object0));
                                n0.X.b0(((r3.a)object0));
                            }
                        }
                        break alab1;
                    }
                }
                catch(Throwable throwable1) {
                    throwable0 = throwable1;
                    ++v;
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    label_24:
        if(!((Boolean)((n)this.m0.getValue()).c0.getValue()).booleanValue()) {
            if(v != 0) {
                Nb.j.c(throwable0);
                this.c0 = throwable0;
                this.d0 = v;
                this.e0 = 1;
                object0 = this.f0.h(new Integer(v), throwable0, this);
                if(object0 == object1) {
                    return object1;
                }
            label_33:
                if(((Boolean)object0).booleanValue()) {
                    goto label_34;
                }
                goto label_59;
            }
            try {
            label_34:
                Context context0 = this.g0;
                q q0 = this.h0;
                String s = this.i0;
                if(s == null || Vb.j.c0(s)) {
                    s = null;
                }
                else if(!Vb.j.V(s, '/')) {
                    s = s + "/";
                }
                String s1 = this.j0;
                if(s1 == null || Vb.j.c0(s1)) {
                    s1 = null;
                }
                else if(!Vb.j.V(s1, '/')) {
                    s1 = s1 + "/";
                }
                String s2 = Vb.j.c0(this.k0) || Vb.q.O(this.k0, ".", false) ? this.k0 : "." + this.k0;
                this.c0 = throwable0;
                this.d0 = v;
                this.e0 = 2;
                object0 = w.k(context0, q0, s, s1, s2, this.l0, this);
                if(object0 != object1) {
                    goto label_14;
                }
                return object1;
            }
            catch(Throwable throwable1) {
                throwable0 = throwable1;
                ++v;
                goto label_24;
            }
        }
    label_59:
        if(!((Boolean)((n)this.m0.getValue()).b0.getValue()).booleanValue() && throwable0 != null) {
            ((n)this.m0.getValue()).a(throwable0);
        }
        return t.a;
    }
}

