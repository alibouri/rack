package o9;

import A3.e;
import Nb.j;
import com.apollographql.apollo.api.b;

public final class h1 {
    public final int a;
    public final String b;
    public final boolean c;

    public h1(String s, boolean z, int v) {
        this.a = v;
        this.b = s;
        this.c = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h1)) {
            return false;
        }
        if(this.a != ((h1)object0).a) {
            return false;
        }
        return j.a(this.b, ((h1)object0).b) ? this.c == ((h1)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.a * 0x1F, 0x1F, this.b);
        return this.c ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Choice(index=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", name=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", selected=");
        return b.r(stringBuilder0, this.c, ")");
    }
}

