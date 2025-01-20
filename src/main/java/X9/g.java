package X9;

import Ab.t;
import C3.i;
import Fb.j;
import U.N0;
import W5.f;
import Xb.G;
import com.sendwave.backend.fragment.AnnouncementFragment;
import kotlin.jvm.functions.Function2;

public final class g extends j implements Function2 {
    public final X9.j c0;
    public final i d0;
    public final N0 e0;

    public g(X9.j j0, i i0, N0 n00, kotlin.coroutines.g g0) {
        this.c0 = j0;
        this.d0 = i0;
        this.e0 = n00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((g)this.t(((G)object0), ((kotlin.coroutines.g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        return new g(this.c0, this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        Integer integer0 = (Integer)this.e0.getValue();
        if(integer0 != null) {
            X9.j j0 = this.c0;
            if(((int)integer0) < j0.a.size()) {
                this.d0.s().n(((AnnouncementFragment)j0.a.get(((int)integer0))).getId());
            }
        }
        return t.a;
    }
}

