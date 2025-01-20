package b3;

import E7.u;
import Ec.C;
import java.io.IOException;
import java.util.ArrayList;

public final class b {
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public u g;
    public int h;
    public final f i;

    public b(f f0, String s) {
        this.i = f0;
        this.a = s;
        f0.getClass();
        this.b = new long[2];
        f0.getClass();
        this.c = new ArrayList(2);
        f0.getClass();
        this.d = new ArrayList(2);
        StringBuilder stringBuilder0 = new StringBuilder(s);
        stringBuilder0.append('.');
        int v = stringBuilder0.length();
        f0.getClass();
        for(int v1 = 0; v1 < 2; ++v1) {
            stringBuilder0.append(v1);
            this.c.add(this.i.X.d(stringBuilder0.toString()));
            stringBuilder0.append(".tmp");
            this.d.add(this.i.X.d(stringBuilder0.toString()));
            stringBuilder0.setLength(v);
        }
    }

    public final c a() {
        f f0;
        if(!this.e) {
            return null;
        }
        if(this.g == null && !this.f) {
            ArrayList arrayList0 = this.c;
            int v = arrayList0.size();
            for(int v1 = 0; true; ++v1) {
                f0 = this.i;
                if(v1 >= v) {
                    break;
                }
                C c0 = (C)arrayList0.get(v1);
                if(!f0.n0.c(c0)) {
                    try {
                        f0.F(this);
                    }
                    catch(IOException unused_ex) {
                    }
                    return null;
                }
            }
            ++this.h;
            return new c(f0, this);
        }
        return null;
    }
}

