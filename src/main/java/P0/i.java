package P0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

public final class i {
    public static final i a;

    static {
        i.a = new i();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final boolean a(Canvas canvas0, float f, float f1, float f2, float f3) {
        return canvas0.quickReject(f, f1, f2, f3);
    }

    public final boolean b(Canvas canvas0, Path path0) {
        return canvas0.quickReject(path0);
    }

    public final boolean c(Canvas canvas0, RectF rectF0) {
        return canvas0.quickReject(rectF0);
    }
}

