package Ea;

import Ab.t;
import J2.w;
import R2.f;
import U.p;
import android.support.v4.media.session.a;
import com.wave.customer.scratchCardRewards.d;
import hb.h;
import kotlin.jvm.functions.Function2;

public final class n implements Function2 {
    public final int X;
    public final String Y;
    public final int Z;

    public n(String s, int v, int v1) {
        this.X = v1;
        this.Y = s;
        this.Z = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        switch(this.X) {
            case 0: {
                d.b(this.Y, ((p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
            case 1: {
                a.b(this.Y, ((p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
            case 2: {
                f.f(this.Y, ((p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
            case 3: {
                f.e(this.Y, ((p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
            case 4: {
                w.d(this.Y, ((p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
            case 5: {
                jb.n.a(this.Y, ((p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
            default: {
                h.s(this.Y, ((p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
        }
    }
}

