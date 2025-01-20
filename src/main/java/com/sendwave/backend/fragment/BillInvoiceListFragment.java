package com.sendwave.backend.fragment;

import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.backend.type.InvoiceOrder;
import com.sendwave.models.CurrencyAmount;
import java.util.List;
import m5.b;

public final class BillInvoiceListFragment implements Data {
    public final String a;
    public final List b;
    public final CurrencyAmount c;
    public final boolean d;
    public final InvoiceOrder e;

    public BillInvoiceListFragment(String s, List list0, CurrencyAmount currencyAmount0, boolean z, InvoiceOrder invoiceOrder0) {
        this.a = s;
        this.b = list0;
        this.c = currencyAmount0;
        this.d = z;
        this.e = invoiceOrder0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BillInvoiceListFragment)) {
            return false;
        }
        if(!j.a(this.a, ((BillInvoiceListFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((BillInvoiceListFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((BillInvoiceListFragment)object0).c)) {
            return false;
        }
        return this.d == ((BillInvoiceListFragment)object0).d ? j.a(this.e, ((BillInvoiceListFragment)object0).e) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = b.q(this.b, this.a.hashCode() * 0x1F, 0x1F);
        int v1 = this.c == null ? 0 : this.c.hashCode();
        return this.d ? this.e.hashCode() + ((v + v1) * 0x1F + 0x4CF) * 0x1F : this.e.hashCode() + ((v + v1) * 0x1F + 0x4D5) * 0x1F;
    }

    @Override
    public final String toString() {
        return "BillInvoiceListFragment(id=" + this.a + ", bills=" + this.b + ", advanceAmount=" + this.c + ", multipleInvoicePaymentsSupported=" + this.d + ", invoicePaymentOrder=" + this.e + ")";
    }
}

