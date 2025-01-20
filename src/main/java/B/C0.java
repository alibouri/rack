package B;

import J1.e0;
import J1.o;
import J1.p0;
import android.os.Build.VERSION;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;

public final class c0 implements o, View.OnAttachStateChangeListener, Runnable {
    public WindowInsets X;
    public final int Y;
    public final H0 Z;
    public boolean b0;
    public boolean c0;
    public WindowInsetsCompat d0;

    public c0(H0 h00) {
        this.Y = !h00.r;
        this.Z = h00;
    }

    public final void a(e0 e00) {
        this.b0 = false;
        this.c0 = false;
        WindowInsetsCompat windowInsetsCompat0 = this.d0;
        if(e00.a.a() != 0L && windowInsetsCompat0 != null) {
            this.Z.getClass();
            g0 g00 = e.l(windowInsetsCompat0.a.f(8));
            this.Z.q.f(g00);
            g0 g01 = e.l(windowInsetsCompat0.a.f(8));
            this.Z.p.f(g01);
            H0.a(this.Z, windowInsetsCompat0);
        }
        this.d0 = null;
    }

    @Override  // J1.o
    public final WindowInsetsCompat l(View view0, WindowInsetsCompat windowInsetsCompat0) {
        this.d0 = windowInsetsCompat0;
        H0 h00 = this.Z;
        h00.getClass();
        p0 p00 = windowInsetsCompat0.a;
        g0 g00 = e.l(p00.f(8));
        h00.p.f(g00);
        if(this.b0) {
            if(Build.VERSION.SDK_INT == 30) {
                view0.post(this);
                return h00.r ? WindowInsetsCompat.b : windowInsetsCompat0;
            }
        }
        else if(!this.c0) {
            g0 g01 = e.l(p00.f(8));
            h00.q.f(g01);
            H0.a(h00, windowInsetsCompat0);
        }
        return h00.r ? WindowInsetsCompat.b : windowInsetsCompat0;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        view0.requestApplyInsets();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
    }

    @Override
    public final void run() {
        if(this.b0) {
            this.b0 = false;
            this.c0 = false;
            WindowInsetsCompat windowInsetsCompat0 = this.d0;
            if(windowInsetsCompat0 != null) {
                this.Z.getClass();
                g0 g00 = e.l(windowInsetsCompat0.a.f(8));
                this.Z.q.f(g00);
                H0.a(this.Z, windowInsetsCompat0);
                this.d0 = null;
            }
        }
    }
}

