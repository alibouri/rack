package l1;

import i1.a;
import java.util.HashMap;
import o1.d;

public final class k {
    public final d a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public int o;
    public final HashMap p;

    public k(k k0) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = NaNf;
        this.e = NaNf;
        this.f = NaNf;
        this.g = NaNf;
        this.h = NaNf;
        this.i = NaNf;
        this.j = NaNf;
        this.k = NaNf;
        this.l = NaNf;
        this.m = NaNf;
        this.n = NaNf;
        this.o = 0;
        this.p = new HashMap();
        this.a = k0.a;
        this.b = k0.b;
        this.c = k0.c;
        this.a(k0);
    }

    public k(d d0) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = NaNf;
        this.e = NaNf;
        this.f = NaNf;
        this.g = NaNf;
        this.h = NaNf;
        this.i = NaNf;
        this.j = NaNf;
        this.k = NaNf;
        this.l = NaNf;
        this.m = NaNf;
        this.n = NaNf;
        this.o = 0;
        this.p = new HashMap();
        this.a = d0;
    }

    public final void a(k k0) {
        if(k0 == null) {
            return;
        }
        this.d = k0.d;
        this.e = k0.e;
        this.f = k0.f;
        this.g = k0.g;
        this.h = k0.h;
        this.i = k0.i;
        this.j = k0.j;
        this.k = k0.k;
        this.l = k0.l;
        this.m = k0.m;
        this.n = k0.n;
        this.o = k0.o;
        HashMap hashMap0 = this.p;
        hashMap0.clear();
        for(Object object0: k0.p.values()) {
            String s = ((a)object0).a;
            a a0 = new a();  // initializer: Ljava/lang/Object;-><init>()V
            a0.c = 0x80000000;
            a0.d = NaNf;
            a0.a = s;
            a0.b = ((a)object0).b;
            a0.c = ((a)object0).c;
            a0.d = ((a)object0).d;
            hashMap0.put(s, a0);
        }
    }
}

