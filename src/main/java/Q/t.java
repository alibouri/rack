package Q;

import U.d;
import U.l;
import U.p;
import androidx.compose.runtime.MutableState;
import n0.v;
import v.n0;
import v.z;

public abstract class t {
    public static final n0 a;

    static {
        t.a = new n0(15, z.c, 2);
    }

    public static final f a(boolean z, float f, long v, p p0, int v1) {
        MutableState mutableState0 = d.G(new v(v), p0);
        int v2 = 1;
        int v3 = ((v1 & 14 ^ 6) <= 4 || !p0.g(z)) && (v1 & 6) != 4 ? 0 : 1;
        if(((v1 & 0x70 ^ 0x30) <= 0x20 || !p0.c(f)) && (v1 & 0x30) != 0x20) {
            v2 = 0;
        }
        Object object0 = p0.G();
        if((v3 | v2) != 0 || object0 == l.a) {
            object0 = new f(z, f, mutableState0);
            p0.a0(object0);
        }
        return (f)object0;
    }
}

