package a9;

import Nb.j;
import java.util.List;

public final class o2 {
    public final String a;
    public final List b;
    public final Integer c;

    public o2(String s, List list0, Integer integer0) {
        this.a = s;
        this.b = list0;
        this.c = integer0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof o2)) {
            return false;
        }
        if(!j.a(this.a, ((o2)object0).a)) {
            return false;
        }
        return j.a(this.b, ((o2)object0).b) ? j.a(this.c, ((o2)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        Integer integer0 = this.c;
        if(integer0 != null) {
            v1 = integer0.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "OnElectronicCapture(contractUrl=" + this.a + ", documentFields=" + this.b + ", minRequiredSignPoints=" + this.c + ")";
    }
}

