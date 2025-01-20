package B2;

import Ab.h;
import J2.w;
import Nb.j;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import l5.a;
import l5.c;

public final class b implements Drawable.Callback {
    public final int X;
    public Object Y;

    public b() {
        this.X = 1;
        super();
    }

    public b(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    private final void a(Drawable drawable0) {
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void invalidateDrawable(Drawable drawable0) {
        switch(this.X) {
            case 0: {
                ((e)this.Y).invalidateSelf();
                return;
            label_4:
                j.f(drawable0, "d");
                a a0 = (a)this.Y;
                Integer integer0 = (int)(((Number)a0.e0.getValue()).intValue() + 1);
                a0.e0.setValue(integer0);
                m0.e e0 = new m0.e((a0.d0.getIntrinsicWidth() < 0 || a0.d0.getIntrinsicHeight() < 0 ? 0x7FC000007FC00000L : w.m(a0.d0.getIntrinsicWidth(), a0.d0.getIntrinsicHeight())));
                a0.f0.setValue(e0);
                break;
            }
            case 1: {
                break;
            }
            default: {
                goto label_4;
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
        switch(this.X) {
            case 0: {
                ((e)this.Y).scheduleSelf(runnable0, v);
                return;
            }
            case 1: {
                Drawable.Callback drawable$Callback0 = (Drawable.Callback)this.Y;
                if(drawable$Callback0 != null) {
                    drawable$Callback0.scheduleDrawable(drawable0, runnable0, v);
                }
                return;
            }
            default: {
                j.f(drawable0, "d");
                j.f(runnable0, "what");
                ((Handler)((h)c.a).getValue()).postAtTime(runnable0, v);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
        switch(this.X) {
            case 0: {
                ((e)this.Y).unscheduleSelf(runnable0);
                return;
            }
            case 1: {
                Drawable.Callback drawable$Callback0 = (Drawable.Callback)this.Y;
                if(drawable$Callback0 != null) {
                    drawable$Callback0.unscheduleDrawable(drawable0, runnable0);
                }
                return;
            }
            default: {
                j.f(drawable0, "d");
                j.f(runnable0, "what");
                ((Handler)((h)c.a).getValue()).removeCallbacks(runnable0);
            }
        }
    }
}

