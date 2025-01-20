package p2;

import j6.K0;
import java.util.List;

public final class c extends b {
    public final K0 d;

    public c(K0 k00) {
        this.d = k00;
    }

    @Override  // p2.b
    public final boolean a(int v, int v1) {
        K0 k00 = this.d;
        Object object0 = ((List)k00.Z).get(v);
        Object object1 = ((List)k00.b0).get(v1);
        if(object0 != null && object1 != null) {
            return ((b)((androidx.recyclerview.widget.b)k00.c0).b.Z).b(object0, object1);
        }
        if(object0 != null || object1 != null) {
            throw new AssertionError();
        }
        return true;
    }

    @Override  // p2.b
    public final boolean c(int v, int v1) {
        Object object0 = ((List)this.d.Z).get(v);
        Object object1 = ((List)this.d.b0).get(v1);
        return object0 == null || object1 == null ? object0 == null && object1 == null : ((b)((androidx.recyclerview.widget.b)this.d.c0).b.Z).d(object0, object1);
    }

    @Override  // p2.b
    public final Object f(int v, int v1) {
        K0 k00 = this.d;
        if(((List)k00.Z).get(v) == null || ((List)k00.b0).get(v1) == null) {
            throw new AssertionError();
        }
        ((b)((androidx.recyclerview.widget.b)k00.c0).b.Z).getClass();
        return null;
    }

    @Override  // p2.b
    public final int g() {
        return ((List)this.d.b0).size();
    }

    @Override  // p2.b
    public final int h() {
        return ((List)this.d.Z).size();
    }
}

