package v9;

import Ab.t;
import G0.e0;
import Nb.j;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;

public final class c implements Function1 {
    public final int X;
    public final e0 Y;

    public c(e0 e00, int v) {
        this.X = v;
        this.Y = e00;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            j.f(((Context)object0), "it");
            return this.Y;
        }
        e0 e00 = this.Y;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = e00.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        viewGroup$LayoutParams0.width = (int)(((IntSize)object0).a >> 0x20);
        viewGroup$LayoutParams0.height = (int)(((IntSize)object0).a & 0xFFFFFFFFL);
        e00.setLayoutParams(viewGroup$LayoutParams0);
        return t.a;
    }
}

