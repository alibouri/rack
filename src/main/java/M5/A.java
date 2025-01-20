package m5;

import Nb.j;
import U7.c;
import android.view.View;
import android.view.Window;
import kotlin.jvm.functions.Function1;
import n0.M;
import n0.v;

public final class a {
    public final Window a;
    public final c b;

    public a(View view0, Window window0) {
        j.f(view0, "view");
        super();
        this.a = window0;
        this.b = window0 == null ? null : new c(view0, window0);
    }

    public final void a(long v, boolean z, Function1 function10) {
        j.f(function10, "transformColorForLightContent");
        c c0 = this.b;
        if(c0 != null) {
            ((U5.a)c0.Y).S(z);
        }
        Window window0 = this.a;
        if(window0 != null) {
            if(z && (c0 == null || !((U5.a)c0.Y).F())) {
                v = ((v)function10.n(new v(v))).a;
            }
            window0.setStatusBarColor(M.G(v));
        }
    }
}

