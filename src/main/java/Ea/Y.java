package Ea;

import Ab.k;
import Ab.t;
import Bb.F;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.R9;
import android.net.Uri;
import com.wave.customer.scratchCardRewards.ScratchCardTermsAndConditions;
import com.wave.customer.scratchCardRewards.g;
import java.util.Map;
import kotlin.jvm.functions.Function2;

public final class y extends j implements Function2 {
    public Uri c0;
    public int d0;
    public final g e0;
    public final ScratchCardTermsAndConditions f0;

    public y(g g0, ScratchCardTermsAndConditions scratchCardTermsAndConditions0, kotlin.coroutines.g g1) {
        this.e0 = g0;
        this.f0 = scratchCardTermsAndConditions0;
        super(2, g1);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((y)this.t(((R9)object0), ((kotlin.coroutines.g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        return new y(this.e0, this.f0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Uri uri1;
        Object object1 = a.X;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                Map map0 = F.J(new k("version", this.f0.X));
                this.e0.b0.d("Scratch card terms clicked", map0);
                Uri uri0 = Uri.parse(this.f0.Y);
                this.c0 = uri0;
                this.d0 = 1;
                object0 = this.e0.c0.e(this);
                if(object0 == object1) {
                    return object1;
                }
                uri1 = uri0;
                break;
            }
            case 1: {
                uri1 = this.c0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Nb.j.c(uri1);
        ((d)object0).o(uri1);
        return t.a;
    }
}

