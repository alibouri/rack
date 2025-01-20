package j6;

import E.h0;
import a6.d;
import android.os.Looper;
import com.google.android.gms.internal.measurement.E1;
import i.s;

public final class a1 extends U {
    public d b0;
    public boolean c0;
    public final s d0;
    public final h0 e0;
    public final E1 f0;

    public a1(d0 d00) {
        super(d00);
        this.c0 = true;
        this.d0 = new s(this);
        this.e0 = new h0(this);
        this.f0 = new E1(this);
    }

    @Override  // j6.U
    public final boolean w() {
        return false;
    }

    public final void x() {
        this.q();
        if(this.b0 == null) {
            this.b0 = new d(Looper.getMainLooper(), 3);
        }
    }
}

