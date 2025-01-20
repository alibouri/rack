package B6;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public abstract class c {
    public static final ThreadLocal a;
    public static final ThreadLocal b;

    static {
        c.a = new ThreadLocal();
        c.b = new ThreadLocal();
    }

    public static void a(ViewGroup viewGroup0, View view0, Matrix matrix0) {
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 instanceof View && viewParent0 != viewGroup0) {
            c.a(viewGroup0, ((View)viewParent0), matrix0);
            matrix0.preTranslate(((float)(-((View)viewParent0).getScrollX())), ((float)(-((View)viewParent0).getScrollY())));
        }
        matrix0.preTranslate(((float)view0.getLeft()), ((float)view0.getTop()));
        if(!view0.getMatrix().isIdentity()) {
            matrix0.preConcat(view0.getMatrix());
        }
    }
}

