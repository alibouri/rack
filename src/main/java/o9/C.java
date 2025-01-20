package o9;

import A3.e;
import Bb.r;
import Nb.j;
import androidx.lifecycle.LifecycleOwner;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.shared.ProposedBillField;
import f9.E;
import java.util.ArrayList;
import m5.b;
import q9.o0;
import q9.r1;

public final class c {
    public final String a;
    public final CurrencyAmount b;
    public final ArrayList c;
    public final String d;
    public final String e;

    public c(String s, CurrencyAmount currencyAmount0, ArrayList arrayList0) {
        this(s, currencyAmount0, arrayList0, r1.d(0x7F12030A, new Object[0]), r1.d(0x7F1200EB, new Object[0]));  // string:pay_bill_total "Total"
    }

    public c(String s, CurrencyAmount currencyAmount0, ArrayList arrayList0, String s1, String s2) {
        j.f(s, "typeId");
        j.f(s1, "totalAmountLabelText");
        j.f(s2, "confirmationDialogTitle");
        super();
        this.a = s;
        this.b = currencyAmount0;
        this.c = arrayList0;
        this.d = s1;
        this.e = s2;
    }

    public final E a(LifecycleOwner lifecycleOwner0) {
        j.f(lifecycleOwner0, "owner");
        ArrayList arrayList0 = new ArrayList(r.b0(this.c));
        for(Object object0: this.c) {
            arrayList0.add(new f9.j(((ProposedBillField)object0), ((ProposedBillField)object0).X, 0x7F0D005E));  // layout:item_confirm_payment_sheet_field
        }
        return new E(lifecycleOwner0, o0.a(arrayList0), null);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c)) {
            return false;
        }
        if(!j.a(this.a, ((c)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((c)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((c)object0).c)) {
            return false;
        }
        return j.a(this.d, ((c)object0).d) ? j.a(this.e, ((c)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? this.e.hashCode() + e.s((this.c.hashCode() + v * 961) * 0x1F, 0x1F, this.d) : this.e.hashCode() + e.s((this.c.hashCode() + (v * 0x1F + this.b.hashCode()) * 0x1F) * 0x1F, 0x1F, this.d);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BillPay2Proposal(typeId=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", billAmount=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", fields=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", totalAmountLabelText=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", confirmationDialogTitle=");
        return b.y(stringBuilder0, this.e, ")");
    }
}

