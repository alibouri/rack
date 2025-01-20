package d9;

import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Optional.Absent;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.sendwave.models.CurrencyAmount;

public final class p2 {
    public final String a;
    public final Optional b;
    public final CurrencyAmount c;
    public final CurrencyAmount d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    public final Optional i;
    public final Optional j;
    public final Optional k;
    public final Optional l;

    public p2(String s, Optional optional0, CurrencyAmount currencyAmount0, CurrencyAmount currencyAmount1, Present optional$Present0, Optional optional1, Optional optional2, Optional optional3, Optional optional4, Present optional$Present1) {
        j.f(s, "recipientMobile");
        j.f(optional0, "recipientName");
        j.f(currencyAmount0, "sendAmount");
        j.f(currencyAmount1, "receiveAmount");
        j.f(optional1, "fxRate");
        j.f(Absent.INSTANCE, "walletId");
        j.f(Absent.INSTANCE, "userInterface");
        j.f(optional2, "actionUrl");
        j.f(optional3, "actionSource");
        j.f(optional4, "coords");
        super();
        this.a = s;
        this.b = optional0;
        this.c = currencyAmount0;
        this.d = currencyAmount1;
        this.e = optional$Present0;
        this.f = optional1;
        this.g = Absent.INSTANCE;
        this.h = Absent.INSTANCE;
        this.i = optional2;
        this.j = optional3;
        this.k = optional4;
        this.l = optional$Present1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof p2)) {
            return false;
        }
        if(!j.a(this.a, ((p2)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((p2)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((p2)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((p2)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((p2)object0).e)) {
            return false;
        }
        if(!j.a(this.f, ((p2)object0).f)) {
            return false;
        }
        if(!j.a(this.g, ((p2)object0).g)) {
            return false;
        }
        if(!j.a(this.h, ((p2)object0).h)) {
            return false;
        }
        if(!j.a(this.i, ((p2)object0).i)) {
            return false;
        }
        if(!j.a(this.j, ((p2)object0).j)) {
            return false;
        }
        return j.a(this.k, ((p2)object0).k) ? j.a(this.l, ((p2)object0).l) : false;
    }

    @Override
    public final int hashCode() {
        return this.l.hashCode() + o.m(this.k, o.m(this.j, o.m(this.i, o.m(this.h, o.m(this.g, o.m(this.f, o.m(this.e, o.n(this.d, o.n(this.c, o.m(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override
    public final String toString() {
        return "P2PTransferInput(recipientMobile=" + this.a + ", recipientName=" + this.b + ", sendAmount=" + this.c + ", receiveAmount=" + this.d + ", feeAmount=" + this.e + ", fxRate=" + this.f + ", walletId=" + this.g + ", userInterface=" + this.h + ", actionUrl=" + this.i + ", actionSource=" + this.j + ", coords=" + this.k + ", clientId=" + this.l + ")";
    }
}

