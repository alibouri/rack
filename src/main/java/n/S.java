package n;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;

public class s {
    public final Context a;
    public final j b;
    public final boolean c;
    public final int d;
    public View e;
    public int f;
    public boolean g;
    public t h;
    public q i;
    public PopupWindow.OnDismissListener j;
    public final r k;

    public s(int v, Context context0, View view0, j j0, boolean z) {
        this.f = 0x800003;
        this.k = new r(0, this);
        this.a = context0;
        this.b = j0;
        this.e = view0;
        this.c = z;
        this.d = v;
    }

    public final q a() {
        if(this.i == null) {
            Context context0 = this.a;
            Display display0 = ((WindowManager)context0.getSystemService("window")).getDefaultDisplay();
            Point point0 = new Point();
            display0.getRealSize(point0);
            e e0 = Math.min(point0.x, point0.y) >= context0.getResources().getDimensionPixelSize(0x7F070016) ? new e(context0, this.e, this.d, this.c) : new z(this.d, this.a, this.e, this.b, this.c);  // dimen:abc_cascading_menus_min_smallest_width
            e0.l(this.b);
            e0.r(this.k);
            e0.n(this.e);
            e0.j(this.h);
            e0.o(this.g);
            e0.p(this.f);
            this.i = e0;
        }
        return this.i;
    }

    public final boolean b() {
        return this.i != null && this.i.e();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener popupWindow$OnDismissListener0 = this.j;
        if(popupWindow$OnDismissListener0 != null) {
            popupWindow$OnDismissListener0.onDismiss();
        }
    }

    public final void d(int v, int v1, boolean z, boolean z1) {
        q q0 = this.a();
        q0.s(z1);
        if(z) {
            if((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                v -= this.e.getWidth();
            }
            q0.q(v);
            q0.t(v1);
            int v2 = (int)(this.a.getResources().getDisplayMetrics().density * 48.0f / 2.0f);
            q0.X = new Rect(v - v2, v1 - v2, v + v2, v1 + v2);
        }
        q0.a();
    }
}

