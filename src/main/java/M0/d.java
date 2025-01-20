package m0;

import Bb.F;
import m5.b;

public final class d {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
    }

    public d(float f, float f1, float f2, float f3, long v, long v1, long v2, long v3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = v;
        this.f = v1;
        this.g = v2;
        this.h = v3;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d)) {
            return false;
        }
        if(Float.compare(this.a, ((d)object0).a) != 0) {
            return false;
        }
        if(Float.compare(this.b, ((d)object0).b) != 0) {
            return false;
        }
        if(Float.compare(this.c, ((d)object0).c) != 0) {
            return false;
        }
        if(Float.compare(this.d, ((d)object0).d) != 0) {
            return false;
        }
        if(!a.a(this.e, ((d)object0).e)) {
            return false;
        }
        if(!a.a(this.f, ((d)object0).f)) {
            return false;
        }
        return a.a(this.g, ((d)object0).g) ? a.a(this.h, ((d)object0).h) : false;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.h ^ this.h >>> 0x20)) + (((int)(this.g ^ this.g >>> 0x20)) + (((int)(this.f ^ this.f >>> 0x20)) + (((int)(this.e ^ this.e >>> 0x20)) + b.p(b.p(b.p(Float.floatToIntBits(this.a) * 0x1F, this.b, 0x1F), this.c, 0x1F), this.d, 0x1F)) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        String s = F.c0(this.a) + ", " + F.c0(this.b) + ", " + F.c0(this.c) + ", " + F.c0(this.d);
        long v = this.e;
        long v1 = this.f;
        long v2 = this.g;
        long v3 = this.h;
        if(a.a(v, v1) && a.a(v1, v2) && a.a(v2, v3)) {
            if(a.b(v) == a.c(v)) {
                StringBuilder stringBuilder0 = com.apollographql.apollo.api.b.s("RoundRect(rect=", s, ", radius=");
                stringBuilder0.append(F.c0(a.b(v)));
                stringBuilder0.append(')');
                return stringBuilder0.toString();
            }
            StringBuilder stringBuilder1 = com.apollographql.apollo.api.b.s("RoundRect(rect=", s, ", x=");
            stringBuilder1.append(F.c0(a.b(v)));
            stringBuilder1.append(", y=");
            stringBuilder1.append(F.c0(a.c(v)));
            stringBuilder1.append(')');
            return stringBuilder1.toString();
        }
        StringBuilder stringBuilder2 = com.apollographql.apollo.api.b.s("RoundRect(rect=", s, ", topLeft=");
        stringBuilder2.append(a.d(v));
        stringBuilder2.append(", topRight=");
        stringBuilder2.append(a.d(v1));
        stringBuilder2.append(", bottomRight=");
        stringBuilder2.append(a.d(v2));
        stringBuilder2.append(", bottomLeft=");
        stringBuilder2.append(a.d(v3));
        stringBuilder2.append(')');
        return stringBuilder2.toString();
    }
}

