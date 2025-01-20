package q9;

import Ab.t;
import Eb.a;
import Fb.j;
import N2.l;
import W5.f;
import ac.i;
import ac.j0;
import ac.o0;
import bc.n;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;

public final class q extends j implements Function3 {
    public final int c0;
    public int d0;
    public i e0;
    public Object f0;
    public final String g0;
    public final w h0;

    public q(g g0, String s, w w0, int v) {
        this.c0 = v;
        this.g0 = s;
        this.h0 = w0;
        super(3, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        switch(this.c0) {
            case 0: {
                q q1 = new q(((g)object2), this.g0, this.h0, 0);
                q1.e0 = (i)object0;
                q1.f0 = object1;
                return q1.v(t.a);
            }
            case 1: {
                q q2 = new q(((g)object2), this.g0, this.h0, 1);
                q2.e0 = (i)object0;
                q2.f0 = object1;
                return q2.v(t.a);
            }
            case 2: {
                q q3 = new q(((g)object2), this.g0, this.h0, 2);
                q3.e0 = (i)object0;
                q3.f0 = object1;
                return q3.v(t.a);
            }
            case 3: {
                q q4 = new q(((g)object2), this.g0, this.h0, 3);
                q4.e0 = (i)object0;
                q4.f0 = object1;
                return q4.v(t.a);
            }
            default: {
                q q0 = new q(((g)object2), this.g0, this.h0, 4);
                q0.e0 = (i)object0;
                q0.f0 = object1;
                return q0.v(t.a);
            }
        }
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = t.a;
        w w0 = this.h0;
        String s = this.g0;
        switch(this.c0) {
            case 0: {
                a a1 = a.X;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        i i1 = this.e0;
                        n n1 = Nb.j.a(((String)this.f0), s) ? w0.h0 : new l(4, new Integer(0));
                        this.d0 = 1;
                        return o0.p(n1, i1, this) == a1 ? a1 : object1;
                    }
                    case 1: {
                        f.b0(object0);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 1: {
                a a2 = a.X;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        i i2 = this.e0;
                        h h0 = Nb.j.a(((String)this.f0), s) ? w0.e0 : new l(4, r1.d(0x7F120490, new Object[0]));  // string:voice_announcement_play_caption "Play announcement"
                        this.d0 = 1;
                        return o0.p(h0, i2, this) == a2 ? a2 : object1;
                    }
                    case 1: {
                        f.b0(object0);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 2: {
                a a3 = a.X;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        i i3 = this.e0;
                        h h1 = Nb.j.a(((String)this.f0), s) ? w0.d0 : new l(4, new Integer(0x7F0801D5));  // drawable:ic_audio_play
                        this.d0 = 1;
                        return o0.p(h1, i3, this) == a3 ? a3 : object1;
                    }
                    case 1: {
                        f.b0(object0);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 3: {
                a a4 = a.X;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        i i4 = this.e0;
                        j0 j00 = Nb.j.a(((String)this.f0), s) ? w0.b0 : new l(4, Boolean.FALSE);
                        this.d0 = 1;
                        return o0.p(j00, i4, this) == a4 ? a4 : object1;
                    }
                    case 1: {
                        f.b0(object0);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            default: {
                a a0 = a.X;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        i i0 = this.e0;
                        n n0 = Nb.j.a(((String)this.f0), s) ? w0.f0 : new l(4, new Integer(0));
                        this.d0 = 1;
                        return o0.p(n0, i0, this) == a0 ? a0 : object1;
                    }
                    case 1: {
                        f.b0(object0);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }
    }
}

