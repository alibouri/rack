package ja;

import A3.e;
import Nb.j;
import com.sendwave.models.CurrencyAmount;
import f9.b;
import java.util.List;

public final class m {
    public final CurrencyAmount a;
    public final String b;
    public final b c;
    public final List d;

    public m(CurrencyAmount currencyAmount0, String s, b b0, List list0) {
        j.f(b0, "audioState");
        super();
        this.a = currencyAmount0;
        this.b = s;
        this.c = b0;
        this.d = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof m)) {
            return false;
        }
        if(!j.a(this.a, ((m)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((m)object0).b)) {
            return false;
        }
        return j.a(this.c, ((m)object0).c) ? j.a(this.d, ((m)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? this.d.hashCode() + (this.c.hashCode() + e.s(0, 0x1F, this.b)) * 0x1F : this.d.hashCode() + (this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b)) * 0x1F;
    }

    @Override
    public final String toString() {
        return "OverdraftIntroSheetState(amountOffered=" + this.a + ", audioUrl=" + this.b + ", audioState=" + this.c + ", bullets=" + this.d + ")";
    }
}

