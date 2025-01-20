package M;

import I.X;
import m0.b;
import v.h;

public final class K {
    public final X a;
    public final long b;
    public final int c;
    public final boolean d;

    public K(X x0, long v, int v1, boolean z) {
        this.a = x0;
        this.b = v;
        this.c = v1;
        this.d = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof K)) {
            return false;
        }
        if(this.a != ((K)object0).a) {
            return false;
        }
        if(!b.b(this.b, ((K)object0).b)) {
            return false;
        }
        return this.c == ((K)object0).c ? this.d == ((K)object0).d : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = b.f(this.b);
        int v2 = h.d(this.c);
        return this.d ? (v2 + (v1 + v * 0x1F) * 0x1F) * 0x1F + 0x4CF : (v2 + (v1 + v * 0x1F) * 0x1F) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("SelectionHandleInfo(handle=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", position=");
        stringBuilder0.append(b.k(this.b));
        stringBuilder0.append(", anchor=");
        switch(this.c) {
            case 1: {
                s = "Left";
                break;
            }
            case 2: {
                s = "Middle";
                break;
            }
            case 3: {
                s = "Right";
                break;
            }
            default: {
                s = "null";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", visible=");
        return m5.b.z(stringBuilder0, this.d, ')');
    }
}

