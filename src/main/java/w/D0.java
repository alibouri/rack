package w;

import Ab.t;
import Nb.k;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function0;
import m0.b;

public final class d0 extends k implements Function0 {
    public final int X;
    public final f0 Y;

    public d0(f0 f00, int v) {
        this.X = v;
        this.Y = f00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                LayoutCoordinates layoutCoordinates0 = (LayoutCoordinates)this.Y.y0.getValue();
                return layoutCoordinates0 == null ? new b(0x7FC000007FC00000L) : new b(layoutCoordinates0.F(0L));
            }
            case 1: {
                return new b(this.Y.A0);
            }
            default: {
                this.Y.z0();
                return t.a;
            }
        }
    }
}

