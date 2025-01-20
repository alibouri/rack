package coil.compose;

import D0.j;
import F0.T;
import F0.f;
import Z2.r;
import g0.c;
import m0.e;
import n0.n;
import s0.b;

public final class ContentPainterElement extends T {
    public final b X;
    public final c Y;
    public final j Z;
    public final float b0;
    public final n c0;

    public ContentPainterElement(b b0, c c0, j j0, float f, n n0) {
        this.X = b0;
        this.Y = c0;
        this.Z = j0;
        this.b0 = f;
        this.c0 = n0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ContentPainterElement)) {
            return false;
        }
        if(!Nb.j.a(this.X, ((ContentPainterElement)object0).X)) {
            return false;
        }
        if(!Nb.j.a(this.Y, ((ContentPainterElement)object0).Y)) {
            return false;
        }
        if(!Nb.j.a(this.Z, ((ContentPainterElement)object0).Z)) {
            return false;
        }
        return Float.compare(this.b0, ((ContentPainterElement)object0).b0) == 0 ? Nb.j.a(this.c0, ((ContentPainterElement)object0).c0) : false;
    }

    @Override
    public final int hashCode() {
        int v = m5.b.p((this.Z.hashCode() + (this.Y.hashCode() + this.X.hashCode() * 0x1F) * 0x1F) * 0x1F, this.b0, 0x1F);
        return this.c0 == null ? v : v + this.c0.hashCode();
    }

    @Override  // F0.T
    public final g0.n k() {
        g0.n n0 = new r();  // initializer: Lg0/n;-><init>()V
        n0.l0 = this.X;
        n0.m0 = this.Y;
        n0.n0 = this.Z;
        n0.o0 = this.b0;
        n0.p0 = this.c0;
        return n0;
    }

    @Override  // F0.T
    public final void m(g0.n n0) {
        boolean z = e.a(((r)n0).l0.h(), this.X.h());
        ((r)n0).l0 = this.X;
        ((r)n0).m0 = this.Y;
        ((r)n0).n0 = this.Z;
        ((r)n0).o0 = this.b0;
        ((r)n0).p0 = this.c0;
        if(!z) {
            f.o(((r)n0));
        }
        f.n(((r)n0));
    }

    @Override
    public final String toString() {
        return "ContentPainterElement(painter=" + this.X + ", alignment=" + this.Y + ", contentScale=" + this.Z + ", alpha=" + this.b0 + ", colorFilter=" + this.c0 + ')';
    }
}

