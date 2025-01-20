package s2;

import Ab.t;
import Fb.j;
import Ma.o;
import W5.f;
import android.database.Cursor;
import ha.m;
import k2.t1;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import q2.C;
import q2.v;
import v.b;

public final class a extends j implements Function1 {
    public final int c0;
    public final Object d0;
    public final Object e0;

    public a(Object object0, Object object1, g g0, int v) {
        this.c0 = v;
        this.d0 = object0;
        this.e0 = object1;
        super(1, g0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.c0 != 0) {
            new a(((b)this.d0), this.e0, ((g)object0), 1).v(t.a);
            return t.a;
        }
        return new a(((o)this.d0), ((t1)this.e0), ((g)object0), 0).v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = this.e0;
        Object object2 = this.d0;
        if(this.c0 != 0) {
            f.b0(object0);
            b.b(((b)object2));
            Object object3 = b.a(((b)object2), object1);
            ((b)object2).c.Y.setValue(object3);
            ((b)object2).e.setValue(object3);
            return t.a;
        }
        int v = 0;
        f.b0(object0);
        Nb.j.f(((o)object2).b, "sourceQuery");
        v v1 = ((o)object2).c;
        Nb.j.f(v1, "db");
        C c0 = M6.b.o(((o)object2).b.f0, "SELECT COUNT(*) FROM ( " + ((o)object2).b.b() + " )");
        c0.a(((o)object2).b);
        Cursor cursor0 = v1.n(c0, null);
        try {
            if(cursor0.moveToFirst()) {
                v = cursor0.getInt(0);
            }
        }
        finally {
            cursor0.close();
            c0.f();
        }
        ((o)object2).d.set(v);
        m m0 = new m(1, ((o)object2), o.class, "convertRows", "convertRows(Landroid/database/Cursor;)Ljava/util/List;", 0, 23);
        return t2.a.a(((t1)object1), ((o)object2).b, v1, v, m0);
    }
}

