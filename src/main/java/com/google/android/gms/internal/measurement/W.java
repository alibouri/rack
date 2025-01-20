package com.google.android.gms.internal.measurement;

import E7.C;
import R2.c;
import R2.h;
import a8.Q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public final class w {
    public final C a;
    public h b;
    public final Q c;
    public final c d;

    public w() {
        C c0 = new C(4);
        super();
        this.a = c0;
        this.b = ((h)c0.Y).e();
        Q q0 = new Q(3, false);
        q0.Y = new com.google.android.gms.internal.measurement.c("", 0L, null);
        q0.Z = new com.google.android.gms.internal.measurement.c("", 0L, null);
        q0.b0 = new ArrayList();
        this.c = q0;
        this.d = new c(10);
        a a0 = new a(0);
        a0.b = this;
        q2 q20 = (q2)c0.b0;
        ((HashMap)q20.X).put("internal.registerCallback", a0);
        a a1 = new a(1);
        a1.b = this;
        ((HashMap)q20.X).put("internal.eventLogger", a1);
    }

    public final void a(s1 s10) {
        k k0;
        try {
            C c0 = this.a;
            this.b = ((h)c0.Y).e();
            if(c0.S(this.b, ((t1[])s10.p().toArray(new t1[0]))) instanceof i) {
                throw new IllegalStateException("Program loading failed");
            }
            Iterator iterator0 = s10.o().q().iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return;
                }
                Object object0 = iterator0.next();
                l2 l20 = ((r1)object0).p();
                String s = ((r1)object0).o();
                for(Object object1: l20) {
                    o o0 = c0.S(this.b, new t1[]{((t1)object1)});
                    if(!(o0 instanceof n)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    h h0 = this.b;
                    if(h0.l(s)) {
                        o o1 = h0.i(s);
                        if(!(o1 instanceof k)) {
                            throw new IllegalStateException("Invalid function name: " + s);
                        }
                        k0 = (k)o1;
                    }
                    else {
                        k0 = null;
                    }
                    if(k0 == null) {
                        throw new IllegalStateException("Rule function is undefined: " + s);
                    }
                    k0.b(this.b, Collections.singletonList(o0));
                }
            }
        }
        catch(Throwable throwable0) {
        }
        throw new J(throwable0);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V
    }

    public final boolean b(com.google.android.gms.internal.measurement.c c0) {
        try {
            this.c.Y = c0;
            this.c.Z = (com.google.android.gms.internal.measurement.c)c0.clone();
            ((ArrayList)this.c.b0).clear();
            ((h)this.a.Z).m("runtime.counter", new com.google.android.gms.internal.measurement.h(0.0));
            h h0 = this.b.e();
            this.d.q(h0, this.c);
            return ((com.google.android.gms.internal.measurement.c)this.c.Z).equals(((com.google.android.gms.internal.measurement.c)this.c.Y)) && ((ArrayList)this.c.b0).isEmpty() ? false : true;
        }
        catch(Throwable throwable0) {
            throw new J(throwable0);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V
        }
    }
}

