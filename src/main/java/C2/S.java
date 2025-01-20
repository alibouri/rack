package c2;

import B3.c;
import E7.w;
import com.sendwave.util.LauncherFragment;
import f.g;
import f.h;
import f.i;
import java.util.concurrent.atomic.AtomicReference;

public final class s extends u {
    public final c a;
    public final AtomicReference b;
    public final I c;
    public final w d;
    public final LauncherFragment e;

    public s(LauncherFragment launcherFragment0, c c0, AtomicReference atomicReference0, I i0, w w0) {
        this.e = launcherFragment0;
        this.a = c0;
        this.b = atomicReference0;
        this.c = i0;
        this.d = w0;
    }

    @Override  // c2.u
    public final void a() {
        LauncherFragment launcherFragment0 = this.e;
        String s = "fragment_" + launcherFragment0.c0 + "_rq#" + launcherFragment0.T0.getAndIncrement();
        LauncherFragment launcherFragment1 = (LauncherFragment)this.a.Y;
        c2.w w0 = launcherFragment1.s0;
        h h0 = w0 instanceof i ? w0.m() : launcherFragment1.O().g0;
        g g0 = h0.d(s, launcherFragment0, this.c, this.d);
        this.b.set(g0);
    }
}

