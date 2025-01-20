package l0;

import F0.f;
import W.d;
import kotlin.jvm.functions.Function1;

public final class m {
    public final d a;
    public static final m b;
    public static final m c;

    static {
        m.b = new m();
        m.c = new m();
    }

    public m() {
        this.a = new d(new n[16]);
    }

    public final boolean a(Function1 function10) {
        if(this == m.b || this == m.c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        d d0 = this.a;
        if(!d0.n()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        int v = d0.Z;
        if(v > 0) {
            Object[] arr_object = d0.X;
            int v1 = 0;
            boolean z = false;
            while(true) {
                g0.n n0 = ((g0.n)(((n)arr_object[v1]))).X;
                if(!n0.k0) {
                    break;
                }
                d d1 = new d(new g0.n[16]);
                g0.n n1 = n0.d0;
                if(n1 == null) {
                    f.b(d1, n0);
                }
                else {
                    d1.c(n1);
                }
            label_16:
                while(d1.n()) {
                    g0.n n2 = (g0.n)d1.p(d1.Z - 1);
                    if((n2.b0 & 0x400) == 0) {
                        f.b(d1, n2);
                    }
                    else {
                        while(n2 != null) {
                            if((n2.Z & 0x400) != 0) {
                                d d2 = null;
                                while(n2 != null) {
                                    if(!(n2 instanceof q)) {
                                        if((n2.Z & 0x400) != 0 && n2 instanceof F0.n) {
                                            g0.n n3 = ((F0.n)n2).m0;
                                            int v2 = 0;
                                            while(n3 != null) {
                                                if((n3.Z & 0x400) != 0) {
                                                    ++v2;
                                                    if(v2 == 1) {
                                                        n2 = n3;
                                                    }
                                                    else {
                                                        if(d2 == null) {
                                                            d2 = new d(new g0.n[16]);
                                                        }
                                                        if(n2 != null) {
                                                            d2.c(n2);
                                                            n2 = null;
                                                        }
                                                        d2.c(n3);
                                                    }
                                                }
                                                n3 = n3.d0;
                                            }
                                            if(v2 != 1) {
                                                goto label_49;
                                            }
                                            continue;
                                        }
                                    }
                                    else if((((q)n2).x0().a ? ((Boolean)function10.n(((q)n2))).booleanValue() : l0.d.i(((q)n2), 7, function10))) {
                                        z = true;
                                        break label_16;
                                    }
                                label_49:
                                    n2 = f.f(d2);
                                }
                                break;
                            }
                            n2 = n2.d0;
                        }
                    }
                }
                ++v1;
                if(v1 >= v) {
                    return z;
                }
            }
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        return false;
    }

    public final void b() {
        this.a(g.c0);
    }
}

