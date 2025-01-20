package i9;

import W4.f;
import android.util.SparseIntArray;
import ca.g;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.util.CurrencyAmountView;
import com.wave.models.ProposedTransfer;
import q9.U0;
import q9.l1;

public final class u extends g {
    public long v;
    public static final SparseIntArray w;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        u.w = sparseIntArray0;
        sparseIntArray0.put(0x7F0A00E7, 5);  // id:confirm_to
        sparseIntArray0.put(0x7F0A00E8, 6);  // id:confirm_to_label
        sparseIntArray0.put(0x7F0A00E6, 7);  // id:confirm_send_label
        sparseIntArray0.put(0x7F0A00E4, 8);  // id:confirm_receive_label
    }

    @Override  // R1.g
    public final void f() {
        long v;
        String s1;
        CurrencyAmount currencyAmount1;
        CurrencyAmount currencyAmount0;
        boolean z;
        String s;
        synchronized(this) {
            v = this.v;
            this.v = 0L;
        }
        ProposedTransfer proposedTransfer0 = (ProposedTransfer)this.u;
        int v1 = Long.compare(v & 3L, 0L);
        if(v1 == 0 || proposedTransfer0 == null) {
            s = null;
            z = false;
            currencyAmount0 = null;
            s1 = null;
            currencyAmount1 = null;
        }
        else {
            s = proposedTransfer0.i0;
            z = proposedTransfer0.o0;
            currencyAmount0 = proposedTransfer0.Z;
            currencyAmount1 = proposedTransfer0.Y;
            s1 = l1.d(proposedTransfer0.X, proposedTransfer0.g0.Y);
        }
        if(v1 != 0) {
            ((CurrencyAmountView)this.s).setCurrencyAmount(currencyAmount0);
            ((CurrencyAmountView)this.t).setCurrencyAmount(currencyAmount1);
            f.M(this.q, s1);
            f.M(this.r, s);
            U0.o(this.r, z);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.v != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.v = 2L;
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
            this.u = (ProposedTransfer)object0;
            synchronized(this) {
                this.v |= 1L;
            }
            this.o();
            return true;
        }
        return false;
    }
}

