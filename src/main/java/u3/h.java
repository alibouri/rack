package u3;

import E3.g;
import F3.a;
import F3.b;
import M.J;
import android.graphics.PointF;
import java.util.List;
import z3.c;

public final class h extends i {
    public final int h;
    public final Object i;

    public h(int v, List list0) {
        this.h = v;
        switch(v) {
            case 1: {
                super(list0);
                this.i = new PointF();
                return;
            }
            case 2: {
                super(list0);
                this.i = new b(1.0f, 1.0f);
                return;
            }
            default: {
                super(list0);
                int v2 = 0;
                for(int v1 = 0; v1 < list0.size(); ++v1) {
                    c c0 = (c)((a)list0.get(v1)).b;
                    if(c0 != null) {
                        v2 = Math.max(v2, c0.b.length);
                    }
                }
                this.i = new c(new float[v2], new int[v2]);
            }
        }
    }

    @Override  // u3.e
    public final Object e(a a0, float f) {
        float[] arr_f;
        int[] arr_v2;
        switch(this.h) {
            case 0: {
                c c0 = (c)a0.b;
                c c1 = (c)a0.c;
                Object object2 = (c)this.i;
                object2.getClass();
                if(c0.equals(c1)) {
                    ((c)object2).a(c0);
                    return object2;
                }
                if(f <= 0.0f) {
                    ((c)object2).a(c0);
                    return object2;
                }
                if(f >= 1.0f) {
                    ((c)object2).a(c1);
                    return object2;
                }
                int[] arr_v = c0.b;
                int[] arr_v1 = c1.b;
                if(arr_v.length == arr_v1.length) {
                    for(int v = 0; true; ++v) {
                        arr_v2 = object2.b;
                        arr_f = object2.a;
                        if(v >= arr_v.length) {
                            break;
                        }
                        arr_f[v] = g.e(c0.a[v], c1.a[v], f);
                        arr_v2[v] = io.sentry.config.a.G(arr_v[v], f, arr_v1[v]);
                    }
                    for(int v1 = arr_v.length; v1 < arr_f.length; ++v1) {
                        arr_f[v1] = arr_f[arr_v.length - 1];
                        arr_v2[v1] = arr_v2[arr_v.length - 1];
                    }
                    return object2;
                }
                StringBuilder stringBuilder0 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                stringBuilder0.append(arr_v.length);
                stringBuilder0.append(" vs ");
                throw new IllegalArgumentException(J.f(stringBuilder0, arr_v1.length, ")"));
            }
            case 1: {
                return this.i(a0, f, f);
            }
            default: {
                Object object0 = a0.b;
                if(object0 != null) {
                    Object object1 = a0.c;
                    if(object1 != null) {
                        float f1 = g.e(((b)object0).a, ((b)object1).a, f);
                        float f2 = g.e(((b)object0).b, ((b)object1).b, f);
                        ((b)this.i).a = f1;
                        ((b)this.i).b = f2;
                        return (b)this.i;
                    }
                }
                throw new IllegalStateException("Missing values for keyframe.");
            }
        }
    }

    @Override  // u3.e
    public Object f(a a0, float f, float f1, float f2) {
        return this.h != 1 ? super.f(a0, f, f1, f2) : this.i(a0, f1, f2);
    }

    public PointF i(a a0, float f, float f1) {
        Object object0 = a0.b;
        if(object0 != null) {
            Object object1 = a0.c;
            if(object1 != null) {
                float f2 = ((PointF)object0).x;
                float f3 = m5.b.o(((PointF)object1).x, f2, f, f2);
                float f4 = ((PointF)object0).y;
                ((PointF)this.i).set(f3, m5.b.o(((PointF)object1).y, f4, f1, f4));
                return (PointF)this.i;
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}

