package w;

import A.k;
import A.m;
import Ab.t;
import Eb.a;
import F0.W;
import F0.o0;
import F0.q0;
import Fb.j;
import M.O;
import Nb.s;
import W.d;
import W5.f;
import Xb.G;
import Xb.Q;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.LayoutNode;
import g0.n;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import y.x0;

public final class c extends j implements Function2 {
    public m c0;
    public int d0;
    public final w.j e0;
    public final long f0;
    public final k g0;

    public c(w.j j0, long v, k k0, g g0) {
        this.e0 = j0;
        this.f0 = v;
        this.g0 = k0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((c)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new c(this.e0, this.f0, this.g0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        m m1;
        boolean z1;
        boolean z;
        Object object1 = a.X;
        w.j j0 = this.e0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                j0.getClass();
                s s0 = new s();  // initializer: Ljava/lang/Object;-><init>()V
                y.t t0 = x0.m0;
                O o0 = new O(s0, 2);
                n n0 = j0.X;
                if(!n0.k0) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                n n1 = n0.c0;
                LayoutNode layoutNode0 = F0.f.v(j0);
            label_13:
                while(layoutNode0 != null) {
                    if((((n)layoutNode0.u0.f).b0 & 0x40000) != 0) {
                        while(n1 != null) {
                            if((n1.Z & 0x40000) != 0) {
                                n n2 = n1;
                                d d0 = null;
                                while(n2 != null) {
                                    if(!(n2 instanceof q0)) {
                                        if((n2.Z & 0x40000) != 0 && n2 instanceof F0.n) {
                                            n n3 = ((F0.n)n2).m0;
                                            int v = 0;
                                            while(n3 != null) {
                                                if((n3.Z & 0x40000) != 0) {
                                                    ++v;
                                                    if(v == 1) {
                                                        n2 = n3;
                                                    }
                                                    else {
                                                        if(d0 == null) {
                                                            d0 = new d(new n[16]);
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
                                                goto label_41;
                                            }
                                            continue;
                                        }
                                    }
                                    else if(!(t0.equals(((q0)n2).p()) ? ((Boolean)o0.n(((q0)n2))).booleanValue() : true)) {
                                        break label_13;
                                    }
                                label_41:
                                    n2 = F0.f.f(d0);
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
                if(s0.X) {
                    z1 = true;
                }
                else {
                    for(ViewParent viewParent0 = F0.f.x(j0).getParent(); true; viewParent0 = ((ViewGroup)viewParent0).getParent()) {
                        z = false;
                        if(viewParent0 == null || !(viewParent0 instanceof ViewGroup)) {
                            break;
                        }
                        if(((ViewGroup)viewParent0).shouldDelayChildPressedState()) {
                            z = true;
                            break;
                        }
                    }
                    z1 = z;
                }
                if(z1) {
                    this.d0 = 1;
                    if(Q.b(w.a, this) == object1) {
                        return object1;
                    }
                }
                goto label_75;
            }
            case 1: {
                f.b0(object0);
            label_75:
                m m0 = new m(this.f0);
                this.c0 = m0;
                this.d0 = 2;
                if(this.g0.a(m0, this) == object1) {
                    return object1;
                }
                m1 = m0;
                break;
            }
            case 2: {
                m1 = this.c0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        j0.x0 = m1;
        return t.a;
    }
}

