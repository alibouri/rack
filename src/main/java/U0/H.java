package U0;

import A3.e;
import Lc.b;
import Y8.o;

public final class h implements i {
    public final int a;
    public final int b;

    public h(int v, int v1) {
        this.a = v;
        this.b = v1;
        if(v < 0 || v1 < 0) {
            throw new IllegalArgumentException(e.u(v, v1, "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively.").toString());
        }
    }

    @Override  // U0.i
    public final void a(j j0) {
        int v = 0;
        int v1 = 0;
        int v2 = 0;
        while(v1 < this.a) {
            int v3 = j0.b;
            if(v3 > v2 + 1) {
                v2 = !Character.isHighSurrogate(j0.b(v2 * -1 + v3 - 2)) || !Character.isLowSurrogate(j0.b(j0.b - (v2 + 1))) ? v2 + 1 : v2 + 2;
                ++v1;
            }
            else {
                v2 = v3;
                if(true) {
                    break;
                }
            }
        }
        int v4 = 0;
        while(v < this.b) {
            b b0 = j0.a;
            int v5 = b0.p();
            if(j0.c + (v4 + 1) < v5) {
                int v6 = j0.b(j0.c + (v4 + 1));
                v4 = !Character.isHighSurrogate(j0.b(j0.c + (v4 + 1) - 1)) || !Character.isLowSurrogate(((char)v6)) ? v4 + 1 : v4 + 2;
                ++v;
            }
            else {
                v4 = b0.p() - j0.c;
                if(true) {
                    break;
                }
            }
        }
        j0.a(j0.c, v4 + j0.c);
        j0.a(j0.b - v2, j0.b);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h)) {
            return false;
        }
        return this.a == ((h)object0).a ? this.b == ((h)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", lengthAfterCursor=");
        return o.z(stringBuilder0, this.b, ')');
    }
}

