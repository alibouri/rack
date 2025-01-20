package R9;

import Fb.c;
import com.sendwave.backend.fragment.MerchantPaymentInfoFragment;

public final class d1 extends c {
    public k1 b0;
    public MerchantPaymentInfoFragment c0;
    public Object d0;
    public final k1 e0;
    public int f0;

    public d1(k1 k10, c c0) {
        this.e0 = k10;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.d0 = object0;
        this.f0 |= 0x80000000;
        return this.e0.o(this);
    }
}

