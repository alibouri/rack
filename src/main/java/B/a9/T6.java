package a9;

import Nb.j;
import com.sendwave.backend.fragment.SavingsWalletFragment;

public final class t6 {
    public final String a;
    public final SavingsWalletFragment b;

    public t6(String s, SavingsWalletFragment savingsWalletFragment0) {
        this.a = s;
        this.b = savingsWalletFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof t6)) {
            return false;
        }
        return j.a(this.a, ((t6)object0).a) ? j.a(this.b, ((t6)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "SavingsWallet(__typename=" + this.a + ", savingsWalletFragment=" + this.b + ")";
    }
}

