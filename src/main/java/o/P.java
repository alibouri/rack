package o;

import I3.n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import b4.A0;

public final class p {
    public v0 a;
    public static final PorterDuff.Mode b;
    public static p c;

    static {
        p.b = PorterDuff.Mode.SRC_IN;
    }

    public static p a() {
        synchronized(p.class) {
            if(p.c == null) {
                p.d();
            }
            return p.c;
        }
    }

    public final Drawable b(Context context0, int v) {
        synchronized(this) {
            return this.a.f(context0, v);
        }
    }

    public static PorterDuffColorFilter c(int v, PorterDuff.Mode porterDuff$Mode0) {
        synchronized(p.class) {
            return v0.h(v, porterDuff$Mode0);
        }
    }

    public static void d() {
        synchronized(p.class) {
            if(p.c == null) {
                p p0 = new p();  // initializer: Ljava/lang/Object;-><init>()V
                p.c = p0;
                p0.a = v0.d();
                p.c.a.m(new A0());
            }
        }
    }

    public static void e(Drawable drawable0, n n0, int[] arr_v) {
        int[] arr_v1 = drawable0.getState();
        if(drawable0.mutate() == drawable0) {
            if(drawable0 instanceof LayerDrawable && drawable0.isStateful()) {
                drawable0.setState(new int[0]);
                drawable0.setState(arr_v1);
            }
            ColorFilter colorFilter0 = null;
            boolean z = n0.Y;
            if(z || n0.X) {
                ColorStateList colorStateList0 = z ? ((ColorStateList)n0.Z) : null;
                PorterDuff.Mode porterDuff$Mode0 = n0.X ? ((PorterDuff.Mode)n0.b0) : v0.h;
                if(colorStateList0 != null && porterDuff$Mode0 != null) {
                    colorFilter0 = v0.h(colorStateList0.getColorForState(arr_v, 0), porterDuff$Mode0);
                }
                drawable0.setColorFilter(colorFilter0);
            }
            else {
                drawable0.clearColorFilter();
            }
            if(Build.VERSION.SDK_INT <= 23) {
                drawable0.invalidateSelf();
            }
        }
        else {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
        }
    }
}

