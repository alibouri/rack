package N2;

import Aa.t0;
import Ab.t;
import Ba.n;
import Ea.S0;
import Fb.j;
import Ha.S;
import R9.Q1;
import W5.f;
import ac.a;
import ac.e0;
import ac.h;
import ac.i;
import ac.q;
import bc.B;
import bc.c;
import bc.v;
import bc.w;
import ha.D2;
import ha.v2;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import ma.i0;
import o9.U0;
import o9.W0;
import p9.h0;
import q9.s;
import yc.d;

public final class l implements h {
    public final int X;
    public final Object Y;

    public l(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    public l(Function2 function20) {
        this.X = 5;
        super();
        this.Y = (j)function20;
    }

    @Override  // ac.h
    public final Object d(i i0, g g0) {
        B b1;
        Throwable throwable1;
        Object object9;
        a a0;
        int v2;
        i i1;
        l l0;
        int v1;
        ac.j j2;
        switch(this.X) {
            case 0: {
                Object object1 = c.a(i0, g0, new k(((h[])this.Y), 0), new S0(3, null, 2), ((h[])this.Y));
                return object1 != Eb.a.X ? t.a : object1;
            }
            case 1: {
                Na.j j0 = new Na.j(i0, 8);
                Object object2 = ((t0)this.Y).d(j0, g0);
                return object2 != Eb.a.X ? t.a : object2;
            }
            case 2: {
                Na.j j1 = new Na.j(i0, 22);
                Object object3 = ((Q1)this.Y).d(j1, g0);
                return object3 != Eb.a.X ? t.a : object3;
            }
            case 3: {
                if(g0 instanceof ac.j) {
                    j2 = (ac.j)g0;
                    int v = j2.c0;
                    if((v & 0x80000000) == 0) {
                        j2 = new ac.j(this, g0);
                    }
                    else {
                        j2.c0 = v ^ 0x80000000;
                    }
                }
                else {
                    j2 = new ac.j(this, g0);
                }
                Object object4 = j2.b0;
                Object object5 = Eb.a.X;
                switch(j2.c0) {
                    case 0: {
                        f.b0(object4);
                        v1 = 0;
                        l0 = this;
                        i1 = i0;
                        v2 = ((Object[])this.Y).length;
                        goto label_46;
                    }
                    case 1: {
                        v2 = j2.h0;
                        v1 = j2.g0;
                        i i2 = j2.f0;
                        l0 = j2.e0;
                        f.b0(object4);
                        i1 = i2;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(true) {
                    ++v1;
                label_46:
                    if(v1 >= v2) {
                        break;
                    }
                    j2.e0 = l0;
                    j2.f0 = i1;
                    j2.g0 = v1;
                    j2.h0 = v2;
                    j2.c0 = 1;
                    if(i1.c(((Object[])l0.Y)[v1], j2) != object5) {
                        continue;
                    }
                    return object5;
                }
                return t.a;
            }
            case 4: {
                Object object6 = i0.c(this.Y, g0);
                return object6 != Eb.a.X ? t.a : object6;
            }
            case 5: {
                if(g0 instanceof a) {
                    a0 = (a)g0;
                    int v3 = a0.e0;
                    if((v3 & 0x80000000) == 0) {
                        a0 = new a(this, g0);
                    }
                    else {
                        a0.e0 = v3 ^ 0x80000000;
                    }
                }
                else {
                    a0 = new a(this, g0);
                }
                Object object7 = a0.c0;
                Object object8 = Eb.a.X;
                t t0 = t.a;
                switch(a0.e0) {
                    case 0: {
                        f.b0(object7);
                        Nb.j.c(a0.Y);
                        B b0 = new B(i0, a0.Y);
                        try {
                            a0.b0 = b0;
                            a0.e0 = 1;
                            object9 = ((Function2)(((j)this.Y))).j(b0, a0);
                        }
                        catch(Throwable throwable0) {
                            throwable1 = throwable0;
                            b1 = b0;
                            b1.w();
                            throw throwable1;
                        }
                        if(object9 != object8) {
                            object9 = t0;
                        }
                        if(object9 != object8) {
                            b1 = b0;
                            break;
                        }
                        return object8;
                    }
                    case 1: {
                        try {
                            b1 = a0.b0;
                            f.b0(object7);
                            break;
                        }
                        catch(Throwable throwable1) {
                        }
                        b1.w();
                        throw throwable1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                b1.w();
                return t0;
            }
            case 6: {
                w w0 = new w(((q)this.Y), i0, null);
                v v4 = new v(g0, g0.a());  // initializer: Ldc/s;-><init>(Lkotlin/coroutines/g;Lkotlin/coroutines/CoroutineContext;)V
                Object object10 = d.D(v4, v4, w0);
                return object10 != Eb.a.X ? t.a : object10;
            }
            case 7: {
                U2.i i3 = new U2.i(i0, 10);
                Object object11 = ((s)this.Y).d(i3, g0);
                return object11 != Eb.a.X ? t.a : object11;
            }
            case 8: {
                D2 d20 = new D2(i0, 21);
                Object object12 = ((n)this.Y).d(d20, g0);
                return object12 != Eb.a.X ? t.a : object12;
            }
            case 9: {
                D2 d21 = new D2(i0, 23);
                Object object13 = ((v2)this.Y).d(d21, g0);
                return object13 != Eb.a.X ? t.a : object13;
            }
            case 10: {
                D2 d22 = new D2(i0, 26);
                Object object14 = ((n)this.Y).d(d22, g0);
                return object14 != Eb.a.X ? t.a : object14;
            }
            case 11: {
                D2 d23 = new D2(i0, 28);
                Object object15 = ((S)this.Y).d(d23, g0);
                return object15 != Eb.a.X ? t.a : object15;
            }
            case 12: {
                i0 i00 = new i0(i0, 10);
                Object object16 = ((e0)this.Y).d(i00, g0);
                return object16 != Eb.a.X ? t.a : object16;
            }
            case 13: {
                W0 w00 = new W0(i0, 0);
                Object object17 = ((U0)this.Y).d(w00, g0);
                return object17 != Eb.a.X ? t.a : object17;
            }
            case 14: {
                W0 w01 = new W0(i0, 3);
                Object object18 = ((U0)this.Y).d(w01, g0);
                return object18 != Eb.a.X ? t.a : object18;
            }
            case 15: {
                W0 w02 = new W0(i0, 12);
                Object object19 = ((U0)this.Y).d(w02, g0);
                return object19 != Eb.a.X ? t.a : object19;
            }
            case 16: {
                W0 w03 = new W0(i0, 13);
                Object object20 = ((U0)this.Y).d(w03, g0);
                return object20 != Eb.a.X ? t.a : object20;
            }
            case 17: {
                h0 h01 = new h0(i0, 3);
                Object object21 = ((ac.B)this.Y).d(h01, g0);
                return object21 != Eb.a.X ? t.a : object21;
            }
            case 18: {
                h0 h02 = new h0(i0, 4);
                Object object22 = ((Na.f)this.Y).d(h02, g0);
                return object22 != Eb.a.X ? t.a : object22;
            }
            default: {
                h0 h00 = new h0(i0, 6);
                Object object0 = ((bc.n)this.Y).d(h00, g0);
                return object0 != Eb.a.X ? t.a : object0;
            }
        }
    }
}

