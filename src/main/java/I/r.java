package i;

import J1.C;
import Q4.i;
import R2.c;
import android.view.View;
import android.widget.PopupWindow;

public final class r extends i {
    public final int a;
    public final Object b;

    public r(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // J1.W
    public final void a() {
        Object object0 = this.b;
        switch(this.a) {
            case 0: {
                ((p)object0).Y.t0.setAlpha(1.0f);
                ((p)object0).Y.w0.d(null);
                ((p)object0).Y.w0 = null;
                return;
            }
            case 1: {
                ((B)object0).t0.setAlpha(1.0f);
                ((B)object0).w0.d(null);
                ((B)object0).w0 = null;
                return;
            }
            default: {
                ((B)((c)object0).Z).t0.setVisibility(8);
                B b0 = (B)((c)object0).Z;
                PopupWindow popupWindow0 = b0.u0;
                if(popupWindow0 != null) {
                    popupWindow0.dismiss();
                }
                else if(b0.t0.getParent() instanceof View) {
                    C.c(((View)b0.t0.getParent()));
                }
                b0.t0.e();
                b0.w0.d(null);
                b0.w0 = null;
                C.c(b0.y0);
            }
        }
    }

    @Override  // Q4.i
    public void c() {
        Object object0 = this.b;
        switch(this.a) {
            case 0: {
                ((p)object0).Y.t0.setVisibility(0);
                return;
            }
            case 1: {
                ((B)object0).t0.setVisibility(0);
                if(((B)object0).t0.getParent() instanceof View) {
                    C.c(((View)((B)object0).t0.getParent()));
                }
            }
        }
    }
}

