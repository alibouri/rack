package D0;

import Ab.t;
import Bb.A;
import Bb.p;
import E.d0;
import E.w;
import Ec.C;
import Ec.F;
import Ec.O;
import Ec.b;
import Ec.q;
import Ec.x;
import F0.I;
import F0.J;
import F0.L;
import F0.c0;
import F0.f;
import Fc.d;
import Fc.g;
import G0.P;
import H6.e;
import I.N0;
import I.j0;
import K.B;
import K.v;
import L.m;
import N.B0;
import N.C0;
import Nb.k;
import Nb.z;
import U.M;
import U.N;
import U.Y;
import U.f0;
import U.m0;
import U.s0;
import W.a;
import Xb.H;
import Xb.j;
import a1.h;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Density;
import g0.n;
import io.sentry.hints.i;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import y.q0;

public final class a0 extends k implements Function0 {
    public final int X;
    public final Object Y;

    public a0(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super(0);
    }

    private final Object a() {
        CancellationException cancellationException0;
        s0 s00 = (s0)this.Y;
        synchronized(s00.b) {
            j j0 = s00.x();
            if(((m0)s00.r.getValue()).compareTo(m0.Y) > 0) {
                if(j0 != null) {
                    ((Xb.k)j0).i(t.a);
                }
                return t.a;
            }
            Throwable throwable0 = s00.d;
            cancellationException0 = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
            cancellationException0.initCause(throwable0);
        }
        throw cancellationException0;
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object object5;
        O o0;
        Throwable throwable11;
        ArrayList arrayList5;
        g g3;
        long v28;
        long v27;
        F f5;
        ArrayList arrayList4;
        Throwable throwable8;
        Throwable throwable7;
        Throwable throwable5;
        d d9;
        F f4;
        F f3;
        d d8;
        int v20;
        Iterator iterator4;
        F f2;
        long v14;
        q q0;
        switch(this.X) {
            case 0: {
                G g0 = ((e0)this.Y).a();
                LayoutNode layoutNode0 = g0.X;
                int v = ((a)layoutNode0.p()).X.Z;
                if(g0.l0 != v) {
                    for(Object object1: g0.d0.entrySet()) {
                        ((y)((Map.Entry)object1).getValue()).d = true;
                    }
                    if(!layoutNode0.v0.d) {
                        LayoutNode.T(layoutNode0, false, 7);
                    }
                }
                return t.a;
            }
            case 1: {
                w w0 = ((c)this.Y).j;
                if(w0 != null) {
                    f.n(w0);
                }
                return t.a;
            }
            case 2: {
                return new d0(((d0.j)this.Y), A.X);
            }
            case 3: {
                ModifierLocalManager modifierLocalManager0 = (ModifierLocalManager)this.Y;
                modifierLocalManager0.f = false;
                HashSet hashSet0 = new HashSet();
                W.d d0 = modifierLocalManager0.d;
                int v1 = d0.Z;
                W.d d1 = modifierLocalManager0.e;
                if(v1 > 0) {
                    Object[] arr_object = d0.X;
                    for(int v2 = 0; true; ++v2) {
                        LayoutNode layoutNode1 = (LayoutNode)arr_object[v2];
                        E0.g g1 = (E0.g)d1.X[v2];
                        n n0 = (n)layoutNode1.u0.f;
                        if(n0.k0) {
                            ModifierLocalManager.b(n0, g1, hashSet0);
                        }
                        if(v2 + 1 >= v1) {
                            break;
                        }
                    }
                }
                d0.i();
                d1.i();
                W.d d2 = modifierLocalManager0.b;
                int v3 = d2.Z;
                W.d d3 = modifierLocalManager0.c;
                if(v3 > 0) {
                    Object[] arr_object1 = d2.X;
                    int v4 = 0;
                    while(true) {
                        F0.c c0 = (F0.c)arr_object1[v4];
                        E0.g g2 = (E0.g)d3.X[v4];
                        if(c0.k0) {
                            ModifierLocalManager.b(c0, g2, hashSet0);
                        }
                        ++v4;
                        if(v4 >= v3) {
                            break;
                        }
                    }
                }
                d2.i();
                d3.i();
                for(Object object2: hashSet0) {
                    ((F0.c)object2).z0();
                }
                return t.a;
            }
            case 4: {
                ((LayoutNode)this.Y).v0.r.u0 = true;
                I i0 = ((LayoutNode)this.Y).v0.s;
                if(i0 != null) {
                    i0.r0 = true;
                }
                return t.a;
            }
            case 5: {
                J j0 = (J)this.Y;
                j0.F0.k = 0;
                W.d d4 = j0.F0.a.v();
                int v5 = d4.Z;
                if(v5 > 0) {
                    Object[] arr_object2 = d4.X;
                    int v6 = 0;
                    while(true) {
                        J j1 = ((LayoutNode)arr_object2[v6]).v0.r;
                        j1.e0 = j1.f0;
                        j1.f0 = 0x7FFFFFFF;
                        j1.r0 = false;
                        if(j1.i0 == 2) {
                            j1.i0 = 3;
                        }
                        ++v6;
                        if(v6 >= v5) {
                            break;
                        }
                    }
                }
                L l0 = j0.F0;
                W.d d5 = l0.a.v();
                int v7 = d5.Z;
                if(v7 > 0) {
                    Object[] arr_object3 = d5.X;
                    int v8 = 0;
                    while(true) {
                        ((LayoutNode)arr_object3[v8]).v0.r.s0.d = false;
                        ++v8;
                        if(v8 >= v7) {
                            break;
                        }
                    }
                }
                j0.i().p0().n();
                LayoutNode layoutNode2 = l0.a;
                W.d d6 = layoutNode2.v();
                int v9 = d6.Z;
                if(v9 > 0) {
                    Object[] arr_object4 = d6.X;
                    int v10 = 0;
                    while(true) {
                        LayoutNode layoutNode3 = (LayoutNode)arr_object4[v10];
                        if(layoutNode3.v0.r.e0 != layoutNode3.t()) {
                            layoutNode2.K();
                            layoutNode2.z();
                            if(layoutNode3.t() == 0x7FFFFFFF) {
                                layoutNode3.v0.r.l0();
                            }
                        }
                        ++v10;
                        if(v10 >= v9) {
                            break;
                        }
                    }
                }
                W.d d7 = layoutNode2.v();
                int v11 = d7.Z;
                if(v11 > 0) {
                    Object[] arr_object5 = d7.X;
                    int v12 = 0;
                    while(true) {
                        F0.F f0 = ((LayoutNode)arr_object5[v12]).v0.r.s0;
                        f0.e = f0.d;
                        ++v12;
                        if(v12 >= v11) {
                            break;
                        }
                    }
                }
                return t.a;
            }
            case 6: {
                ((L)this.Y).a().a(((L)this.Y).t);
                return t.a;
            }
            case 7: {
                c0 c00 = ((c0)this.Y).l0;
                if(c00 != null) {
                    c00.M0();
                }
                return t.a;
            }
            case 8: {
                Fc.f f1 = (Fc.f)this.Y;
                ClassLoader classLoader0 = f1.b;
                Enumeration enumeration0 = classLoader0.getResources("");
                Nb.j.e(enumeration0, "getResources(...)");
                ArrayList arrayList0 = Collections.list(enumeration0);
                Nb.j.e(arrayList0, "list(...)");
                ArrayList arrayList1 = new ArrayList();
                Iterator iterator2 = arrayList0.iterator();
                while(true) {
                    boolean z = iterator2.hasNext();
                    q0 = f1.c;
                    if(!z) {
                        break;
                    }
                    Object object3 = iterator2.next();
                    URL uRL0 = (URL)object3;
                    Nb.j.c(uRL0);
                    Ab.k k0 = Nb.j.a(uRL0.getProtocol(), "file") ? new Ab.k(q0, e.n(new File(uRL0.toURI()))) : null;
                    if(k0 != null) {
                        arrayList1.add(k0);
                    }
                }
                Enumeration enumeration1 = classLoader0.getResources("META-INF/MANIFEST.MF");
                Nb.j.e(enumeration1, "getResources(...)");
                ArrayList arrayList2 = Collections.list(enumeration1);
                Nb.j.e(arrayList2, "list(...)");
                ArrayList arrayList3 = new ArrayList();
                Iterator iterator3 = arrayList2.iterator();
                while(iterator3.hasNext()) {
                    Object object4 = iterator3.next();
                    Nb.j.c(((URL)object4));
                    String s = ((URL)object4).toString();
                    Nb.j.e(s, "toString(...)");
                    if(Vb.q.O(s, "jar:file:", false)) {
                        int v13 = Vb.j.d0(6, s, "!");
                        if(v13 != -1) {
                            String s1 = s.substring(4, v13);
                            Nb.j.e(s1, "substring(...)");
                            C c1 = e.n(new File(URI.create(s1)));
                            x x0 = q0.g(c1);
                            try {
                                v14 = x0.a() - 22L;
                                if(v14 < 0L) {
                                    throw new IOException("not a zip: size=" + x0.a());
                                }
                                long v15 = Math.max(v14 - 0x10000L, 0L);
                                while(true) {
                                label_160:
                                    f2 = b.c(x0.b(v14));
                                    break;
                                }
                            }
                            catch(Throwable throwable0) {
                                goto label_273;
                            }
                            try {
                                if(f2.q() == 101010256) {
                                    int v16 = f2.z();
                                    int v17 = f2.z();
                                    int v18 = f2.z();
                                    if(Long.compare(v18 & 0xFFFF, f2.z() & 0xFFFF) != 0 || (v16 & 0xFFFF) != 0 || (v17 & 0xFFFF) != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    iterator4 = iterator3;
                                    f2.skip(4L);
                                    long v19 = ((long)f2.q()) & 0xFFFFFFFFL;
                                    v20 = f2.z() & 0xFFFF;
                                    d8 = new d(((long)(v18 & 0xFFFF)), v19, v20);
                                    f2.F(((long)v20));
                                    goto label_177;
                                }
                                goto label_265;
                            }
                            catch(Throwable throwable1) {
                                try {
                                    f2.close();
                                    throw throwable1;
                                label_177:
                                    f2.close();
                                    if(v14 - 20L > 0L) {
                                        f3 = b.c(x0.b(v14 - 20L));
                                        goto label_180;
                                    }
                                    goto label_227;
                                }
                                catch(Throwable throwable0) {
                                    goto label_273;
                                }
                            }
                            try {
                            label_180:
                                if(f3.q() == 0x7064B50) {
                                    int v21 = f3.q();
                                    long v22 = f3.r();
                                    if(f3.q() != 1 || v21 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    f4 = b.c(x0.b(v22));
                                    goto label_186;
                                }
                                goto label_221;
                            }
                            catch(Throwable throwable2) {
                                goto label_213;
                            }
                            try {
                            label_186:
                                int v23 = f4.q();
                                if(v23 != 0x6064B50) {
                                    throw new IOException("bad zip: expected " + Fc.b.d(0x6064B50) + " but was " + Fc.b.d(v23));
                                }
                                f4.skip(12L);
                                int v24 = f4.q();
                                int v25 = f4.q();
                                long v26 = f4.r();
                                if(v26 != f4.r() || v24 != 0 || v25 != 0) {
                                    throw new IOException("unsupported zip: spanned");
                                }
                                f4.skip(8L);
                                d9 = new d(v26, f4.r(), v20);
                            }
                            catch(Throwable throwable3) {
                                try {
                                    f4.close();
                                    throwable5 = throwable3;
                                    goto label_210;
                                }
                                catch(Throwable throwable4) {
                                    try {
                                        U5.a.y(throwable3, throwable4);
                                        throwable5 = throwable3;
                                        goto label_210;
                                    }
                                    catch(Throwable throwable2) {
                                        goto label_213;
                                    }
                                }
                            }
                            try {
                                f4.close();
                                throwable5 = null;
                            }
                            catch(Throwable throwable5) {
                            }
                            d8 = d9;
                            try {
                            label_210:
                                if(throwable5 != null) {
                                    throw throwable5;
                                }
                            }
                            catch(Throwable throwable2) {
                                try {
                                label_213:
                                    throwable7 = throwable2;
                                    f3.close();
                                    throwable8 = throwable7;
                                    d8 = d8;
                                    goto label_225;
                                }
                                catch(Throwable throwable6) {
                                    try {
                                        U5.a.y(throwable7, throwable6);
                                        throwable8 = throwable7;
                                        d8 = d8;
                                        goto label_225;
                                    }
                                    catch(Throwable throwable0) {
                                        goto label_273;
                                    }
                                }
                            }
                            try {
                            label_221:
                                f3.close();
                                throwable8 = null;
                            }
                            catch(Throwable throwable8) {
                            }
                            try {
                            label_225:
                                if(throwable8 != null) {
                                    throw throwable8;
                                }
                            label_227:
                                arrayList4 = new ArrayList();
                                f5 = b.c(x0.b(d8.b));
                            }
                            catch(Throwable throwable0) {
                                goto label_273;
                            }
                            try {
                                v27 = d8.a;
                                v28 = 0L;
                                while(true) {
                                label_231:
                                    if(v28 >= v27) {
                                        goto label_254;
                                    }
                                    g3 = Fc.b.e(f5);
                                    long v29 = g3.h;
                                    arrayList5 = arrayList1;
                                    break;
                                }
                            }
                            catch(Throwable throwable9) {
                                arrayList5 = arrayList1;
                                goto label_248;
                            }
                            try {
                                if(v29 >= d8.b) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if(i.g(g3.a)) {
                                    arrayList4.add(g3);
                                }
                                ++v28;
                                arrayList1 = arrayList5;
                                v27 = v27;
                                goto label_231;
                            }
                            catch(Throwable throwable9) {
                            }
                            try {
                            label_248:
                                f5.close();
                                throwable11 = throwable9;
                                goto label_259;
                            }
                            catch(Throwable throwable10) {
                                try {
                                    U5.a.y(throwable9, throwable10);
                                    throwable11 = throwable9;
                                    goto label_259;
                                }
                                catch(Throwable throwable0) {
                                    goto label_273;
                                }
                            }
                            try {
                            label_254:
                                arrayList5 = arrayList1;
                                f5.close();
                                throwable11 = null;
                            }
                            catch(Throwable throwable11) {
                            }
                            try {
                            label_259:
                                if(throwable11 != null) {
                                    throw throwable11;
                                }
                                o0 = new O(c1, q0, Fc.b.b(arrayList4));
                            }
                            catch(Throwable throwable0) {
                                goto label_273;
                            }
                            try {
                                x0.close();
                            }
                            catch(Throwable unused_ex) {
                            }
                            object5 = new Ab.k(o0, Fc.f.e);
                            goto label_282;
                            try {
                            label_265:
                                f2.close();
                                --v14;
                                if(v14 < v15) {
                                    throw new IOException("not a zip: end of central directory signature not found");
                                }
                                arrayList1 = arrayList1;
                                iterator3 = iterator3;
                                goto label_160;
                            }
                            catch(Throwable throwable0) {
                            label_273:
                                if(x0 != null) {
                                    try {
                                        x0.close();
                                    }
                                    catch(Throwable throwable12) {
                                        U5.a.y(throwable0, throwable12);
                                    }
                                }
                                throw throwable0;
                            }
                        }
                    }
                    object5 = null;
                    iterator4 = iterator3;
                    arrayList5 = arrayList1;
                label_282:
                    if(object5 != null) {
                        arrayList3.add(object5);
                    }
                    arrayList1 = arrayList5;
                    iterator3 = iterator4;
                }
                return p.F0(arrayList1, arrayList3);
            }
            case 9: {
                ((G.c)this.Y).G0.n(Boolean.valueOf(!((G.c)this.Y).F0));
                return t.a;
            }
            case 10: {
                AndroidComposeView androidComposeView0 = (AndroidComposeView)this.Y;
                MotionEvent motionEvent0 = androidComposeView0.n1;
                if(motionEvent0 != null) {
                    switch(motionEvent0.getActionMasked()) {
                        case 7: 
                        case 9: {
                            androidComposeView0.o1 = SystemClock.uptimeMillis();
                            androidComposeView0.post(androidComposeView0.r1);
                            break;
                        }
                        default: {
                            return t.a;
                        }
                    }
                }
                return t.a;
            }
            case 11: {
                H.b(((G0.O)this.Y).Z, null);
                return t.a;
            }
            case 12: {
                ((P)this.Y).b = null;
                return t.a;
            }
            case 13: {
                return (O0.f)this.Y;
            }
            case 14: {
                return ((j0)this.Y).d();
            }
            case 15: {
                return new N0(((q0)this.Y), 0.0f);
            }
            case 16: {
                return new a1.g(android.support.v4.media.session.a.i(((h)this.Y).a, ((h)this.Y).b));
            }
            case 17: {
                Object object6 = ((View)((v)this.Y).Y).getContext().getSystemService("input_method");
                Nb.j.d(object6, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager)object6;
            }
            case 18: {
                return new BaseInputConnection(((B)this.Y).a, false);
            }
            case 19: {
                ((m)this.Y).B0 = null;
                f.p(((m)this.Y));
                f.o(((m)this.Y));
                f.n(((m)this.Y));
                return Boolean.TRUE;
            }
            case 20: {
                ((L.p)this.Y).w0 = null;
                f.p(((L.p)this.Y));
                f.o(((L.p)this.Y));
                f.n(((L.p)this.Y));
                return Boolean.TRUE;
            }
            case 21: {
                return new m0.b(((m0.b)((U.N0)this.Y).getValue()).a);
            }
            case 22: {
                return C0.a(((C0)this.Y)).w(B0.c);
            }
            case 23: {
                Boolean boolean0 = Boolean.valueOf(!((Boolean)((Q.a)this.Y).h0.getValue()).booleanValue());
                ((Q.a)this.Y).h0.setValue(boolean0);
                return t.a;
            }
            case 24: {
                f.n(((Q.b)this.Y));
                return t.a;
            }
            case 25: {
                return ((Density)this.Y).w(125.0f);
            }
            case 26: {
                Object object7 = (File)((T1.F)this.Y).a.invoke();
                String s2 = ((File)object7).getAbsolutePath();
                synchronized(T1.F.j) {
                    LinkedHashSet linkedHashSet0 = T1.F.i;
                    if(!linkedHashSet0.contains(s2)) {
                        Nb.j.e(s2, "it");
                        linkedHashSet0.add(s2);
                        return object7;
                    }
                }
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + object7 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore\'s active on the same file (by confirming that the scope is cancelled).").toString());
            }
            case 27: {
                s.B b0 = new s.B(((f0)this.Y).a.size());
                ArrayList arrayList6 = ((f0)this.Y).a;
                int v31 = arrayList6.size();
                for(int v32 = 0; v32 < v31; ++v32) {
                    N n1 = (N)arrayList6.get(v32);
                    int v33 = n1.a;
                    M m0 = n1.b == null ? v33 : new M(v33, n1.b);
                    int v34 = b0.d(m0);
                    Object object9 = v34 >= 0 ? null : b0.c[v34];
                    if(object9 != null) {
                        if(!(object9 instanceof List) || object9 instanceof Ob.a && !(object9 instanceof Ob.c)) {
                            n1 = Bb.q.N(new Object[]{object9, n1});
                        }
                        else {
                            List list0 = z.b(object9);
                            list0.add(n1);
                            n1 = list0;
                        }
                    }
                    if(v34 < 0) {
                        b0.b[~v34] = m0;
                        b0.c[~v34] = n1;
                    }
                    else {
                        b0.c[v34] = n1;
                    }
                }
                return new Y(b0);
            }
            case 28: {
                return this.a();
            }
            default: {
                Object object0 = ((View)((R2.w)this.Y).Y).getContext().getSystemService("input_method");
                Nb.j.d(object0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager)object0;
            }
        }
    }
}

