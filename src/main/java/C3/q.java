package C3;

import D3.b;
import E3.g;
import F3.a;
import R2.e;
import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

public abstract class q {
    public static final LinearInterpolator a;
    public static final e b;
    public static final e c;

    static {
        q.a = new LinearInterpolator();
        q.b = e.l(new String[]{"t", "s", "e", "o", "i", "h", "to", "ti"});
        q.c = e.l(new String[]{"x", "y"});
    }

    public static BaseInterpolator a(PointF pointF0, PointF pointF1) {
        try {
            pointF0.x = g.b(pointF0.x, -1.0f, 1.0f);
            pointF0.y = g.b(pointF0.y, -100.0f, 100.0f);
            pointF1.x = g.b(pointF1.x, -1.0f, 1.0f);
            float f = g.b(pointF1.y, -100.0f, 100.0f);
            pointF1.y = f;
            return new PathInterpolator(pointF0.x, pointF0.y, pointF1.x, f);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            return "The Path cannot loop back on itself.".equals(illegalArgumentException0.getMessage()) ? new PathInterpolator(Math.min(pointF0.x, 1.0f), pointF0.y, Math.max(pointF1.x, 0.0f), pointF1.y) : new LinearInterpolator();
        }
    }

    public static a b(b b0, r3.a a0, float f, F f1, boolean z, boolean z1) {
        BaseInterpolator baseInterpolator3;
        Object object6;
        BaseInterpolator baseInterpolator2;
        BaseInterpolator baseInterpolator1;
        Object object3;
        PointF pointF9;
        int v3;
        PointF pointF8;
        Object object2;
        LinearInterpolator linearInterpolator0 = q.a;
        e e0 = q.b;
        if(z && z1) {
            b0.b();
            PointF pointF0 = null;
            PointF pointF1 = null;
            PointF pointF2 = null;
            int v = 0;
            PointF pointF3 = null;
            PointF pointF4 = null;
            PointF pointF5 = null;
            Object object0 = null;
            PointF pointF6 = null;
            PointF pointF7 = null;
            float f2 = 0.0f;
            Object object1 = null;
            while(b0.hasNext()) {
                int v1 = b0.r(e0);
                e e1 = q.c;
                switch(v1) {
                    case 0: {
                        f2 = (float)b0.nextDouble();
                        e0 = e0;
                        linearInterpolator0 = linearInterpolator0;
                        pointF1 = pointF1;
                        continue;
                    }
                    case 1: {
                        object0 = f1.c(b0, f);
                        linearInterpolator0 = linearInterpolator0;
                        pointF1 = pointF1;
                        continue;
                    }
                    case 2: {
                        object1 = f1.c(b0, f);
                        linearInterpolator0 = linearInterpolator0;
                        pointF1 = pointF1;
                        continue;
                    }
                    case 3: {
                        if(b0.l() == 3) {
                            b0.b();
                            float f3 = 0.0f;
                            float f4 = 0.0f;
                            float f5 = 0.0f;
                            float f6 = 0.0f;
                            while(b0.hasNext()) {
                                switch(b0.r(e1)) {
                                    case 0: {
                                        object2 = object0;
                                        if(b0.l() == 7) {
                                            f5 = (float)b0.nextDouble();
                                            object0 = object2;
                                            f3 = f5;
                                            continue;
                                        }
                                        else {
                                            b0.a();
                                            f3 = (float)b0.nextDouble();
                                            f5 = b0.l() == 7 ? ((float)b0.nextDouble()) : f3;
                                            break;
                                        }
                                        goto label_58;
                                    }
                                    case 1: {
                                    label_58:
                                        if(b0.l() == 7) {
                                            f6 = (float)b0.nextDouble();
                                            object0 = object0;
                                            f4 = f6;
                                            continue;
                                        }
                                        else {
                                            object2 = object0;
                                            b0.a();
                                            f4 = (float)b0.nextDouble();
                                            f6 = b0.l() == 7 ? ((float)b0.nextDouble()) : f4;
                                        }
                                        break;
                                    }
                                    default: {
                                        b0.skipValue();
                                        continue;
                                    }
                                }
                                b0.f();
                                object0 = object2;
                            }
                            pointF5 = new PointF(f3, f4);
                            pointF6 = new PointF(f5, f6);
                            b0.h();
                        }
                        else {
                            pointF3 = p.b(b0, f);
                        }
                        v = v;
                        e0 = e0;
                        linearInterpolator0 = linearInterpolator0;
                        pointF2 = pointF2;
                        pointF1 = pointF1;
                        continue;
                    }
                    case 4: {
                        if(b0.l() == 3) {
                            b0.b();
                            float f7 = 0.0f;
                            float f8 = 0.0f;
                            float f9 = 0.0f;
                            float f10 = 0.0f;
                            while(b0.hasNext()) {
                                int v2 = b0.r(e1);
                                if(v2 == 0) {
                                label_107:
                                    pointF8 = pointF1;
                                    v3 = v;
                                    if(b0.l() == 7) {
                                        f7 = (float)b0.nextDouble();
                                        f9 = f7;
                                        goto label_117;
                                    }
                                    else {
                                        b0.a();
                                        f7 = (float)b0.nextDouble();
                                        f9 = b0.l() == 7 ? ((float)b0.nextDouble()) : f7;
                                    }
                                }
                                else {
                                    pointF8 = pointF1;
                                    if(v2 != 1) {
                                        b0.skipValue();
                                        goto label_118;
                                    }
                                    else if(b0.l() == 7) {
                                        f10 = (float)b0.nextDouble();
                                        f8 = f10;
                                        goto label_118;
                                    }
                                    else {
                                        b0.a();
                                        f8 = (float)b0.nextDouble();
                                        if(b0.l() == 7) {
                                            v3 = v;
                                            f10 = (float)b0.nextDouble();
                                        }
                                        else {
                                            v3 = v;
                                            f10 = f8;
                                        }
                                        goto label_116;
                                    }
                                    goto label_107;
                                }
                            label_116:
                                b0.f();
                            label_117:
                                v = v3;
                            label_118:
                                pointF2 = pointF2;
                                pointF1 = pointF8;
                            }
                            pointF9 = pointF1;
                            PointF pointF10 = new PointF(f7, f8);
                            PointF pointF11 = new PointF(f9, f10);
                            b0.h();
                            pointF0 = pointF11;
                            pointF7 = pointF10;
                        }
                        else {
                            pointF9 = pointF1;
                            pointF4 = p.b(b0, f);
                        }
                        e0 = e0;
                        linearInterpolator0 = linearInterpolator0;
                        pointF1 = pointF9;
                        continue;
                    }
                    case 5: {
                        v = b0.nextInt() == 1 ? 1 : 0;
                        break;
                    }
                    case 6: {
                        pointF1 = p.b(b0, f);
                        break;
                    }
                    case 7: {
                        pointF2 = p.b(b0, f);
                        break;
                    }
                    default: {
                        b0.skipValue();
                    }
                }
                linearInterpolator0 = linearInterpolator0;
            }
            BaseInterpolator baseInterpolator0 = linearInterpolator0;
            b0.h();
            if(v != 0) {
                object3 = object0;
                baseInterpolator1 = null;
                baseInterpolator2 = null;
            }
            else if(pointF3 != null && pointF4 != null) {
                baseInterpolator0 = q.a(pointF3, pointF4);
                object3 = object1;
                baseInterpolator1 = null;
                baseInterpolator2 = null;
            }
            else if(pointF5 == null || pointF6 == null || pointF7 == null || pointF0 == null) {
                object3 = object1;
                baseInterpolator1 = null;
                baseInterpolator2 = null;
            }
            else {
                baseInterpolator1 = q.a(pointF5, pointF7);
                baseInterpolator2 = q.a(pointF6, pointF0);
                object3 = object1;
                baseInterpolator0 = null;
            }
            a a1 = baseInterpolator1 == null || baseInterpolator2 == null ? new a(a0, object0, object3, baseInterpolator0, f2, null) : new a(a0, object0, object3, baseInterpolator1, baseInterpolator2, f2);
            a1.o = pointF1;
            a1.p = pointF2;
            return a1;
        }
        e e2 = e0;
        if(z) {
            b0.b();
            Object object4 = null;
            PointF pointF12 = null;
            boolean z2 = false;
            float f11 = 0.0f;
            PointF pointF13 = null;
            PointF pointF14 = null;
            PointF pointF15 = null;
            Object object5 = null;
            while(b0.hasNext()) {
                switch(b0.r(e2)) {
                    case 0: {
                        f11 = (float)b0.nextDouble();
                        break;
                    }
                    case 1: {
                        object4 = f1.c(b0, f);
                        break;
                    }
                    case 2: {
                        object5 = f1.c(b0, f);
                        break;
                    }
                    case 3: {
                        pointF13 = p.b(b0, 1.0f);
                        break;
                    }
                    case 4: {
                        pointF12 = p.b(b0, 1.0f);
                        break;
                    }
                    case 5: {
                        z2 = b0.nextInt() == 1;
                        break;
                    }
                    case 6: {
                        pointF14 = p.b(b0, f);
                        break;
                    }
                    case 7: {
                        pointF15 = p.b(b0, f);
                        break;
                    }
                    default: {
                        b0.skipValue();
                    }
                }
                e2 = e2;
            }
            b0.h();
            if(z2) {
                object6 = object4;
                baseInterpolator3 = linearInterpolator0;
            }
            else if(pointF13 == null || pointF12 == null) {
                object6 = object5;
                baseInterpolator3 = linearInterpolator0;
            }
            else {
                baseInterpolator3 = q.a(pointF13, pointF12);
                object6 = object5;
            }
            a a2 = new a(a0, object4, object6, baseInterpolator3, f11, null);
            a2.o = pointF14;
            a2.p = pointF15;
            return a2;
        }
        return new a(f1.c(b0, f));
    }
}

