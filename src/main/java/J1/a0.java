package J1;

import B.H0;
import B.c0;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.core.view.WindowInsetsCompat;
import e2.a;

public final class a0 extends d0 {
    public static final PathInterpolator d;
    public static final a e;
    public static final DecelerateInterpolator f;

    static {
        a0.d = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        a0.e = new a();
        a0.f = new DecelerateInterpolator();
    }

    public static void d(e0 e00, View view0) {
        c0 c00 = a0.i(view0);
        if(c00 != null) {
            c00.a(e00);
            if(c00.Y == 0) {
                return;
            }
        }
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                a0.d(e00, ((ViewGroup)view0).getChildAt(v));
            }
        }
    }

    public static void e(View view0, WindowInsets windowInsets0, boolean z) {
        c0 c00 = a0.i(view0);
        if(c00 != null) {
            c00.X = windowInsets0;
            if(!z) {
                z = true;
                c00.b0 = true;
                c00.c0 = true;
                if(c00.Y != 0) {
                    z = false;
                }
            }
        }
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                a0.e(((ViewGroup)view0).getChildAt(v), windowInsets0, z);
            }
        }
    }

    public static void f(View view0, WindowInsetsCompat windowInsetsCompat0) {
        c0 c00 = a0.i(view0);
        if(c00 != null) {
            H0.a(c00.Z, windowInsetsCompat0);
            if(c00.Z.r) {
                windowInsetsCompat0 = WindowInsetsCompat.b;
            }
            if(c00.Y == 0) {
                return;
            }
        }
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                a0.f(((ViewGroup)view0).getChildAt(v), windowInsetsCompat0);
            }
        }
    }

    public static void g(View view0) {
        c0 c00 = a0.i(view0);
        if(c00 != null) {
            c00.b0 = false;
            if(c00.Y == 0) {
                return;
            }
        }
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                a0.g(((ViewGroup)view0).getChildAt(v));
            }
        }
    }

    public static WindowInsets h(View view0, WindowInsets windowInsets0) {
        return view0.getTag(0x7F0A02E0) == null ? view0.onApplyWindowInsets(windowInsets0) : windowInsets0;  // id:tag_on_apply_window_listener
    }

    public static c0 i(View view0) {
        Object object0 = view0.getTag(0x7F0A02E8);  // id:tag_window_insets_animation_callback
        return object0 instanceof Z ? ((Z)object0).a : null;
    }
}

