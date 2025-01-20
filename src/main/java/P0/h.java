package p0;

import Nb.j;
import m5.b;
import n0.M;
import n0.k;

public final class h extends e {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final k e;

    public h(float f, float f1, int v, int v1, int v2) {
        if((v2 & 2) != 0) {
            f1 = 4.0f;
        }
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = 0;
        }
        super();
        this.a = f;
        this.b = f1;
        this.c = v;
        this.d = v1;
        this.e = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h)) {
            return false;
        }
        if(this.a == ((h)object0).a || this.b == ((h)object0).b || !M.s(this.c, ((h)object0).c)) {
            return false;
        }
        return M.t(this.d, ((h)object0).d) ? j.a(this.e, ((h)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = ((b.p(Float.floatToIntBits(this.a) * 0x1F, this.b, 0x1F) + this.c) * 0x1F + this.d) * 0x1F;
        return this.e == null ? v : v + this.e.hashCode();
    }

    @Override
    public final String toString() {
        String s1;
        StringBuilder stringBuilder0 = new StringBuilder("Stroke(width=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", miter=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", cap=");
        int v = this.c;
        String s = "Unknown";
        if(v == 0) {
            s1 = "Butt";
        }
        else {
            switch(v) {
                case 1: {
                    s1 = "Round";
                    break;
                }
                case 2: {
                    s1 = "Square";
                    break;
                }
                default: {
                    s1 = "Unknown";
                }
            }
        }
        stringBuilder0.append(s1);
        stringBuilder0.append(", join=");
        int v1 = this.d;
        if(v1 == 0) {
            s = "Miter";
        }
        else {
            switch(v1) {
                case 1: {
                    s = "Round";
                    break;
                }
                case 2: {
                    s = "Bevel";
                }
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", pathEffect=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

