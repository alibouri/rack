package x2;

import Ab.o;
import Ab.r;
import J8.j;
import U0.D;
import android.content.Context;
import w2.c;

public final class f implements c {
    public final Context X;
    public final String Y;
    public final j Z;
    public final boolean b0;
    public final boolean c0;
    public final o d0;
    public boolean e0;

    public f(Context context0, String s, j j0, boolean z, boolean z1) {
        Nb.j.f(context0, "context");
        Nb.j.f(j0, "callback");
        super();
        this.X = context0;
        this.Y = s;
        this.Z = j0;
        this.b0 = z;
        this.c0 = z1;
        this.d0 = W4.f.A(new D(25, this));
    }

    @Override  // w2.c
    public final b T() {
        return ((e)this.d0.getValue()).a(true);
    }

    @Override
    public final void close() {
        if(this.d0.Y != r.a) {
            ((e)this.d0.getValue()).close();
        }
    }

    @Override  // w2.c
    public final void setWriteAheadLoggingEnabled(boolean z) {
        if(this.d0.Y != r.a) {
            e e0 = (e)this.d0.getValue();
            Nb.j.f(e0, "sQLiteOpenHelper");
            e0.setWriteAheadLoggingEnabled(z);
        }
        this.e0 = z;
    }
}

