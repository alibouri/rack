package r8;

import G8.g;
import K8.b;
import io.sentry.g1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;

public final class h implements k {
    public EnumMap a;
    public k[] b;

    @Override  // r8.k
    public final m a(g1 g10, EnumMap enumMap0) {
        this.c(enumMap0);
        return this.b(g10);
    }

    public final m b(g1 g10) {
        k[] arr_k = this.b;
        if(arr_k != null) {
            int v = 0;
            while(v < arr_k.length) {
                k k0 = arr_k[v];
                try {
                    return k0.a(g10, this.a);
                }
                catch(l unused_ex) {
                    ++v;
                }
            }
        }
        throw i.Z;
    }

    public final void c(EnumMap enumMap0) {
        this.a = enumMap0;
        boolean z = false;
        boolean z1 = enumMap0 != null && enumMap0.containsKey(c.b0);
        Collection collection0 = enumMap0 == null ? null : ((Collection)enumMap0.get(c.Z));
        ArrayList arrayList0 = new ArrayList();
        if(collection0 != null) {
            if(collection0.contains(a.m0) || collection0.contains(a.n0) || collection0.contains(a.f0) || collection0.contains(a.e0) || collection0.contains(a.Y) || collection0.contains(a.Z) || collection0.contains(a.b0) || collection0.contains(a.c0) || collection0.contains(a.g0) || collection0.contains(a.k0) || collection0.contains(a.l0)) {
                z = true;
            }
            if(z && !z1) {
                arrayList0.add(new g(enumMap0, 0));
            }
            if(collection0.contains(a.j0)) {
                arrayList0.add(new O8.a());
            }
            if(collection0.contains(a.d0)) {
                arrayList0.add(new A8.a());
            }
            if(collection0.contains(a.X)) {
                arrayList0.add(new b(1));
            }
            if(collection0.contains(a.i0)) {
                arrayList0.add(new b(0));
            }
            if(collection0.contains(a.h0)) {
                arrayList0.add(new E8.a());
            }
            if(z && z1) {
                arrayList0.add(new g(enumMap0, 0));
            }
        }
        if(arrayList0.isEmpty()) {
            if(!z1) {
                arrayList0.add(new g(enumMap0, 0));
            }
            arrayList0.add(new O8.a());
            arrayList0.add(new A8.a());
            arrayList0.add(new b(1));
            arrayList0.add(new b(0));
            arrayList0.add(new E8.a());
            if(z1) {
                arrayList0.add(new g(enumMap0, 0));
            }
        }
        this.b = (k[])arrayList0.toArray(new k[arrayList0.size()]);
    }

    @Override  // r8.k
    public final void reset() {
        k[] arr_k = this.b;
        if(arr_k != null) {
            for(int v = 0; v < arr_k.length; ++v) {
                arr_k[v].reset();
            }
        }
    }
}

