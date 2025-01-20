package c2;

import I1.a;
import android.content.Intent;
import android.content.res.Configuration;

public final class v implements a {
    public final int a;
    public final x b;

    public v(x x0, int v) {
        this.a = v;
        this.b = x0;
        super();
    }

    @Override  // I1.a
    public final void a(Object object0) {
        if(this.a != 0) {
            Intent intent0 = (Intent)object0;
            this.b.s0.z();
            return;
        }
        Configuration configuration0 = (Configuration)object0;
        this.b.s0.z();
    }
}

