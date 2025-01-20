package J1;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import z1.b;

public final class f0 extends j0 {
    public WindowInsets c;
    public b d;
    public static Field e = null;
    public static boolean f = false;
    public static Constructor g = null;
    public static boolean h = false;

    public f0() {
        this.c = f0.i();
    }

    public f0(WindowInsetsCompat windowInsetsCompat0) {
        super(windowInsetsCompat0);
        this.c = windowInsetsCompat0.f();
    }

    @Override  // J1.j0
    public WindowInsetsCompat b() {
        this.a();
        WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.g(null, this.c);
        windowInsetsCompat0.a.q(this.b);
        windowInsetsCompat0.a.s(this.d);
        return windowInsetsCompat0;
    }

    @Override  // J1.j0
    public void e(b b0) {
        this.d = b0;
    }

    @Override  // J1.j0
    public void g(b b0) {
        WindowInsets windowInsets0 = this.c;
        if(windowInsets0 != null) {
            this.c = windowInsets0.replaceSystemWindowInsets(b0.a, b0.b, b0.c, b0.d);
        }
    }

    private static WindowInsets i() {
        Class class0 = WindowInsets.class;
        if(!f0.f) {
            try {
                f0.e = class0.getDeclaredField("CONSUMED");
            }
            catch(ReflectiveOperationException reflectiveOperationException0) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", reflectiveOperationException0);
            }
            f0.f = true;
        }
        Field field0 = f0.e;
        if(field0 != null) {
            try {
                WindowInsets windowInsets0 = (WindowInsets)field0.get(null);
                if(windowInsets0 != null) {
                    return new WindowInsets(windowInsets0);
                }
            }
            catch(ReflectiveOperationException reflectiveOperationException1) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", reflectiveOperationException1);
            }
        }
        if(!f0.h) {
            try {
                f0.g = class0.getConstructor(Rect.class);
            }
            catch(ReflectiveOperationException reflectiveOperationException2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", reflectiveOperationException2);
            }
            f0.h = true;
        }
        Constructor constructor0 = f0.g;
        if(constructor0 != null) {
            try {
                return (WindowInsets)constructor0.newInstance(new Rect());
            }
            catch(ReflectiveOperationException reflectiveOperationException3) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", reflectiveOperationException3);
            }
        }
        return null;
    }
}

