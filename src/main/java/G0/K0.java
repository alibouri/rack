package G0;

import Ab.t;
import I.j0;
import N.C0;
import N.D0;
import N.r0;
import Nb.j;
import Nb.k;
import Xb.J;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import dc.e;
import kotlin.jvm.functions.Function0;
import l0.m;
import v2.d;

public final class k0 extends k implements Function0 {
    public final int X;
    public final boolean Y;
    public final Object Z;
    public final Object b0;

    public k0(int v, Object object0, Object object1, boolean z) {
        this.X = v;
        this.Y = z;
        this.Z = object0;
        this.b0 = object1;
        super(0);
    }

    public k0(j0 j00, m m0, boolean z) {
        this.X = 1;
        this.Z = j00;
        this.b0 = m0;
        this.Y = z;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                if(this.Y) {
                    ((d)this.Z).getClass();
                    j.f(((String)this.b0), "key");
                    ((d)this.Z).a.d(((String)this.b0));
                }
                return t.a;
            }
            case 1: {
                j0 j00 = (j0)this.Z;
                if(!j00.b()) {
                    ((m)this.b0).b();
                    return Boolean.TRUE;
                }
                if(!this.Y) {
                    SoftwareKeyboardController softwareKeyboardController0 = j00.c;
                    if(softwareKeyboardController0 != null) {
                        softwareKeyboardController0.a();
                    }
                }
                return Boolean.TRUE;
            }
            default: {
                if(this.Y) {
                    C0 c00 = (C0)this.Z;
                    if(((Boolean)c00.a.c.n(D0.X)).booleanValue()) {
                        r0 r00 = new r0(c00, null);
                        J.q(((e)this.b0), null, null, r00, 3);
                    }
                }
                return t.a;
            }
        }
    }
}

