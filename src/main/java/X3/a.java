package x3;

import android.graphics.PointF;

public final class a {
    public final PointF a;
    public final PointF b;
    public final PointF c;

    public a() {
        this.a = new PointF();
        this.b = new PointF();
        this.c = new PointF();
    }

    public a(PointF pointF0, PointF pointF1, PointF pointF2) {
        this.a = pointF0;
        this.b = pointF1;
        this.c = pointF2;
    }

    @Override
    public final String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", ((float)this.c.x), ((float)this.c.y), ((float)this.a.x), ((float)this.a.y), ((float)this.b.x), ((float)this.b.y));
    }
}

