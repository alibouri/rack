package R9;

import Ab.t;
import B9.b;
import Eb.a;
import Fb.j;
import N2.l;
import W5.f;
import ac.i;
import ac.o0;
import com.sendwave.backend.FragmentHandle;
import java.util.LinkedHashMap;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;
import q9.r1;

public final class d3 extends j implements Function3 {
    public final int c0;
    public int d0;
    public i e0;
    public Object f0;
    public final e3 g0;

    public d3(g g0, e3 e30, int v) {
        this.c0 = v;
        this.g0 = e30;
        super(3, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        if(this.c0 != 0) {
            d3 d30 = new d3(((g)object2), this.g0, 1);
            d30.e0 = (i)object0;
            d30.f0 = object1;
            return d30.v(t.a);
        }
        d3 d31 = new d3(((g)object2), this.g0, 0);
        d31.e0 = (i)object0;
        d31.f0 = object1;
        return d31.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        l l0;
        Object object1 = t.a;
        FragmentHandle fragmentHandle0 = null;
        boolean z = false;
        e3 e30 = this.g0;
        if(this.c0 != 0) {
            a a0 = a.X;
            switch(this.d0) {
                case 0: {
                    f.b0(object0);
                    i i0 = this.e0;
                    if(((Boolean)this.f0).booleanValue()) {
                        LinkedHashMap linkedHashMap0 = e30.c0.a();
                        e30.c0.a.d("duplicate login attempt", linkedHashMap0);
                        l0 = new l(4, r1.d(0x7F12003C, new Object[0]));  // string:already_logged_in "You are already connected with this number. Please enter 
                                                                         // your other mobile number to add it."
                    }
                    else {
                        l0 = new l(4, null);
                    }
                    this.d0 = 1;
                    return o0.p(l0, i0, this) == a0 ? a0 : object1;
                }
                case 1: {
                    f.b0(object0);
                    return object1;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
        }
        a a1 = a.X;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                i i1 = this.e0;
                String s = (String)this.f0;
                if(e30.k0) {
                    b b0 = e30.f0.a(s);
                    if(b0 != null) {
                        fragmentHandle0 = b0.b();
                    }
                    if(fragmentHandle0 != null) {
                        z = true;
                    }
                }
                this.d0 = 1;
                o0.r(i1);
                Object object2 = i1.c(Boolean.valueOf(z), this);
                if(object2 != a1) {
                    object2 = object1;
                }
                if(object2 != a1) {
                    object2 = object1;
                }
                return object2 == a1 ? a1 : object1;
            }
            case 1: {
                f.b0(object0);
                return object1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

