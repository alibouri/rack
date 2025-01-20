package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

public final class w extends SeekBar {
    public final x b0;

    public w(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0x7F040381);  // attr:seekBarStyle
        B0.a(this, this.getContext());
        x x0 = new x(this);
        this.b0 = x0;
        x0.b(attributeSet0, 0x7F040381);  // attr:seekBarStyle
    }

    @Override  // android.widget.AbsSeekBar
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x x0 = this.b0;
        Drawable drawable0 = x0.f;
        if(drawable0 != null && drawable0.isStateful()) {
            w w0 = x0.e;
            if(drawable0.setState(w0.getDrawableState())) {
                w0.invalidateDrawable(drawable0);
            }
        }
    }

    @Override  // android.widget.AbsSeekBar
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable0 = this.b0.f;
        if(drawable0 != null) {
            drawable0.jumpToCurrentState();
        }
    }

    @Override  // android.widget.AbsSeekBar
    public final void onDraw(Canvas canvas0) {
        synchronized(this) {
            super.onDraw(canvas0);
            this.b0.g(canvas0);
        }
    }
}

