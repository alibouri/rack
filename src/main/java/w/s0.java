package w;

import android.widget.Magnifier;
import io.sentry.config.a;
import m0.b;

public class s0 implements q0 {
    public final Magnifier a;

    public s0(Magnifier magnifier0) {
        this.a = magnifier0;
    }

    @Override  // w.q0
    public void a(float f, long v, long v1) {
        this.a.show(b.d(v), b.e(v));
    }

    public final void b() {
        this.a.dismiss();
    }

    public final long c() {
        return a.d(this.a.getWidth(), this.a.getHeight());
    }

    public final void d() {
        this.a.update();
    }
}

