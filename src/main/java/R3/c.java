package r3;

import java.util.concurrent.atomic.AtomicBoolean;

public final class c implements m {
    public final int a;
    public final String b;
    public final AtomicBoolean c;

    public c(String s, AtomicBoolean atomicBoolean0, int v) {
        this.a = v;
        this.b = s;
        this.c = atomicBoolean0;
        super();
    }

    @Override  // r3.m
    public final void a(Object object0) {
        if(this.a != 0) {
            Throwable throwable0 = (Throwable)object0;
            d.a.remove(this.b);
            this.c.set(true);
            if(d.a.size() == 0) {
                d.h();
            }
            return;
        }
        a a0 = (a)object0;
        d.a.remove(this.b);
        this.c.set(true);
        if(d.a.size() == 0) {
            d.h();
        }
    }
}

