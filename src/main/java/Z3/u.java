package Z3;

import Ab.e;
import Eb.a;
import Fb.c;
import I5.h;
import Nb.j;
import W5.f;
import Zb.m;
import a4.g;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.-JsonWriters;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.BufferedSourceJsonReader;
import java.util.Map;
import java.util.concurrent.CancellationException;
import pc.C;
import v7.d;

public abstract class u {
    public final b a;
    public final h b;

    public u(b b0, h h0) {
        j.f(h0, "listener");
        super();
        this.a = b0;
        this.b = h0;
    }

    public abstract void a(Map arg1);

    public final Object b(c c0) {
        u u1;
        u u0;
        s s0;
        if(c0 instanceof s) {
            s0 = (s)c0;
            int v = s0.f0;
            if((v & 0x80000000) == 0) {
                s0 = new s(this, c0);
            }
            else {
                s0.f0 = v ^ 0x80000000;
            }
        }
        else {
            s0 = new s(this, c0);
        }
        Object object0 = s0.d0;
        Object object1 = a.X;
        switch(s0.f0) {
            case 0: {
                f.b0(object0);
                u0 = this;
                goto label_32;
            }
            case 1: {
                u0 = s0.c0;
                u1 = s0.b0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            String s1 = (String)object0;
            u0.getClass();
            j.f(s1, "<this>");
            Object object2 = null;
            try {
                Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
                j0.m0(s1);
                BufferedSourceJsonReader bufferedSourceJsonReader0 = new BufferedSourceJsonReader(j0);
                Object object3 = Adapters.AnyAdapter.fromJson(bufferedSourceJsonReader0, CustomScalarAdapters.Empty);
                if(object3 instanceof Map) {
                    object2 = (Map)object3;
                }
            }
            catch(Exception unused_ex) {
            }
            if(object2 != null) {
                return object2;
            }
            u0 = u1;
        label_32:
            s0.b0 = u0;
            s0.c0 = u0;
            s0.f0 = 1;
            object0 = u0.a.a.t(s0);
            if(object0 == object1) {
                return object1;
            }
            u1 = u0;
        }
    }

    public static Object c(u u0, c c0) {
        u u1;
        t t0;
        if(c0 instanceof t) {
            t0 = (t)c0;
            int v = t0.f0;
            if((v & 0x80000000) == 0) {
                t0 = new t(u0, c0);
            }
            else {
                t0.f0 = v ^ 0x80000000;
            }
        }
        else {
            t0 = new t(u0, c0);
        }
        Object object0 = t0.d0;
        Object object1 = a.X;
    alab1:
        switch(t0.f0) {
            case 0: {
                f.b0(object0);
                break;
            }
            case 1: {
                try {
                    u0 = t0.c0;
                    u1 = t0.b0;
                    f.b0(object0);
                    while(true) {
                    label_18:
                        u0.a(((Map)object0));
                        u0 = u1;
                        break alab1;
                    }
                }
                catch(CancellationException cancellationException0) {
                    throw cancellationException0;
                }
                catch(Exception exception0) {
                    u1.b.getClass();
                    ((q)u1.b.Y).g.s(new g(exception0));
                    return Ab.t.a;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            t0.b0 = u0;
            t0.c0 = u0;
            t0.f0 = 1;
            object0 = u0.b(t0);
            goto label_29;
        }
        catch(CancellationException cancellationException0) {
            throw cancellationException0;
        }
        catch(Exception exception1) {
        }
        u1 = u0;
        exception0 = exception1;
        u1.b.getClass();
        ((q)u1.b.Y).g.s(new g(exception0));
        return Ab.t.a;
    label_29:
        if(object0 == object1) {
            return object1;
        }
        try {
            u1 = u0;
            goto label_18;
        }
        catch(CancellationException cancellationException0) {
            throw cancellationException0;
        }
        catch(Exception exception0) {
        }
        u1.b.getClass();
        ((q)u1.b.Y).g.s(new g(exception0));
        return Ab.t.a;
    }

    public final void d(Map map0, r r0) {
        j.f(map0, "messageMap");
        j.f(r0, "frameType");
        m m0 = this.a.a;
        C c0 = this.a.b;
        switch(r0.ordinal()) {
            case 0: {
                Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
                -JsonWriters.writeAny(new BufferedSinkJsonWriter(j0, null), map0);
                String s = j0.B();
                ((Dc.g)c0).getClass();
                if(!((Dc.g)c0).i(1, d.l(s))) {
                    m0.d(null);
                    return;
                }
                break;
            }
            case 1: {
                Ec.j j1 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
                -JsonWriters.writeAny(new BufferedSinkJsonWriter(j1, null), map0);
                Ec.m m1 = j1.N(j1.Y);
                j.f(m1, "data");
                ((Dc.g)c0).getClass();
                if(!((Dc.g)c0).i(2, m1)) {
                    m0.d(null);
                    return;
                }
                break;
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }
}

