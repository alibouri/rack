package j6;

import N5.r;
import s.e;

public final class b implements Runnable {
    public final int X;
    public final String Y;
    public final long Z;
    public final n b0;

    public b(n n0, String s, long v, int v1) {
        this.X = v1;
        this.Y = s;
        this.Z = v;
        this.b0 = n0;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            n n0 = this.b0;
            n0.q();
            String s = this.Y;
            r.f(s);
            e e0 = n0.b0;
            Integer integer0 = (Integer)e0.get(s);
            if(integer0 == null) {
                n0.b().e0.b(s, "Call to endAdUnitExposure for unknown ad unit id");
            }
            else {
                M0 m00 = n0.s().x(false);
                int v = (int)integer0;
                if(v - 1 != 0) {
                    e0.put(s, ((int)(v - 1)));
                    return;
                }
                e0.remove(s);
                e e1 = n0.Z;
                Long long0 = (Long)e1.get(s);
                long v1 = this.Z;
                if(long0 == null) {
                    n0.b().e0.d("First ad unit exposure time was never set");
                }
                else {
                    e1.remove(s);
                    n0.x(s, v1 - ((long)long0), m00);
                }
                if(e0.isEmpty()) {
                    long v2 = n0.c0;
                    if(v2 == 0L) {
                        n0.b().e0.d("First ad exposure time was never set");
                        return;
                    }
                    n0.v(v1 - v2, m00);
                    n0.c0 = 0L;
                    return;
                }
            }
            return;
        }
        n n1 = this.b0;
        n1.q();
        String s1 = this.Y;
        r.f(s1);
        e e2 = n1.b0;
        long v3 = this.Z;
        if(e2.isEmpty()) {
            n1.c0 = v3;
        }
        Integer integer1 = (Integer)e2.get(s1);
        if(integer1 != null) {
            e2.put(s1, ((int)(((int)integer1) + 1)));
            return;
        }
        if(e2.Z >= 100) {
            n1.b().h0.d("Too many ads visible");
            return;
        }
        e2.put(s1, 1);
        n1.Z.put(s1, v3);
    }
}

