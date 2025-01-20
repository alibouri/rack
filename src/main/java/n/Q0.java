package N;

import Ab.t;
import Nb.j;
import Nb.k;
import U.C;
import androidx.compose.ui.unit.Density;
import hc.d;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

public final class q0 extends k implements Function0 {
    public final C0 X;
    public final Density Y;
    public final float Z;

    public q0(C0 c00, Density density0, float f) {
        this.X = c00;
        this.Y = density0;
        this.Z = f;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object object0;
        this.X.b = this.Y;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        linkedHashMap0.put(D0.X, ((float)this.Z));
        linkedHashMap0.put(D0.Y, 0.0f);
        S0 s00 = new S0(linkedHashMap0);
        v v0 = this.X.a;
        boolean z = Float.isNaN(v0.g.k());
        C c0 = v0.e;
        if(z) {
            object0 = c0.getValue();
        }
        else {
            object0 = s00.a(v0.g.k());
            if(object0 == null) {
                object0 = c0.getValue();
            }
        }
        if(!j.a(v0.g(), s00)) {
            v0.j.setValue(s00);
            D.j j0 = new D.j(v0, 15, object0);
            d d0 = ((R0)v0.m).b;
            boolean z1 = d0.e(null);
            if(z1) {
                try {
                    j0.invoke();
                }
                finally {
                    d0.f(null);
                }
            }
            if(!z1) {
                v0.n(object0);
            }
        }
        return t.a;
    }
}

