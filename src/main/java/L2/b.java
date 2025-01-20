package l2;

import Ab.t;
import Bb.p;
import Bb.v;
import Nb.j;
import U0.D;
import Vb.k;
import W5.f;
import a8.Q;
import ac.B0;
import ac.j0;
import ac.n0;
import ac.o0;
import android.os.Build;
import android.util.Log;
import g.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k2.K;
import k2.O;
import k2.T1;
import k2.W0;
import k2.W1;
import k2.f0;
import k2.h1;
import k2.n1;
import kotlin.coroutines.CoroutineContext;

public final class b {
    public final CoroutineContext a;
    public K b;
    public W0 c;
    public final Q d;
    public final CopyOnWriteArrayList e;
    public final a f;
    public volatile boolean g;
    public volatile int h;
    public final B0 i;
    public final j0 j;
    public final n0 k;
    public final c l;

    public b(c c0, CoroutineContext coroutineContext0, h1 h10) {
        W0 w00;
        this.l = c0;
        j.f(coroutineContext0, "mainContext");
        this.a = coroutineContext0;
        k2.n0 n00 = h10 == null ? null : ((k2.n0)h10.d.invoke());
        if(n00 == null) {
            w00 = W0.c0;
            j.d(w00, "null cannot be cast to non-null type androidx.paging.PageStore<T of androidx.paging.PageStore.Companion.initial>");
        }
        else {
            w00 = new W0(n00);
        }
        this.c = w00;
        Q q0 = new Q(15);
        if(h10 != null) {
            k2.n0 n01 = (k2.n0)h10.d.invoke();
            if(n01 != null) {
                q0.M(n01.e, n01.f);
            }
        }
        this.d = q0;
        CopyOnWriteArrayList copyOnWriteArrayList0 = new CopyOnWriteArrayList();
        this.e = copyOnWriteArrayList0;
        this.f = new a(true);
        this.i = o0.c(Boolean.FALSE);
        this.j = (j0)q0.b0;
        this.k = o0.a(0, 0x40, Zb.a.Y);
        copyOnWriteArrayList0.add(new D(14, this));
    }

    public static final Object a(b b0, List list0, int v, int v1, boolean z, f0 f00, f0 f01, K k0, Fb.c c0) {
        Object object3;
        Object object2;
        W0 w00;
        n1 n10;
        b0.getClass();
        if(c0 instanceof n1) {
            n10 = (n1)c0;
            int v2 = n10.m0;
            if((v2 & 0x80000000) == 0) {
                n10 = new n1(b0, c0);
            }
            else {
                n10.m0 = v2 ^ 0x80000000;
            }
        }
        else {
            n10 = new n1(b0, c0);
        }
        Object object0 = n10.k0;
        Object object1 = Eb.a.X;
        t t0 = t.a;
        switch(n10.m0) {
            case 0: {
                f.b0(object0);
                if(z && f00 == null) {
                    throw new IllegalArgumentException("Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set.");
                }
                b0.g = false;
                w00 = new W0(list0, v, v1);
                j.d(b0.c, "null cannot be cast to non-null type androidx.paging.PlaceholderPaddedList<T of androidx.paging.PagingDataPresenter>");
                b0.c = w00;
                b0.b = k0;
                n10.b0 = b0;
                n10.c0 = list0;
                n10.d0 = f00;
                n10.e0 = f01;
                n10.f0 = k0;
                n10.g0 = w00;
                n10.h0 = v;
                n10.i0 = v1;
                n10.j0 = z;
                n10.m0 = 1;
                O o0 = b0.l.c.b();
                b0.l.d.setValue(o0);
                if(t0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                z = n10.j0;
                v1 = n10.i0;
                v = n10.h0;
                W0 w01 = n10.g0;
                k0 = n10.f0;
                f01 = n10.e0;
                f00 = n10.d0;
                list0 = n10.c0;
                b b1 = n10.b0;
                f.b0(object0);
                w00 = w01;
                b0 = b1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(Build.ID != null && Log.isLoggable("Paging", 3)) {
            StringBuilder stringBuilder0 = new StringBuilder("Presenting data (\n                            |   first item: ");
            T1 t10 = (T1)p.q0(list0);
            if(t10 == null) {
                object2 = null;
            }
            else {
                List list1 = t10.b;
                object2 = list1 == null ? null : p.q0(list1);
            }
            stringBuilder0.append(object2);
            stringBuilder0.append("\n                            |   last item: ");
            T1 t11 = (T1)p.x0(list0);
            if(t11 == null) {
                object3 = null;
            }
            else {
                List list2 = t11.b;
                object3 = list2 == null ? null : p.x0(list2);
            }
            stringBuilder0.append(object3);
            stringBuilder0.append("\n                            |   placeholdersBefore: ");
            stringBuilder0.append(v);
            stringBuilder0.append("\n                            |   placeholdersAfter: ");
            stringBuilder0.append(v1);
            stringBuilder0.append("\n                            |   hintReceiver: ");
            stringBuilder0.append(k0);
            stringBuilder0.append("\n                            |   sourceLoadStates: ");
            stringBuilder0.append(f00);
            stringBuilder0.append("\n                        ");
            Log.d("Paging", k.G(((f01 == null ? stringBuilder0.toString() : stringBuilder0.toString() + "|   mediatorLoadStates: " + f01 + '\n') + "|)")), null);
        }
        if(z) {
            j.c(f00);
            b0.d.M(f00, f01);
        }
        if(w00.g() == 0) {
            K k1 = b0.b;
            if(k1 != null) {
                int v3 = w00.Y / 2;
                k1.a(new W1(v3, v3, w00.e(), w00.f()));  // initializer: Lk2/X1;-><init>(IIII)V
            }
        }
        return t0;
    }

    public final O b() {
        int v = this.c.Z;
        int v1 = this.c.b0;
        ArrayList arrayList0 = this.c.X;
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            v.f0(arrayList1, ((T1)object0).b);
        }
        return new O(arrayList1, v, v1);
    }
}

