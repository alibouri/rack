package h3;

import W4.f;
import kotlin.jvm.functions.Function0;

public final class a implements Function0 {
    public final int X;
    public final b Y;

    public a(b b0, int v) {
        this.X = v;
        this.Y = b0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b b0 = this.Y;
        if(this.X != 0) {
            String s = b0.f.a("Content-Type");
            if(s != null) {
                try {
                    return android.support.v4.media.session.a.C(s);
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
            return null;
        }
        return f.G(b0.f);
    }
}

