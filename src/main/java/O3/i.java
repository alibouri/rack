package o3;

import Bb.F;
import N2.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import n3.b;
import q3.a;
import q3.d;

public final class i implements b {
    public k X;

    public i() {
        this.X = new k(null, null, null);
    }

    public final h b(String s, a a0) {
        h h0 = new h();  // initializer: Ljava/lang/Object;-><init>()V
        h0.Y = null;
        if(a0 == null) {
            a0 = new a(1, 0);
        }
        h0.X = a0;
        k k0 = s == null || s.length() <= 0 ? F.s(this.X, s, null, false) : this.X;
        if(k0 != null) {
            if(!h0.X.c(0x100)) {
                h0.Y = new f(h0, k0, null, 1);
                return h0;
            }
            h0.Y = new g(h0, k0, null);
            return h0;
        }
        h0.Y = Collections.EMPTY_LIST.iterator();
        return h0;
    }

    public final void c(String s) {
        Object object1;
        k k1;
        io.sentry.config.a.r("http://purl.org/dc/elements/1.1/");
        String s1 = c.e("");
        String s2 = c.e("x-default");
        m m0 = M6.b.x("http://purl.org/dc/elements/1.1/", "rights");
        d d0 = new d(0x1E00);
        k k0 = F.r(this.X, m0, true, d0);
        if(k0 == null) {
            throw new n3.a("Failed to find or create array node", 102);
        }
        if(!k0.j().c(0x1000)) {
            if(k0.m() || !k0.j().c(0x800)) {
                throw new n3.a("Specified property is no alt-text array", 102);
            }
            k0.j().e(0x1000, true);
        }
        boolean z = false;
        Iterator iterator0 = k0.o();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            k1 = (k)object0;
            if(!k1.n() || !"xml:lang".equals(k1.l(1).X)) {
                throw new n3.a("Language qualifier must be first", 102);
            }
            if(!"x-default".equals(k1.l(1).Y)) {
                continue;
            }
            z = true;
            goto label_23;
        }
        k1 = null;
    label_23:
        if(k1 != null && k0.i() > 1) {
            ((ArrayList)k0.h()).remove(k1);
            if(k0.b0.isEmpty()) {
                k0.b0 = null;
            }
            k0.b(k1);
        }
        if(!k0.j().c(0x1000)) {
            throw new n3.a("Localized text array is not alt-text", 102);
        }
        if(k0.m()) {
            Object object2 = null;
            Object object3 = null;
            int v = 0;
            Iterator iterator1 = k0.o();
            while(iterator1.hasNext()) {
                Object object4 = iterator1.next();
                k k2 = (k)object4;
                if(k2.j().f()) {
                    throw new n3.a("Alt-text array item is not simple", 102);
                }
                if(!k2.n() || !"xml:lang".equals(k2.l(1).X)) {
                    throw new n3.a("Alt-text array item has no language qualifier", 102);
                }
                String s3 = k2.l(1).Y;
                if(s2.equals(s3)) {
                    goto label_56;
                }
                if(s1 != null && s3.startsWith(s1)) {
                    if(object2 == null) {
                        object2 = k2;
                    }
                    ++v;
                }
                else if("x-default".equals(s3)) {
                    object3 = k2;
                }
            }
            if(v != 1 && v <= 1 && object3 == null) {
                new Object[]{new Integer(5), k0.g(1)};
            }
        }
        else {
            Integer integer0 = new Integer(0);
            object1 = null;
        }
    label_56:
        boolean z1 = "x-default".equals(s2);
        switch(((int)integer0)) {
            case 0: {
                F.i(k0, "x-default", s);
                if(!z1) {
                    F.i(k0, s2, s);
                }
                z = true;
                break;
            }
            case 1: {
                if(z1) {
                    Iterator iterator2 = k0.o();
                    while(iterator2.hasNext()) {
                        Object object5 = iterator2.next();
                        k k3 = (k)object5;
                        if(k3 != k1 && k3.Y.equals((k1 == null ? null : k1.Y))) {
                            k3.Y = s;
                        }
                    }
                    if(k1 != null) {
                        k1.Y = s;
                    }
                }
                else {
                    if(z && k1 != ((k)object1) && k1 != null && k1.Y.equals(((k)object1).Y)) {
                        k1.Y = s;
                    }
                    ((k)object1).Y = s;
                }
                break;
            }
            case 2: {
                if(z && k1 != ((k)object1) && k1 != null && k1.Y.equals(((k)object1).Y)) {
                    k1.Y = s;
                }
                ((k)object1).Y = s;
                break;
            }
            case 3: {
                F.i(k0, s2, s);
                if(z1) {
                    z = true;
                }
                break;
            }
            case 4: {
                if(k1 != null && k0.i() == 1) {
                    k1.Y = s;
                }
                F.i(k0, s2, s);
                break;
            }
            case 5: {
                F.i(k0, s2, s);
                if(z1) {
                    z = true;
                }
                break;
            }
            default: {
                throw new n3.a("Unexpected result from ChooseLocalizedText", 9);
            }
        }
        if(!z && k0.i() == 1) {
            F.i(k0, "x-default", s);
        }
    }

    @Override
    public final Object clone() {
        k k0 = this.X.e();
        Object object0 = new i();  // initializer: Ljava/lang/Object;-><init>()V
        object0.X = k0;
        return object0;
    }
}

