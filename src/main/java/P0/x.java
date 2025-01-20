package P0;

import Nb.j;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas.EdgeType;
import android.graphics.Canvas.VertexMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

public final class x extends Canvas {
    public Canvas a;

    @Override  // android.graphics.Canvas
    public final boolean clipOutPath(Path path0) {
        g g0 = g.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return g0.a(canvas0, path0);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean clipOutRect(float f, float f1, float f2, float f3) {
        g g0 = g.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return g0.b(canvas0, f, f1, f2, f3);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean clipOutRect(int v, int v1, int v2, int v3) {
        g g0 = g.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return g0.c(canvas0, v, v1, v2, v3);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect0) {
        g g0 = g.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return g0.d(canvas0, rect0);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF0) {
        g g0 = g.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return g0.e(canvas0, rectF0);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean clipPath(Path path0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.clipPath(path0);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean clipPath(Path path0, Region.Op region$Op0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.clipPath(path0, region$Op0);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean clipRect(float f, float f1, float f2, float f3) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.clipRect(f, f1, f2, f3);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean clipRect(float f, float f1, float f2, float f3, Region.Op region$Op0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.clipRect(f, f1, f2, f3, region$Op0);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean clipRect(int v, int v1, int v2, int v3) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.clipRect(v, v1, v2, v3);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean clipRect(Rect rect0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.clipRect(rect0);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean clipRect(Rect rect0, Region.Op region$Op0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.clipRect(rect0, region$Op0);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean clipRect(RectF rectF0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.clipRect(rectF0);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean clipRect(RectF rectF0, Region.Op region$Op0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.clipRect(rectF0, region$Op0);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void concat(Matrix matrix0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.concat(matrix0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void disableZ() {
        h h0 = h.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            h0.a(canvas0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawARGB(int v, int v1, int v2, int v3) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawARGB(v, v1, v2, v3);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawArc(float f, float f1, float f2, float f3, float f4, float f5, boolean z, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawArc(f, f1, f2, f3, f4, f5, z, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawArc(RectF rectF0, float f, float f1, boolean z, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawArc(rectF0, f, f1, z, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap0, float f, float f1, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawBitmap(bitmap0, f, f1, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap0, Matrix matrix0, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawBitmap(bitmap0, matrix0, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap0, Rect rect0, Rect rect1, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawBitmap(bitmap0, rect0, rect1, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap0, Rect rect0, RectF rectF0, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawBitmap(bitmap0, rect0, rectF0, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawBitmap(int[] arr_v, int v, int v1, float f, float f1, int v2, int v3, boolean z, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawBitmap(arr_v, v, v1, f, f1, v2, v3, z, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawBitmap(int[] arr_v, int v, int v1, int v2, int v3, int v4, int v5, boolean z, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawBitmap(arr_v, v, v1, v2, v3, v4, v5, z, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap0, int v, int v1, float[] arr_f, int v2, int[] arr_v, int v3, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawBitmapMesh(bitmap0, v, v1, arr_f, v2, arr_v, v3, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawCircle(float f, float f1, float f2, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawCircle(f, f1, f2, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawColor(int v) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawColor(v);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawColor(int v, BlendMode blendMode0) {
        h h0 = h.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            h0.b(canvas0, v, blendMode0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawColor(int v, PorterDuff.Mode porterDuff$Mode0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawColor(v, porterDuff$Mode0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawColor(long v) {
        h h0 = h.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            h0.c(canvas0, v);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawColor(long v, BlendMode blendMode0) {
        h h0 = h.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            h0.d(canvas0, v, blendMode0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF0, float f, float f1, RectF rectF1, float f2, float f3, Paint paint0) {
        h h0 = h.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            h0.e(canvas0, rectF0, f, f1, rectF1, f2, f3, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF0, float[] arr_f, RectF rectF1, float[] arr_f1, Paint paint0) {
        h h0 = h.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            h0.f(canvas0, rectF0, arr_f, rectF1, arr_f1, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawGlyphs(int[] arr_v, int v, float[] arr_f, int v1, int v2, Font font0, Paint paint0) {
        P0.j j0 = P0.j.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            j0.a(canvas0, arr_v, v, arr_f, v1, v2, font0, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawLine(float f, float f1, float f2, float f3, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawLine(f, f1, f2, f3, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawLines(float[] arr_f, int v, int v1, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawLines(arr_f, v, v1, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawLines(float[] arr_f, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawLines(arr_f, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawOval(float f, float f1, float f2, float f3, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawOval(f, f1, f2, f3, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawOval(RectF rectF0, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawOval(rectF0, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawPaint(Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawPaint(paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch0, Rect rect0, Paint paint0) {
        P0.j j0 = P0.j.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            j0.b(canvas0, ninePatch0, rect0, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch0, RectF rectF0, Paint paint0) {
        P0.j j0 = P0.j.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            j0.c(canvas0, ninePatch0, rectF0, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawPath(Path path0, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawPath(path0, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawPicture(Picture picture0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawPicture(picture0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawPicture(Picture picture0, Rect rect0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawPicture(picture0, rect0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawPicture(Picture picture0, RectF rectF0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawPicture(picture0, rectF0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawPoint(float f, float f1, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawPoint(f, f1, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawPoints(float[] arr_f, int v, int v1, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawPoints(arr_f, v, v1, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawPoints(float[] arr_f, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawPoints(arr_f, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawPosText(String s, float[] arr_f, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawPosText(s, arr_f, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawPosText(char[] arr_c, int v, int v1, float[] arr_f, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawPosText(arr_c, v, v1, arr_f, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawRGB(int v, int v1, int v2) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawRGB(v, v1, v2);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawRect(float f, float f1, float f2, float f3, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawRect(f, f1, f2, f3, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawRect(Rect rect0, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawRect(rect0, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawRect(RectF rectF0, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawRect(rectF0, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode0) {
        h h0 = h.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            h0.g(canvas0, renderNode0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawRoundRect(float f, float f1, float f2, float f3, float f4, float f5, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawRoundRect(f, f1, f2, f3, f4, f5, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF0, float f, float f1, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawRoundRect(rectF0, f, f1, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawText(CharSequence charSequence0, int v, int v1, float f, float f1, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawText(charSequence0, v, v1, f, f1, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawText(String s, float f, float f1, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawText(s, f, f1, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawText(String s, int v, int v1, float f, float f1, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawText(s, v, v1, f, f1, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawText(char[] arr_c, int v, int v1, float f, float f1, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawText(arr_c, v, v1, f, f1, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawTextOnPath(String s, Path path0, float f, float f1, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawTextOnPath(s, path0, f, f1, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawTextOnPath(char[] arr_c, int v, int v1, Path path0, float f, float f1, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawTextOnPath(arr_c, v, v1, path0, f, f1, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText0, int v, int v1, int v2, int v3, float f, float f1, boolean z, Paint paint0) {
        h h0 = h.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            h0.h(canvas0, measuredText0, v, v1, v2, v3, f, f1, z, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence0, int v, int v1, int v2, int v3, float f, float f1, boolean z, Paint paint0) {
        e e0 = e.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            e0.a(canvas0, charSequence0, v, v1, v2, v3, f, f1, z, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawTextRun(char[] arr_c, int v, int v1, int v2, int v3, float f, float f1, boolean z, Paint paint0) {
        e e0 = e.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            e0.b(canvas0, arr_c, v, v1, v2, v3, f, f1, z, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode canvas$VertexMode0, int v, float[] arr_f, int v1, float[] arr_f1, int v2, int[] arr_v, int v3, short[] arr_v1, int v4, int v5, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.drawVertices(canvas$VertexMode0, v, arr_f, v1, arr_f1, v2, arr_v, v3, arr_v1, v4, v5, paint0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void enableZ() {
        h h0 = h.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            h0.i(canvas0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            boolean z = canvas0.getClipBounds(rect0);
            if(z) {
                rect0.set(0, 0, rect0.width(), 0x7FFFFFFF);
            }
            return z;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.getDensity();
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.getDrawFilter();
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.getHeight();
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void getMatrix(Matrix matrix0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.getMatrix(matrix0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.getMaximumBitmapHeight();
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.getMaximumBitmapWidth();
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.getSaveCount();
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.getWidth();
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.isOpaque();
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean quickReject(float f, float f1, float f2, float f3) {
        i i0 = i.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return i0.a(canvas0, f, f1, f2, f3);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean quickReject(float f, float f1, float f2, float f3, Canvas.EdgeType canvas$EdgeType0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.quickReject(f, f1, f2, f3, canvas$EdgeType0);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean quickReject(Path path0) {
        i i0 = i.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return i0.b(canvas0, path0);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean quickReject(Path path0, Canvas.EdgeType canvas$EdgeType0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.quickReject(path0, canvas$EdgeType0);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean quickReject(RectF rectF0) {
        i i0 = i.a;
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return i0.c(canvas0, rectF0);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final boolean quickReject(RectF rectF0, Canvas.EdgeType canvas$EdgeType0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.quickReject(rectF0, canvas$EdgeType0);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void restore() {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.restore();
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void restoreToCount(int v) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.restoreToCount(v);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void rotate(float f) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.rotate(f);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final int save() {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.save();
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final int saveLayer(float f, float f1, float f2, float f3, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.saveLayer(f, f1, f2, f3, paint0);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final int saveLayer(float f, float f1, float f2, float f3, Paint paint0, int v) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.saveLayer(f, f1, f2, f3, paint0, v);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final int saveLayer(RectF rectF0, Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.saveLayer(rectF0, paint0);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final int saveLayer(RectF rectF0, Paint paint0, int v) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.saveLayer(rectF0, paint0, v);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f1, float f2, float f3, int v) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.saveLayerAlpha(f, f1, f2, f3, v);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f1, float f2, float f3, int v, int v1) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.saveLayerAlpha(f, f1, f2, f3, v, v1);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF0, int v) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.saveLayerAlpha(rectF0, v);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF0, int v, int v1) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            return canvas0.saveLayerAlpha(rectF0, v, v1);
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void scale(float f, float f1) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.scale(f, f1);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.setBitmap(bitmap0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void setDensity(int v) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.setDensity(v);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.setDrawFilter(drawFilter0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void setMatrix(Matrix matrix0) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.setMatrix(matrix0);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void skew(float f, float f1) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.skew(f, f1);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }

    @Override  // android.graphics.Canvas
    public final void translate(float f, float f1) {
        Canvas canvas0 = this.a;
        if(canvas0 != null) {
            canvas0.translate(f, f1);
            return;
        }
        j.p("nativeCanvas");
        throw null;
    }
}

