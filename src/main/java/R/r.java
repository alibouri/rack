package r;

import N4.h;
import androidx.lifecycle.MutableLiveData;
import java.lang.ref.WeakReference;

public final class r extends d {
    public final WeakReference a;

    public r(s s0) {
        this.a = new WeakReference(s0);
    }

    @Override  // r.d
    public final void a(int v, CharSequence charSequence0) {
        WeakReference weakReference0 = this.a;
        if(weakReference0.get() != null && !((s)weakReference0.get()).k0 && ((s)weakReference0.get()).j0) {
            ((s)weakReference0.get()).q(new e(v, charSequence0));
        }
    }

    @Override  // r.d
    public final void b(p p0) {
        int v = -1;
        WeakReference weakReference0 = this.a;
        if(weakReference0.get() != null && ((s)weakReference0.get()).j0) {
            if(p0.b == -1) {
                int v1 = ((s)weakReference0.get()).o();
                if((v1 & 0x7FFF) != 0 && !h.u(v1)) {
                    v = 2;
                }
                p0 = new p(p0.a, v);
            }
            s s0 = (s)weakReference0.get();
            if(s0.n0 == null) {
                s0.n0 = new MutableLiveData();
            }
            s.u(s0.n0, p0);
        }
    }
}

