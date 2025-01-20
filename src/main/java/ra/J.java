package ra;

import A3.e;
import a9.w5;
import com.sendwave.backend.type.PaymentCardKind;
import java.util.Date;
import m5.b;

public final class j {
    public final String a;
    public final String b;
    public final Date c;
    public final V d;
    public final w5 e;
    public final String f;
    public final String g;
    public final PaymentCardKind h;
    public final String i;

    public j(String s, String s1, Date date0, V v0, w5 w50, String s2, String s3, PaymentCardKind paymentCardKind0, String s4) {
        Nb.j.f(s, "id");
        Nb.j.f(s2, "partnerPublicKey");
        Nb.j.f(paymentCardKind0, "kind");
        super();
        this.a = s;
        this.b = s1;
        this.c = date0;
        this.d = v0;
        this.e = w50;
        this.f = s2;
        this.g = s3;
        this.h = paymentCardKind0;
        this.i = s4;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof j)) {
            return false;
        }
        if(!Nb.j.a(this.a, ((j)object0).a)) {
            return false;
        }
        if(!Nb.j.a(this.b, ((j)object0).b)) {
            return false;
        }
        if(!Nb.j.a(this.c, ((j)object0).c)) {
            return false;
        }
        if(!Nb.j.a(this.d, ((j)object0).d)) {
            return false;
        }
        if(!Nb.j.a(this.e, ((j)object0).e)) {
            return false;
        }
        if(!Nb.j.a(this.f, ((j)object0).f)) {
            return false;
        }
        if(!Nb.j.a(this.g, ((j)object0).g)) {
            return false;
        }
        return Nb.j.a(this.h, ((j)object0).h) ? Nb.j.a(this.i, ((j)object0).i) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
        int v1 = this.c.hashCode();
        int v2 = this.d.hashCode();
        return this.e == null ? this.i.hashCode() + (this.h.hashCode() + e.s(e.s((v2 + (v1 + v) * 0x1F) * 961, 0x1F, this.f), 0x1F, this.g)) * 0x1F : this.i.hashCode() + (this.h.hashCode() + e.s(e.s(((v2 + (v1 + v) * 0x1F) * 0x1F + this.e.hashCode()) * 0x1F, 0x1F, this.f), 0x1F, this.g)) * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PaymentCard(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", lastFourDigits=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", expires=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", state=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", blockMessage=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", partnerPublicKey=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", bankIcon=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", kind=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", name=");
        return b.y(stringBuilder0, this.i, ")");
    }
}

