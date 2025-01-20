package a9;

import Nb.j;
import java.util.Date;

public final class l2 {
    public final String a;
    public final Date b;
    public final Date c;

    public l2(String s, Date date0, Date date1) {
        this.a = s;
        this.b = date0;
        this.c = date1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof l2)) {
            return false;
        }
        if(!j.a(this.a, ((l2)object0).a)) {
            return false;
        }
        return j.a(this.b, ((l2)object0).b) ? j.a(this.c, ((l2)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        Date date0 = this.c;
        if(date0 != null) {
            v1 = date0.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "OnDocumentDateField(dateFormat=" + this.a + ", maxDate=" + this.b + ", minDate=" + this.c + ")";
    }
}

