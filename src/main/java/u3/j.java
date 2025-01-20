package u3;

import F3.a;
import android.graphics.Path;
import android.graphics.PointF;

public final class j extends a {
    public Path q;
    public final a r;

    public j(r3.a a0, a a1) {
        super(a0, ((PointF)a1.b), ((PointF)a1.c), a1.d, a1.e, a1.f, a1.g, a1.h);
        this.r = a1;
        this.d();
    }

    public final void d() {
        Object object0 = this.b;
        boolean z = this.c != null && object0 != null && ((PointF)object0).equals(((PointF)this.c).x, ((PointF)this.c).y);
        if(object0 != null) {
            Object object1 = this.c;
            if(object1 != null && !z) {
                PointF pointF0 = this.r.o;
                PointF pointF1 = this.r.p;
                Path path0 = new Path();
                path0.moveTo(((PointF)object0).x, ((PointF)object0).y);
                if(pointF0 == null || pointF1 == null || pointF0.length() == 0.0f && pointF1.length() == 0.0f) {
                    path0.lineTo(((PointF)object1).x, ((PointF)object1).y);
                }
                else {
                    path0.cubicTo(pointF0.x + ((PointF)object0).x, ((PointF)object0).y + pointF0.y, ((PointF)object1).x + pointF1.x, ((PointF)object1).y + pointF1.y, ((PointF)object1).x, ((PointF)object1).y);
                }
                this.q = path0;
            }
        }
    }
}

