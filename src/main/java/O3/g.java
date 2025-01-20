package o3;

import java.util.Iterator;

public final class g extends f {
    public final String g0;
    public final Iterator h0;
    public int i0;
    public final h j0;

    public g(h h0, k k0, String s) {
        this.j0 = h0;
        super(h0);
        this.i0 = 0;
        if(k0.j().c(0x80000000)) {
            h0.getClass();
        }
        this.g0 = this.a(k0, s, 1);
        this.h0 = k0.o();
    }

    @Override  // o3.f
    public final boolean hasNext() {
        if(this.e0 != null) {
            return true;
        }
        h h0 = this.j0;
        Iterator iterator0 = this.h0;
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ++this.i0;
            String s = null;
            String s1 = ((k)object0).j().c(0x80000000) || ((k)object0).Z == null ? null : this.a(((k)object0), this.g0, this.i0);
            if(h0.X.c(0x200) && ((k)object0).m()) {
                return this.hasNext();
            }
            if(!((k)object0).j().c(0x80000000)) {
                s = ((k)object0).Y;
            }
            this.e0 = new e(s1, s);
            return true;
        }
        return false;
    }
}

