package a9;

import Nb.j;
import java.util.Date;

public final class f9 {
    public final int a;
    public final int b;
    public final Date c;

    public f9(int v, int v1, Date date0) {
        this.a = v;
        this.b = v1;
        this.c = date0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f9)) {
            return false;
        }
        if(this.a != ((f9)object0).a) {
            return false;
        }
        return this.b == ((f9)object0).b ? j.a(this.c, ((f9)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = (this.a * 0x1F + this.b) * 0x1F;
        return this.c == null ? v : v + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "TxHistoryOfflineSyncProps(firstPageSize=" + this.a + ", subsequentPagesSize=" + this.b + ", whenShouldDoFullResync=" + this.c + ")";
    }
}

