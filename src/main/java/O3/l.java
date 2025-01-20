package o3;

import java.util.HashMap;
import java.util.Iterator;
import n3.a;
import q3.d;

public abstract class l {
    public static final HashMap a;

    static {
        l.a = new HashMap();
        d d0 = new d();
        d0.e(0x200, true);
        l.a.put("dc:contributor", d0);
        l.a.put("dc:language", d0);
        l.a.put("dc:publisher", d0);
        l.a.put("dc:relation", d0);
        l.a.put("dc:subject", d0);
        l.a.put("dc:type", d0);
        d d1 = new d();
        d1.e(0x200, true);
        d1.e(0x400, true);
        l.a.put("dc:creator", d1);
        l.a.put("dc:date", d1);
        d d2 = new d();
        d2.e(0x200, true);
        d2.e(0x400, true);
        d2.e(0x800, true);
        d2.e(0x1000, true);
        l.a.put("dc:description", d2);
        l.a.put("dc:rights", d2);
        l.a.put("dc:title", d2);
    }

    public static void a(k k0, k k1, boolean z) {
        if(!k0.Y.equals(k1.Y) || k0.i() == k1.i() || !z && (!k0.X.equals(k1.X) || !k0.j().equals(k1.j()) || (k0.c0 == null ? 0 : k0.c0.size()) != (k1.c0 == null ? 0 : k1.c0.size()))) {
            throw new a("Mismatch between alias and base nodes", 203);
        }
        Iterator iterator0 = k0.o();
        Iterator iterator1 = k1.o();
        while(iterator0.hasNext() && iterator1.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = iterator1.next();
            l.a(((k)object0), ((k)object1), false);
        }
        Iterator iterator2 = k0.p();
        Iterator iterator3 = k1.p();
        while(iterator2.hasNext() && iterator3.hasNext()) {
            Object object2 = iterator2.next();
            Object object3 = iterator3.next();
            l.a(((k)object2), ((k)object3), false);
        }
    }

    public static void b(k k0) {
        if(!k0.j().c(0x200)) {
            return;
        }
        d d0 = k0.j();
        d0.e(0x400, true);
        d0.e(0x800, true);
        d0.e(0x1000, true);
        Iterator iterator0 = k0.o();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            k k1 = (k)object0;
            if(k1.j().f()) {
                iterator0.remove();
            }
            else if(k1.j().c(0x40)) {
            }
            else if(k1.Y != null && k1.Y.length() != 0) {
                k1.c(new k("xml:lang", "x-repair", null));
            }
            else {
                iterator0.remove();
            }
        }
    }

    public static void c(Iterator iterator0, k k0, k k1) {
        if(k1.j().c(0x1000)) {
            if(k0.j().c(0x40)) {
                throw new a("Alias to x-default already has a language qualifier", 203);
            }
            k0.c(new k("xml:lang", "x-default", null));
        }
        iterator0.remove();
        k0.X = "[]";
        k1.a(k0);
    }
}

