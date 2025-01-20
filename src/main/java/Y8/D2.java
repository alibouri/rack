package Y8;

import A3.e;
import Nb.j;
import com.sendwave.backend.fragment.FavoriteBuyAirtimeRecipientsFragment;

public final class d2 {
    public final String a;
    public final String b;
    public final FavoriteBuyAirtimeRecipientsFragment c;

    public d2(String s, String s1, FavoriteBuyAirtimeRecipientsFragment favoriteBuyAirtimeRecipientsFragment0) {
        this.a = s;
        this.b = s1;
        this.c = favoriteBuyAirtimeRecipientsFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d2)) {
            return false;
        }
        if(!j.a(this.a, ((d2)object0).a)) {
            return false;
        }
        return j.a(this.b, ((d2)object0).b) ? j.a(this.c, ((d2)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    @Override
    public final String toString() {
        return "PrimaryWallet(__typename=" + this.a + ", id=" + this.b + ", favoriteBuyAirtimeRecipientsFragment=" + this.c + ")";
    }
}

