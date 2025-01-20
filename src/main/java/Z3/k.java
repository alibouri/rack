package z3;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import m5.b;

public final class k {
    public final ArrayList a;
    public PointF b;
    public boolean c;

    public k() {
        this.a = new ArrayList();
    }

    public k(PointF pointF0, boolean z, List list0) {
        this.b = pointF0;
        this.c = z;
        this.a = new ArrayList(list0);
    }

    public final void a(float f, float f1) {
        if(this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f1);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ShapeData{numCurves=");
        stringBuilder0.append(this.a.size());
        stringBuilder0.append("closed=");
        return b.z(stringBuilder0, this.c, '}');
    }
}

