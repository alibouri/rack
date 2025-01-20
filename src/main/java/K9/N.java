package K9;

import Ab.t;
import Bb.r;
import Eb.a;
import Fb.j;
import W5.f;
import X8.b;
import Xb.G;
import Xb.J;
import Xb.V;
import com.sendwave.androidApi.Contact;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class n extends j implements Function2 {
    public p c0;
    public Collection d0;
    public Iterator e0;
    public Collection f0;
    public int g0;
    public final p h0;

    public n(p p0, g g0) {
        this.h0 = p0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((n)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new n(this.h0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Collection collection1;
        p p1;
        Iterator iterator0;
        Collection collection0;
        Object object1 = a.X;
        p p0 = this.h0;
        switch(this.g0) {
            case 0: {
                f.b0(object0);
                this.g0 = 1;
                p0.Z.getClass();
                b b0 = new b(p0.Z, null);
                object0 = J.y(V.c, b0, this);
                if(object0 == object1) {
                    return object1;
                }
                collection0 = new ArrayList(r.b0(((Iterable)object0)));
                iterator0 = ((Iterable)object0).iterator();
                p1 = p0;
                goto label_23;
            }
            case 1: {
                f.b0(object0);
                collection0 = new ArrayList(r.b0(((Iterable)object0)));
                iterator0 = ((Iterable)object0).iterator();
                p1 = p0;
                goto label_23;
            }
            case 2: {
                collection0 = this.f0;
                iterator0 = this.e0;
                collection1 = this.d0;
                p1 = this.c0;
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
        label_23:
            if(!iterator0.hasNext()) {
                break;
            }
            Object object2 = iterator0.next();
            this.c0 = p1;
            this.d0 = collection0;
            this.e0 = iterator0;
            this.f0 = collection0;
            this.g0 = 2;
            object0 = p1.d0.a(((Contact)object2), this);
            if(object0 == object1) {
                return object1;
            }
            collection1 = collection0;
        }
        p0.k0.k(((List)collection0));
        return t.a;
    }
}

