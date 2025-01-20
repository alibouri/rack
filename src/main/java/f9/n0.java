package f9;

import Ab.t;
import Fb.j;
import Mb.e;
import W5.f;
import android.os.Parcelable;
import com.sendwave.backend.fragment.LinkedAccountTypeFragment;
import com.sendwave.backend.type.Currency;
import com.sendwave.models.CurrencyAmount;
import kotlin.coroutines.g;
import q9.M0;
import q9.r1;

public final class n0 extends j implements e {
    public final int c0;
    public Parcelable d0;
    public Object e0;
    public Object f0;

    public n0(int v, g g0, int v1) {
        this.c0 = v1;
        super(v, g0);
    }

    @Override  // Mb.e
    public final Object r(Object object0, Object object1, Object object2, Object object3) {
        if(this.c0 != 0) {
            n0 n00 = new n0(4, ((g)object3), 1);
            n00.d0 = (CurrencyAmount)object0;
            n00.e0 = (LinkedAccountTypeFragment)object1;
            n00.f0 = (String)object2;
            return n00.v(t.a);
        }
        n0 n01 = new n0(4, ((g)object3), 0);
        n01.d0 = (Currency)object0;
        n01.e0 = (Currency)object1;
        n01.f0 = (W)object2;
        return n01.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        if(this.c0 != 0) {
            f.b0(object0);
            CurrencyAmount currencyAmount0 = (CurrencyAmount)this.d0;
            LinkedAccountTypeFragment linkedAccountTypeFragment0 = (LinkedAccountTypeFragment)this.e0;
            String s = (String)this.f0;
            if(s.length() > 0 && currencyAmount0.b(linkedAccountTypeFragment0.n) < 0) {
                Nb.j.e(linkedAccountTypeFragment0.n.X, "currency");
                return r1.d(0x7F12015E, new Object[]{M0.d(linkedAccountTypeFragment0.n.X).format(linkedAccountTypeFragment0.n.Y)});  // string:error_below_minimum "%s is the minimum amount"
            }
            if(s.length() > 0 && currencyAmount0.b(linkedAccountTypeFragment0.o) > 0) {
                Nb.j.e(linkedAccountTypeFragment0.o.X, "currency");
                return r1.d(0x7F120158, new Object[]{M0.d(linkedAccountTypeFragment0.o.X).format(linkedAccountTypeFragment0.o.Y)});  // string:error_above_maximum "%s is the maximum amount"
            }
            return null;
        }
        f.b0(object0);
        Currency currency0 = (Currency)this.d0;
        Currency currency1 = (Currency)this.e0;
        W w0 = (W)this.f0;
        return new T(new CurrencyAmount(currency0, w0.a), new CurrencyAmount(currency1, w0.b), new CurrencyAmount(currency0, w0.c));
    }
}

