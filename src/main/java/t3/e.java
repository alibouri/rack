package T3;

import B3.d;
import Ba.l;
import G0.s0;
import Nb.j;
import V2.a;
import W2.c;
import X2.g;
import java.util.Collection;

public final class e extends s0 {
    public final int Y;
    public final d Z;
    public final Object b0;

    public e(d d0, String s, l l0) {
        this.Y = 0;
        j.f(s, "key");
        this.Z = d0;
        super(l0);
        this.b0 = s;
    }

    public e(d d0, Collection collection0, l l0) {
        this.Y = 1;
        this.Z = d0;
        super(l0);
        this.b0 = collection0;
    }

    public final c k(a a0) {
        String s;
        if(this.Y != 0) {
            Collection collection0 = (Collection)this.b0;
            int v = collection0.size();
            d d0 = this.Z;
            if(v == 0) {
                s = "()";
            }
            else {
                StringBuilder stringBuilder0 = new StringBuilder(v + 2);
                stringBuilder0.append("(?");
                for(int v1 = 0; v1 < v - 1; ++v1) {
                    stringBuilder0.append(",?");
                }
                stringBuilder0.append(')');
                s = stringBuilder0.toString();
                j.e(s, "toString(...)");
            }
            l l0 = new l(13, this);
            return ((g)d0.Y).h(null, "SELECT key, record FROM records WHERE key IN " + s, a0, collection0.size(), l0);
        }
        l l1 = new l(12, this);
        return ((g)this.Z.Y).h(0xDCAC96B, "SELECT key, record FROM records WHERE key=?", a0, 1, l1);
    }

    @Override
    public final String toString() {
        return this.Y == 0 ? "json.sq:recordForKey" : "json.sq:recordsForKeys";
    }
}

