package B;

import Ab.t;
import D0.M;
import D0.V;
import I.F;
import I.P0;
import I.T0;
import I.j0;
import I.k0;
import I.t0;
import J2.w;
import M.o;
import M0.a;
import M0.i;
import N.C0;
import N.D0;
import Nb.j;
import Nb.k;
import O0.G;
import O0.K;
import O0.L;
import O0.N;
import O0.f;
import O0.s;
import R.X;
import R.Y;
import R.z0;
import S.n;
import U0.B;
import U0.H;
import U0.v;
import Xb.D;
import Xb.J;
import Xb.r0;
import a1.g;
import android.graphics.Canvas;
import android.view.DragEvent;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.focus.b;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.LifecycleOwner;
import e0.p;
import j0.c;
import java.util.List;
import java.util.concurrent.CancellationException;
import k2.f0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import l0.q;
import n0.O;
import n0.Q;
import n0.W;
import n0.h;
import n0.r;
import p0.d;
import p0.e;
import u.C;
import v.d0;
import y.W0;
import y.q0;
import yc.l;

public final class m0 extends k implements Function1 {
    public final int X;
    public final Object Y;
    public final Object Z;
    public final Object b0;

    public m0(o0 o00, M m0, V v0) {
        this.X = 1;
        this.b0 = o00;
        this.Y = m0;
        this.Z = v0;
        super(1);
    }

    public m0(M m0, n n0, V v0) {
        this.X = 11;
        this.Y = m0;
        this.b0 = n0;
        this.Z = v0;
        super(1);
    }

    public m0(V v0, M m0, s0 s00) {
        this.X = 3;
        this.Z = v0;
        this.Y = m0;
        this.b0 = s00;
        super(1);
    }

    public m0(Object object0, Object object1, Object object2, int v) {
        this.X = v;
        this.b0 = object0;
        this.Z = object1;
        this.Y = object2;
        super(1);
    }

    public m0(q q0, b b0, Function1 function10) {
        this.X = 19;
        this.b0 = q0;
        this.Z = b0;
        this.Y = (k)function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        G g3;
        G g2;
        boolean z = false;
        AndroidComposeView androidComposeView0 = null;
        Object object1 = t.a;
        Object object2 = this.Z;
        Object object3 = this.Y;
        Object object4 = this.b0;
        switch(this.X) {
            case 0: {
                if(((n0)object4).n0) {
                    Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), ((V)object2), ((M)object3).I(((n0)object4).l0), ((M)object3).I(((n0)object4).m0));
                    return object1;
                }
                Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), ((V)object2), ((M)object3).I(((n0)object4).l0), ((M)object3).I(((n0)object4).m0));
                return object1;
            }
            case 1: {
                long v4 = ((g)((o0)object4).l0.n(((M)object3))).a;
                if(((o0)object4).m0) {
                    Placeable.PlacementScope.g(((Placeable.PlacementScope)object0), ((V)object2), ((int)(v4 >> 0x20)), ((int)(v4 & 0xFFFFFFFFL)));
                    return object1;
                }
                Placeable.PlacementScope.h(((Placeable.PlacementScope)object0), ((V)object2), ((int)(v4 >> 0x20)), ((int)(v4 & 0xFFFFFFFFL)), null, 12);
                return object1;
            }
            case 2: {
                if(((p0)object4).p0) {
                    Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), ((V)object2), ((M)object3).I(((p0)object4).l0), ((M)object3).I(((p0)object4).m0));
                    return object1;
                }
                Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), ((V)object2), ((M)object3).I(((p0)object4).l0), ((M)object3).I(((p0)object4).m0));
                return object1;
            }
            case 3: {
                Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), ((V)object2), ((M)object3).I(((s0)object4).l0.b(((M)object3).getLayoutDirection())), ((M)object3).I(((s0)object4).l0.c()));
                return object1;
            }
            case 4: {
                ((MutableState)object2).setValue(((B)object0));
                boolean z1 = j.a(((String)((MutableState)object3).getValue()), ((B)object0).a.X);
                f f3 = ((B)object0).a;
                ((MutableState)object3).setValue(f3.X);
                if(!z1) {
                    ((Function1)object4).n(f3.X);
                }
                return object1;
            }
            case 5: {
                P0 p00 = ((j0)object4).d();
                if(p00 != null) {
                    n0.t t0 = ((d)object0).A().o();
                    long v5 = ((N)((j0)object4).x.getValue()).a;
                    long v6 = ((N)((j0)object4).y.getValue()).a;
                    long v7 = ((j0)object4).w;
                    L l0 = p00.a;
                    h h0 = ((j0)object4).v;
                    K k0 = l0.a;
                    if(!N.b(v5)) {
                        h0.w(v7);
                        int v8 = ((v)object3).l(N.e(v5));
                        int v9 = ((v)object3).l(N.d(v5));
                        if(v8 != v9) {
                            t0.q(l0.k(v8, v9), h0);
                        }
                    }
                    else if(N.b(v6)) {
                        long v15 = ((B)object2).b;
                        if(!N.b(v15)) {
                            h0.w(v7);
                            int v16 = ((v)object3).l(N.e(v15));
                            int v17 = ((v)object3).l(N.d(v15));
                            if(v16 != v17) {
                                t0.q(l0.k(v16, v17), h0);
                            }
                        }
                    }
                    else {
                        long v10 = k0.b.b();
                        n0.v v11 = new n0.v(v10);
                        if(v10 == 16L) {
                            v11 = null;
                        }
                        long v12 = v11 == null ? n0.v.b : v11.a;
                        h0.w(n0.v.b(n0.v.d(v12) * 0.2f, v12));
                        int v13 = ((v)object3).l(N.e(v6));
                        int v14 = ((v)object3).l(N.d(v6));
                        if(v13 != v14) {
                            t0.q(l0.k(v13, v14), h0);
                        }
                    }
                    boolean z2 = l0.d() && k0.f != 3;
                    if(z2) {
                        t0.n();
                        t0.s(l.g(0L, w.m(((int)(l0.c >> 0x20)), ((int)(l0.c & 0xFFFFFFFFL)))), 1);
                    }
                    G g0 = k0.b.a;
                    Z0.j j0 = g0.m;
                    Z0.n n0 = g0.a;
                    if(j0 == null) {
                        j0 = Z0.j.b;
                    }
                    Q q0 = g0.n == null ? Q.d : g0.n;
                    e e0 = g0.p;
                    if(e0 == null) {
                        e0 = p0.g.a;
                    }
                    try {
                        r r0 = n0.e();
                        Z0.l l1 = Z0.l.a;
                        s s0 = l0.b;
                        if(r0 == null) {
                            s.g(s0, t0, (n0 == l1 ? n0.v.b : n0.b()), q0, j0, e0);
                            goto label_104;
                        label_101:
                            if(!z2) {
                                throw throwable0;
                            }
                            goto label_102;
                        }
                        else {
                            s.h(s0, t0, r0, (n0 == l1 ? 1.0f : n0.a()), q0, j0, e0);
                        }
                        goto label_104;
                    }
                    catch(Throwable throwable0) {
                        goto label_101;
                    }
                label_102:
                    t0.l();
                    throw throwable0;
                label_104:
                    if(z2) {
                        t0.l();
                        return object1;
                    }
                    return object1;
                }
                return object1;
            }
            case 6: {
                H h1 = (H)((Nb.w)object3).X;
                B b0 = ((R2.k)object4).C(((List)object0));
                if(h1 != null) {
                    h1.a(null, b0);
                }
                ((F)object2).n(b0);
                return object1;
            }
            case 7: {
                Object object5 = ((O0.d)object2).a;
                O0.M m0 = ((O0.q)object5).a();
                G g1 = m0 == null ? null : m0.a;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState0 = ((k0)object3).a;
                if((parcelableSnapshotMutableIntState0.k() & 1) != 0) {
                    z = true;
                }
                if(z) {
                    O0.M m1 = ((O0.q)object5).a();
                    g2 = m1 == null ? null : m1.b;
                }
                else {
                    g2 = null;
                }
                ((T0)object4).getClass();
                if(g1 != null) {
                    g2 = g1.c(g2);
                }
                if((parcelableSnapshotMutableIntState0.k() & 2) == 0) {
                    g3 = null;
                }
                else {
                    O0.M m2 = ((O0.q)object5).a();
                    g3 = m2 == null ? null : m2.c;
                }
                if(g2 != null) {
                    g3 = g2.c(g3);
                }
                if((parcelableSnapshotMutableIntState0.k() & 4) != 0) {
                    O0.M m3 = ((O0.q)object5).a();
                    if(m3 != null) {
                        androidComposeView0 = m3.d;
                    }
                }
                if(g3 != null) {
                    androidComposeView0 = g3.c(((G)androidComposeView0));
                }
                if(androidComposeView0 != null) {
                    ((t0)object0).a.b(((G)androidComposeView0), ((O0.d)object2).b, ((O0.d)object2).c);
                }
                return object1;
            }
            case 8: {
                ((M.l)object4).getClass();
                M.l.n(((s.v)object2), ((M.q)object3), ((o)object0), 0, ((o)object0).f.a.a.X.length());
                return object1;
            }
            case 9: {
                Tb.e e1 = M0.s.a[2];
                M0.q.d.a(((M0.j)object0), ((String)object4));
                if(((D0)((C0)object2).a.d.getValue()) == D0.Y) {
                    a a0 = new a(null, new D.j(((C0)object2), 16, ((dc.e)object3)));
                    ((M0.j)object0).c(i.t, a0);
                }
                return object1;
            }
            case 10: {
                J.q(((dc.e)object4), null, null, new Y(((z0)object2), ((Number)object0).floatValue(), null), 3).q(new X(((z0)object2), ((Function0)object3), 1));
                return object1;
            }
            case 11: {
                float f4 = ((M)object3).s() ? ((n)object4).l0.h().c(((n)object4).l0.e.getValue()) : ((n)object4).l0.l();
                float f5 = ((n)object4).n0 == q0.Y ? f4 : 0.0f;
                if(((n)object4).n0 != q0.X) {
                    f4 = 0.0f;
                }
                Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), ((V)object2), Pb.a.H(f5), Pb.a.H(f4));
                return object1;
            }
            case 12: {
                Throwable throwable1 = (Throwable)object0;
                if(object4 != Zb.k.l) {
                    CoroutineContext coroutineContext0 = ((gc.e)(((gc.f)object3))).X;
                    Ab.e e2 = dc.a.a(((Zb.i)object2).Y, object4, null);
                    if(e2 != null) {
                        D.a(e2, coroutineContext0);
                    }
                }
                return object1;
            }
            case 13: {
                U.F f6 = (U.F)object0;
                ((c.L)object4).a(((LifecycleOwner)object2), ((d.a)object3));
                return new E.B(8, ((d.a)object3));
            }
            case 14: {
                U.F f7 = (U.F)object0;
                if(((d0.h)object4).b.containsKey(object2)) {
                    throw new IllegalArgumentException(("Key " + object2 + " was used multiple times ").toString());
                }
                ((d0.h)object4).a.remove(object2);
                ((d0.h)object4).b.put(object2, ((d0.f)object3));
                return new d0.g(((d0.f)object3), ((d0.h)object4), object2);
            }
            case 15: {
                n0.t t1 = ((d)object0).A().o();
                if(((d1.o)object4).getView().getVisibility() != 8) {
                    ((d1.o)object4).v0 = true;
                    AndroidComposeView androidComposeView1 = ((LayoutNode)object2).g0;
                    if(androidComposeView1 instanceof AndroidComposeView) {
                        androidComposeView0 = androidComposeView1;
                    }
                    if(androidComposeView0 != null) {
                        Canvas canvas0 = n0.d.a(t1);
                        androidComposeView0.getAndroidViewsHandler$ui_release().getClass();
                        ((d1.o)object3).draw(canvas0);
                    }
                    ((d1.o)object4).v0 = false;
                }
                return object1;
            }
            case 16: {
                Throwable throwable2 = (Throwable)object0;
                Ab.e e3 = dc.a.a(((Function1)object4), object2, null);
                if(e3 != null) {
                    D.a(e3, ((CoroutineContext)object3));
                }
                return object1;
            }
            case 17: {
                if(F0.f.w(((c)object2)).getDragAndDropManager().a(((c)(((F0.q0)object0))))) {
                    DragEvent dragEvent0 = (DragEvent)((g.a)object3).Y;
                    if(Bb.F.g(((c)(((F0.q0)object0))), yc.d.d(dragEvent0.getX(), dragEvent0.getY()))) {
                        ((Nb.w)object4).X = (F0.q0)object0;
                        return F0.p0.Z;
                    }
                }
                return F0.p0.X;
            }
            case 18: {
                return a8.Q.c(((a8.Q)object4), ((k2.q)object0), ((f0)object2), ((f0)object3));
            }
            case 19: {
                if(!j.a(((q)object0), ((q)object4))) {
                    if(j.a(((q)object0), ((b)object2).f)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    return Boolean.valueOf(((Boolean)((Function1)(((k)object3))).n(((q)object0))).booleanValue());
                }
                return Boolean.valueOf(false);
            }
            case 20: {
                U.F f8 = (U.F)object0;
                return new d0.g(((p)object4), object2, ((u.k)object3));
            }
            case 21: {
                ((O)object0).a((((d0)object4) == null ? 1.0f : ((Number)((d0)object4).getValue()).floatValue()));
                ((O)object0).h((((d0)object2) == null ? 1.0f : ((Number)((d0)object2).getValue()).floatValue()));
                ((O)object0).i((((d0)object2) == null ? 1.0f : ((Number)((d0)object2).getValue()).floatValue()));
                ((O)object0).m((((d0)object3) == null ? W.b : ((W)((d0)object3).getValue()).a));
                return object1;
            }
            case 22: {
                switch(((u.t)object0).ordinal()) {
                    case 0: {
                        u.H h2 = ((C)object2).a.c;
                        if(h2 != null) {
                            androidComposeView0 = new W(h2.b);
                            return androidComposeView0 == null ? new W(W.b) : new W(androidComposeView0.a);
                        }
                        u.H h3 = ((u.D)object3).a.c;
                        if(h3 != null) {
                            androidComposeView0 = new W(h3.b);
                            return androidComposeView0 == null ? new W(W.b) : new W(androidComposeView0.a);
                        }
                        break;
                    }
                    case 1: {
                        androidComposeView0 = (W)object4;
                        return androidComposeView0 == null ? new W(W.b) : new W(androidComposeView0.a);
                    }
                    case 2: {
                        u.H h4 = ((u.D)object3).a.c;
                        if(h4 != null) {
                            androidComposeView0 = new W(h4.b);
                            return androidComposeView0 == null ? new W(W.b) : new W(androidComposeView0.a);
                        }
                        u.H h5 = ((C)object2).a.c;
                        if(h5 != null) {
                            androidComposeView0 = new W(h5.b);
                            return androidComposeView0 == null ? new W(W.b) : new W(androidComposeView0.a);
                        }
                        break;
                    }
                    default: {
                        throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }
                return new W(W.b);
            }
            default: {
                float f = ((Number)object0).floatValue();
                float f1 = ((y.D)object4).n0 ? 1.0f : -1.0f;
                long v = ((y.D)object4).m0.g(f1 * f);
                long v1 = ((y.D)object4).m0.d(v);
                long v2 = W0.a(((y.T0)object3).a, ((y.T0)object3).a.h, v1, 1);
                long v3 = ((y.D)object4).m0.d(v2);
                float f2 = ((y.D)object4).m0.f(v3) * f1;
                if(Math.abs(f2) < Math.abs(f)) {
                    CancellationException cancellationException0 = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + f2 + " < " + f + ')');
                    cancellationException0.initCause(null);
                    ((r0)object2).f(cancellationException0);
                }
                return object1;
            }
        }
    }
}

