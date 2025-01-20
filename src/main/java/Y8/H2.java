package Y8;

import Nb.j;
import com.sendwave.backend.fragment.FavoriteRecipientsFragment;

public final class h2 {
    public final String a;
    public final FavoriteRecipientsFragment b;

    public h2(String s, FavoriteRecipientsFragment favoriteRecipientsFragment0) {
        this.a = s;
        this.b = favoriteRecipientsFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h2)) {
            return false;
        }
        return j.a(this.a, ((h2)object0).a) ? j.a(this.b, ((h2)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "PrimaryWallet(__typename=" + this.a + ", favoriteRecipientsFragment=" + this.b + ")";
    }
}

