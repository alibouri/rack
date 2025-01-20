package M6;

import O6.a;
import android.os.Bundle;
import o6.i;

public final class h extends g {
    @Override  // M6.g
    public final void o(Bundle bundle0) {
        super.o(bundle0);
        int v = bundle0.getInt("error.code", -2);
        i i0 = this.f;
        if(v != 0) {
            i0.c(new a(bundle0.getInt("error.code", -2)));
            return;
        }
        i0.d(null);
    }
}

