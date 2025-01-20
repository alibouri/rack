package a9;

import A3.e;
import Nb.j;
import com.sendwave.backend.type.ReceiptTemplateId;

public final class c1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ReceiptTemplateId f;
    public final a1 g;

    public c1(String s, String s1, String s2, String s3, String s4, ReceiptTemplateId receiptTemplateId0, a1 a10) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = receiptTemplateId0;
        this.g = a10;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c1)) {
            return false;
        }
        if(!j.a(this.a, ((c1)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((c1)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((c1)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((c1)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((c1)object0).e)) {
            return false;
        }
        return j.a(this.f, ((c1)object0).f) ? j.a(this.g, ((c1)object0).g) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = e.s(e.s((this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F, 0x1F, this.c), 0x1F, this.d);
        int v2 = this.e == null ? 0 : this.e.hashCode();
        int v3 = this.f == null ? 0 : this.f.hashCode();
        a1 a10 = this.g;
        if(a10 != null) {
            v = a10.hashCode();
        }
        return ((v1 + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "OnBillPaymentEntry(billId=" + this.a + ", icon=" + this.b + ", billName=" + this.c + ", billAccount=" + this.d + ", meterNumber=" + this.e + ", receiptTemplateId=" + this.f + ", historyEntryButtonInfo=" + this.g + ")";
    }
}

