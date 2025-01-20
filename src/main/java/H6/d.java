package H6;

import android.support.v4.media.session.a;

public final class d extends a {
    @Override  // android.support.v4.media.session.a
    public final void E(s s0, float f, float f1) {
        s0.d(f1 * f, 180.0f, 90.0f);
        s0.c(((float)(Math.sin(Math.toRadians(90.0)) * ((double)f1) * ((double)f))), ((float)(Math.sin(Math.toRadians(0.0)) * ((double)f1) * ((double)f))));
    }
}

