package u2;

import A3.e;
import Nb.j;
import java.util.List;

public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public b(String s, String s1, String s2, List list0, List list1) {
        j.f(list0, "columnNames");
        j.f(list1, "referenceColumnNames");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = list0;
        this.e = list1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b)) {
            return false;
        }
        if(!j.a(this.a, ((b)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((b)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((b)object0).c)) {
            return false;
        }
        return j.a(this.d, ((b)object0).d) ? j.a(this.e, ((b)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return this.e.hashCode() + m5.b.q(this.d, e.s(e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c), 0x1F);
    }

    @Override
    public final String toString() {
        return "ForeignKey{referenceTable=\'" + this.a + "\', onDelete=\'" + this.b + " +\', onUpdate=\'" + this.c + "\', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
    }
}

