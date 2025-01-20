package com.wave.components.sendmoney;

import Ab.k;
import Ab.t;
import Eb.a;
import Fb.j;
import K9.K0;
import W5.f;
import Y8.R9;
import com.sendwave.models.CurrencyAmount;
import com.wave.models.ProposedTransfer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import o9.N1;
import q9.M0;

public final class c extends j implements Function2 {
    public Map c0;
    public ProposedTransfer d0;
    public int e0;
    public final d f0;

    public c(d d0, g g0) {
        this.f0 = d0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((c)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new c(this.f0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        d d0;
        Object object2;
        Object object1;
        try {
            object1 = a.X;
            object2 = t.a;
            d0 = this.f0;
            switch(this.e0) {
                case 0: {
                    goto label_5;
                }
                case 1: {
                    goto label_19;
                }
                case 2: {
                    goto label_29;
                }
                case 3: {
                    goto label_39;
                }
                case 4: {
                    goto label_53;
                }
                case 5: {
                    goto label_56;
                }
                case 6: {
                    goto label_65;
                }
            }
        }
        catch(N1 unused_ex) {
            return object2;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_5:
        f.b0(object0);
        Map map0 = new LinkedHashMap();
        CurrencyAmount currencyAmount0 = ((K0)d0.y0.getValue()).f;
        if(currencyAmount0 != null) {
            map0.put("overdraft_used", M0.a(currencyAmount0));
        }
        d0.c0.d("send money clicked", map0);
        ProposedTransfer proposedTransfer0 = (ProposedTransfer)d0.z0.a(d.F0[5], d0);
        if(proposedTransfer0 == null) {
            return object2;
        }
        try {
            this.c0 = map0;
            this.d0 = proposedTransfer0;
            this.e0 = 1;
            if(d.o(d0, proposedTransfer0, ((LinkedHashMap)map0), this) == object1) {
                return object1;
            label_19:
                proposedTransfer0 = this.d0;
                map0 = this.c0;
                f.b0(object0);
            }
        }
        catch(N1 unused_ex) {
            return object2;
        }
        if(((K0)d0.y0.getValue()).j != null) {
            this.c0 = map0;
            this.d0 = proposedTransfer0;
            this.e0 = 2;
            object0 = d0.i0.e(this);
            if(object0 == object1) {
                return object1;
            label_29:
                proposedTransfer0 = this.d0;
                map0 = this.c0;
                f.b0(object0);
            }
            k k0 = ((K0)d0.y0.getValue()).j;
            this.c0 = map0;
            this.d0 = proposedTransfer0;
            this.e0 = 3;
            object0 = Pb.a.N(((V8.d)object0), 0x7F0D0036, null, k0, this, 2);  // layout:confirm_p2p_overdraft_transfer_bottom_sheet
            if(object0 == object1) {
                return object1;
            label_39:
                proposedTransfer0 = this.d0;
                map0 = this.c0;
                f.b0(object0);
            }
            if(((Integer)object0) == null || ((int)(((Integer)object0))) != -1) {
                return object2;
            }
            d0.c0.d("confirm send with overdraft", map0);
        }
        d0.getClass();
        try {
            this.c0 = map0;
            this.d0 = null;
            this.e0 = 5;
            if(d0.q(proposedTransfer0, null, this) == object1) {
                return object1;
            }
        }
        catch(N1 unused_ex) {
            return object2;
        }
        Map map1 = map0;
        goto label_58;
    label_53:
        map1 = this.c0;
        f.b0(object0);
        goto label_58;
        try {
        label_56:
            map1 = this.c0;
            f.b0(object0);
        }
        catch(N1 unused_ex) {
            return object2;
        }
    label_58:
        map1.put("from", d0.Z.c0.name());
        d0.c0.d("Send money to a contact", map1);
        this.c0 = null;
        this.e0 = 6;
        object0 = d0.i0.e(this);
        if(object0 == object1) {
            return object1;
        label_65:
            f.b0(object0);
        }
        ((V8.d)object0).Y(Success.X);
        return object2;
    }
}

