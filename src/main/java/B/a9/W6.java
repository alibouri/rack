package a9;

import Nb.j;
import com.sendwave.backend.fragment.WalletFragment;

public final class w6 {
    public final String a;
    public final WalletFragment b;

    public w6(String s, WalletFragment walletFragment0) {
        this.a = s;
        this.b = walletFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof w6)) {
            return false;
        }
        return j.a(this.a, ((w6)object0).a) ? j.a(this.b, ((w6)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Wallet(__typename=" + this.a + ", walletFragment=" + this.b + ")";
    }
}

