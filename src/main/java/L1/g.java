package l1;

import g1.k;
import java.util.ArrayList;
import java.util.Collections;
import m1.d;
import o1.i;

public class g extends b implements d {
    public final k k0;
    public final int l0;
    public final ArrayList m0;

    public g(k k0, int v) {
        super(k0);
        this.m0 = new ArrayList();
        this.k0 = k0;
        this.l0 = v;
    }

    @Override  // l1.b
    public final o1.d a() {
        return this.s();
    }

    @Override  // l1.b, m1.d
    public void apply() {
    }

    public final void q(Object[] arr_object) {
        Collections.addAll(this.m0, arr_object);
    }

    public final void r() {
        super.apply();
    }

    public i s() {
        return null;
    }
}

