package n0;

import android.os.Build.VERSION;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.platform.AndroidComposeView;
import q0.g;
import q0.i;
import r0.a;
import r0.b;

public final class f implements GraphicsContext {
    public final AndroidComposeView a;
    public final Object b;
    public b c;
    public static boolean d = true;

    public f(AndroidComposeView androidComposeView0) {
        this.a = androidComposeView0;
        this.b = new Object();
    }

    @Override  // androidx.compose.ui.graphics.GraphicsContext
    public final q0.b a() {
        g g0;
        synchronized(this.b) {
            AndroidComposeView androidComposeView0 = this.a;
            int v1 = Build.VERSION.SDK_INT;
            if(v1 >= 29) {
                e.a(androidComposeView0);
            }
            if(v1 >= 29) {
                g0 = new g();
            }
            else if(f.d) {
                try {
                    CanvasHolder canvasHolder0 = new CanvasHolder();
                    p0.b b0 = new p0.b();
                    g0 = new q0.e(this.a, canvasHolder0, b0);
                }
                catch(Throwable unused_ex) {
                    f.d = false;
                    g0 = new i(this.c(this.a));
                }
            }
            else {
                g0 = new i(this.c(this.a));
            }
            return new q0.b(g0);
        }
    }

    @Override  // androidx.compose.ui.graphics.GraphicsContext
    public final void b(q0.b b0) {
        synchronized(this.b) {
            if(!b0.r) {
                b0.r = true;
                b0.b();
            }
        }
    }

    public final a c(AndroidComposeView androidComposeView0) {
        a a0 = this.c;
        if(a0 == null) {
            b b0 = new b(androidComposeView0.getContext());  // initializer: Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V
            b0.setClipChildren(false);
            b0.setClipToPadding(false);
            b0.setTag(0x7F0A016F, Boolean.TRUE);  // id:hide_graphics_layer_in_inspector_tag
            androidComposeView0.addView(b0, -1);
            this.c = b0;
            return b0;
        }
        return a0;
    }
}

