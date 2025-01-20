package k2;

import Ab.t;
import Bb.q;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.J;
import ac.B0;
import ac.j0;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import l2.b;

public final class m1 extends j implements Function2 {
    public int c0;
    public final q0 d0;
    public final b e0;
    public final h1 f0;

    public m1(q0 q00, b b0, h1 h10, g g0) {
        this.d0 = q00;
        this.e0 = b0;
        this.f0 = h10;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((m1)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new m1(this.d0, this.e0, this.f0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        Object object2 = t.a;
        boolean z = true;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                q0 q00 = this.d0;
                if(q00 instanceof p0) {
                    ((p0)this.d0).getClass();
                    List list0 = q.K(new T1(0, null));
                    ((p0)this.d0).getClass();
                    this.c0 = 1;
                    if(b.a(this.e0, list0, 0, 0, false, null, null, this.f0.c, this) == object1) {
                        return object1;
                    }
                }
                else if(q00 instanceof n0 && ((n0)q00).a == g0.X) {
                    this.c0 = 2;
                    if(b.a(this.e0, ((n0)q00).b, ((n0)q00).c, ((n0)q00).d, true, ((n0)q00).e, ((n0)q00).f, this.f0.c, this) == object1) {
                        return object1;
                    }
                }
                else if(q00 instanceof n0) {
                    if(((Boolean)this.e0.i.getValue()).booleanValue()) {
                        this.c0 = 3;
                        if(J.A(this) != object1) {
                            goto label_34;
                        }
                        return object1;
                    }
                    else {
                        goto label_34;
                    }
                }
                else if(q00 instanceof k0) {
                    if(((Boolean)this.e0.i.getValue()).booleanValue()) {
                        this.c0 = 5;
                        if(J.A(this) != object1) {
                            goto label_74;
                        }
                        return object1;
                    }
                    else {
                        goto label_74;
                    }
                }
                else if(q00 instanceof o0) {
                    this.e0.d.M(((o0)q00).a, ((o0)q00).b);
                }
                break;
            }
            case 1: 
            case 2: {
                f.b0(object0);
                break;
            }
            case 3: {
                f.b0(object0);
            label_34:
                this.e0.c.h(this.d0);
                this.c0 = 4;
                O o0 = this.e0.l.c.b();
                this.e0.l.d.setValue(o0);
                if(object2 == object1) {
                    return object1;
                }
                goto label_41;
            }
            case 4: {
                f.b0(object0);
            label_41:
                this.e0.d.M(((n0)this.d0).e, ((n0)this.d0).f);
                k2.q q0 = (k2.q)((B0)((j0)this.e0.d.b0).X).getValue();
                f0 f00 = q0 == null ? null : q0.d;
                if(f00 == null) {
                    throw new IllegalStateException("PagingDataPresenter.combinedLoadStatesCollection.stateFlow should not hold null CombinedLoadStates after Insert event.");
                }
                n0 n00 = (n0)this.d0;
                boolean z1 = (n00.a != g0.Y || !f00.b.a) && (n00.a != g0.Z || !f00.c.a);
                Iterable iterable0 = n00.b;
                if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                    for(Object object3: iterable0) {
                        if(!((T1)object3).b.isEmpty()) {
                            z = false;
                            break;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                if(!z1) {
                    this.e0.g = false;
                }
                else if(this.e0.g || z) {
                    if(z) {
                    label_67:
                        b b2 = this.e0;
                        K k0 = b2.b;
                        if(k0 != null) {
                            k0.a(b2.c.b(b2.h));
                            break;
                        }
                    }
                    else {
                        b b0 = this.e0;
                        if(this.e0.h >= b0.c.Z) {
                            b b1 = this.e0;
                            if(b0.h <= b1.c.Z + b1.c.Y) {
                                b1.g = false;
                                break;
                            }
                        }
                        goto label_67;
                    }
                }
                break;
            }
            case 5: {
                f.b0(object0);
            label_74:
                this.e0.c.h(this.d0);
                this.c0 = 6;
                O o1 = this.e0.l.c.b();
                this.e0.l.d.setValue(o1);
                if(object2 == object1) {
                    return object1;
                }
                goto label_81;
            }
            case 6: {
                f.b0(object0);
            label_81:
                this.e0.d.getClass();
                Nb.j.f(((k0)this.d0).a, "type");
                T0.G g0 = new T0.G(((k0)this.d0).a, 14, this.e0.d);
                this.e0.d.j(g0);
                this.e0.g = false;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(this.d0 instanceof n0 || this.d0 instanceof k0 || this.d0 instanceof p0) {
            for(Object object4: this.e0.e) {
                ((Function0)object4).invoke();
            }
        }
        return object2;
    }
}

