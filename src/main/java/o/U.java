package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

public final class u extends RatingBar {
    public final s b0;

    public u(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0x7F040362);  // attr:ratingBarStyle
        B0.a(this, this.getContext());
        s s0 = new s(this);
        this.b0 = s0;
        s0.b(attributeSet0, 0x7F040362);  // attr:ratingBarStyle
    }

    @Override  // android.widget.RatingBar
    public final void onMeasure(int v, int v1) {
        synchronized(this) {
            super.onMeasure(v, v1);
            Bitmap bitmap0 = (Bitmap)this.b0.c;
            if(bitmap0 != null) {
                this.setMeasuredDimension(View.resolveSizeAndState(bitmap0.getWidth() * this.getNumStars(), v, 0), this.getMeasuredHeight());
            }
        }
    }
}

