package ha;

import Ab.t;
import Eb.a;
import Fb.j;
import Ja.g;
import W5.f;
import Y8.G6;
import Y8.R9;
import Y8.S6;
import Y8.s;
import com.apollographql.apollo.api.Optional.Present;
import com.sendwave.backend.type.PartnerOrg;
import kotlin.jvm.functions.Function2;

public final class w0 extends j implements Function2 {
    public int c0;
    public final S2 d0;
    public final String e0;
    public final PartnerOrg f0;
    public final g g0;

    public w0(S2 s20, String s, PartnerOrg partnerOrg0, g g0, kotlin.coroutines.g g1) {
        this.d0 = s20;
        this.e0 = s;
        this.f0 = partnerOrg0;
        this.g0 = g0;
        super(2, g1);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((w0)this.t(((R9)object0), ((kotlin.coroutines.g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        return new w0(this.d0, this.e0, this.f0, this.g0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                Present optional$Present0 = S6.a(this.f0);
                Present optional$Present1 = S6.a(Boolean.TRUE);
                s s0 = new s(this.e0, optional$Present0, optional$Present1);
                this.c0 = 1;
                if(this.d0.Y.f(s0, G6.X, this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.g0.b(null);
        this.g0.a(null);
        return t.a;
    }
}

