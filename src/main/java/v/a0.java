package v;

import Ab.t;
import J2.w;
import Nb.k;
import a1.d;
import a1.e;
import a1.g;
import android.support.v4.media.session.a;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m0.b;
import m0.c;

public final class a0 extends k implements Function1 {
    public final int X;
    public static final a0 Y;
    public static final a0 Z;
    public static final a0 b0;
    public static final a0 c0;
    public static final a0 d0;
    public static final a0 e0;
    public static final a0 f0;
    public static final a0 g0;
    public static final a0 h0;
    public static final a0 i0;
    public static final a0 j0;
    public static final a0 k0;
    public static final a0 l0;
    public static final a0 m0;
    public static final a0 n0;
    public static final a0 o0;
    public static final a0 p0;
    public static final a0 q0;
    public static final a0 r0;
    public static final a0 s0;

    static {
        a0.Y = new a0(1, 0);
        a0.Z = new a0(1, 1);
        a0.b0 = new a0(1, 2);
        a0.c0 = new a0(1, 3);
        a0.d0 = new a0(1, 4);
        a0.e0 = new a0(1, 5);
        a0.f0 = new a0(1, 6);
        a0.g0 = new a0(1, 7);
        a0.h0 = new a0(1, 8);
        a0.i0 = new a0(1, 9);
        a0.j0 = new a0(1, 10);
        a0.k0 = new a0(1, 11);
        a0.l0 = new a0(1, 12);
        a0.m0 = new a0(1, 13);
        a0.n0 = new a0(1, 14);
        a0.o0 = new a0(1, 15);
        a0.p0 = new a0(1, 16);
        a0.q0 = new a0(1, 17);
        a0.r0 = new a0(1, 18);
        a0.s0 = new a0(1, 19);
    }

    public a0(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                j j0 = (j)object0;
                return t.a;
            }
            case 1: {
                ((Function0)object0).invoke();
                return t.a;
            }
            case 2: {
                return new n(Float.intBitsToFloat(((int)(((e)object0).a >> 0x20))), Float.intBitsToFloat(((int)(((e)object0).a & 0xFFFFFFFFL))));
            }
            case 3: {
                return new e(((long)Float.floatToRawIntBits(((n)object0).a)) << 0x20 | ((long)Float.floatToRawIntBits(((n)object0).b)) & 0xFFFFFFFFL);
            }
            case 4: {
                return new m(((d)object0).X);
            }
            case 5: {
                return new d(((m)object0).a);
            }
            case 6: {
                return new m(((Number)object0).floatValue());
            }
            case 7: {
                return (float)((m)object0).a;
            }
            case 8: {
                return new n(((float)(((int)(((g)object0).a >> 0x20)))), ((float)(((int)(((g)object0).a & 0xFFFFFFFFL)))));
            }
            case 9: {
                return new g(a.i(Math.round(((n)object0).a), Math.round(((n)object0).b)));
            }
            case 10: {
                return new n(((float)(((int)(((IntSize)object0).a >> 0x20)))), ((float)(((int)(((IntSize)object0).a & 0xFFFFFFFFL)))));
            }
            case 11: {
                int v = Math.round(((n)object0).a);
                int v1 = 0;
                if(v < 0) {
                    v = 0;
                }
                int v2 = Math.round(((n)object0).b);
                if(v2 >= 0) {
                    v1 = v2;
                }
                return new IntSize(io.sentry.config.a.d(v, v1));
            }
            case 12: {
                return new m(((float)((Number)object0).intValue()));
            }
            case 13: {
                return (int)((m)object0).a;
            }
            case 14: {
                return new n(b.d(((b)object0).a), b.e(((b)object0).a));
            }
            case 15: {
                return new b(yc.d.d(((n)object0).a, ((n)object0).b));
            }
            case 16: {
                return new p(((c)object0).a, ((c)object0).b, ((c)object0).c, ((c)object0).d);
            }
            case 17: {
                return new c(((p)object0).a, ((p)object0).b, ((p)object0).c, ((p)object0).d);
            }
            case 18: {
                return new n(m0.e.d(((m0.e)object0).a), m0.e.b(((m0.e)object0).a));
            }
            default: {
                return new m0.e(w.m(((n)object0).a, ((n)object0).b));
            }
        }
    }
}

