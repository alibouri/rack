package ca;

import W4.f;
import android.util.SparseIntArray;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.util.CurrencyAmountView;
import com.wave.models.ProposedCheckout;

public final class p extends o {
    public long t;
    public static final SparseIntArray u;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        p.u = sparseIntArray0;
        sparseIntArray0.put(0x7F0A00E7, 3);  // id:confirm_to
        sparseIntArray0.put(0x7F0A00E8, 4);  // id:confirm_to_label
        sparseIntArray0.put(0x7F0A00E6, 5);  // id:confirm_send_label
    }

    @Override  // R1.g
    public final void f() {
        long v;
        String s;
        CurrencyAmount currencyAmount0;
        synchronized(this) {
            v = this.t;
            this.t = 0L;
        }
        ProposedCheckout proposedCheckout0 = (ProposedCheckout)this.s;
        int v1 = Long.compare(v & 3L, 0L);
        if(v1 == 0 || proposedCheckout0 == null) {
            currencyAmount0 = null;
            s = null;
        }
        else {
            currencyAmount0 = proposedCheckout0.Y;
            s = proposedCheckout0.X;
        }
        if(v1 != 0) {
            ((CurrencyAmountView)this.r).setCurrencyAmount(currencyAmount0);
            f.M(this.q, s);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.t != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.t = 2L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(20 == v) {
            this.s = (ProposedCheckout)object0;
            synchronized(this) {
                this.t |= 1L;
            }
            this.o();
            return true;
        }
        return false;
    }
}

