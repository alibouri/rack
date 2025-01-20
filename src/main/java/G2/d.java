package g2;

import androidx.lifecycle.ViewModel;
import s.K;

public class d extends ViewModel {
    public final K Y;
    public boolean Z;
    public static final c b0;

    static {
        d.b0 = new c();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public d() {
        this.Y = new K(0);
        this.Z = false;
    }

    @Override  // androidx.lifecycle.ViewModel
    public final void n() {
        K k0 = this.Y;
        int v = k0.Z;
        for(int v1 = 0; v1 < v; ++v1) {
            a a0 = (a)k0.Y[v1];
            I5.c c0 = a0.l;
            c0.a();
            c0.c = true;
            b b0 = a0.n;
            if(b0 != null) {
                a0.i(b0);
            }
            a a1 = c0.a;
            if(a1 == null) {
                throw new IllegalStateException("No listener register");
            }
            if(a1 != a0) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            c0.a = null;
            c0.d = true;
            c0.b = false;
            c0.c = false;
            c0.e = false;
        }
        int v2 = k0.Z;
        Object[] arr_object = k0.Y;
        for(int v3 = 0; v3 < v2; ++v3) {
            arr_object[v3] = null;
        }
        k0.Z = 0;
    }
}

