package F0;

import M6.b;
import Nb.j;
import androidx.compose.ui.node.LayoutNode;

public abstract class n extends g0.n {
    public final int l0;
    public g0.n m0;

    public n() {
        this.l0 = d0.f(this);
    }

    @Override  // g0.n
    public final void n0() {
        super.n0();
        for(g0.n n0 = this.m0; n0 != null; n0 = n0.d0) {
            n0.w0(this.f0);
            if(!n0.k0) {
                n0.n0();
            }
        }
    }

    @Override  // g0.n
    public final void o0() {
        for(g0.n n0 = this.m0; n0 != null; n0 = n0.d0) {
            n0.o0();
        }
        super.o0();
    }

    @Override  // g0.n
    public final void s0() {
        super.s0();
        for(g0.n n0 = this.m0; n0 != null; n0 = n0.d0) {
            n0.s0();
        }
    }

    @Override  // g0.n
    public final void t0() {
        for(g0.n n0 = this.m0; n0 != null; n0 = n0.d0) {
            n0.t0();
        }
        super.t0();
    }

    @Override  // g0.n
    public final void u0() {
        super.u0();
        for(g0.n n0 = this.m0; n0 != null; n0 = n0.d0) {
            n0.u0();
        }
    }

    @Override  // g0.n
    public final void v0(g0.n n0) {
        this.X = n0;
        for(g0.n n1 = this.m0; n1 != null; n1 = n1.d0) {
            n1.v0(n0);
        }
    }

    @Override  // g0.n
    public final void w0(c0 c00) {
        this.f0 = c00;
        for(g0.n n0 = this.m0; n0 != null; n0 = n0.d0) {
            n0.w0(c00);
        }
    }

    public final void x0(m m0) {
        g0.n n0 = ((g0.n)m0).X;
        g0.n n1 = null;
        if(n0 != m0) {
            g0.n n2 = m0 instanceof g0.n ? ((g0.n)m0) : null;
            if(n2 != null) {
                n1 = n2.c0;
            }
            if(n0 != this.X || !j.a(n1, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if(!n0.k0) {
            n0.v0(this.X);
            int v = this.Z;
            int v1 = d0.g(n0);
            n0.Z = v1;
            int v2 = this.Z;
            if((v1 & 2) != 0 && (v2 & 2) != 0 && !(this instanceof x)) {
                b.T(("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + n0));
                throw null;
            }
            n0.d0 = this.m0;
            this.m0 = n0;
            n0.c0 = this;
            this.z0(v1 | v2, false);
            if(this.k0) {
                if((v1 & 2) == 0 || (v & 2) != 0) {
                    this.w0(this.f0);
                }
                else {
                    LayoutNode layoutNode0 = f.v(this);
                    this.X.w0(null);
                    layoutNode0.u0.l();
                }
                n0.n0();
                n0.t0();
                d0.a(n0);
            }
            return;
        }
        b.T("Cannot delegate to an already attached node");
        throw null;
    }

    public final void y0(m m0) {
        g0.n n0 = this.m0;
        g0.n n1 = null;
        while(n0 != null) {
            if(n0 == m0) {
                if(n0.k0) {
                    d0.b(n0, -1, 2);
                    n0.u0();
                    n0.o0();
                }
                n0.v0(n0);
                n0.b0 = 0;
                if(n1 == null) {
                    this.m0 = n0.d0;
                }
                else {
                    n1.d0 = n0.d0;
                }
                n0.d0 = null;
                n0.c0 = null;
                int v = this.Z;
                int v1 = d0.g(this);
                this.z0(v1, true);
                if(this.k0 && (v & 2) != 0 && (v1 & 2) == 0) {
                    LayoutNode layoutNode0 = f.v(this);
                    this.X.w0(null);
                    layoutNode0.u0.l();
                }
                return;
            }
            n1 = n0;
            n0 = n0.d0;
        }
        throw new IllegalStateException(("Could not find delegate: " + m0).toString());
    }

    public final void z0(int v, boolean z) {
        int v2;
        int v1 = this.Z;
        this.Z = v;
        if(v1 != v) {
            g0.n n0 = this.X;
            if(n0 == this) {
                this.b0 = v;
            }
            if(this.k0) {
                g0.n n1;
                for(n1 = this; n1 != null; n1 = n1.c0) {
                    v |= n1.Z;
                    n1.Z = v;
                    if(n1 == n0) {
                        break;
                    }
                }
                if(z && n1 == n0) {
                    v = d0.g(n0);
                    n0.Z = v;
                }
                if(n1 == null) {
                    v2 = 0;
                }
                else {
                    g0.n n2 = n1.d0;
                    v2 = n2 == null ? 0 : n2.b0;
                }
                int v3 = v | v2;
                while(n1 != null) {
                    v3 |= n1.Z;
                    n1.b0 = v3;
                    n1 = n1.c0;
                }
            }
        }
    }
}

