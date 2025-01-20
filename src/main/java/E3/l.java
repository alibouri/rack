package E3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

public abstract class l {
    public static final Matrix a;
    public static final k b;
    public static final k c;
    public static final k d;
    public static final k e;
    public static final float f;

    static {
        l.a = new Matrix();
        l.b = new k(0);
        l.c = new k(1);
        l.d = new k(2);
        l.e = new k(3);
        l.f = (float)(Math.sqrt(2.0) / 2.0);
    }

    public static void a(Path path0, float f, float f1, float f2) {
        PathMeasure pathMeasure0 = (PathMeasure)l.b.get();
        Path path1 = (Path)l.c.get();
        Path path2 = (Path)l.d.get();
        pathMeasure0.setPath(path0, false);
        float f3 = pathMeasure0.getLength();
        if(Float.compare(f, 1.0f) == 0 && f1 == 0.0f) {
            return;
        }
        if(f3 >= 1.0f && ((double)Math.abs(f1 - f - 1.0f)) >= 0.01) {
            float f4 = f * f3;
            float f5 = f1 * f3;
            float f6 = f2 * f3;
            float f7 = Math.min(f4, f5) + f6;
            float f8 = Math.max(f4, f5) + f6;
            if(f7 < f3 && f8 < f3) {
                f7 = (float)g.d(f7, f3);
                f8 = (float)g.d(f8, f3);
            }
            if(f7 < 0.0f) {
                f7 = (float)g.d(f7, f3);
            }
            if(f8 < 0.0f) {
                f8 = (float)g.d(f8, f3);
            }
            int v = Float.compare(f7, f8);
            if(v == 0) {
                path0.reset();
                return;
            }
            if(v >= 0) {
                f7 -= f3;
            }
            path1.reset();
            pathMeasure0.getSegment(f7, f8, path1, true);
            if(f8 > f3) {
                path2.reset();
                pathMeasure0.getSegment(0.0f, f8 % f3, path2, true);
                path1.addPath(path2);
            }
            else if(f7 < 0.0f) {
                path2.reset();
                pathMeasure0.getSegment(f7 + f3, f3, path2, true);
                path1.addPath(path2);
            }
            path0.set(path1);
        }
    }

    public static void b(Closeable closeable0) {
        try {
            closeable0.close();
        }
        catch(RuntimeException runtimeException0) {
            throw runtimeException0;
        }
        catch(Exception unused_ex) {
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Bitmap d(Bitmap bitmap0, int v, int v1) {
        if(bitmap0.getWidth() == v && bitmap0.getHeight() == v1) {
            return bitmap0;
        }
        Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap0, v, v1, true);
        bitmap0.recycle();
        return bitmap1;
    }
}

