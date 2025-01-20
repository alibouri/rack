package x0;

import Nb.k;
import android.view.KeyEvent;
import g0.n;
import kotlin.jvm.functions.Function1;

public final class d extends n implements c {
    public Function1 l0;
    public k m0;

    @Override  // x0.c
    public final boolean J(KeyEvent keyEvent0) {
        return this.l0 == null ? false : ((Boolean)this.l0.n(new b(keyEvent0))).booleanValue();
    }

    @Override  // x0.c
    public final boolean k(KeyEvent keyEvent0) {
        return this.m0 == null ? false : ((Boolean)((Function1)this.m0).n(new b(keyEvent0))).booleanValue();
    }
}

