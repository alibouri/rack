package ra;

import A3.e;
import Y8.o;
import a9.F5;
import a9.H5;
import com.sendwave.backend.fragment.PaymentCardWalletFragment;
import com.sendwave.backend.fragment.TooltipsFragment;
import com.sendwave.backend.type.PaymentCardState;
import com.sendwave.models.CurrencyAmount;
import m5.b;

public final class c0 {
    public final j a;
    public final PaymentCardWalletFragment b;
    public final CurrencyAmount c;
    public final F5 d;
    public final String e;
    public final H5 f;
    public final PaymentCardState g;
    public final TooltipsFragment h;
    public final String i;
    public final CurrencyAmount j;

    public c0(j j0, PaymentCardWalletFragment paymentCardWalletFragment0, CurrencyAmount currencyAmount0, F5 f50, String s, H5 h50, PaymentCardState paymentCardState0, TooltipsFragment tooltipsFragment0, String s1) {
        this.a = j0;
        this.b = paymentCardWalletFragment0;
        this.c = currencyAmount0;
        this.d = f50;
        this.e = s;
        this.f = h50;
        this.g = paymentCardState0;
        this.h = tooltipsFragment0;
        this.i = s1;
        this.j = paymentCardWalletFragment0 == null ? null : paymentCardWalletFragment0.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c0)) {
            return false;
        }
        if(!Nb.j.a(this.a, ((c0)object0).a)) {
            return false;
        }
        if(!Nb.j.a(this.b, ((c0)object0).b)) {
            return false;
        }
        if(!Nb.j.a(this.c, ((c0)object0).c)) {
            return false;
        }
        if(!Nb.j.a(this.d, ((c0)object0).d)) {
            return false;
        }
        if(!Nb.j.a(this.e, ((c0)object0).e)) {
            return false;
        }
        if(!Nb.j.a(this.f, ((c0)object0).f)) {
            return false;
        }
        if(!Nb.j.a(this.g, ((c0)object0).g)) {
            return false;
        }
        return Nb.j.a(this.h, ((c0)object0).h) ? Nb.j.a(this.i, ((c0)object0).i) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = e.s((this.d.hashCode() + o.n(this.c, ((this.a == null ? 0 : this.a.hashCode()) * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F, 0x1F)) * 0x1F, 0x1F, this.e);
        int v2 = this.f == null ? 0 : this.f.hashCode();
        PaymentCardState paymentCardState0 = this.g;
        if(paymentCardState0 != null) {
            v = paymentCardState0.hashCode();
        }
        return this.i.hashCode() + (this.h.hashCode() + ((v1 + v2) * 0x1F + v) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PaymentCardWithInfo(card=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", cardWallet=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", activationFee=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", activationMessage=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", paymentCardTermsUrl=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", primaryWallet=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", backendCardState=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", tooltipsFragment=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", bankPartnerLogo=");
        return b.y(stringBuilder0, this.i, ")");
    }
}

