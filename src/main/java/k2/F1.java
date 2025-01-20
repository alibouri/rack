package k2;

import A3.e;

public final class f1 {
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;

    public f1(int v, int v1, boolean z, int v2, int v3, int v4) {
        if((v4 & 2) != 0) {
            v1 = v;
        }
        if((v4 & 8) != 0) {
            v2 = v * 3;
        }
        if((v4 & 16) != 0) {
            v3 = 0x7FFFFFFF;
        }
        super();
        this.a = v;
        this.b = v1;
        this.c = z;
        this.d = v2;
        this.e = v3;
        this.f = 0x80000000;
        if(!z && v1 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        if(v3 != 0x7FFFFFFF && v3 < v1 * 2 + v) {
            StringBuilder stringBuilder0 = e.v(v, v1, "Maximum size must be at least pageSize + 2*prefetchDist, pageSize=", ", prefetchDist=", ", maxSize=");
            stringBuilder0.append(v3);
            throw new IllegalArgumentException(stringBuilder0.toString());
        }
    }
}

