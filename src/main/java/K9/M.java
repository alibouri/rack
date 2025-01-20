package K9;

import Ab.k;
import Ab.t;
import Bb.r;
import Bb.z;
import Eb.a;
import Fb.j;
import W5.f;
import X8.e;
import Xb.J;
import Xb.V;
import com.sendwave.androidApi.Contact;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class m extends j implements Function2 {
    public Collection c0;
    public Iterator d0;
    public Collection e0;
    public int f0;
    public Object g0;
    public final p h0;

    public m(p p0, g g0) {
        this.h0 = p0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((m)this.t(((k)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new m(this.h0, g0);
        g1.g0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        p p1;
        Collection collection1;
        Iterator iterator0;
        Collection collection0;
        Object object1 = a.X;
        p p0 = this.h0;
        switch(this.f0) {
            case 0: {
                f.b0(object0);
                k k0 = (k)this.g0;
                String s = (String)k0.X;
                if(((Boolean)k0.Y).booleanValue() && s.length() != 0) {
                    Boolean boolean0 = Boolean.TRUE;
                    p0.i0.getClass();
                    p0.i0.l(null, boolean0);
                    this.f0 = 1;
                    p0.Z.getClass();
                    e e0 = new e(p0.Z, s, null);
                    object0 = J.y(V.c, e0, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    collection0 = new ArrayList(r.b0(((Iterable)object0)));
                    iterator0 = ((Iterable)object0).iterator();
                    goto label_36;
                }
                Boolean boolean1 = Boolean.FALSE;
                p0.i0.getClass();
                p0.i0.l(null, boolean1);
                return z.X;
            }
            case 1: {
                f.b0(object0);
                collection0 = new ArrayList(r.b0(((Iterable)object0)));
                iterator0 = ((Iterable)object0).iterator();
                goto label_36;
            }
            case 2: {
                collection0 = this.e0;
                iterator0 = this.d0;
                collection1 = this.c0;
                p1 = (p)this.g0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            collection0.add(((f9.j)object0));
            collection0 = collection1;
            p0 = p1;
        label_36:
            if(!iterator0.hasNext()) {
                break;
            }
            Object object2 = iterator0.next();
            this.g0 = p0;
            this.c0 = collection0;
            this.d0 = iterator0;
            this.e0 = collection0;
            this.f0 = 2;
            object0 = p0.d0.a(((Contact)object2), this);
            if(object0 == object1) {
                return object1;
            }
            p1 = p0;
            collection1 = collection0;
        }
        return (List)collection0;
    }
}

