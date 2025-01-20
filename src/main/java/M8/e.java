package m8;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

public final class e implements Externalizable {
    public ArrayList X;

    @Override
    public final void readExternal(ObjectInput objectInput0) {
        int v = objectInput0.readInt();
        for(int v1 = 0; v1 < v; ++v1) {
            d d0 = new d();  // initializer: Ljava/lang/Object;-><init>()V
            d0.Y = null;
            d0.b0 = null;
            d0.d0 = null;
            d0.f0 = null;
            d0.h0 = null;
            d0.j0 = null;
            d0.l0 = null;
            d0.n0 = null;
            d0.p0 = null;
            d0.r0 = null;
            d0.t0 = null;
            d0.v0 = null;
            d0.x0 = null;
            d0.z0 = null;
            d0.B0 = null;
            d0.D0 = null;
            d0.F0 = null;
            d0.G0 = "";
            d0.H0 = 0;
            d0.I0 = "";
            d0.K0 = "";
            d0.M0 = "";
            d0.O0 = "";
            d0.Q0 = "";
            d0.S0 = "";
            d0.T0 = false;
            d0.U0 = new ArrayList();
            d0.V0 = new ArrayList();
            d0.W0 = false;
            d0.Y0 = "";
            d0.Z0 = false;
            d0.readExternal(objectInput0);
            this.X.add(d0);
        }
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput0) {
        ArrayList arrayList0 = this.X;
        int v = arrayList0.size();
        objectOutput0.writeInt(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((d)arrayList0.get(v1)).writeExternal(objectOutput0);
        }
    }
}

