package g1;

import E7.w;
import M.J;
import W5.f;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.HashMap;
import l1.b;
import l1.h;
import m1.a;
import m1.e;
import m1.g;
import m1.i;

public final class k {
    public w a;
    public boolean b;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;
    public final b f;
    public int g;
    public final ArrayList h;
    public final ArrayList i;
    public boolean j;
    public final Density k;
    public long l;

    public k(Density density0) {
        this.b = true;
        HashMap hashMap0 = new HashMap();
        this.c = hashMap0;
        this.d = new HashMap();
        this.e = new HashMap();
        b b0 = new b(this);
        this.f = b0;
        Integer integer0 = 0;
        this.g = 0;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = true;
        b0.a = integer0;
        hashMap0.put(integer0, b0);
        this.k = density0;
        this.l = f.c(0, 0, 15);
        this.a = new w(14, this);
    }

    public final void a(Object object0) {
        this.h.add(object0);
        this.j = true;
    }

    public final b b(Object object0) {
        HashMap hashMap0 = this.c;
        h h0 = (h)hashMap0.get(object0);
        if(h0 == null) {
            h0 = new b(this);
            hashMap0.put(object0, h0);
            h0.a = object0;
        }
        return h0 instanceof b ? ((b)h0) : null;
    }

    public final int c(Float float0) {
        return Math.round(((float)float0));
    }

    public final g d(int v, String s) {
        b b0 = this.b(s);
        if(b0.c == null || !(b0.c instanceof g)) {
            g g0 = new g(this);
            g0.b = v;
            g0.g = s;
            b0.c = g0;
            b0.b(g0.a());
        }
        return (g)b0.c;
    }

    public final l1.g e(int v) {
        m1.h h0;
        StringBuilder stringBuilder0 = new StringBuilder("__HELPER_KEY_");
        int v1 = this.g;
        this.g = v1 + 1;
        String s = J.f(stringBuilder0, v1, "__");
        HashMap hashMap0 = this.d;
        l1.g g0 = (l1.g)hashMap0.get(s);
        if(g0 == null) {
            switch(v.h.d(v)) {
                case 0: {
                    g0 = new m1.h(this, 1);  // initializer: Lm1/c;-><init>(Lg1/k;I)V
                    break;
                }
                case 1: {
                    g0 = new i(this, 2);  // initializer: Lm1/c;-><init>(Lg1/k;I)V
                    break;
                }
                case 2: {
                    h0 = new a(this, 4, 0);
                    h0.o0 = 0.5f;
                    g0 = h0;
                    break;
                }
                case 3: {
                    h0 = new a(this, 4, 1);
                    h0.o0 = 0.5f;
                    g0 = h0;
                    break;
                }
                case 4: {
                    g0 = new m1.b(this, 5);  // initializer: Ll1/g;-><init>(Lg1/k;I)V
                    break;
                }
                case 6: 
                case 7: {
                    g0 = new e(this, v);
                    break;
                }
                case 8: 
                case 9: 
                case 10: {
                    g0 = new m1.f(this, v);
                    break;
                }
                default: {
                    g0 = new l1.g(this, v);
                }
            }
            g0.a = s;
            hashMap0.put(s, g0);
        }
        return g0;
    }
}

