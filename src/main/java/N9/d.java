package N9;

import A3.e;
import Nb.j;
import m5.b;

public final class d {
    public final String a;
    public final c b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;

    public d(String s, c c0, String s1, int v, int v1) {
        j.f(s, "id");
        super();
        this.a = s;
        this.b = c0;
        this.c = s1;
        this.d = v;
        this.e = v1;
        this.f = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d)) {
            return false;
        }
        if(!j.a(this.a, ((d)object0).a)) {
            return false;
        }
        if(!this.b.equals(((d)object0).b)) {
            return false;
        }
        if(!this.c.equals(((d)object0).c)) {
            return false;
        }
        if(this.d != ((d)object0).d) {
            return false;
        }
        return this.e == ((d)object0).e ? j.a(this.f, ((d)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = ((e.s((this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F, this.c) + this.d) * 0x1F + this.e) * 0x1F;
        return this.f == null ? v : v + this.f.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("TooltipItem(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", target=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", text=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", backgroundColorInt=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", showCount=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", _persistenceKey=");
        return b.y(stringBuilder0, this.f, ")");
    }
}

