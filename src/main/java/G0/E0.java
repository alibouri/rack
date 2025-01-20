package G0;

import B.o;
import U.Z;
import U.d;
import U.l0;
import U.p;
import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AbstractComposeView;
import kotlin.jvm.functions.Function2;

public final class e0 extends AbstractComposeView {
    public final ParcelableSnapshotMutableState j0;
    public boolean k0;

    public e0(Context context0) {
        super(context0, null, 0);
        this.j0 = d.D(null, Z.e);
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final void b(int v, p p0) {
        p0.S(0x190BF45A);
        if((((v & 6) == 0 ? (p0.h(this) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            Function2 function20 = (Function2)this.j0.getValue();
            if(function20 == null) {
                p0.Q(358373017);
            }
            else {
                p0.Q(150107752);
                function20.j(p0, 0);
            }
            p0.p(false);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new o(v, 3, this);
        }
    }

    @Override  // android.view.ViewGroup
    public CharSequence getAccessibilityClassName() {
        return e0.class.getName();
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.k0;
    }

    public static void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    public final void setContent(Function2 function20) {
        this.k0 = true;
        this.j0.setValue(function20);
        if(this.isAttachedToWindow()) {
            this.d();
        }
    }
}

