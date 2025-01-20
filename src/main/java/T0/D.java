package t0;

import java.util.ArrayList;
import m5.b;
import n0.U;
import n0.v;

public final class d {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final c j;
    public boolean k;

    public d(String s, float f, float f1, float f2, float f3, long v, int v1, boolean z, int v2) {
        this.a = (v2 & 1) == 0 ? s : "";
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = f3;
        this.f = (v2 & 0x20) == 0 ? v : v.i;
        this.g = (v2 & 0x40) == 0 ? v1 : 5;
        this.h = z;
        ArrayList arrayList0 = new ArrayList();
        this.i = arrayList0;
        c c0 = new c(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0x3FF);
        this.j = c0;
        arrayList0.add(c0);
    }

    public static void a(d d0, ArrayList arrayList0, U u0) {
        if(!d0.k) {
            ((c)b.r(1, d0.i)).j.add(new I("", arrayList0, 0, u0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
            return;
        }
        M6.b.T("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        throw null;
    }

    public final e b() {
        if(!this.k) {
            while(true) {
                ArrayList arrayList0 = this.i;
                if(arrayList0.size() <= 1) {
                    break;
                }
                if(!this.k) {
                    c c0 = (c)arrayList0.remove(arrayList0.size() - 1);
                    ((c)b.r(1, arrayList0)).j.add(new E(c0.a, c0.b, c0.c, c0.d, c0.e, c0.f, c0.g, c0.h, c0.i, c0.j));
                    continue;
                }
                M6.b.T("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                throw null;
            }
            E e0 = new E(this.j.a, this.j.b, this.j.c, this.j.d, this.j.e, this.j.f, this.j.g, this.j.h, this.j.i, this.j.j);
            e e1 = new e(this.a, this.b, this.c, this.d, this.e, e0, this.f, this.g, this.h);
            this.k = true;
            return e1;
        }
        M6.b.T("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        throw null;
    }
}

