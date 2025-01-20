package R9;

import Ab.t;
import Fb.j;
import W5.f;
import Xb.G;
import android.view.View;
import com.wave.customer.BuyAirtimeDialogActivity;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import o9.n;

public final class e extends j implements Function2 {
    public final BuyAirtimeDialogActivity c0;
    public final n d0;

    public e(BuyAirtimeDialogActivity buyAirtimeDialogActivity0, n n0, g g0) {
        this.c0 = buyAirtimeDialogActivity0;
        this.d0 = n0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((e)this.t(((G)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new e(this.c0, this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        View view0 = this.c0.findViewById(this.d0.c0);
        if(view0 != null) {
            view0.requestFocus();
        }
        return t.a;
    }
}

