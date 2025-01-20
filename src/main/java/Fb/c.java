package Fb;

import Nb.j;
import Xb.k;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.i;

public abstract class c extends a {
    public final CoroutineContext Y;
    public transient g Z;

    public c(g g0) {
        this(g0, (g0 == null ? null : g0.a()));
    }

    public c(g g0, CoroutineContext coroutineContext0) {
        super(g0);
        this.Y = coroutineContext0;
    }

    @Override  // kotlin.coroutines.g
    public CoroutineContext a() {
        j.c(this.Y);
        return this.Y;
    }

    @Override  // Fb.a
    public void w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0;
        g g0 = this.Z;
        if(g0 != null && g0 != this) {
            Element coroutineContext$Element0 = this.a().l(h.X);
            j.c(coroutineContext$Element0);
            i i0 = (i)coroutineContext$Element0;
            do {
                atomicReferenceFieldUpdater0 = dc.h.f0;
            }
            while(atomicReferenceFieldUpdater0.get(((dc.h)g0)) == dc.a.d);
            Object object0 = atomicReferenceFieldUpdater0.get(((dc.h)g0));
            k k0 = object0 instanceof k ? ((k)object0) : null;
            if(k0 != null) {
                k0.r();
            }
        }
        this.Z = b.X;
    }
}

