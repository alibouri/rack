package P0;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;

public final class j {
    public static final j a;

    static {
        j.a = new j();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final void a(Canvas canvas0, int[] arr_v, int v, float[] arr_f, int v1, int v2, Font font0, Paint paint0) {
        canvas0.drawGlyphs(arr_v, v, arr_f, v1, v2, font0, paint0);
    }

    public final void b(Canvas canvas0, NinePatch ninePatch0, Rect rect0, Paint paint0) {
        canvas0.drawPatch(ninePatch0, rect0, paint0);
    }

    public final void c(Canvas canvas0, NinePatch ninePatch0, RectF rectF0, Paint paint0) {
        canvas0.drawPatch(ninePatch0, rectF0, paint0);
    }
}

