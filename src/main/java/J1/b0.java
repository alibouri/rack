package J1;

import B.H0;
import B.c0;
import android.os.Build.VERSION;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation.Bounds;
import android.view.WindowInsetsAnimation.Callback;
import android.view.WindowInsetsAnimation;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import z1.b;

public final class b0 extends WindowInsetsAnimation.Callback {
    public final c0 a;
    public ArrayList b;
    public final HashMap c;

    public b0(c0 c00) {
        super(c00.Y);
        this.c = new HashMap();
        this.a = c00;
    }

    public final e0 a(WindowInsetsAnimation windowInsetsAnimation0) {
        e0 e00 = (e0)this.c.get(windowInsetsAnimation0);
        if(e00 == null) {
            e00 = new e0(0, null, 0L);
            if(Build.VERSION.SDK_INT >= 30) {
                e00.a = new J1.c0(windowInsetsAnimation0);
            }
            this.c.put(windowInsetsAnimation0, e00);
        }
        return e00;
    }

    @Override  // android.view.WindowInsetsAnimation$Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation0) {
        e0 e00 = this.a(windowInsetsAnimation0);
        this.a.a(e00);
        this.c.remove(windowInsetsAnimation0);
    }

    @Override  // android.view.WindowInsetsAnimation$Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation0) {
        this.a(windowInsetsAnimation0);
        this.a.b0 = true;
        this.a.c0 = true;
    }

    @Override  // android.view.WindowInsetsAnimation$Callback
    public final WindowInsets onProgress(WindowInsets windowInsets0, List list0) {
        ArrayList arrayList0 = this.b;
        if(arrayList0 == null) {
            ArrayList arrayList1 = new ArrayList(list0.size());
            this.b = arrayList1;
            Collections.unmodifiableList(arrayList1);
        }
        else {
            arrayList0.clear();
        }
        for(int v = list0.size() - 1; v >= 0; --v) {
            WindowInsetsAnimation windowInsetsAnimation0 = s.i(list0.get(v));
            e0 e00 = this.a(windowInsetsAnimation0);
            float f = windowInsetsAnimation0.getFraction();
            e00.a.c(f);
            this.b.add(e00);
        }
        WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.g(null, windowInsets0);
        H0.a(this.a.Z, windowInsetsCompat0);
        if(this.a.Z.r) {
            windowInsetsCompat0 = WindowInsetsCompat.b;
        }
        return windowInsetsCompat0.f();
    }

    @Override  // android.view.WindowInsetsAnimation$Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation0, WindowInsetsAnimation.Bounds windowInsetsAnimation$Bounds0) {
        this.a(windowInsetsAnimation0);
        b b0 = b.c(windowInsetsAnimation$Bounds0.getLowerBound());
        b b1 = b.c(windowInsetsAnimation$Bounds0.getUpperBound());
        this.a.b0 = false;
        return s.g(b0.d(), b1.d());
    }
}

