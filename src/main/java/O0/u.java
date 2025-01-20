package O0;

import I2.J;
import m5.b;

public final class u {
    public final a a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public u(a a0, int v, int v1, int v2, int v3, float f, float f1) {
        this.a = a0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = f;
        this.g = f1;
    }

    public final long a(long v, boolean z) {
        if(z) {
            return N.a(v, N.b) ? N.b : n.b(((int)(v >> 0x20)) + this.b, ((int)(v & 0xFFFFFFFFL)) + this.b);
        }
        return n.b(((int)(v >> 0x20)) + this.b, ((int)(v & 0xFFFFFFFFL)) + this.b);
    }

    public final int b(int v) {
        return J.r(v, this.b, this.c) - this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof u)) {
            return false;
        }
        if(!this.a.equals(((u)object0).a)) {
            return false;
        }
        if(this.b != ((u)object0).b) {
            return false;
        }
        if(this.c != ((u)object0).c) {
            return false;
        }
        if(this.d != ((u)object0).d) {
            return false;
        }
        if(this.e != ((u)object0).e) {
            return false;
        }
        return Float.compare(this.f, ((u)object0).f) == 0 ? Float.compare(this.g, ((u)object0).g) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.g) + b.p(((((this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F, this.f, 0x1F);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ParagraphInfo(paragraph=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", startIndex=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", endIndex=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", startLineIndex=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", endLineIndex=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", top=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", bottom=");
        return b.x(stringBuilder0, this.g, ')');
    }
}

