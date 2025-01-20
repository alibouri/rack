package u2;

import Nb.j;

public final class c implements Comparable {
    public final int X;
    public final int Y;
    public final String Z;
    public final String b0;

    public c(int v, int v1, String s, String s1) {
        this.X = v;
        this.Y = v1;
        this.Z = s;
        this.b0 = s1;
    }

    @Override
    public final int compareTo(Object object0) {
        j.f(((c)object0), "other");
        int v = this.X - ((c)object0).X;
        return v == 0 ? this.Y - ((c)object0).Y : v;
    }
}

