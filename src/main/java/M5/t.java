package M5;

import L5.c;
import N5.d;
import N5.g;
import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

public final class t implements d {
    public final c X;
    public final b Y;
    public g Z;
    public Set b0;
    public boolean c0;
    public final f d0;

    public t(f f0, c c0, b b0) {
        this.d0 = f0;
        this.Z = null;
        this.b0 = null;
        this.c0 = false;
        this.X = c0;
        this.Y = b0;
    }

    public final void a(ConnectionResult connectionResult0) {
        r r0 = (r)this.d0.j.get(this.Y);
        if(r0 != null) {
            r0.p(connectionResult0);
        }
    }

    @Override  // N5.d
    public final void b(ConnectionResult connectionResult0) {
        Y6.b b0 = new Y6.b(11, this, connectionResult0, false);
        this.d0.n.post(b0);
    }
}

