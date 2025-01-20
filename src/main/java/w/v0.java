package w;

import Pb.a;
import android.view.View;
import android.widget.Magnifier.Builder;
import android.widget.Magnifier;
import androidx.compose.ui.unit.Density;
import m0.e;

public final class v0 implements r0 {
    public static final v0 a;

    static {
        v0.a = new v0();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // w.r0
    public final q0 a(View view0, boolean z, long v, float f, float f1, boolean z1, Density density0, float f2) {
        if(z) {
            return new u0(new Magnifier(view0));  // initializer: Lw/s0;-><init>(Landroid/widget/Magnifier;)V
        }
        long v1 = density0.P(v);
        float f3 = density0.w(f);
        float f4 = density0.w(f1);
        Magnifier.Builder magnifier$Builder0 = new Magnifier.Builder(view0);
        if(v1 != 0x7FC000007FC00000L) {
            magnifier$Builder0.setSize(a.H(e.d(v1)), a.H(e.b(v1)));
        }
        if(!Float.isNaN(f3)) {
            magnifier$Builder0.setCornerRadius(f3);
        }
        if(!Float.isNaN(f4)) {
            magnifier$Builder0.setElevation(f4);
        }
        if(!Float.isNaN(f2)) {
            magnifier$Builder0.setInitialZoom(f2);
        }
        magnifier$Builder0.setClippingEnabled(z1);
        return new u0(magnifier$Builder0.build());  // initializer: Lw/s0;-><init>(Landroid/widget/Magnifier;)V
    }

    @Override  // w.r0
    public final boolean b() {
        return true;
    }
}

