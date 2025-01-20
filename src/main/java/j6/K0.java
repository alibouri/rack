package j6;

import android.os.Bundle;

public final class k0 implements Runnable {
    public final int X;
    public final Object Y;
    public final Object Z;
    public final long b0;
    public final Object c0;
    public final Object d0;

    public k0(Object object0, Object object1, Object object2, Object object3, long v, int v1) {
        this.X = v1;
        this.Y = object1;
        this.Z = object2;
        this.c0 = object3;
        this.b0 = v;
        this.d0 = object0;
        super();
    }

    @Override
    public final void run() {
        switch(this.X) {
            case 0: {
                String s = (String)this.Z;
                h0 h00 = (h0)this.d0;
                String s1 = (String)this.Y;
                if(s1 == null) {
                    k1 k10 = h00.d;
                    k10.c().q();
                    if(k10.D0 == null || k10.D0.equals(s)) {
                        k10.D0 = s;
                        k10.C0 = null;
                        return;
                    }
                }
                else {
                    M0 m00 = new M0(this.b0, ((String)this.c0), s1);
                    h00.d.c().q();
                    h00.d.D0 = s;
                    h00.d.C0 = m00;
                }
                return;
            }
            case 1: {
                ((w0)this.d0).x(this.b0, this.c0, ((String)this.Y), ((String)this.Z));
                return;
            }
            default: {
                ((Bundle)this.Y).remove("screen_name");
                ((Bundle)this.Y).remove("screen_class");
                Bundle bundle0 = ((L0)this.d0).p().A("screen_view", ((Bundle)this.Y), null, false);
                ((L0)this.d0).B(((M0)this.Z), ((M0)this.c0), this.b0, true, bundle0);
            }
        }
    }
}

