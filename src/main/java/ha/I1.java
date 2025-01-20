package ha;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R9;
import android.net.Uri;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class i1 extends j implements Function2 {
    public int c0;
    public final S2 d0;
    public final String e0;

    public i1(S2 s20, String s, g g0) {
        this.d0 = s20;
        this.e0 = s;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((i1)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new i1(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                object0 = this.d0.r0.e(this);
                if(object0 == object1) {
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
        Uri uri0 = Uri.parse(this.e0);
        Nb.j.e(uri0, "parse(...)");
        ((w)object0).o(uri0);
        return t.a;
    }
}

