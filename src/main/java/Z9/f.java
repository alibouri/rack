package Z9;

import Ab.t;
import N.m2;
import O0.O;
import U.p;
import Vb.j;
import Z0.i;
import a9.C4;
import androidx.compose.foundation.layout.c;
import db.a;
import db.b;
import g0.l;
import hb.h;
import kotlin.jvm.functions.Function2;

public final class f implements Function2 {
    public final int X;
    public final C4 Y;

    public f(C4 c40, int v) {
        this.X = v;
        this.Y = c40;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if(this.X != 0) {
            if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                ((p)object0).K();
                return t.a;
            }
            boolean z = j.R(this.Y.c, "•", false);
            String s = this.Y.c;
            if(z) {
                ((p)object0).Q(0xD0D66EE6);
                R2.f.f(s, ((p)object0), 0);
                ((p)object0).p(false);
                return t.a;
            }
            ((p)object0).Q(-791160460);
            O o0 = ((a)((p)object0).k(b.d)).h;
            m2.b(s, c.d(l.X, 1.0f), 0L, 0L, null, null, null, 0L, null, new i(3), 0L, 0, false, 0, 0, null, o0, ((p)object0), 0x30, 0, 0xFDFC);
            ((p)object0).p(false);
            return t.a;
        }
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        h.g(this.Y.e, this.Y.f, ((p)object0), 0);
        return t.a;
    }
}

