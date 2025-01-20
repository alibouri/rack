package q6;

import M.J;
import android.animation.TimeInterpolator;

public final class b {
    public long a;
    public long b;
    public TimeInterpolator c;
    public int d;
    public int e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator0 = this.c;
        return timeInterpolator0 == null ? a.b : timeInterpolator0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b)) {
            return false;
        }
        if(this.a != ((b)object0).a) {
            return false;
        }
        if(this.b != ((b)object0).b) {
            return false;
        }
        if(this.d != ((b)object0).d) {
            return false;
        }
        return this.e == ((b)object0).e ? this.a().getClass().equals(((b)object0).a().getClass()) : false;
    }

    @Override
    public final int hashCode() {
        int v = (((int)(this.a ^ this.a >>> 0x20)) * 0x1F + ((int)(this.b >>> 0x20 ^ this.b))) * 0x1F;
        return ((this.a().getClass().hashCode() + v) * 0x1F + this.d) * 0x1F + this.e;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("\n");
        stringBuilder0.append(b.class.getName());
        stringBuilder0.append('{');
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append(" delay: ");
        stringBuilder0.append(this.a);
        stringBuilder0.append(" duration: ");
        stringBuilder0.append(this.b);
        stringBuilder0.append(" interpolator: ");
        stringBuilder0.append(this.a().getClass());
        stringBuilder0.append(" repeatCount: ");
        stringBuilder0.append(this.d);
        stringBuilder0.append(" repeatMode: ");
        return J.f(stringBuilder0, this.e, "}\n");
    }
}

