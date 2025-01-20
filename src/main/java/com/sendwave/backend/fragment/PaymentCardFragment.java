package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import a9.w5;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.backend.type.PaymentCardKind;
import com.sendwave.backend.type.PaymentCardState;
import java.util.Date;
import m5.b;

public final class PaymentCardFragment implements Data {
    public final String a;
    public final String b;
    public final String c;
    public final Date d;
    public final PaymentCardState e;
    public final w5 f;
    public final String g;
    public final PaymentCardKind h;
    public final String i;

    public PaymentCardFragment(String s, String s1, String s2, Date date0, PaymentCardState paymentCardState0, w5 w50, String s3, PaymentCardKind paymentCardKind0, String s4) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = date0;
        this.e = paymentCardState0;
        this.f = w50;
        this.g = s3;
        this.h = paymentCardKind0;
        this.i = s4;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PaymentCardFragment)) {
            return false;
        }
        if(!j.a(this.a, ((PaymentCardFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((PaymentCardFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((PaymentCardFragment)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((PaymentCardFragment)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((PaymentCardFragment)object0).e)) {
            return false;
        }
        if(!j.a(this.f, ((PaymentCardFragment)object0).f)) {
            return false;
        }
        if(!j.a(this.g, ((PaymentCardFragment)object0).g)) {
            return false;
        }
        return j.a(this.h, ((PaymentCardFragment)object0).h) ? j.a(this.i, ((PaymentCardFragment)object0).i) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = e.s(e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c);
        int v1 = this.d.hashCode();
        int v2 = this.e.hashCode();
        return this.f == null ? this.i.hashCode() + (this.h.hashCode() + e.s((v2 + (v1 + v) * 0x1F) * 961, 0x1F, this.g)) * 0x1F : this.i.hashCode() + (this.h.hashCode() + e.s(((v2 + (v1 + v) * 0x1F) * 0x1F + this.f.hashCode()) * 0x1F, 0x1F, this.g)) * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PaymentCardFragment(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", lastFourDigits=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", cardholderName=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", whenExpires=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", state=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", message=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", partnerPublicKey=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", kind=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", bankPartnerIcon=");
        return b.y(stringBuilder0, this.i, ")");
    }
}

