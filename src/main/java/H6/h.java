package H6;

import android.support.v4.media.session.a;

public final class h extends a {
    @Override  // android.support.v4.media.session.a
    public final void E(s s0, float f, float f1) {
        s0.d(f1 * f, 180.0f, 90.0f);
        float f2 = f1 * 2.0f * f;
        o o0 = new o(0.0f, 0.0f, f2, f2);
        o0.f = 180.0f;
        o0.g = 90.0f;
        s0.f.add(o0);
        m m0 = new m(o0);
        s0.a(180.0f);
        s0.g.add(m0);
        s0.d = 270.0f;
        float f3 = (0.0f + f2) * 0.5f;
        float f4 = (f2 - 0.0f) / 2.0f;
        s0.b = ((float)Math.cos(Math.toRadians(270.0))) * f4 + f3;
        s0.c = f4 * ((float)Math.sin(Math.toRadians(270.0))) + f3;
    }
}

