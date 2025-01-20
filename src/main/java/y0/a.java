package Y0;

import Nb.j;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import n0.k;
import p0.e;
import p0.g;
import p0.h;

public final class a extends CharacterStyle implements UpdateAppearance {
    public final e X;

    public a(e e0) {
        this.X = e0;
    }

    @Override  // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint0) {
        Paint.Cap paint$Cap0;
        Paint.Join paint$Join0;
        if(textPaint0 != null) {
            e e0 = this.X;
            if(j.a(e0, g.a)) {
                textPaint0.setStyle(Paint.Style.FILL);
                return;
            }
            if(e0 instanceof h) {
                textPaint0.setStyle(Paint.Style.STROKE);
                textPaint0.setStrokeWidth(((h)e0).a);
                textPaint0.setStrokeMiter(((h)e0).b);
                int v = ((h)e0).d;
                if(v == 0) {
                    paint$Join0 = Paint.Join.MITER;
                }
                else {
                    switch(v) {
                        case 1: {
                            paint$Join0 = Paint.Join.ROUND;
                            break;
                        }
                        case 2: {
                            paint$Join0 = Paint.Join.BEVEL;
                            break;
                        }
                        default: {
                            paint$Join0 = Paint.Join.MITER;
                        }
                    }
                }
                textPaint0.setStrokeJoin(paint$Join0);
                int v1 = ((h)e0).c;
                if(v1 == 0) {
                    paint$Cap0 = Paint.Cap.BUTT;
                }
                else {
                    switch(v1) {
                        case 1: {
                            paint$Cap0 = Paint.Cap.ROUND;
                            break;
                        }
                        case 2: {
                            paint$Cap0 = Paint.Cap.SQUARE;
                            break;
                        }
                        default: {
                            paint$Cap0 = Paint.Cap.BUTT;
                        }
                    }
                }
                textPaint0.setStrokeCap(paint$Cap0);
                k k0 = ((h)e0).e;
                textPaint0.setPathEffect((k0 == null ? null : k0.a));
            }
        }
    }
}

