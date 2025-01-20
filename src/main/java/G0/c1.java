package G0;

import Ab.t;
import E7.u;
import Nb.w;
import U.e0;
import U.s0;
import Xb.I;
import Xb.J;
import android.view.View;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import dc.e;
import java.util.ArrayList;
import kotlin.coroutines.g;

public final class c1 implements LifecycleEventObserver {
    public final e X;
    public final e0 Y;
    public final s0 Z;
    public final w b0;
    public final View c0;

    public c1(e e0, e0 e00, s0 s00, w w0, View view0) {
        this.X = e0;
        this.Y = e00;
        this.Z = s00;
        this.b0 = w0;
        this.c0 = view0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void b(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        switch(lifecycle$Event0) {
            case 1: {
                b1 b10 = new b1(this.b0, this.Z, lifecycleOwner0, this, this.c0, null);
                J.q(this.X, null, I.b0, b10, 1);
                return;
            }
            case 2: {
                e0 e00 = this.Y;
                if(e00 != null) {
                    u u0 = e00.Y;
                    Object object0 = u0.b;
                    synchronized(object0) {
                        if(!u0.j()) {
                            ArrayList arrayList0 = (ArrayList)u0.c;
                            u0.c = (ArrayList)u0.d;
                            u0.d = arrayList0;
                            u0.a = true;
                            int v1 = arrayList0.size();
                            for(int v2 = 0; v2 < v1; ++v2) {
                                ((g)arrayList0.get(v2)).i(t.a);
                            }
                            arrayList0.clear();
                        }
                    }
                }
                this.Z.I();
                return;
            }
            case 3: {
                this.Z.B();
                return;
            }
            case 4: {
                this.Z.w();
            }
        }
    }
}

