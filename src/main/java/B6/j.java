package B6;

import android.content.Context;
import android.text.TextPaint;
import com.google.android.material.resources.TextAppearance;
import java.lang.ref.WeakReference;

public final class j {
    public final TextPaint a;
    public final h b;
    public float c;
    public boolean d;
    public final WeakReference e;
    public TextAppearance f;

    public j(i i0) {
        this.a = new TextPaint(1);
        this.b = new h(0, this);
        this.d = true;
        this.e = new WeakReference(null);
        this.e = new WeakReference(i0);
    }

    public final float a(String s) {
        if(!this.d) {
            return this.c;
        }
        float f = s == null ? 0.0f : this.a.measureText(s, 0, s.length());
        this.c = f;
        this.d = false;
        return f;
    }

    public final void b(TextAppearance textAppearance0, Context context0) {
        if(this.f != textAppearance0) {
            this.f = textAppearance0;
            if(textAppearance0 != null) {
                TextPaint textPaint0 = this.a;
                h h0 = this.b;
                textAppearance0.f(context0, textPaint0, h0);
                i i0 = (i)this.e.get();
                if(i0 != null) {
                    textPaint0.drawableState = i0.getState();
                }
                textAppearance0.e(context0, textPaint0, h0);
                this.d = true;
            }
            i i1 = (i)this.e.get();
            if(i1 != null) {
                i1.a();
                i1.onStateChange(i1.getState());
            }
        }
    }
}

