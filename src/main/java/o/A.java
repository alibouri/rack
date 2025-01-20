package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

public final class a extends Drawable {
    public final ActionBarContainer a;

    public a(ActionBarContainer actionBarContainer0) {
        this.a = actionBarContainer0;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas0) {
        ActionBarContainer actionBarContainer0 = this.a;
        if(actionBarContainer0.i0) {
            Drawable drawable0 = actionBarContainer0.h0;
            if(drawable0 != null) {
                drawable0.draw(canvas0);
            }
        }
        else {
            Drawable drawable1 = actionBarContainer0.f0;
            if(drawable1 != null) {
                drawable1.draw(canvas0);
            }
            Drawable drawable2 = actionBarContainer0.g0;
            if(drawable2 != null && actionBarContainer0.j0) {
                drawable2.draw(canvas0);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline0) {
        ActionBarContainer actionBarContainer0 = this.a;
        if(!actionBarContainer0.i0) {
            Drawable drawable0 = actionBarContainer0.f0;
            if(drawable0 != null) {
                drawable0.getOutline(outline0);
            }
        }
        else if(actionBarContainer0.h0 != null) {
            actionBarContainer0.f0.getOutline(outline0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAlpha(int v) {
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter0) {
    }
}

