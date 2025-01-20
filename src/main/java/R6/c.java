package r6;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View.MeasureSpec;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.appbar.AppBarLayout.BaseBehavior;
import com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior;
import com.google.android.material.appbar.AppBarLayout;
import hb.h;

public abstract class c extends d {
    public final Rect c;
    public final Rect d;
    public int e;
    public int f;

    public c() {
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }

    public c(int v) {
        super(0);
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final boolean i(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2) {
        int v3 = view0.getLayoutParams().height;
        if(v3 == -2 || v3 == -1) {
            AppBarLayout appBarLayout0 = ScrollingViewBehavior.v(coordinatorLayout0.j(view0));
            if(appBarLayout0 != null) {
                int v4 = View.MeasureSpec.getSize(v2);
                if(v4 <= 0) {
                    v4 = coordinatorLayout0.getHeight();
                }
                else if(appBarLayout0.getFitsSystemWindows()) {
                    WindowInsetsCompat windowInsetsCompat0 = coordinatorLayout0.getLastWindowInsets();
                    if(windowInsetsCompat0 != null) {
                        int v5 = windowInsetsCompat0.d();
                        v4 += windowInsetsCompat0.a() + v5;
                    }
                }
                coordinatorLayout0.r(view0, v, v1, View.MeasureSpec.makeMeasureSpec(appBarLayout0.getTotalScrollRange() + v4 - appBarLayout0.getMeasuredHeight(), (v3 == -1 ? 0x40000000 : 0x80000000)));
                return true;
            }
        }
        return false;
    }

    @Override  // r6.d
    public final void t(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        AppBarLayout appBarLayout0 = ScrollingViewBehavior.v(coordinatorLayout0.j(view0));
        if(appBarLayout0 != null) {
            androidx.coordinatorlayout.widget.c c0 = (androidx.coordinatorlayout.widget.c)view0.getLayoutParams();
            int v1 = coordinatorLayout0.getPaddingLeft() + c0.leftMargin;
            int v2 = appBarLayout0.getBottom() + c0.topMargin;
            int v3 = coordinatorLayout0.getWidth() - coordinatorLayout0.getPaddingRight() - c0.rightMargin;
            int v4 = coordinatorLayout0.getHeight();
            int v5 = appBarLayout0.getBottom();
            int v6 = coordinatorLayout0.getPaddingBottom();
            Rect rect0 = this.c;
            rect0.set(v1, v2, v3, v5 + v4 - v6 - c0.bottomMargin);
            WindowInsetsCompat windowInsetsCompat0 = coordinatorLayout0.getLastWindowInsets();
            if(windowInsetsCompat0 != null && coordinatorLayout0.getFitsSystemWindows() && !view0.getFitsSystemWindows()) {
                int v7 = rect0.left;
                rect0.left = windowInsetsCompat0.b() + v7;
                rect0.right -= windowInsetsCompat0.c();
            }
            Gravity.apply((c0.c == 0 ? 0x800033 : c0.c), view0.getMeasuredWidth(), view0.getMeasuredHeight(), rect0, this.d, v);
            int v8 = this.u(appBarLayout0);
            view0.layout(this.d.left, this.d.top - v8, this.d.right, this.d.bottom - v8);
            this.e = this.d.top - appBarLayout0.getBottom();
            return;
        }
        coordinatorLayout0.q(view0, v);
        this.e = 0;
    }

    public final int u(View view0) {
        float f = 0.0f;
        if(this.f != 0) {
            if(view0 instanceof AppBarLayout) {
                int v = ((AppBarLayout)view0).getTotalScrollRange();
                int v1 = ((AppBarLayout)view0).getDownNestedPreScrollRange();
                Behavior coordinatorLayout$Behavior0 = ((androidx.coordinatorlayout.widget.c)((AppBarLayout)view0).getLayoutParams()).a;
                int v2 = coordinatorLayout$Behavior0 instanceof BaseBehavior ? ((BaseBehavior)coordinatorLayout$Behavior0).u() : 0;
                if(v1 == 0 || v + v2 > v1) {
                    int v3 = v - v1;
                    if(v3 != 0) {
                        f = ((float)v2) / ((float)v3) + 1.0f;
                    }
                }
            }
            return h.F(((int)(f * ((float)this.f))), 0, this.f);
        }
        return 0;
    }
}

