package Aa;

import Ab.t;
import Eb.a;
import Fb.j;
import Q4.i;
import V8.d;
import W5.f;
import Y8.R9;
import a5.w;
import a9.T7;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.r1;

public final class m0 extends j implements Function2 {
    public int c0;
    public final u0 d0;
    public final T7 e0;

    public m0(u0 u00, T7 t70, g g0) {
        this.d0 = u00;
        this.e0 = t70;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((m0)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new m0(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object2;
        Object object1 = a.X;
        u0 u00 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                Nb.j.f(u00.b0, "<this>");
                i.y(u00.b0, x0.d0, "Contact support to Unlock via WhatsApp button clicked", null);
                if(this.e0 == null || !((Boolean)u00.f0.j(this.e0.e, this.e0.f.d)).booleanValue()) {
                    u00.o(b0.Y, Boolean.FALSE);
                    this.c0 = 1;
                    object2 = u00.l0.e(this);
                    if(object2 == object1) {
                        return object1;
                    }
                    goto label_21;
                }
                else {
                    n n0 = new n(1, u00);
                    this.c0 = 3;
                    if(w.a0(u00.l0, this.e0, u00.b0, n0, s9.a.i0, "Vault", null, this) == object1) {
                        return object1;
                    }
                }
                break;
            }
            case 1: {
                f.b0(object0);
                object2 = object0;
            label_21:
                String s = r1.d(0x7F120088, new Object[]{u00.e0.j0});  // string:call_support_to_unlock "Contact Wave at %s to unlock your Vault early."
                String s1 = r1.d(0x7F1202DC, new Object[0]);  // string:ok "OK"
                this.c0 = 2;
                if(Pb.a.O(((d)object2), "", s, s1, null, false, null, null, this, 504) == object1) {
                    return object1;
                }
                break;
            }
            case 2: 
            case 3: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return t.a;
    }
}

