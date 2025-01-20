package k2;

import Bb.p;
import Bb.q;
import Nb.j;
import Y8.o;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class z1 {
    public final List a;
    public final Integer b;
    public final f1 c;
    public final int d;

    public z1(List list0, Integer integer0, f1 f10, int v) {
        this.a = list0;
        this.b = integer0;
        this.c = f10;
        this.d = v;
    }

    public final Object a(int v) {
        List list0 = this.a;
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            for(Object object0: list0) {
                if(!((w1)object0).X.isEmpty()) {
                    int v1 = v - this.d;
                    int v2;
                    for(v2 = 0; v2 < q.y(list0) && v1 > q.y(((w1)list0.get(v2)).X); ++v2) {
                        v1 -= ((w1)list0.get(v2)).X.size();
                    }
                    for(Object object1: list0) {
                        w1 w10 = (w1)object1;
                        if(!w10.X.isEmpty()) {
                            ListIterator listIterator0 = list0.listIterator(list0.size());
                            while(listIterator0.hasPrevious()) {
                                w1 w11 = (w1)listIterator0.previous();
                                if(!w11.X.isEmpty()) {
                                    if(v1 < 0) {
                                        return p.p0(w10.X);
                                    }
                                    return v2 != q.y(list0) || v1 <= q.y(((w1)p.w0(list0)).X) ? ((w1)list0.get(v2)).X.get(v1) : p.w0(w11.X);
                                }
                                if(false) {
                                    break;
                                }
                            }
                            throw new NoSuchElementException("List contains no element matching the predicate.");
                        }
                        if(false) {
                            break;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    // Deobfuscation rating: LOW(40)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof z1 && j.a(this.a, ((z1)object0).a) && j.a(this.b, ((z1)object0).b) && j.a(this.c, ((z1)object0).c) && this.d == ((z1)object0).d;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? this.c.hashCode() + v + this.d : this.c.hashCode() + (v + this.b.hashCode()) + this.d;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PagingState(pages=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", anchorPosition=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", config=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", leadingPlaceholderCount=");
        return o.z(stringBuilder0, this.d, ')');
    }
}

