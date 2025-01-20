package E7;

import S5.c;
import android.content.Context;
import android.content.Intent;
import n2.b;
import o6.a;
import o6.h;

public final class k implements a {
    public final Context X;
    public final Intent Y;
    public final boolean Z;

    public k(Context context0, Intent intent0, boolean z) {
        this.X = context0;
        this.Y = intent0;
        this.Z = z;
    }

    @Override  // o6.a
    public final Object j(h h0) {
        return c.d() && ((int)(((Integer)h0.f()))) == 402 ? m.a(this.X, this.Y, this.Z).l(new b(0), new l(0)) : h0;
    }
}

