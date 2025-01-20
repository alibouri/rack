package R9;

import Nb.j;
import com.wave.customer.QrScanOrCardActivity;
import com.wave.customer.home.PersonalHomeActivity;
import kotlin.jvm.functions.Function0;
import q9.k3;
import q9.o0;

public final class e2 implements Function0 {
    public final int X;
    public final k3 Y;

    public e2(k3 k30, int v) {
        this.X = v;
        this.Y = k30;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        k3 k30 = this.Y;
        if(this.X != 0) {
            Object object0 = o0.u(((PersonalHomeActivity)k30).getApplicationContext());
            j.e(object0, "getID(...)");
            return object0;
        }
        return Z0.a(((QrScanOrCardActivity)k30)).a();
    }
}

