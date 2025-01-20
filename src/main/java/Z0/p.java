package z0;

import java.util.ArrayList;
import m0.b;

public final class p {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final long k;

    public p(long v, long v1, long v2, long v3, boolean z, float f, int v4, boolean z1, ArrayList arrayList0, long v5, long v6) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = z;
        this.f = f;
        this.g = v4;
        this.h = z1;
        this.i = arrayList0;
        this.j = v5;
        this.k = v6;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof p)) {
            return false;
        }
        if(!m.a(this.a, ((p)object0).a)) {
            return false;
        }
        if(this.b != ((p)object0).b) {
            return false;
        }
        if(!b.b(this.c, ((p)object0).c)) {
            return false;
        }
        if(!b.b(this.d, ((p)object0).d)) {
            return false;
        }
        if(this.e != ((p)object0).e) {
            return false;
        }
        if(Float.compare(this.f, ((p)object0).f) != 0) {
            return false;
        }
        if(!l.e(this.g, ((p)object0).g)) {
            return false;
        }
        if(this.h != ((p)object0).h) {
            return false;
        }
        if(!this.i.equals(((p)object0).i)) {
            return false;
        }
        return b.b(this.j, ((p)object0).j) ? b.b(this.k, ((p)object0).k) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = (m5.b.p(((b.f(this.d) + (b.f(this.c) + (((int)(this.a ^ this.a >>> 0x20)) * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F) * 0x1F) * 0x1F + (this.e ? 0x4CF : 0x4D5)) * 0x1F, this.f, 0x1F) + this.g) * 0x1F;
        if(this.h) {
            v = 0x4CF;
        }
        return b.f(this.k) + (b.f(this.j) + (this.i.hashCode() + (v1 + v) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("PointerInputEventData(id=");
        stringBuilder0.append(m.b(this.a));
        stringBuilder0.append(", uptime=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", positionOnScreen=");
        stringBuilder0.append(b.k(this.c));
        stringBuilder0.append(", position=");
        stringBuilder0.append(b.k(this.d));
        stringBuilder0.append(", down=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", pressure=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", type=");
        switch(this.g) {
            case 1: {
                s = "Touch";
                break;
            }
            case 2: {
                s = "Mouse";
                break;
            }
            case 3: {
                s = "Stylus";
                break;
            }
            case 4: {
                s = "Eraser";
                break;
            }
            default: {
                s = "Unknown";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", activeHover=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", historical=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", scrollDelta=");
        stringBuilder0.append(b.k(this.j));
        stringBuilder0.append(", originalEventPosition=");
        stringBuilder0.append(b.k(this.k));
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

