package O0;

import W0.c;
import Y8.o;

public final class v {
    public final c a;
    public final int b;
    public final int c;

    public v(c c0, int v, int v1) {
        this.a = c0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof v)) {
            return false;
        }
        if(!this.a.equals(((v)object0).a)) {
            return false;
        }
        return this.b == ((v)object0).b ? this.c == ((v)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", startIndex=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", endIndex=");
        return o.z(stringBuilder0, this.c, ')');
    }
}

