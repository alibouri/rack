package Fa;

import Ab.t;
import B.v;
import B.y;
import C.c;
import J2.w;
import M6.b;
import N.m2;
import Nb.j;
import O0.O;
import U.p;
import Z0.i;
import com.wave.customer.scratchCardRewards.components.g;
import db.a;
import kotlin.jvm.functions.Function3;
import yc.d;
import yc.l;

public final class n implements Function3 {
    public final int X;
    public static final n Y;
    public static final n Z;
    public static final n b0;
    public static final n c0;
    public static final n d0;
    public static final n e0;
    public static final n f0;
    public static final n g0;
    public static final n h0;
    public static final n i0;

    static {
        n.Y = new n(0);
        n.Z = new n(1);
        n.b0 = new n(2);
        n.c0 = new n(3);
        n.d0 = new n(4);
        n.e0 = new n(5);
        n.f0 = new n(6);
        n.g0 = new n(7);
        n.h0 = new n(8);
        n.i0 = new n(9);
    }

    public n(int v) {
        this.X = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        switch(this.X) {
            case 0: {
                int v1 = ((Number)object2).intValue();
                j.f(((y)object0), "<this>");
                if((v1 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                }
                return t.a;
            }
            case 1: {
                int v2 = ((Number)object2).intValue();
                j.f(((v)object0), "$this$PathComponent");
                if((v2 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                g.r(0, ((p)object1));
                return t.a;
            }
            case 2: {
                int v3 = ((Number)object2).intValue();
                j.f(((c)object0), "$this$item");
                if((v3 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                g.m(-1, null, null, ((p)object1), 6, 6);
                return t.a;
            }
            case 3: {
                int v4 = ((Number)object2).intValue();
                j.f(((c)object0), "$this$item");
                if((v4 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                g.s(0, ((p)object1));
                return t.a;
            }
            case 4: {
                int v5 = ((Number)object2).intValue();
                j.f(((c)object0), "$this$item");
                if((v5 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                g.e(0, ((p)object1));
                return t.a;
            }
            case 5: {
                int v6 = ((Number)object2).intValue();
                j.f(((v)object0), "$this$PathComponent");
                if((v6 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                b.d(l.y(0x7F080218, ((p)object1), 0), "", null, null, null, 0.0f, null, ((p)object1), 0x30, 0x7C);  // drawable:ic_clock
                return t.a;
            }
            case 6: {
                int v7 = ((Number)object2).intValue();
                j.f(((v)object0), "$this$PathComponent");
                if((v7 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                String s = w.S(0x7F12038D, ((p)object1));  // string:rewards_path_end "More rewards coming soon!"
                O o0 = db.b.a(((a)((p)object1).k(db.b.d)).a, ((p)object1));
                long v8 = d.h(0x7F060048, ((p)object1));  // color:WaveBlue500
                m2.b(s, androidx.compose.foundation.layout.c.n(g0.l.X, 70.0f), v8, 0L, null, null, null, 0L, null, new i(3), 0L, 0, false, 0, 0, null, o0, ((p)object1), 0x30, 0, 0xFDF8);
                return t.a;
            }
            case 7: {
                int v9 = ((Number)object2).intValue();
                j.f(((v)object0), "$this$PathComponent");
                if((v9 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                g.h(d.h(0x7F060173, ((p)object1)), 0L, ((p)object1), 0);  // color:rewards_blue
                return t.a;
            }
            case 8: {
                int v10 = ((Number)object2).intValue();
                j.f(((v)object0), "$this$PathComponent");
                if((v10 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                g.g(d.h(0x7F060043, ((p)object1)), ((p)object1), 0);  // color:WaveBlue100
                return t.a;
            }
            default: {
                int v = ((Number)object2).intValue();
                j.f(((v)object0), "<this>");
                if((v & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                }
                return t.a;
            }
        }
    }
}

