package z1;

import Y8.o;
import android.graphics.Insets;

public final class b {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public static final b e;

    static {
        b.e = new b(0, 0, 0, 0);
    }

    public b(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    public static b a(b b0, b b1) {
        return b.b(Math.max(b0.a, b1.a), Math.max(b0.b, b1.b), Math.max(b0.c, b1.c), Math.max(b0.d, b1.d));
    }

    public static b b(int v, int v1, int v2, int v3) {
        return v != 0 || v1 != 0 || v2 != 0 || v3 != 0 ? new b(v, v1, v2, v3) : b.e;
    }

    public static b c(Insets insets0) {
        return b.b(insets0.left, insets0.top, insets0.right, insets0.bottom);
    }

    public final Insets d() {
        return Q2.b.b(this.a, this.b, this.c, this.d);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(b.class != class0 || this.d != ((b)object0).d) {
                return false;
            }
            if(this.a != ((b)object0).a) {
                return false;
            }
            return this.c == ((b)object0).c ? this.b == ((b)object0).b : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Insets{left=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", top=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", right=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", bottom=");
        return o.z(stringBuilder0, this.d, '}');
    }
}

