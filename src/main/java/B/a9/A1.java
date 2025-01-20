package a9;

import Nb.j;
import m5.b;
import n0.v;
import v1.r;

public final class a1 {
    public final String a;
    public final long b;
    public final long c;

    public a1(String s, long v, long v1) {
        this.a = s;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a1)) {
            return false;
        }
        if(!j.a(this.a, ((a1)object0).a)) {
            return false;
        }
        return v.c(this.b, ((a1)object0).b) ? v.c(this.c, ((a1)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return v.i(this.c) + r.c(this.a.hashCode() * 0x1F, this.b, 0x1F);
    }

    @Override
    public final String toString() {
        String s = v.j(this.b);
        String s1 = v.j(this.c);
        StringBuilder stringBuilder0 = new StringBuilder("HistoryEntryButtonInfo(text=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", color=");
        stringBuilder0.append(s);
        stringBuilder0.append(", colorPressed=");
        return b.y(stringBuilder0, s1, ")");
    }
}

