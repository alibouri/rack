package R0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class f extends MetricAffectingSpan {
    public final float X;

    public f(float f) {
        this.X = f;
    }

    @Override  // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint0) {
        float f = textPaint0.getTextSize();
        float f1 = textPaint0.getTextScaleX() * f;
        if(f1 != 0.0f) {
            textPaint0.setLetterSpacing(this.X / f1);
        }
    }

    @Override  // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint0) {
        float f = textPaint0.getTextSize();
        float f1 = textPaint0.getTextScaleX() * f;
        if(f1 != 0.0f) {
            textPaint0.setLetterSpacing(this.X / f1);
        }
    }
}

