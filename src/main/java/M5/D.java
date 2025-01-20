package m5;

import Nb.j;
import U.O0;
import U.l;
import U.p;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e1.r;
import n0.M;

public abstract class d {
    public static final long a;
    public static final c b;

    static {
        d.a = M.b(0.0f, 0.0f, 0.0f, 0.3f, o0.d.c);
        d.b = c.X;
    }

    public static final a a(p p0) {
        p0.R(0xD5569573);
        p0.R(1009281237);
        O0 o00 = AndroidCompositionLocals_androidKt.f;
        ViewParent viewParent0 = ((View)p0.k(o00)).getParent();
        Window window0 = null;
        r r0 = viewParent0 instanceof r ? ((r)viewParent0) : null;
        Window window1 = r0 == null ? null : r0.a();
        if(window1 == null) {
            Context context0 = ((View)p0.k(o00)).getContext();
            j.e(context0, "getContext(...)");
            while(true) {
                if(context0 instanceof Activity) {
                    window0 = ((Activity)context0).getWindow();
                    break;
                }
                if(!(context0 instanceof ContextWrapper)) {
                    break;
                }
                context0 = ((ContextWrapper)context0).getBaseContext();
                j.e(context0, "getBaseContext(...)");
            }
            window1 = window0;
        }
        p0.p(false);
        View view0 = (View)p0.k(AndroidCompositionLocals_androidKt.f);
        p0.R(0xC1B8D0F5);
        boolean z = p0.f(view0);
        boolean z1 = p0.f(window1);
        Object object0 = p0.G();
        if((z | z1) != 0 || object0 == l.a) {
            object0 = new a(view0, window1);
            p0.a0(object0);
        }
        p0.p(false);
        p0.p(false);
        return (a)object0;
    }
}

