package e1;

import B.o;
import U.Z;
import U.d;
import U.l0;
import android.content.Context;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AbstractComposeView;
import kotlin.jvm.functions.Function2;

public final class p extends AbstractComposeView implements r {
    public final Window j0;
    public final ParcelableSnapshotMutableState k0;
    public boolean l0;
    public boolean m0;

    public p(Context context0, Window window0) {
        super(context0);
        this.j0 = window0;
        this.k0 = d.D(n.a, Z.e);
    }

    @Override  // e1.r
    public final Window a() {
        return this.j0;
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final void b(int v, U.p p0) {
        p0.S(0x6770D814);
        if((((v & 6) == 0 ? (p0.h(this) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            ((Function2)this.k0.getValue()).j(p0, 0);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new o(v, 7, this);
        }
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final void g(boolean z, int v, int v1, int v2, int v3) {
        super.g(z, v, v1, v2, v3);
        if(!this.l0) {
            View view0 = this.getChildAt(0);
            if(view0 == null) {
                return;
            }
            int v4 = view0.getMeasuredWidth();
            int v5 = view0.getMeasuredHeight();
            this.j0.setLayout(v4, v5);
        }
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.m0;
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final void h(int v, int v1) {
        if(this.l0) {
            super.h(v, v1);
            return;
        }
        float f = this.getContext().getResources().getDisplayMetrics().density;
        int v2 = View.MeasureSpec.makeMeasureSpec(Math.round(((float)this.getContext().getResources().getConfiguration().screenWidthDp) * f), 0x80000000);
        float f1 = this.getContext().getResources().getDisplayMetrics().density;
        super.h(v2, View.MeasureSpec.makeMeasureSpec(Math.round(((float)this.getContext().getResources().getConfiguration().screenHeightDp) * f1), 0x80000000));
    }
}

