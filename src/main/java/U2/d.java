package u2;

import Nb.j;
import Vb.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import m5.b;

public final class d {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    public d(String s, boolean z, List list0, List list1) {
        j.f(list0, "columns");
        j.f(list1, "orders");
        super();
        this.a = s;
        this.b = z;
        this.c = list0;
        this.d = list1;
        Collection collection0 = list1;
        if(collection0.isEmpty()) {
            int v = list0.size();
            collection0 = new ArrayList(v);
            for(int v1 = 0; v1 < v; ++v1) {
                ((ArrayList)collection0).add("ASC");
            }
        }
        this.d = (List)collection0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d)) {
            return false;
        }
        if(this.b != ((d)object0).b) {
            return false;
        }
        if(!j.a(this.c, ((d)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((d)object0).d)) {
            return false;
        }
        boolean z = q.O(this.a, "index_", false);
        String s = ((d)object0).a;
        return z ? q.O(s, "index_", false) : this.a.equals(s);
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int hashCode() {
        return q.O(this.a, "index_", false) ? this.d.hashCode() + b.q(this.c, (0x73D447D3 + this.b) * 0x1F, 0x1F) : this.d.hashCode() + b.q(this.c, (this.a.hashCode() * 0x1F + this.b) * 0x1F, 0x1F);
    }

    @Override
    public final String toString() {
        return "Index{name=\'" + this.a + "\', unique=" + this.b + ", columns=" + this.c + ", orders=" + this.d + "\'}";
    }
}

