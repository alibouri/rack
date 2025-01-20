package C3;

import D3.b;
import R2.e;
import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import v.h;

public abstract class p {
    public static final e a;

    static {
        p.a = e.l(new String[]{"x", "y"});
    }

    public static int a(b b0) {
        b0.a();
        double f = b0.nextDouble();
        double f1 = b0.nextDouble();
        double f2 = b0.nextDouble();
        while(b0.hasNext()) {
            b0.skipValue();
        }
        b0.f();
        return Color.argb(0xFF, ((int)(f * 255.0)), ((int)(f1 * 255.0)), ((int)(f2 * 255.0)));
    }

    public static PointF b(b b0, float f) {
        int v = h.d(b0.l());
        switch(v) {
            case 0: {
                b0.a();
                float f3 = (float)b0.nextDouble();
                float f4 = (float)b0.nextDouble();
                while(b0.l() != 2) {
                    b0.skipValue();
                }
                b0.f();
                return new PointF(f3 * f, f4 * f);
            }
            case 2: {
                b0.b();
                float f5 = 0.0f;
                float f6 = 0.0f;
                while(b0.hasNext()) {
                    switch(b0.r(p.a)) {
                        case 0: {
                            f5 = p.d(b0);
                            break;
                        }
                        case 1: {
                            f6 = p.d(b0);
                            break;
                        }
                        default: {
                            b0.v();
                            b0.skipValue();
                        }
                    }
                }
                b0.h();
                return new PointF(f5 * f, f6 * f);
            }
            default: {
                if(v != 6) {
                    throw new IllegalArgumentException("Unknown point starts with " + A3.e.y(b0.l()));
                }
                float f1 = (float)b0.nextDouble();
                float f2 = (float)b0.nextDouble();
                while(b0.hasNext()) {
                    b0.skipValue();
                }
                return new PointF(f1 * f, f2 * f);
            }
        }
    }

    public static ArrayList c(b b0, float f) {
        ArrayList arrayList0 = new ArrayList();
        b0.a();
        while(b0.l() == 1) {
            b0.a();
            arrayList0.add(p.b(b0, f));
            b0.f();
        }
        b0.f();
        return arrayList0;
    }

    public static float d(b b0) {
        int v = b0.l();
        switch(h.d(v)) {
            case 0: {
                b0.a();
                float f = (float)b0.nextDouble();
                while(b0.hasNext()) {
                    b0.skipValue();
                }
                b0.f();
                return f;
            }
            case 6: {
                return (float)b0.nextDouble();
            }
            default: {
                throw new IllegalArgumentException("Unknown value for token of type " + A3.e.y(v));
            }
        }
    }
}

