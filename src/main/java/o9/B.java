package o9;

import A3.e;
import Nb.j;
import Y8.o;
import com.sendwave.models.CurrencyAmount;

public final class b {
    public final String a;
    public final CurrencyAmount b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public b(String s, CurrencyAmount currencyAmount0, String s1, String s2, String s3, boolean z, boolean z1, boolean z2, boolean z3) {
        j.f(s, "id");
        super();
        this.a = s;
        this.b = currencyAmount0;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = z;
        this.g = z1;
        this.h = z2;
        this.i = z3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b)) {
            return false;
        }
        if(!j.a(this.a, ((b)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((b)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((b)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((b)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((b)object0).e)) {
            return false;
        }
        if(this.f != ((b)object0).f) {
            return false;
        }
        if(this.g != ((b)object0).g) {
            return false;
        }
        return this.h == ((b)object0).h ? this.i == ((b)object0).i : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(e.s(o.n(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F, this.c), 0x1F, this.d);
        int v1 = this.e == null ? 0 : this.e.hashCode();
        int v2 = 0x4D5;
        int v3 = this.f ? 0x4CF : 0x4D5;
        int v4 = this.g ? 0x4CF : 0x4D5;
        int v5 = this.h ? 0x4CF : 0x4D5;
        if(this.i) {
            v2 = 0x4CF;
        }
        return ((((v + v1) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v2;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BillInvoiceModel(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", amount=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", dueDate=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", invoiceReference=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", customerName=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", isOverdue=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", isSelected=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", isOnlyBill=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", isLast=");
        return com.apollographql.apollo.api.b.r(stringBuilder0, this.i, ")");
    }
}

