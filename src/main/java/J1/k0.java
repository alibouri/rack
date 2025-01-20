package J1;

import T4.l;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import z1.b;

public abstract class k0 extends p0 {
    public final WindowInsets c;
    public b[] d;
    public b e;
    public WindowInsetsCompat f;
    public b g;
    public static boolean h = false;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;

    public k0(WindowInsetsCompat windowInsetsCompat0, WindowInsets windowInsets0) {
        super(windowInsetsCompat0);
        this.e = null;
        this.c = windowInsets0;
    }

    @Override  // J1.p0
    public void d(View view0) {
        b b0 = this.w(view0);
        if(b0 == null) {
            b0 = b.e;
        }
        this.z(b0);
    }

    @Override  // J1.p0
    public boolean equals(Object object0) {
        return super.equals(object0) ? Objects.equals(this.g, ((k0)object0).g) : false;
    }

    @Override  // J1.p0
    public b f(int v) {
        return this.t(v, false);
    }

    @Override  // J1.p0
    public b g(int v) {
        return this.t(v, true);
    }

    @Override  // J1.p0
    public final b k() {
        if(this.e == null) {
            this.e = b.b(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override  // J1.p0
    public WindowInsetsCompat m(int v, int v1, int v2, int v3) {
        h0 h00;
        WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.g(null, this.c);
        int v4 = Build.VERSION.SDK_INT;
        if(v4 >= 30) {
            h00 = new i0(windowInsetsCompat0);
        }
        else if(v4 >= 29) {
            h00 = new h0(windowInsetsCompat0);
        }
        else {
            h00 = new f0(windowInsetsCompat0);
        }
        h00.g(WindowInsetsCompat.e(this.k(), v, v1, v2, v3));
        h00.e(WindowInsetsCompat.e(this.i(), v, v1, v2, v3));
        return h00.b();
    }

    @Override  // J1.p0
    public boolean o() {
        return this.c.isRound();
    }

    @Override  // J1.p0
    @SuppressLint({"WrongConstant"})
    public boolean p(int v) {
        for(int v1 = 1; v1 <= 0x100; v1 <<= 1) {
            if((v & v1) != 0 && !this.x(v1)) {
                return false;
            }
        }
        return true;
    }

    @Override  // J1.p0
    public void q(b[] arr_b) {
        this.d = arr_b;
    }

    @Override  // J1.p0
    public void r(WindowInsetsCompat windowInsetsCompat0) {
        this.f = windowInsetsCompat0;
    }

    @SuppressLint({"WrongConstant"})
    private b t(int v, boolean z) {
        b b0 = b.e;
        for(int v1 = 1; v1 <= 0x100; v1 <<= 1) {
            if((v & v1) != 0) {
                b0 = b.a(b0, this.u(v1, z));
            }
        }
        return b0;
    }

    public b u(int v, boolean z) {
        b b0 = null;
        int v1 = 0;
        switch(v) {
            case 1: {
                if(z) {
                    b b4 = this.v();
                    b b5 = this.k();
                    return b.b(0, Math.max(b4.b, b5.b), 0, 0);
                }
                return b.b(0, this.k().b, 0, 0);
            }
            case 2: {
                if(z) {
                    b b6 = this.v();
                    b b7 = this.i();
                    return b.b(Math.max(b6.a, b7.a), 0, Math.max(b6.c, b7.c), Math.max(b6.d, b7.d));
                }
                b b8 = this.k();
                WindowInsetsCompat windowInsetsCompat1 = this.f;
                if(windowInsetsCompat1 != null) {
                    b0 = windowInsetsCompat1.a.i();
                }
                return b.b(b8.a, 0, b8.c, (b0 == null ? b8.d : Math.min(b8.d, b0.d)));
            }
            default: {
                b b1 = b.e;
                switch(v) {
                    case 8: {
                        b[] arr_b = this.d;
                        if(arr_b != null) {
                            b0 = arr_b[l.N(8)];
                        }
                        if(b0 != null) {
                            return b0;
                        }
                        b b2 = this.k();
                        b b3 = this.v();
                        int v6 = b2.d;
                        if(v6 > b3.d) {
                            return b.b(0, 0, 0, v6);
                        }
                        if(this.g != null && !this.g.equals(b1)) {
                            int v7 = this.g.d;
                            return v7 <= b3.d ? b1 : b.b(0, 0, 0, v7);
                        }
                        return b1;
                    }
                    case 16: {
                        return this.j();
                    }
                    case 0x20: {
                        return this.h();
                    }
                    case 0x40: {
                        return this.l();
                    }
                    case 0x80: {
                        WindowInsetsCompat windowInsetsCompat0 = this.f;
                        h h0 = windowInsetsCompat0 == null ? this.e() : windowInsetsCompat0.a.e();
                        if(h0 != null) {
                            int v2 = Build.VERSION.SDK_INT;
                            int v3 = v2 < 28 ? 0 : A1.b.j(h0.a);
                            int v4 = v2 < 28 ? 0 : A1.b.l(h0.a);
                            int v5 = v2 < 28 ? 0 : A1.b.k(h0.a);
                            if(v2 >= 28) {
                                v1 = A1.b.i(h0.a);
                            }
                            return b.b(v3, v4, v5, v1);
                        }
                        return b1;
                    }
                    default: {
                        return b1;
                    }
                }
            }
        }
    }

    private b v() {
        return this.f == null ? b.e : this.f.a.i();
    }

    private b w(View view0) {
        if(Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if(!k0.h) {
            k0.y();
        }
        Method method0 = k0.i;
        if(method0 != null && k0.j != null && k0.k != null) {
            try {
                Object object0 = method0.invoke(view0, null);
                if(object0 == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Object object1 = k0.l.get(object0);
                Rect rect0 = (Rect)k0.k.get(object1);
                return rect0 == null ? null : b.b(rect0.left, rect0.top, rect0.right, rect0.bottom);
            }
            catch(ReflectiveOperationException reflectiveOperationException0) {
            }
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + reflectiveOperationException0.getMessage(), reflectiveOperationException0);
        }
        return null;
    }

    public boolean x(int v) {
        switch(v) {
            case 4: {
                return false;
            }
            case 1: 
            case 2: 
            case 8: 
            case 0x80: {
                return !this.u(v, false).equals(b.e);
            }
            default: {
                return true;
            }
        }
    }

    @SuppressLint({"PrivateApi"})
    private static void y() {
        try {
            k0.i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class class0 = Class.forName("android.view.View$AttachInfo");
            k0.j = class0;
            k0.k = class0.getDeclaredField("mVisibleInsets");
            k0.l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            k0.k.setAccessible(true);
            k0.l.setAccessible(true);
        }
        catch(ReflectiveOperationException reflectiveOperationException0) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + reflectiveOperationException0.getMessage(), reflectiveOperationException0);
        }
        k0.h = true;
    }

    public void z(b b0) {
        this.g = b0;
    }
}

