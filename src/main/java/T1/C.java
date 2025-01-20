package t1;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public abstract class c {
    public static final ThreadLocal a;
    public static final ThreadLocal b;

    static {
        c.a = new ThreadLocal();
        c.b = new ThreadLocal();
    }

    public static void a(CoordinatorLayout coordinatorLayout0, View view0, Matrix matrix0) {
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 instanceof View && viewParent0 != coordinatorLayout0) {
            c.a(coordinatorLayout0, ((View)viewParent0), matrix0);
            matrix0.preTranslate(((float)(-((View)viewParent0).getScrollX())), ((float)(-((View)viewParent0).getScrollY())));
        }
        matrix0.preTranslate(((float)view0.getLeft()), ((float)view0.getTop()));
        if(!view0.getMatrix().isIdentity()) {
            matrix0.preConcat(view0.getMatrix());
        }
    }
}

