package a9;

import Nb.j;

public final class i2 {
    public final String a;
    public final o2 b;
    public final p2 c;

    public i2(String s, o2 o20, p2 p20) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = o20;
        this.c = p20;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i2)) {
            return false;
        }
        if(!j.a(this.a, ((i2)object0).a)) {
            return false;
        }
        return j.a(this.b, ((i2)object0).b) ? j.a(this.c, ((i2)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        p2 p20 = this.c;
        if(p20 != null) {
            v1 = p20.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "CaptureMethod(__typename=" + this.a + ", onElectronicCapture=" + this.b + ", onPhotoCapture=" + this.c + ")";
    }
}

