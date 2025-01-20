package a8;

import Nb.j;
import m5.b;

public final class s {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public s(boolean z, String s, int v, int v1) {
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof s)) {
            return false;
        }
        if(!j.a(this.a, ((s)object0).a)) {
            return false;
        }
        if(this.b != ((s)object0).b) {
            return false;
        }
        return this.c == ((s)object0).c ? this.d == ((s)object0).d : false;
    }

    @Override
    public final int hashCode() {
        int v = ((this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c) * 0x1F;
        int v1 = this.d;
        if(v1) {
            v1 = 1;
        }
        return v + v1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ProcessDetails(processName=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", pid=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", importance=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", isDefaultProcess=");
        return b.z(stringBuilder0, this.d, ')');
    }
}

