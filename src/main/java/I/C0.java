package I;

import Bb.F;
import W5.f;
import android.view.KeyEvent;
import x0.a;

public final class c0 implements b0 {
    public final int X;

    public c0(int v) {
        this.X = v;
        super();
    }

    @Override  // I.b0
    public final int a(KeyEvent keyEvent0) {
        boolean z = true;
        int v = 0;
        if(this.X != 0) {
            if(keyEvent0.isShiftPressed() && keyEvent0.isAltPressed()) {
                long v1 = f.f(keyEvent0.getKeyCode());
                if(a.a(v1, s0.i)) {
                    return 41;
                }
                if(a.a(v1, s0.j)) {
                    return 42;
                }
                if(a.a(v1, s0.k)) {
                    return 33;
                }
                if(a.a(v1, s0.l)) {
                    return 34;
                }
            }
            else if(keyEvent0.isAltPressed()) {
                long v2 = f.f(keyEvent0.getKeyCode());
                if(a.a(v2, s0.i)) {
                    return 9;
                }
                if(a.a(v2, s0.j)) {
                    return 10;
                }
                if(a.a(v2, s0.k)) {
                    return 15;
                }
                if(a.a(v2, s0.l)) {
                    v = 16;
                }
            }
            return v == 0 ? e0.a.a(keyEvent0) : v;
        }
        if(keyEvent0.isCtrlPressed() && keyEvent0.isShiftPressed()) {
            return a.a(f.f(keyEvent0.getKeyCode()), s0.g) ? 0x2F : 0;
        }
        if(keyEvent0.isCtrlPressed()) {
            long v3 = F.A(keyEvent0);
            if(!a.a(v3, s0.b)) {
                z = a.a(v3, s0.q);
            }
            if(z) {
                return 17;
            }
            if(a.a(v3, s0.d)) {
                return 18;
            }
            if(a.a(v3, s0.f)) {
                return 19;
            }
            if(a.a(v3, s0.a)) {
                return 26;
            }
            if(!a.a(v3, s0.e)) {
                return a.a(v3, s0.g) ? 46 : 0;
            }
            return 0x2F;
        }
        if(!keyEvent0.isCtrlPressed()) {
            if(keyEvent0.isShiftPressed()) {
                long v4 = f.f(keyEvent0.getKeyCode());
                if(a.a(v4, s0.i)) {
                    return 27;
                }
                if(a.a(v4, s0.j)) {
                    return 28;
                }
                if(a.a(v4, s0.k)) {
                    return 29;
                }
                if(a.a(v4, s0.l)) {
                    return 30;
                }
                if(a.a(v4, s0.m)) {
                    return 0x1F;
                }
                if(a.a(v4, s0.n)) {
                    return 0x20;
                }
                if(a.a(v4, s0.o)) {
                    return 39;
                }
                if(a.a(v4, s0.p)) {
                    return 40;
                }
                return a.a(v4, s0.q) ? 18 : 0;
            }
            long v5 = f.f(keyEvent0.getKeyCode());
            if(a.a(v5, s0.i)) {
                return 1;
            }
            if(a.a(v5, s0.j)) {
                return 2;
            }
            if(a.a(v5, s0.k)) {
                return 11;
            }
            if(a.a(v5, s0.l)) {
                return 12;
            }
            if(a.a(v5, s0.m)) {
                return 13;
            }
            if(a.a(v5, s0.n)) {
                return 14;
            }
            if(a.a(v5, s0.o)) {
                return 7;
            }
            if(a.a(v5, s0.p)) {
                return 8;
            }
            if(a.a(v5, s0.r)) {
                return 44;
            }
            if(a.a(v5, s0.s)) {
                return 20;
            }
            if(a.a(v5, s0.t)) {
                return 21;
            }
            if(!a.a(v5, s0.u)) {
                if(!a.a(v5, s0.v)) {
                    if(!a.a(v5, s0.w)) {
                        return a.a(v5, s0.x) ? 45 : 0;
                    }
                    return 17;
                }
                return 19;
            }
            return 18;
        }
        return 0;
    }
}

