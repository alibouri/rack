package N5;

import com.google.android.gms.common.ConnectionResult;

public final class w extends l {
    public final e g;

    public w(e e0, int v) {
        this.g = e0;
        super(e0, v, null);
    }

    @Override  // N5.l
    public final void a(ConnectionResult connectionResult0) {
        this.g.getClass();
        this.g.h0.b(connectionResult0);
    }

    @Override  // N5.l
    public final boolean b() {
        this.g.h0.b(ConnectionResult.c0);
        return true;
    }
}

