package ra;

import Ab.t;
import B.C;
import J2.w;
import M6.b;
import Nb.j;
import U.p;
import android.support.v4.media.session.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

public final class o implements Function3 {
    public final String X;
    public final Function0 Y;
    public final Modifier Z;
    public final boolean b0;

    public o(String s, Function0 function00, Modifier modifier0, boolean z) {
        this.X = s;
        this.Y = function00;
        this.Z = modifier0;
        this.b0 = z;
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        j.f(((C)object0), "$this$ActivateCardSurface");
        if((v & 17) == 16 && ((p)object1).x()) {
            ((p)object1).K();
            return t.a;
        }
        a.d(w.S(0x7F120079, ((p)object1)), w.S(0x7F12007A, ((p)object1)), this.X, null, ((p)object1), 0, 8);  // string:by_activating_card_you_agree_to_toc "By activating Virtual Visa, I agree 
                                                                                                              // to the Wave Terms and Conditions."
        Modifier modifier0 = c.d(this.Z, 1.0f);
        b.j(this.Y, modifier0, this.b0, false, g.e, ((p)object1), 0x6000, 8);
        return t.a;
    }
}

