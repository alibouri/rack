package j6;

import android.os.Bundle;
import com.apollographql.apollo.api.b;
import com.google.android.gms.measurement.internal.zzo;
import java.util.concurrent.atomic.AtomicReference;

public final class x0 implements Runnable {
    public final int X;
    public AtomicReference Y;
    public w0 Z;

    public x0() {
        this.X = 0;
        super();
    }

    public x0(w0 w00, AtomicReference atomicReference0, int v) {
        this.X = v;
        this.Y = atomicReference0;
        this.Z = w00;
        super();
    }

    private final void a() {
        synchronized(this.Y) {
            try {
                AtomicReference atomicReference1 = this.Y;
                d d0 = ((d0)this.Z.Y).e0;
                String s = ((d0)this.Z.Y).n().x();
                d0.getClass();
                atomicReference1.set(Boolean.valueOf(d0.B(s, s.N)));
            }
            catch(Throwable throwable0) {
                this.Y.notify();
                throw throwable0;
            }
        }
        this.Y.notify();
    }

    private final void b() {
        synchronized(this.Y) {
            try {
                AtomicReference atomicReference1 = this.Y;
                d d0 = ((d0)this.Z.Y).e0;
                String s = ((d0)this.Z.Y).n().x();
                d0.getClass();
                atomicReference1.set(d0.y(s, s.O));
            }
            catch(Throwable throwable0) {
                this.Y.notify();
                throw throwable0;
            }
        }
        this.Y.notify();
    }

    private final void c() {
        synchronized(this.Y) {
            try {
                this.Y.set(((d0)this.Z.Y).e0.v(((d0)this.Z.Y).n().x(), s.Q));
            }
            catch(Throwable throwable0) {
                this.Y.notify();
                throw throwable0;
            }
        }
        this.Y.notify();
    }

    private final void d() {
        synchronized(this.Y) {
            try {
                this.Y.set(((d0)this.Z.Y).e0.w(((d0)this.Z.Y).n().x(), s.P));
            }
            catch(Throwable throwable0) {
                this.Y.notify();
                throw throwable0;
            }
        }
        this.Y.notify();
    }

    @Override
    public final void run() {
        switch(this.X) {
            case 0: {
                w0 w00 = this.Z;
                Bundle bundle0 = w00.o().n0.f();
                P0 p00 = b.n(((d0)w00.Y));
                zzo zzo0 = p00.J(false);
                p00.z(new B0(p00, this.Y, zzo0, bundle0, 3));
                return;
            }
            case 1: {
                this.a();
                return;
            }
            case 2: {
                this.b();
                return;
            }
            case 3: {
                this.c();
                return;
            }
            case 4: {
                this.d();
                return;
            }
            default: {
                AtomicReference atomicReference0 = this.Y;
                synchronized(atomicReference0) {
                    try {
                        this.Y.set(((d0)this.Z.Y).e0.r(((d0)this.Z.Y).n().x(), s.R));
                    }
                    catch(Throwable throwable0) {
                        this.Y.notify();
                        throw throwable0;
                    }
                }
                this.Y.notify();
            }
        }
    }
}

