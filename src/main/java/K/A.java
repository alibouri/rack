package k;

import B2.e;
import N4.h;
import android.graphics.drawable.Animatable;

public final class a extends h {
    public final int a;
    public final Animatable b;

    public a(Animatable animatable0, int v) {
        this.a = v;
        this.b = animatable0;
        super();
    }

    @Override  // N4.h
    public final void L() {
        if(this.a != 0) {
            ((e)this.b).start();
            return;
        }
        this.b.start();
    }

    @Override  // N4.h
    public final void M() {
        if(this.a != 0) {
            ((e)this.b).stop();
            return;
        }
        this.b.stop();
    }
}

