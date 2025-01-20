package o;

import androidx.appcompat.widget.c;

public final class y extends h0 {
    public final D h0;
    public final c i0;

    public y(c c0, c c1, D d0) {
        this.i0 = c0;
        this.h0 = d0;
        super(c1);
    }

    @Override  // o.h0
    public final n.y b() {
        return this.h0;
    }

    @Override  // o.h0
    public final boolean c() {
        c c0 = this.i0;
        if(!c0.getInternalPopup().e()) {
            int v = c0.getTextDirection();
            int v1 = c0.getTextAlignment();
            c0.g0.m(v, v1);
        }
        return true;
    }
}

