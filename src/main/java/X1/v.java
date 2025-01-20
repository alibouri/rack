package X1;

import Bb.F;
import Y1.a;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

public final class v extends ReplacementSpan {
    public final Paint.FontMetricsInt X;
    public final u Y;
    public short Z;
    public float b0;
    public TextPaint c0;

    public v(u u0) {
        this.X = new Paint.FontMetricsInt();
        this.Z = -1;
        this.b0 = 1.0f;
        F.n(u0, "rasterizer cannot be null");
        this.Y = u0;
    }

    @Override  // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas0, CharSequence charSequence0, int v, int v1, float f, int v2, int v3, int v4, Paint paint0) {
        Paint paint1 = paint0;
        TextPaint textPaint0 = null;
        if(charSequence0 instanceof Spanned) {
            CharacterStyle[] arr_characterStyle = (CharacterStyle[])((Spanned)charSequence0).getSpans(v, v1, CharacterStyle.class);
            if(arr_characterStyle.length != 0 && (arr_characterStyle.length != 1 || arr_characterStyle[0] != this)) {
                TextPaint textPaint1 = this.c0;
                if(textPaint1 == null) {
                    textPaint1 = new TextPaint();
                    this.c0 = textPaint1;
                }
                textPaint0 = textPaint1;
                textPaint0.set(paint1);
                for(int v5 = 0; v5 < arr_characterStyle.length; ++v5) {
                    arr_characterStyle[v5].updateDrawState(textPaint0);
                }
            }
            else if(paint1 instanceof TextPaint) {
                textPaint0 = (TextPaint)paint1;
            }
        }
        else if(paint1 instanceof TextPaint) {
            textPaint0 = (TextPaint)paint1;
        }
        if(textPaint0 != null && textPaint0.bgColor != 0) {
            float f1 = f + ((float)this.Z);
            int v6 = textPaint0.getColor();
            Paint.Style paint$Style0 = textPaint0.getStyle();
            textPaint0.setColor(textPaint0.bgColor);
            textPaint0.setStyle(Paint.Style.FILL);
            canvas0.drawRect(f, ((float)v2), f1, ((float)v4), textPaint0);
            textPaint0.setStyle(paint$Style0);
            textPaint0.setColor(v6);
        }
        h.a().getClass();
        if(textPaint0 != null) {
            paint1 = textPaint0;
        }
        Typeface typeface0 = (Typeface)this.Y.b.d;
        Typeface typeface1 = paint1.getTypeface();
        paint1.setTypeface(typeface0);
        canvas0.drawText(((char[])this.Y.b.b), this.Y.a * 2, 2, f, ((float)v3), paint1);
        paint1.setTypeface(typeface1);
    }

    @Override  // android.text.style.ReplacementSpan
    public final int getSize(Paint paint0, CharSequence charSequence0, int v, int v1, Paint.FontMetricsInt paint$FontMetricsInt0) {
        Paint.FontMetricsInt paint$FontMetricsInt1 = this.X;
        paint0.getFontMetricsInt(paint$FontMetricsInt1);
        float f = ((float)Math.abs(paint$FontMetricsInt1.descent - paint$FontMetricsInt1.ascent)) * 1.0f;
        u u0 = this.Y;
        a a0 = u0.c();
        int v2 = a0.a(14);
        int v3 = 0;
        this.b0 = f / ((float)(v2 == 0 ? 0 : ((ByteBuffer)a0.b0).getShort(v2 + a0.X)));
        a a1 = u0.c();
        int v4 = a1.a(14);
        if(v4 != 0) {
            ((ByteBuffer)a1.b0).getShort(v4 + a1.X);
        }
        a a2 = u0.c();
        int v5 = a2.a(12);
        if(v5 != 0) {
            v3 = ((ByteBuffer)a2.b0).getShort(v5 + a2.X);
        }
        short v6 = (short)(((int)(((float)v3) * this.b0)));
        this.Z = v6;
        if(paint$FontMetricsInt0 != null) {
            paint$FontMetricsInt0.ascent = paint$FontMetricsInt1.ascent;
            paint$FontMetricsInt0.descent = paint$FontMetricsInt1.descent;
            paint$FontMetricsInt0.top = paint$FontMetricsInt1.top;
            paint$FontMetricsInt0.bottom = paint$FontMetricsInt1.bottom;
        }
        return v6;
    }
}

