package y7;

import R2.e;
import java.io.IOException;
import z7.a;

public final class b implements Runnable {
    public final int X;
    public final c Y;

    public b(c c0, int v) {
        this.X = v;
        this.Y = c0;
        super();
    }

    @Override
    public final void run() {
        a a1;
        a a0;
        e e0;
        switch(this.X) {
            case 0: {
                this.Y.b();
                return;
            }
            case 1: {
                this.Y.b();
                return;
            }
            default: {
                c c0 = this.Y;
                c0.getClass();
                synchronized(c.m) {
                    c0.a.a();
                    e0 = e.a(c0.a.a);
                }
                try {
                    a0 = c0.c.x();
                    goto label_13;
                }
                catch(Throwable throwable1) {
                    try {
                        if(e0 != null) {
                            e0.m();
                        }
                        throw throwable1;
                    label_13:
                        if(e0 != null) {
                            e0.m();
                        }
                        goto label_19;
                    }
                    catch(Throwable throwable0) {
                    }
                }
                throw throwable0;
            label_19:
                try {
                    boolean z = false;
                    switch(a0.b) {
                        case 3: {
                            z = true;
                        label_24:
                            if(z) {
                                a1 = c0.i(a0);
                            }
                            else {
                                if(c0.d.a(a0)) {
                                    a1 = c0.c(a0);
                                    goto label_35;
                                }
                                return;
                            }
                            goto label_35;
                        }
                        case 5: {
                            a1 = c0.i(a0);
                            goto label_35;
                        }
                        default: {
                            goto label_24;
                        }
                    }
                }
                catch(y7.e e1) {
                }
                c0.j(e1);
                return;
            label_35:
                c0.f(a1);
                c0.m(a0, a1);
                if(a1.b == 4) {
                    c0.l(a1.a);
                }
                int v = a1.b;
                if(v == 5) {
                    c0.j(new y7.e());  // initializer: Ljava/lang/Exception;-><init>()V
                    return;
                }
                if(v != 1 && v != 2) {
                    c0.k(a1);
                    return;
                }
                c0.j(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            }
        }
    }
}

