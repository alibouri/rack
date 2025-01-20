package n;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import o.D;
import o.s0;

public final class c implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int X;
    public final Object Y;

    public c(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch(this.X) {
            case 0: {
                e e0 = (e)this.Y;
                if(e0.e()) {
                    ArrayList arrayList0 = e0.f0;
                    if(arrayList0.size() > 0 && !((d)arrayList0.get(0)).a.v0) {
                        if(e0.m0 != null && e0.m0.isShown()) {
                            for(Object object0: arrayList0) {
                                ((d)object0).a.a();
                            }
                            return;
                        }
                        e0.dismiss();
                    }
                }
                return;
            }
            case 1: {
                z z0 = (z)this.Y;
                if(z0.e()) {
                    s0 s00 = z0.f0;
                    if(!s00.v0) {
                        if(z0.k0 != null && z0.k0.isShown()) {
                            s00.a();
                            return;
                        }
                        z0.dismiss();
                    }
                }
                return;
            }
            case 2: {
                androidx.appcompat.widget.c c0 = (androidx.appcompat.widget.c)this.Y;
                if(!c0.getInternalPopup().e()) {
                    int v = c0.getTextDirection();
                    int v1 = c0.getTextAlignment();
                    c0.g0.m(v, v1);
                }
                ViewTreeObserver viewTreeObserver0 = c0.getViewTreeObserver();
                if(viewTreeObserver0 != null) {
                    viewTreeObserver0.removeOnGlobalLayoutListener(this);
                }
                return;
            }
            default: {
                D d0 = (D)this.Y;
                d0.getClass();
                if(d0.E0.isAttachedToWindow() && d0.E0.getGlobalVisibleRect(d0.C0)) {
                    d0.r();
                    d0.a();
                    return;
                }
                d0.dismiss();
            }
        }
    }
}

