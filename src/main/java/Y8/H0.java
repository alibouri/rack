package Y8;

import Nb.j;
import com.sendwave.backend.fragment.BillInvoiceListFragment;

public final class h0 {
    public final String a;
    public final j0 b;
    public final BillInvoiceListFragment c;

    public h0(String s, j0 j00, BillInvoiceListFragment billInvoiceListFragment0) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = j00;
        this.c = billInvoiceListFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h0)) {
            return false;
        }
        if(!j.a(this.a, ((h0)object0).a)) {
            return false;
        }
        return j.a(this.b, ((h0)object0).b) ? j.a(this.c, ((h0)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        BillInvoiceListFragment billInvoiceListFragment0 = this.c;
        if(billInvoiceListFragment0 != null) {
            v1 = billInvoiceListFragment0.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "BillInvoiceListPolling(__typename=" + this.a + ", onAsyncPending=" + this.b + ", billInvoiceListFragment=" + this.c + ")";
    }
}

