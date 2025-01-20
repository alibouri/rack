package x3;

import A3.e;
import android.graphics.PointF;
import v.h;

public final class b {
    public String a;
    public String b;
    public float c;
    public int d;
    public int e;
    public float f;
    public float g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public PointF l;
    public PointF m;

    @Override
    public final int hashCode() {
        int v = ((int)(((float)e.s(this.a.hashCode() * 0x1F, 0x1F, this.b)) + this.c)) * 0x1F;
        int v1 = h.d(this.d);
        long v2 = (long)Float.floatToRawIntBits(this.f);
        return (((v1 + v) * 0x1F + this.e) * 0x1F + ((int)(v2 ^ v2 >>> 0x20))) * 0x1F + this.h;
    }
}

