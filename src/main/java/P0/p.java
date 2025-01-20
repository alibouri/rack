package P0;

import android.os.Build.VERSION;
import android.text.StaticLayout.Builder;
import android.text.StaticLayout;

public final class p implements u {
    @Override  // P0.u
    public StaticLayout a(v v0) {
        StaticLayout.Builder staticLayout$Builder0 = StaticLayout.Builder.obtain(v0.a, v0.b, v0.c, v0.d, v0.e);
        staticLayout$Builder0.setTextDirection(v0.f);
        staticLayout$Builder0.setAlignment(v0.g);
        staticLayout$Builder0.setMaxLines(v0.h);
        staticLayout$Builder0.setEllipsize(v0.i);
        staticLayout$Builder0.setEllipsizedWidth(v0.j);
        staticLayout$Builder0.setLineSpacing(v0.l, v0.k);
        staticLayout$Builder0.setIncludePad(v0.n);
        staticLayout$Builder0.setBreakStrategy(v0.p);
        staticLayout$Builder0.setHyphenationFrequency(v0.s);
        staticLayout$Builder0.setIndents(v0.t, v0.u);
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 26) {
            q.a(staticLayout$Builder0, v0.m);
        }
        if(v1 >= 28) {
            r.a(staticLayout$Builder0, v0.o);
        }
        if(v1 >= 33) {
            s.b(staticLayout$Builder0, v0.q, v0.r);
        }
        return staticLayout$Builder0.build();
    }
}

