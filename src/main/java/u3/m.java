package u3;

import F3.a;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

public final class m extends e {
    public final PointF h;
    public final PointF i;
    public final f j;
    public final f k;

    public m(f f0, f f1) {
        super(Collections.emptyList());
        this.h = new PointF();
        this.i = new PointF();
        this.j = f0;
        this.k = f1;
        this.g(this.d);
    }

    @Override  // u3.e
    public final Object d() {
        this.i.set(this.h.x, 0.0f);
        this.i.set(this.i.x, this.h.y);
        return this.i;
    }

    @Override  // u3.e
    public final Object e(a a0, float f) {
        this.i.set(this.h.x, 0.0f);
        this.i.set(this.i.x, this.h.y);
        return this.i;
    }

    @Override  // u3.e
    public final void g(float f) {
        this.j.g(f);
        this.k.g(f);
        float f1 = (float)(((Float)this.j.d()));
        float f2 = (float)(((Float)this.k.d()));
        this.h.set(f1, f2);
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.a;
            if(v >= arrayList0.size()) {
                break;
            }
            ((u3.a)arrayList0.get(v)).b();
        }
    }
}

