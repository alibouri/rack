package D;

import A7.b;
import Ab.t;
import F0.G;
import F0.J;
import F0.L;
import F0.N;
import F0.O;
import F0.W;
import F0.c0;
import F0.l0;
import F0.n0;
import F0.o0;
import G0.H0;
import G0.J0;
import I.P0;
import I.T0;
import I.X;
import I.j0;
import I.t0;
import I2.I;
import J2.e;
import J2.u;
import J2.y;
import M.a0;
import M.b0;
import M.q;
import M.r0;
import N.C0;
import N.D0;
import N.S0;
import N.u0;
import N.v1;
import N.v;
import N.z1;
import Nb.k;
import Nb.w;
import Nb.z;
import O0.f;
import R.A0;
import R.G0;
import R.z0;
import S.s;
import Sb.d;
import U.C;
import U0.B;
import U0.m;
import a1.g;
import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.IntSize;
import androidx.work.impl.WorkDatabase;
import d1.o;
import e0.p;
import g0.n;
import io.sentry.config.a;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m0.c;
import s.E;
import yc.l;

public final class j extends k implements Function0 {
    public final int X;
    public final Object Y;
    public final Object Z;

    public j(Object object0, int v, Object object1) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object object8;
        long v12;
        f f3;
        Placeable.PlacementScope placeable$PlacementScope0;
        long v = 0x7FC000007FC00000L;
        Object object0 = null;
        switch(this.X) {
            case 0: {
                h h0 = (h)((C)this.Y).getValue();
                b b0 = new b(((d)((A)this.Z).b.f.getValue()), h0);
                return new i(((A)this.Z), h0, b0);
            }
            case 1: {
                Boolean boolean0 = Boolean.valueOf(!((Boolean)((MutableState)this.Y).getValue()).booleanValue());
                ((MutableState)this.Y).setValue(boolean0);
                ((g1.i)this.Z).b0 = true;
                return t.a;
            }
            case 2: {
                c c0 = (c)this.Y;
                if(c0 == null) {
                    c0 c00 = (c0)this.Z;
                    if(!c00.G0().k0) {
                        c00 = null;
                    }
                    return c00 != null ? l.g(0L, a.a0(c00.Z)) : null;
                }
                return c0;
            }
            case 3: {
                W w0 = ((LayoutNode)this.Y).u0;
                if((((n)w0.f).b0 & 8) != 0) {
                    n n0 = (o0)w0.e;
                    while(n0 != null) {
                        if((n0.Z & 8) != 0) {
                            n n1 = n0;
                            W.d d0 = null;
                            while(n1 != null) {
                                if(n1 instanceof n0) {
                                    boolean z = ((n0)n1).Z();
                                    w w1 = (w)this.Z;
                                    if(z) {
                                        M0.j j0 = new M0.j();
                                        w1.X = j0;
                                        j0.Z = true;
                                    }
                                    if(((n0)n1).c0()) {
                                        ((M0.j)w1.X).Y = true;
                                    }
                                    ((n0)n1).o(((M0.j)w1.X));
                                }
                                else if((n1.Z & 8) != 0 && n1 instanceof F0.n) {
                                    n n2 = ((F0.n)n1).m0;
                                    int v2 = 0;
                                    while(n2 != null) {
                                        if((n2.Z & 8) != 0) {
                                            ++v2;
                                            if(v2 == 1) {
                                                n1 = n2;
                                            }
                                            else {
                                                if(d0 == null) {
                                                    d0 = new W.d(new n[16]);
                                                }
                                                if(n1 != null) {
                                                    d0.c(n1);
                                                    n1 = null;
                                                }
                                                d0.c(n2);
                                            }
                                        }
                                        n2 = n2.d0;
                                    }
                                    if(v2 != 1) {
                                        goto label_58;
                                    }
                                    continue;
                                }
                            label_58:
                                n1 = F0.f.f(d0);
                            }
                        }
                        n0 = n0.c0;
                    }
                }
                return t.a;
            }
            case 4: {
                L l0 = (L)this.Y;
                c0 c01 = l0.a().l0;
                if(c01 == null) {
                    placeable$PlacementScope0 = G.a(l0.a).getPlacementScope();
                }
                else {
                    placeable$PlacementScope0 = c01.g0;
                    if(placeable$PlacementScope0 == null) {
                        placeable$PlacementScope0 = G.a(l0.a).getPlacementScope();
                    }
                }
                J j1 = (J)this.Z;
                Function1 function10 = j1.z0;
                q0.b b1 = j1.A0;
                if(b1 != null) {
                    c0 c02 = l0.a();
                    long v3 = j1.B0;
                    float f = j1.C0;
                    placeable$PlacementScope0.getClass();
                    Placeable.PlacementScope.a(placeable$PlacementScope0, c02);
                    c02.b0(g.d(v3, c02.c0), f, b1);
                    return t.a;
                }
                if(function10 == null) {
                    c0 c03 = l0.a();
                    long v4 = j1.B0;
                    float f1 = j1.C0;
                    placeable$PlacementScope0.getClass();
                    Placeable.PlacementScope.a(placeable$PlacementScope0, c03);
                    c03.Z(g.d(v4, c03.c0), f1, null);
                    return t.a;
                }
                c0 c04 = l0.a();
                long v5 = j1.B0;
                float f2 = j1.C0;
                placeable$PlacementScope0.getClass();
                Placeable.PlacementScope.a(placeable$PlacementScope0, c04);
                c04.Z(g.d(v5, c04.c0), f2, function10);
                return t.a;
            }
            case 5: {
                Function1 function11 = ((l0)this.Y).X.o();
                if(function11 != null) {
                    ((O)this.Z).getClass();
                    function11.n(new N(((O)this.Z)));
                }
                return t.a;
            }
            case 6: {
                return Boolean.valueOf(((AndroidComposeView)this.Y).dispatchKeyEvent(((KeyEvent)this.Z)));
            }
            case 7: {
                ((AndroidComposeView)this.Y).getAndroidViewsHandler$ui_release().removeViewInLayout(((o)this.Z));
                HashMap hashMap0 = ((AndroidComposeView)this.Y).getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
                Object object1 = ((AndroidComposeView)this.Y).getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(((o)this.Z));
                z.c(hashMap0).remove(object1);
                ((o)this.Z).setImportantForAccessibility(0);
                return t.a;
            }
            case 8: {
                H0 h00 = (H0)this.Y;
                M0.h h1 = h00.c0;
                M0.h h2 = h00.d0;
                Float float0 = h00.Z;
                Float float1 = h00.b0;
                if((h1 == null || float0 == null ? 0.0f : ((Number)((Function0)h1.a).invoke()).floatValue() - ((float)float0)) == 0.0f || (h2 == null || float1 == null ? 0.0f : ((Number)((Function0)h2.a).invoke()).floatValue() - ((float)float1)) == 0.0f) {
                    androidx.compose.ui.platform.b b2 = (androidx.compose.ui.platform.b)this.Z;
                    int v6 = b2.E(h00.X);
                    J0 j00 = (J0)b2.t().f(b2.n);
                    if(j00 != null) {
                        K1.d d1 = b2.o;
                        if(d1 != null) {
                            try {
                                Rect rect0 = b2.k(j00);
                                d1.a.setBoundsInScreen(rect0);
                            }
                            catch(IllegalStateException unused_ex) {
                            }
                        }
                    }
                    b2.d.invalidate();
                    J0 j01 = (J0)b2.t().f(v6);
                    if(j01 != null) {
                        M0.o o0 = j01.a;
                        if(o0 != null) {
                            LayoutNode layoutNode0 = o0.c;
                            if(layoutNode0 != null) {
                                if(h1 != null) {
                                    b2.q.i(v6, h1);
                                }
                                if(h2 != null) {
                                    b2.r.i(v6, h2);
                                }
                                b2.A(layoutNode0);
                            }
                        }
                    }
                }
                if(h1 != null) {
                    h00.Z = (Float)((Function0)h1.a).invoke();
                }
                if(h2 != null) {
                    h00.b0 = (Float)((Function0)h2.a).invoke();
                }
                return t.a;
            }
            case 9: {
                B b3 = (B)this.Y;
                MutableState mutableState0 = (MutableState)this.Z;
                long v7 = ((B)mutableState0.getValue()).b;
                if(O0.N.a(b3.b, v7)) {
                    O0.N n3 = ((B)mutableState0.getValue()).c;
                    if(!Nb.j.a(b3.c, n3)) {
                        mutableState0.setValue(b3);
                        return t.a;
                    }
                }
                else {
                    mutableState0.setValue(b3);
                }
                return t.a;
            }
            case 10: {
                T0 t00 = (T0)this.Y;
                if(t00 != null) {
                    p p0 = t00.d;
                    if(p0.isEmpty()) {
                        f3 = t00.c;
                    }
                    else {
                        O0.c c1 = new O0.c();
                        c1.c(t00.a);
                        t0 t01 = new t0(c1);
                        int v8 = p0.size();
                        for(int v1 = 0; v1 < v8; ++v1) {
                            ((Function1)p0.get(v1)).n(t01);
                        }
                        f3 = c1.g();
                    }
                    t00.c = f3;
                    return f3 == null ? ((f)this.Z) : f3;
                }
                return (f)this.Z;
            }
            case 11: {
                m m0 = new m(((U0.n)this.Z).e);
                ((j0)this.Y).u.n(m0);
                return Boolean.TRUE;
            }
            case 12: {
                e e0 = ((u)this.Y).f;
                Nb.j.e(e0, "processor");
                WorkDatabase workDatabase0 = ((u)this.Y).c;
                Nb.j.e(workDatabase0, "workDatabase");
                I2.b b4 = ((u)this.Y).b;
                Nb.j.e(b4, "configuration");
                List list0 = ((u)this.Y).e;
                Nb.j.e(list0, "schedulers");
                I2.B b5 = (I2.B)this.Z;
                R2.p p1 = b5.b;
                String s = p1.a;
                R2.p p2 = workDatabase0.x().j(s);
                if(p2 == null) {
                    throw new IllegalArgumentException(M.J.e("Worker with ", s, " doesn\'t exist"));
                }
                if(A3.e.m(p2.b)) {
                    return I.X;
                }
                if((p2.d() ^ p1.d()) == 0) {
                    boolean z1 = e0.f(s);
                    if(!z1) {
                        for(Object object2: list0) {
                            ((J2.g)object2).a(s);
                        }
                    }
                    workDatabase0.p(new y(workDatabase0, p2, p1, list0, s, b5.c, z1));
                    if(!z1) {
                        J2.j.b(b4, workDatabase0, list0);
                    }
                    return z1 ? I.Z : I.Y;
                }
                StringBuilder stringBuilder0 = new StringBuilder("Can\'t update ");
                String s1 = "OneTime";
                stringBuilder0.append((p2.d() ? "Periodic" : "OneTime"));
                stringBuilder0.append(" Worker to ");
                if(p1.d()) {
                    s1 = "Periodic";
                }
                throw new UnsupportedOperationException(m5.b.y(stringBuilder0, s1, " Worker. Update operation must preserve worker\'s type."));
            }
            case 13: {
                long v9 = ((IntSize)((MutableState)this.Z).getValue()).a;
                a0 a00 = (a0)this.Y;
                q q0 = a00.e();
                if(q0 != null) {
                    X x0 = a00.c();
                    switch((x0 == null ? -1 : b0.a[x0.ordinal()])) {
                        case -1: {
                            break;
                        }
                        case 1: {
                            return new m0.b(M.c0.r(a00, v9, q0.a));
                        }
                        case 2: {
                            return new m0.b(M.c0.r(a00, v9, q0.b));
                        }
                        case 3: {
                            throw new IllegalStateException("SelectionContainer does not support cursor");
                        }
                        default: {
                            throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                        }
                    }
                }
                return new m0.b(0x7FC000007FC00000L);
            }
            case 14: {
                long v10 = ((IntSize)((MutableState)this.Z).getValue()).a;
                M.o0 o00 = (M.o0)this.Y;
                m0.b b6 = o00.g();
                if(b6 != null) {
                    j0 j02 = o00.d;
                    if(j02 != null) {
                        object0 = j02.a.a;
                    }
                    if(object0 != null && object0.X.length() != 0) {
                        X x1 = (X)o00.o.getValue();
                        int v11 = x1 == null ? -1 : r0.a[x1.ordinal()];
                        if(v11 != -1) {
                            switch(v11) {
                                case 1: 
                                case 2: {
                                    v12 = o00.j().b >> 0x20;
                                    break;
                                }
                                case 3: {
                                    v12 = o00.j().b & 0xFFFFFFFFL;
                                    break;
                                }
                                default: {
                                    throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                                }
                            }
                            j0 j03 = o00.d;
                            if(j03 != null) {
                                P0 p00 = j03.d();
                                if(p00 != null) {
                                    j0 j04 = o00.d;
                                    if(j04 != null) {
                                        f f4 = j04.a.a;
                                        if(f4 != null) {
                                            int v13 = o00.b.l(((int)v12));
                                            float f5 = m0.b.d(p00.d(b6.a));
                                            O0.L l1 = p00.a;
                                            int v14 = l1.f(I2.J.r(v13, 0, f4.X.length()));
                                            float f6 = l1.g(v14);
                                            float f7 = l1.h(v14);
                                            float f8 = I2.J.q(f5, Math.min(f6, f7), Math.max(f6, f7));
                                            if(IntSize.a(v10, 0L) || Math.abs(f5 - f8) <= ((float)(((int)(v10 >> 0x20)) / 2))) {
                                                float f9 = l1.b.d(v14);
                                                v = yc.d.d(f8, (l1.b.b(v14) - f9) / 2.0f + f9);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return new m0.b(v);
            }
            case 15: {
                v v15 = (v)this.Y;
                N.t t0 = (N.t)v15.o;
                S0 s00 = v15.g();
                Object object3 = this.Z;
                float f10 = s00.c(object3);
                if(!Float.isNaN(f10)) {
                    t0.a.g.m(f10);
                    t0.a.h.m(0.0f);
                    v15.n(null);
                }
                v15.m(object3);
                return t.a;
            }
            case 16: {
                C0 c05 = (C0)this.Y;
                if(((Boolean)c05.a.c.n(D0.X)).booleanValue()) {
                    u0 u00 = new u0(c05, null);
                    Xb.J.q(((dc.e)this.Z), null, null, u00, 3);
                }
                return Boolean.TRUE;
            }
            case 17: {
                N.H0 h01 = (N.H0)this.Z;
                Object object4 = h01.a;
                z1 z10 = (z1)this.Y;
                if(!Nb.j.a(z10, object4)) {
                    Bb.v.i0(h01.b, new v1(z10, 1));
                    U.l0 l00 = h01.c;
                    if(l00 != null) {
                        l00.c();
                    }
                }
                return t.a;
            }
            case 18: {
                I2.A.e().a(N2.o.a, "NetworkRequestConstraintController unregister callback");
                ((N2.g)this.Y).a.unregisterNetworkCallback(((N2.e)this.Z));
                return t.a;
            }
            case 19: {
                P2.f f11 = ((O2.c)this.Y).a;
                f11.getClass();
                synchronized(f11.c) {
                    if(f11.d.remove(((O2.a)this.Z)) && f11.d.isEmpty()) {
                        f11.d();
                    }
                    return t.a;
                }
            }
            case 20: {
                z0 z00 = (z0)this.Y;
                if(((Boolean)z00.c.c.n(A0.Z)).booleanValue()) {
                    R.c0 c06 = new R.c0(z00, null);
                    Xb.J.q(((dc.e)this.Z), null, null, c06, 3);
                }
                return Boolean.TRUE;
            }
            case 21: {
                R.w w2 = (R.w)this.Z;
                Object object6 = w2.a;
                G0 g00 = (G0)this.Y;
                if(!Nb.j.a(g00, object6)) {
                    Bb.v.i0(w2.b, new R.C0(g00, 1));
                    U.l0 l01 = w2.c;
                    if(l01 != null) {
                        l01.c();
                    }
                }
                return t.a;
            }
            case 22: {
                v v17 = (v)this.Y;
                S.k k0 = (S.k)v17.o;
                s s2 = v17.h();
                Object object7 = this.Z;
                float f12 = s2.c(object7);
                if(!Float.isNaN(f12)) {
                    k0.a.g.m(f12);
                    k0.a.h.m(0.0f);
                    v17.n(null);
                }
                v17.m(object7);
                return t.a;
            }
            case 23: {
                Nb.j.e(((u)this.Y).c, "workManagerImpl.workDatabase");
                E7.n n4 = new E7.n(((u)this.Y), 18, ((UUID)this.Z));
                ((u)this.Y).c.p(n4);
                J2.j.b(((u)this.Y).b, ((u)this.Y).c, ((u)this.Y).e);
                return t.a;
            }
            case 24: {
                Nb.j.f(((String)this.Y), "name");
                Nb.j.f(((u)this.Z), "workManagerImpl");
                Nb.j.e(((u)this.Z).c, "workManagerImpl.workDatabase");
                E7.h h3 = new E7.h(((u)this.Z).c, ((String)this.Y), ((u)this.Z), 9);
                ((u)this.Z).c.p(h3);
                J2.j.b(((u)this.Z).b, ((u)this.Z).c, ((u)this.Z).e);
                return t.a;
            }
            case 25: {
                return ((S2.i)this.Y).n(((WorkDatabase)this.Z));
            }
            case 26: {
                Object[] arr_object = ((E)this.Y).b;
                long[] arr_v = ((E)this.Y).a;
                int v18 = arr_v.length - 2;
                if(v18 >= 0) {
                    int v19 = 0;
                    while(true) {
                        long v20 = arr_v[v19];
                        if((~v20 << 7 & v20 & 0x8080808080808080L) != 0x8080808080808080L) {
                            int v21 = 8 - (~(v19 - v18) >>> 0x1F);
                            for(int v22 = 0; v22 < v21; ++v22) {
                                if((0xFFL & v20) < 0x80L) {
                                    ((U.s)this.Z).y(arr_object[(v19 << 3) + v22]);
                                }
                                v20 >>= 8;
                            }
                            if(v21 == 8) {
                                goto label_345;
                            }
                            break;
                        }
                    label_345:
                        if(v19 == v18) {
                            break;
                        }
                        ++v19;
                    }
                }
                return t.a;
            }
            case 27: {
                Nb.j.e(((Context)this.Y), "applicationContext");
                Nb.j.f(((V1.b)this.Z).a, "name");
                String s3 = Nb.j.m(".preferences_pb", ((V1.b)this.Z).a);
                Nb.j.f(s3, "fileName");
                return new File(((Context)this.Y).getApplicationContext().getFilesDir(), "datastore/" + s3);
            }
            case 28: {
                w2.c c2 = (w2.c)((X2.g)this.Y).Y;
                if(c2 == null) {
                    object8 = (x2.b)this.Z;
                    Nb.j.c(object8);
                }
                else {
                    object8 = c2.T();
                    if(object8 == null) {
                        Nb.j.c(((x2.b)this.Z));
                        return (x2.b)this.Z;
                    }
                }
                return object8;
            }
            default: {
                return new X2.b(((X2.g)this.Y).l().f(((String)this.Z)));
            }
        }
    }
}

