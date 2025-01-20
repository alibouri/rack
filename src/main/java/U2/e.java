package u2;

import Nb.j;
import java.util.AbstractSet;
import java.util.Map;

public final class e {
    public final String a;
    public final Object b;
    public final AbstractSet c;
    public final AbstractSet d;

    public e(String s, Map map0, AbstractSet abstractSet0, AbstractSet abstractSet1) {
        j.f(abstractSet0, "foreignKeys");
        super();
        this.a = s;
        this.b = map0;
        this.c = abstractSet0;
        this.d = abstractSet1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        if(!this.a.equals(((e)object0).a)) {
            return false;
        }
        if(!this.b.equals(((e)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((e)object0).c)) {
            return false;
        }
        AbstractSet abstractSet0 = this.d;
        if(abstractSet0 != null) {
            AbstractSet abstractSet1 = ((e)object0).d;
            return abstractSet1 == null ? true : abstractSet0.equals(abstractSet1);
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "TableInfo{name=\'" + this.a + "\', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}

