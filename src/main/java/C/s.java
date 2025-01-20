package c;

import I5.h;
import J1.r0;
import J1.s0;
import J1.u0;
import J1.v0;
import Nb.j;
import R2.f;
import a.a;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;

public class s extends a {
    @Override  // a.a
    public void z(P p0, P p1, Window window0, View view0, boolean z, boolean z1) {
        u0 u00;
        j.f(p0, "statusBarStyle");
        j.f(p1, "navigationBarStyle");
        j.f(window0, "window");
        j.f(view0, "view");
        f.z(window0, false);
        window0.setStatusBarColor((z ? p0.b : p0.a));
        window0.setNavigationBarColor((z1 ? p1.b : p1.a));
        h h0 = new h(view0);
        int v = Build.VERSION.SDK_INT;
        if(v >= 35) {
            u00 = new v0(window0, h0);  // initializer: LJ1/u0;-><init>(Landroid/view/Window;LI5/h;)V
        }
        else if(v >= 30) {
            u00 = new u0(window0, h0);
        }
        else if(v >= 26) {
            u00 = new s0(window0, h0);  // initializer: LJ1/r0;-><init>(Landroid/view/Window;LI5/h;)V
        }
        else {
            u00 = new r0(window0, h0);
        }
        u00.S(!z);
        u00.R(!z1);
    }
}

