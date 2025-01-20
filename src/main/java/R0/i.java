package R0;

import Nb.j;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

public final class i extends ReplacementSpan {
    public Paint.FontMetricsInt X;
    public int Y;
    public int Z;
    public boolean b0;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt paint$FontMetricsInt0 = this.X;
        if(paint$FontMetricsInt0 != null) {
            return paint$FontMetricsInt0;
        }
        j.p("fontMetrics");
        throw null;
    }

    public final int b() {
        if(!this.b0) {
            throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
        }
        return this.Z;
    }

    @Override  // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas0, CharSequence charSequence0, int v, int v1, float f, int v2, int v3, int v4, Paint paint0) {
    }

    @Override  // android.text.style.ReplacementSpan
    public final int getSize(Paint paint0, CharSequence charSequence0, int v, int v1, Paint.FontMetricsInt paint$FontMetricsInt0) {
        this.b0 = true;
        paint0.getTextSize();
        this.X = paint0.getFontMetricsInt();
        if(this.a().descent <= this.a().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        this.Y = (int)(((float)Math.ceil(0.0)));
        this.Z = (int)(((float)Math.ceil(0.0)));
        if(paint$FontMetricsInt0 != null) {
            paint$FontMetricsInt0.ascent = this.a().ascent;
            paint$FontMetricsInt0.descent = this.a().descent;
            paint$FontMetricsInt0.leading = this.a().leading;
            if(paint$FontMetricsInt0.ascent > -this.b()) {
                paint$FontMetricsInt0.ascent = -this.b();
            }
            paint$FontMetricsInt0.top = Math.min(this.a().top, paint$FontMetricsInt0.ascent);
            paint$FontMetricsInt0.bottom = Math.max(this.a().bottom, paint$FontMetricsInt0.descent);
        }
        if(!this.b0) {
            throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
        }
        return this.Y;
    }
}

