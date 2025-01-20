package p1;

import java.util.ArrayList;

public final class l {
    public o a;
    public ArrayList b;

    public static long a(f f0, long v) {
        o o0 = f0.d;
        if(o0 instanceof j) {
            return v;
        }
        ArrayList arrayList0 = f0.k;
        int v1 = arrayList0.size();
        long v3 = v;
        for(int v2 = 0; v2 < v1; ++v2) {
            e e0 = (e)arrayList0.get(v2);
            if(e0 instanceof f && ((f)e0).d != o0) {
                v3 = Math.min(v3, l.a(((f)e0), ((long)((f)e0).f) + v));
            }
        }
        if(f0 == o0.i) {
            long v4 = v - o0.j();
            return Math.min(Math.min(v3, l.a(o0.h, v4)), v4 - ((long)o0.h.f));
        }
        return v3;
    }

    public static long b(f f0, long v) {
        o o0 = f0.d;
        if(o0 instanceof j) {
            return v;
        }
        ArrayList arrayList0 = f0.k;
        int v1 = arrayList0.size();
        long v3 = v;
        for(int v2 = 0; v2 < v1; ++v2) {
            e e0 = (e)arrayList0.get(v2);
            if(e0 instanceof f && ((f)e0).d != o0) {
                v3 = Math.max(v3, l.b(((f)e0), ((long)((f)e0).f) + v));
            }
        }
        if(f0 == o0.h) {
            long v4 = v + o0.j();
            return Math.max(Math.max(v3, l.b(o0.i, v4)), v4 - ((long)o0.i.f));
        }
        return v3;
    }
}

