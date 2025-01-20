package ha;

import Fb.c;
import com.wave.customer.CustomerAppAction.ShowDeal;

public final class a2 extends c {
    public ShowDeal b0;
    public Object c0;
    public final S2 d0;
    public int e0;

    public a2(S2 s20, c c0) {
        this.d0 = s20;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return S2.u(this.d0, null, this);
    }
}

