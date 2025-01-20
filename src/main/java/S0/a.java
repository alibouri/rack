package s0;

import Nb.j;
import androidx.compose.ui.unit.IntSize;
import m0.e;
import n0.M;
import n0.g;
import n0.n;
import p0.d;

public final class a extends b {
    public final g d0;
    public final long e0;
    public final long f0;
    public int g0;
    public final long h0;
    public float i0;
    public n j0;

    public a(g g0, long v, long v1) {
        this.d0 = g0;
        this.e0 = v;
        this.f0 = v1;
        this.g0 = 1;
        if(((int)(v >> 0x20)) < 0 || ((int)(v & 0xFFFFFFFFL)) < 0 || ((int)(v1 >> 0x20)) < 0 || ((int)(v1 & 0xFFFFFFFFL)) < 0 || ((int)(v1 >> 0x20)) > g0.a.getWidth() || ((int)(v1 & 0xFFFFFFFFL)) > g0.a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.h0 = v1;
        this.i0 = 1.0f;
    }

    @Override  // s0.b
    public final boolean b(float f) {
        this.i0 = f;
        return true;
    }

    @Override  // s0.b
    public final boolean e(n n0) {
        this.j0 = n0;
        return true;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        if(!j.a(this.d0, ((a)object0).d0)) {
            return false;
        }
        if(!a1.g.b(this.e0, ((a)object0).e0)) {
            return false;
        }
        return IntSize.a(this.f0, ((a)object0).f0) ? M.r(this.g0, ((a)object0).g0) : false;
    }

    @Override  // s0.b
    public final long h() {
        return io.sentry.config.a.a0(this.h0);
    }

    @Override
    public final int hashCode() {
        return (((int)(this.f0 >>> 0x20 ^ this.f0)) + (((int)(this.e0 ^ this.e0 >>> 0x20)) + this.d0.hashCode() * 0x1F) * 0x1F) * 0x1F + this.g0;
    }

    @Override  // s0.b
    public final void i(d d0) {
        long v = io.sentry.config.a.d(Math.round(e.d(d0.d())), Math.round(e.b(d0.d())));
        m5.b.e(d0, this.d0, this.e0, this.f0, v, this.i0, this.j0, this.g0, 328);
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("BitmapPainter(image=");
        stringBuilder0.append(this.d0);
        stringBuilder0.append(", srcOffset=");
        stringBuilder0.append(a1.g.e(this.e0));
        stringBuilder0.append(", srcSize=");
        stringBuilder0.append(IntSize.d(this.f0));
        stringBuilder0.append(", filterQuality=");
        int v = this.g0;
        if(v == 0) {
            s = "None";
        }
        else {
            switch(v) {
                case 1: {
                    s = "Low";
                    break;
                }
                case 2: {
                    s = "Medium";
                    break;
                }
                case 3: {
                    s = "High";
                    break;
                }
                default: {
                    s = "Unknown";
                }
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

