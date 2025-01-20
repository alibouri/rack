package U;

import Ob.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import s.s;

public final class z0 implements a, Iterable {
    public int[] X;
    public int Y;
    public Object[] Z;
    public int b0;
    public int c0;
    public boolean d0;
    public int e0;
    public ArrayList f0;
    public HashMap g0;
    public s h0;

    public z0() {
        this.X = new int[0];
        this.Z = new Object[0];
        this.f0 = new ArrayList();
    }

    public final int a(c c0) {
        if(!this.d0) {
            if(c0.a()) {
                return c0.a;
            }
            d.M("Anchor refers to a group that was removed");
            throw null;
        }
        d.p("Use active SlotWriter to determine anchor location instead");
        throw null;
    }

    public final void c() {
        this.g0 = new HashMap();
    }

    public final y0 d() {
        if(this.d0) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        ++this.c0;
        return new y0(this);
    }

    public final B0 e() {
        if(!this.d0) {
            if(this.c0 <= 0) {
                this.d0 = true;
                ++this.e0;
                return new B0(this);
            }
            d.p("Cannot start a writer when a reader is pending");
            throw null;
        }
        d.p("Cannot start a writer when another writer is pending");
        throw null;
    }

    @Override
    public final Iterator iterator() {
        return new J(this, 0, this.Y);
    }
}

