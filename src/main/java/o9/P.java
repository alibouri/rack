package o9;

import Ab.t;
import Eb.a;
import W5.f;
import ac.i;
import com.sendwave.backend.fragment.BillFieldsFragment;
import com.sendwave.backend.fragment.BillPayAmountFieldFragment;
import com.sendwave.models.CurrencyAmount;
import java.math.BigDecimal;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.coroutines.g;

public final class p implements i {
    public final int X;
    public final i Y;
    public final BillFieldsFragment Z;

    public p(i i0, BillFieldsFragment billFieldsFragment0, int v) {
        this.X = v;
        this.Y = i0;
        this.Z = billFieldsFragment0;
        super();
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        o o0;
        o0 o00;
        if(this.X != 0) {
            if(g0 instanceof o0) {
                o00 = (o0)g0;
                int v = o00.c0;
                if((v & 0x80000000) == 0) {
                    o00 = new o0(this, g0);
                }
                else {
                    o00.c0 = v ^ 0x80000000;
                }
            }
            else {
                o00 = new o0(this, g0);
            }
            Object object1 = o00.b0;
            Object object2 = a.X;
            switch(o00.c0) {
                case 0: {
                    f.b0(object1);
                    for(Object object3: ((List)object0)) {
                        if(((n)object3).Z.b.equals(this.Z.b)) {
                            o00.c0 = 1;
                            return this.Y.c(object3, o00) != object2 ? t.a : object2;
                        }
                        if(false) {
                            break;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                case 1: {
                    f.b0(object1);
                    return t.a;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
        }
        if(g0 instanceof o) {
            o0 = (o)g0;
            int v1 = o0.c0;
            if((v1 & 0x80000000) == 0) {
                o0 = new o(this, g0);
            }
            else {
                o0.c0 = v1 ^ 0x80000000;
            }
        }
        else {
            o0 = new o(this, g0);
        }
        Object object4 = o0.b0;
        Object object5 = a.X;
        switch(o0.c0) {
            case 0: {
                f.b0(object4);
                BigDecimal bigDecimal0 = new BigDecimal(this.Z.d);
                CurrencyAmount currencyAmount0 = new CurrencyAmount(((BillPayAmountFieldFragment)object0).c, bigDecimal0);
                o0.c0 = 1;
                return this.Y.c(currencyAmount0, o0) != object5 ? t.a : object5;
            }
            case 1: {
                f.b0(object4);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

