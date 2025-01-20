package M6;

import N6.d;
import N6.i;
import N6.k;
import android.os.Bundle;

public abstract class g extends d implements i {
    public final k e;
    public final o6.i f;
    public final j g;

    public g(j j0, k k0, o6.i i0) {
        this.g = j0;
        super(0);
        this.attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.e = k0;
        this.f = i0;
    }

    @Override  // N6.i
    public void i(Bundle bundle0) {
        this.g.a.c(this.f);
        this.e.e("onRequestInfo", new Object[0]);
    }

    @Override  // N6.i
    public void o(Bundle bundle0) {
        this.g.a.c(this.f);
        this.e.e("onCompleteUpdate", new Object[0]);
    }
}

