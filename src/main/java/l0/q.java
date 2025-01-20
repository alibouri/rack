package l0;

import Ab.e;
import E0.d;
import E0.g;
import F0.W;
import F0.c0;
import F0.e0;
import F0.f;
import F0.l;
import F0.o0;
import M6.b;
import Nb.j;
import Nb.w;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import d6.a;
import g0.n;
import kotlin.jvm.functions.Function0;
import s.B;

public final class q extends n implements d, e0, l {
    public boolean l0;
    public boolean m0;
    public p n0;

    public static final boolean A0(q q0) {
        n n0 = q0.X;
        if(!n0.k0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        n n1 = n0.c0;
        LayoutNode layoutNode0 = f.v(q0);
        while(layoutNode0 != null) {
            if((((n)layoutNode0.u0.f).b0 & 0x400) != 0) {
                while(n1 != null) {
                    if((n1.Z & 0x400) != 0) {
                        n n2 = n1;
                        W.d d0 = null;
                        while(n2 != null) {
                            if(n2 instanceof q) {
                                if(((q)n2).n0 != null) {
                                    switch(((q)n2).y0().ordinal()) {
                                        case 1: {
                                            return true;
                                        }
                                        case 0: 
                                        case 2: 
                                        case 3: {
                                            return false;
                                        }
                                        default: {
                                            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                                        }
                                    }
                                }
                            }
                            else if((n2.Z & 0x400) != 0 && n2 instanceof F0.n) {
                                n n3 = ((F0.n)n2).m0;
                                int v = 0;
                                while(n3 != null) {
                                    if((n3.Z & 0x400) != 0) {
                                        ++v;
                                        if(v == 1) {
                                            n2 = n3;
                                        }
                                        else {
                                            if(d0 == null) {
                                                d0 = new W.d(new n[16]);
                                            }
                                            if(n2 != null) {
                                                d0.c(n2);
                                                n2 = null;
                                            }
                                            d0.c(n3);
                                        }
                                    }
                                    n3 = n3.d0;
                                }
                                if(v != 1) {
                                    goto label_35;
                                }
                                continue;
                            }
                        label_35:
                            n2 = f.f(d0);
                        }
                    }
                    n1 = n1.c0;
                }
            }
            layoutNode0 = layoutNode0.s();
            if(layoutNode0 != null) {
                W w0 = layoutNode0.u0;
                if(w0 != null) {
                    n1 = (o0)w0.e;
                    continue;
                }
            }
            n1 = null;
        }
        return false;
    }

    public final void B0() {
        if(this.n0 == null) {
            a a0 = f.w(this).getFocusOwner().b();
            try {
                if(a0.X) {
                    a.a(a0);
                }
                a0.X = true;
                this.C0((!q.A0(this) || !q.z0(this) ? p.Z : p.Y));
            }
            finally {
                a.b(a0);
            }
        }
        switch(this.y0().ordinal()) {
            case 0: 
            case 2: {
                w w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                f.s(this, new jc.p(w0, 3, this));
                Object object0 = w0.X;
                if(object0 != null) {
                    if(!((h)object0).b()) {
                        f.w(this).getFocusOwner().n(true);
                    }
                    return;
                }
                j.p("focusProperties");
                throw null;
            }
        }
    }

    public final void C0(p p0) {
        ((B)f.w(this).getFocusOwner().b().Y).i(this, p0);
    }

    @Override  // F0.e0
    public final void F() {
        p p0 = this.y0();
        this.B0();
        if(p0 != this.y0()) {
            l0.d.z(this);
        }
    }

    @Override  // E0.f
    public final Object X(g g0) {
        n n0 = this.X;
        if(n0.k0) {
            n n1 = n0.c0;
            LayoutNode layoutNode0 = f.v(this);
            while(layoutNode0 != null) {
                if((((n)layoutNode0.u0.f).b0 & 0x20) != 0) {
                    while(n1 != null) {
                        if((n1.Z & 0x20) != 0) {
                            n n2 = n1;
                            W.d d0 = null;
                            while(n2 != null) {
                                if(n2 instanceof d) {
                                    if(((d)n2).i().v(g0)) {
                                        return ((d)n2).i().D(g0);
                                    }
                                }
                                else if((n2.Z & 0x20) != 0 && n2 instanceof F0.n) {
                                    n n3 = ((F0.n)n2).m0;
                                    int v = 0;
                                    while(n3 != null) {
                                        if((n3.Z & 0x20) != 0) {
                                            ++v;
                                            if(v == 1) {
                                                n2 = n3;
                                            }
                                            else {
                                                if(d0 == null) {
                                                    d0 = new W.d(new n[16]);
                                                }
                                                if(n2 != null) {
                                                    d0.c(n2);
                                                    n2 = null;
                                                }
                                                d0.c(n3);
                                            }
                                        }
                                        n3 = n3.d0;
                                    }
                                    if(v != 1) {
                                        goto label_32;
                                    }
                                    continue;
                                }
                            label_32:
                                n2 = f.f(d0);
                            }
                        }
                        n1 = n1.c0;
                    }
                }
                layoutNode0 = layoutNode0.s();
                if(layoutNode0 != null) {
                    W w0 = layoutNode0.u0;
                    if(w0 != null) {
                        n1 = (o0)w0.e;
                        continue;
                    }
                }
                n1 = null;
            }
            return ((Function0)g0.a).invoke();
        }
        b.S("ModifierLocal accessed from an unattached node");
        throw null;
    }

    @Override  // E0.d
    public final android.support.v4.media.session.a i() {
        return E0.b.b;
    }

    @Override  // g0.n
    public final boolean m0() {
        return false;
    }

    @Override  // g0.n
    public final void q0() {
        int v = this.y0().ordinal();
        switch(v) {
            case 0: {
                f.w(this).getFocusOwner().e(8, true, false);
                f.w(this).getFocusOwner().k(this);
                break;
            }
            case 1: {
                a a0 = f.w(this).getFocusOwner().b();
                try {
                    if(a0.X) {
                        a.a(a0);
                    }
                    a0.X = true;
                    this.C0(p.Z);
                }
                finally {
                    a.b(a0);
                }
                break;
            }
            default: {
                if(v == 2) {
                    f.w(this).getFocusOwner().e(8, true, false);
                    f.w(this).getFocusOwner().k(this);
                }
            }
        }
        this.n0 = null;
    }

    public final i x0() {
        i i0 = new i();  // initializer: Ljava/lang/Object;-><init>()V
        i0.a = true;
        i0.b = m.b;
        i0.c = m.b;
        i0.d = m.b;
        i0.e = m.b;
        i0.f = m.b;
        i0.g = m.b;
        i0.h = m.b;
        i0.i = m.b;
        i0.j = l0.g.Z;
        i0.k = l0.g.b0;
        n n0 = this.X;
        if(!n0.k0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        LayoutNode layoutNode0 = f.v(this);
        n n1 = n0;
    label_16:
        while(layoutNode0 != null) {
            if((((n)layoutNode0.u0.f).b0 & 0xC00) != 0) {
                while(n1 != null) {
                    int v = n1.Z;
                    if((v & 0xC00) != 0) {
                        if(n1 != n0 && (v & 0x400) != 0) {
                            break label_16;
                        }
                        if((v & 0x800) != 0) {
                            n n2 = n1;
                            W.d d0 = null;
                            while(n2 != null) {
                                if(n2 instanceof k) {
                                    ((k)n2).l(i0);
                                }
                                else if((n2.Z & 0x800) != 0 && n2 instanceof F0.n) {
                                    n n3 = ((F0.n)n2).m0;
                                    int v1 = 0;
                                    while(n3 != null) {
                                        if((n3.Z & 0x800) != 0) {
                                            ++v1;
                                            if(v1 == 1) {
                                                n2 = n3;
                                            }
                                            else {
                                                if(d0 == null) {
                                                    d0 = new W.d(new n[16]);
                                                }
                                                if(n2 != null) {
                                                    d0.c(n2);
                                                    n2 = null;
                                                }
                                                d0.c(n3);
                                            }
                                        }
                                        n3 = n3.d0;
                                    }
                                    if(v1 != 1) {
                                        goto label_47;
                                    }
                                    continue;
                                }
                            label_47:
                                n2 = f.f(d0);
                            }
                        }
                    }
                    n1 = n1.c0;
                }
            }
            layoutNode0 = layoutNode0.s();
            if(layoutNode0 != null) {
                W w0 = layoutNode0.u0;
                if(w0 != null) {
                    n1 = (o0)w0.e;
                    continue;
                }
            }
            n1 = null;
        }
        return i0;
    }

    public final p y0() {
        a a0;
        c0 c00 = this.X.f0;
        if(c00 == null) {
            a0 = null;
        }
        else {
            LayoutNode layoutNode0 = c00.j0;
            if(layoutNode0 == null) {
                a0 = null;
            }
            else {
                AndroidComposeView androidComposeView0 = layoutNode0.g0;
                if(androidComposeView0 == null) {
                    a0 = null;
                }
                else {
                    FocusOwner focusOwner0 = androidComposeView0.getFocusOwner();
                    a0 = focusOwner0 == null ? null : focusOwner0.b();
                }
            }
        }
        if(a0 != null) {
            p p0 = (p)((B)a0.Y).e(this);
            if(p0 != null) {
                return p0;
            }
        }
        return this.n0 == null ? p.Z : this.n0;
    }

    public static final boolean z0(q q0) {
        n n0 = q0.X;
        if(n0.k0) {
            W.d d0 = new W.d(new n[16]);
            n n1 = n0.d0;
            if(n1 == null) {
                f.b(d0, n0);
            }
            else {
                d0.c(n1);
            }
            while(d0.n()) {
                n n2 = (n)d0.p(d0.Z - 1);
                if((n2.b0 & 0x400) != 0) {
                    n n3 = n2;
                    while(n3 != null) {
                        if((n3.Z & 0x400) != 0) {
                            W.d d1 = null;
                            n n4 = n3;
                            while(n4 != null) {
                                if(n4 instanceof q) {
                                    if(((q)n4).n0 != null) {
                                        int v = ((q)n4).y0().ordinal();
                                        if(v != 0 && v != 1 && v != 2) {
                                            if(v != 3) {
                                                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                                            }
                                            return false;
                                        }
                                        return true;
                                    }
                                }
                                else if((n4.Z & 0x400) != 0 && n4 instanceof F0.n) {
                                    n n5 = ((F0.n)n4).m0;
                                    int v1 = 0;
                                    while(n5 != null) {
                                        if((n5.Z & 0x400) != 0) {
                                            ++v1;
                                            if(v1 == 1) {
                                                n4 = n5;
                                            }
                                            else {
                                                if(d1 == null) {
                                                    d1 = new W.d(new n[16]);
                                                }
                                                if(n4 != null) {
                                                    d1.c(n4);
                                                    n4 = null;
                                                }
                                                d1.c(n5);
                                            }
                                        }
                                        n5 = n5.d0;
                                    }
                                    if(v1 != 1) {
                                        goto label_43;
                                    }
                                    continue;
                                }
                            label_43:
                                n4 = f.f(d1);
                            }
                        }
                        n3 = n3.d0;
                    }
                }
                f.b(d0, n2);
            }
            return false;
        }
        b.T("visitSubtreeIf called on an unattached node");
        throw null;
    }
}

