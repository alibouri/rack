package c;

import Nb.j;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import q9.k3;

public abstract class q {
    public static final int a;
    public static final int b;

    static {
        q.a = Color.argb(230, 0xFF, 0xFF, 0xFF);
        q.b = Color.argb(0x80, 27, 27, 27);
    }

    public static void a(k3 k30) {
        s s0;
        P p0 = new P(0, 0, O.Y);
        P p1 = new P(q.a, q.b, O.Y);
        View view0 = k30.getWindow().getDecorView();
        j.e(view0, "window.decorView");
        Resources resources0 = view0.getResources();
        j.e(resources0, "view.resources");
        boolean z = ((Boolean)O.Y.n(resources0)).booleanValue();
        Resources resources1 = view0.getResources();
        j.e(resources1, "view.resources");
        boolean z1 = ((Boolean)O.Y.n(resources1)).booleanValue();
        int v = Build.VERSION.SDK_INT;
        if(v >= 30) {
            s0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
        }
        else if(v >= 29) {
            s0 = new u();  // initializer: Ljava/lang/Object;-><init>()V
        }
        else if(v >= 28) {
            s0 = new t();  // initializer: Ljava/lang/Object;-><init>()V
        }
        else if(v >= 26) {
            s0 = new s();  // initializer: Ljava/lang/Object;-><init>()V
        }
        else {
            s0 = new r();  // initializer: Ljava/lang/Object;-><init>()V
        }
        Window window0 = k30.getWindow();
        j.e(window0, "window");
        s0.z(p0, p1, window0, view0, z, z1);
        Window window1 = k30.getWindow();
        j.e(window1, "window");
        s0.h(window1);
    }
}

