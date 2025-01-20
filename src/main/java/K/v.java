package K;

import Ab.t;
import B6.n;
import D0.a0;
import F0.r0;
import J1.o;
import J2.e;
import J5.k;
import M.J;
import Nb.j;
import T2.a;
import W4.f;
import W7.h;
import Xb.q;
import Y8.R6;
import Z6.g;
import Zb.i;
import a5.w;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.node.LayoutNode;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import c2.D;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d0.m;
import io.sentry.Y0;
import io.sentry.b1;
import io.sentry.internal.debugmeta.c;
import io.sentry.protocol.s;
import io.sentry.protocol.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function2;
import q9.v2;
import t5.b;
import y7.d;

public final class v implements o, m, b {
    public final int X;
    public Object Y;
    public Object Z;

    public v(int v) {
        this.X = v;
        switch(v) {
            case 6: {
                super();
                this.Y = new SparseIntArray();
                this.Z = K5.b.d;
                return;
            }
            case 7: {
                super();
                this.Y = new L7.b(12);
                this.Z = new S0.b();
                return;
            }
            case 14: {
                super();
                return;
            }
            default: {
                super();
                this.Y = new c(1);
                this.Z = new c(1);
            }
        }
    }

    public v(e e0, a a0) {
        this.X = 4;
        j.f(e0, "processor");
        j.f(a0, "workTaskExecutor");
        super();
        this.Y = e0;
        this.Z = a0;
    }

    public v(k k0, M5.j j0, int v) {
        this.X = 5;
        super();
        this.Z = k0;
        this.Y = j0;
    }

    public v(R6 r60, v2 v20) {
        this.X = 16;
        j.f(r60, "repo");
        j.f(v20, "pinRepository");
        super();
        this.Y = r60;
        this.Z = v20;
    }

    public v(g g0, d d0, h h0, W7.c c0, Context context0, String s, W7.k k0, ScheduledExecutorService scheduledExecutorService0) {
        this.X = 8;
        super();
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        this.Y = linkedHashSet0;
        this.Z = new W7.m(g0, d0, h0, c0, context0, s, linkedHashSet0, k0, scheduledExecutorService0);
    }

    public v(View view0) {
        this.X = 0;
        super();
        this.Y = view0;
        this.Z = f.z(new a0(17, this));
    }

    public v(androidx.fragment.app.d d0) {
        this.X = 10;
        j.f(d0, "fragmentManager");
        super();
        this.Y = d0;
        this.Z = new CopyOnWriteArrayList();
    }

    public v(h1.d d0) {
        this.X = 12;
        super();
        this.Z = d0;
    }

    public v(Y0 y00, Collection collection0) {
        this.X = 13;
        super();
        w.e0(y00, "SentryEnvelopeHeader is required.");
        this.Y = y00;
        w.e0(collection0, "SentryEnvelope items are required.");
        this.Z = collection0;
    }

    public v(u u0, s s0, b1 b10) {
        this.X = 13;
        super();
        this.Y = new Y0(u0, s0, null);
        ArrayList arrayList0 = new ArrayList(1);
        arrayList0.add(b10);
        this.Z = arrayList0;
    }

    public v(Object object0, int v, Object object1) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        super();
    }

    @Override  // d0.m
    public Object a(d0.b b0, Object object0) {
        return ((Function2)this.Y).j(b0, object0);
    }

    public void b(LayoutNode layoutNode0, boolean z) {
        c c0 = (c)this.Z;
        c c1 = (c)this.Y;
        if(z) {
            c1.b(layoutNode0);
            c0.b(layoutNode0);
            return;
        }
        if(!((r0)c1.Z).contains(layoutNode0)) {
            c0.b(layoutNode0);
        }
    }

    public void c() {
        synchronized(this) {
            if(!((LinkedHashSet)this.Y).isEmpty()) {
                ((W7.m)this.Z).e(0L);
            }
        }
    }

    public boolean d(LayoutNode layoutNode0, boolean z) {
        boolean z1 = ((r0)((c)this.Y).Z).contains(layoutNode0);
        return z ? z1 : z1 || ((r0)((c)this.Z).Z).contains(layoutNode0);
    }

    public void e(Fragment fragment0, boolean z) {
        j.f(fragment0, "f");
        Fragment fragment1 = ((androidx.fragment.app.d)this.Y).y;
        if(fragment1 != null) {
            fragment1.p().o.e(fragment0, true);
        }
        for(Object object0: ((CopyOnWriteArrayList)this.Z)) {
            D d0 = (D)object0;
        }
    }

    public void f(Fragment fragment0, boolean z) {
        j.f(fragment0, "f");
        Fragment fragment1 = ((androidx.fragment.app.d)this.Y).y;
        if(fragment1 != null) {
            fragment1.p().o.f(fragment0, true);
        }
        for(Object object0: ((CopyOnWriteArrayList)this.Z)) {
            D d0 = (D)object0;
        }
    }

    public void g(Fragment fragment0, boolean z) {
        j.f(fragment0, "f");
        Fragment fragment1 = ((androidx.fragment.app.d)this.Y).y;
        if(fragment1 != null) {
            fragment1.p().o.g(fragment0, true);
        }
        for(Object object0: ((CopyOnWriteArrayList)this.Z)) {
            D d0 = (D)object0;
        }
    }

    @Override  // zb.a
    public Object get() {
        return new s5.f(((Context)((g3.b)this.Y).Y), ((s5.d)((s5.e)this.Z).get()));
    }

    public void h(Fragment fragment0, boolean z) {
        j.f(fragment0, "f");
        Fragment fragment1 = ((androidx.fragment.app.d)this.Y).y;
        if(fragment1 != null) {
            fragment1.p().o.h(fragment0, true);
        }
        for(Object object0: ((CopyOnWriteArrayList)this.Z)) {
            D d0 = (D)object0;
        }
    }

    public void i(Fragment fragment0, boolean z) {
        j.f(fragment0, "f");
        Fragment fragment1 = ((androidx.fragment.app.d)this.Y).y;
        if(fragment1 != null) {
            fragment1.p().o.i(fragment0, true);
        }
        for(Object object0: ((CopyOnWriteArrayList)this.Z)) {
            D d0 = (D)object0;
        }
    }

    public void j(Fragment fragment0, boolean z) {
        j.f(fragment0, "f");
        Fragment fragment1 = ((androidx.fragment.app.d)this.Y).y;
        if(fragment1 != null) {
            fragment1.p().o.j(fragment0, true);
        }
        for(Object object0: ((CopyOnWriteArrayList)this.Z)) {
            D d0 = (D)object0;
            if(!z || d0.b) {
                d0.a.a(fragment0);
            }
        }
    }

    public void k(Fragment fragment0, boolean z) {
        j.f(fragment0, "f");
        Fragment fragment1 = ((androidx.fragment.app.d)this.Y).y;
        if(fragment1 != null) {
            fragment1.p().o.k(fragment0, true);
        }
        for(Object object0: ((CopyOnWriteArrayList)this.Z)) {
            D d0 = (D)object0;
        }
    }

    @Override  // J1.o
    public WindowInsetsCompat l(View view0, WindowInsetsCompat windowInsetsCompat0) {
        n n0 = (n)this.Z;
        int v = n0.a;
        F1.c c0 = (F1.c)this.Y;
        int v1 = windowInsetsCompat0.d();
        BottomSheetBehavior bottomSheetBehavior0 = (BottomSheetBehavior)c0.Y;
        bottomSheetBehavior0.r = v1;
        boolean z = view0.getLayoutDirection() == 1;
        int v2 = view0.getPaddingBottom();
        int v3 = view0.getPaddingLeft();
        int v4 = view0.getPaddingRight();
        boolean z1 = bottomSheetBehavior0.m;
        if(z1) {
            int v5 = windowInsetsCompat0.a();
            bottomSheetBehavior0.q = v5;
            v2 = v5 + n0.c;
        }
        int v6 = n0.b;
        if(bottomSheetBehavior0.n) {
            v3 = (z ? v6 : v) + windowInsetsCompat0.b();
        }
        if(bottomSheetBehavior0.o) {
            if(!z) {
                v = v6;
            }
            v4 = windowInsetsCompat0.c() + v;
        }
        view0.setPadding(v3, view0.getPaddingTop(), v4, v2);
        boolean z2 = c0.X;
        if(z2) {
            bottomSheetBehavior0.k = windowInsetsCompat0.a.h().d;
        }
        if(z1 || z2) {
            bottomSheetBehavior0.J();
        }
        return windowInsetsCompat0;
    }

    public void m(Fragment fragment0, boolean z) {
        j.f(fragment0, "f");
        Fragment fragment1 = ((androidx.fragment.app.d)this.Y).y;
        if(fragment1 != null) {
            fragment1.p().o.m(fragment0, true);
        }
        for(Object object0: ((CopyOnWriteArrayList)this.Z)) {
            D d0 = (D)object0;
        }
    }

    public void n(Fragment fragment0, boolean z) {
        j.f(fragment0, "f");
        Fragment fragment1 = ((androidx.fragment.app.d)this.Y).y;
        if(fragment1 != null) {
            fragment1.p().o.n(fragment0, true);
        }
        for(Object object0: ((CopyOnWriteArrayList)this.Z)) {
            D d0 = (D)object0;
            if(!z || d0.b) {
                d0.a.b(fragment0);
            }
        }
    }

    public void o(Fragment fragment0, Bundle bundle0, boolean z) {
        j.f(fragment0, "f");
        Fragment fragment1 = ((androidx.fragment.app.d)this.Y).y;
        if(fragment1 != null) {
            fragment1.p().o.o(fragment0, bundle0, true);
        }
        for(Object object0: ((CopyOnWriteArrayList)this.Z)) {
            D d0 = (D)object0;
        }
    }

    public void p(Fragment fragment0, boolean z) {
        j.f(fragment0, "f");
        Fragment fragment1 = ((androidx.fragment.app.d)this.Y).y;
        if(fragment1 != null) {
            fragment1.p().o.p(fragment0, true);
        }
        for(Object object0: ((CopyOnWriteArrayList)this.Z)) {
            D d0 = (D)object0;
        }
    }

    public void q(Fragment fragment0, boolean z) {
        j.f(fragment0, "f");
        Fragment fragment1 = ((androidx.fragment.app.d)this.Y).y;
        if(fragment1 != null) {
            fragment1.p().o.q(fragment0, true);
        }
        for(Object object0: ((CopyOnWriteArrayList)this.Z)) {
            D d0 = (D)object0;
        }
    }

    public void r(Fragment fragment0, View view0, Bundle bundle0, boolean z) {
        j.f(fragment0, "f");
        j.f(view0, "v");
        androidx.fragment.app.d d0 = (androidx.fragment.app.d)this.Y;
        Fragment fragment1 = d0.y;
        if(fragment1 != null) {
            fragment1.p().o.r(fragment0, view0, bundle0, true);
        }
        for(Object object0: ((CopyOnWriteArrayList)this.Z)) {
            D d1 = (D)object0;
            if(!z || d1.b) {
                d1.a.c(d0, fragment0, view0);
            }
        }
    }

    public void s(Fragment fragment0, boolean z) {
        j.f(fragment0, "f");
        androidx.fragment.app.d d0 = (androidx.fragment.app.d)this.Y;
        Fragment fragment1 = d0.y;
        if(fragment1 != null) {
            fragment1.p().o.s(fragment0, true);
        }
        for(Object object0: ((CopyOnWriteArrayList)this.Z)) {
            D d1 = (D)object0;
            if(!z || d1.b) {
                d1.a.d(d0, fragment0);
            }
        }
    }

    public InputMethodManager t() {
        return (InputMethodManager)((Ab.h)this.Z).getValue();
    }

    @Override
    public String toString() {
        String s = "[ ";
        if(this.X != 12) {
            return super.toString();
        }
        if(((h1.e)this.Y) != null) {
            for(int v = 0; v < 9; ++v) {
                StringBuilder stringBuilder0 = J.i(s);
                stringBuilder0.append(((h1.e)this.Y).f0[v]);
                stringBuilder0.append(" ");
                s = stringBuilder0.toString();
            }
        }
        StringBuilder stringBuilder1 = A3.e.w(s, "] ");
        stringBuilder1.append(((h1.e)this.Y));
        return stringBuilder1.toString();
    }

    // Deobfuscation rating: LOW(20)
    public boolean u() {
        return !((r0)((c)this.Z).Z).isEmpty() || !((r0)((c)this.Y).Z).isEmpty() ? 1 : 0;
    }

    public void v(Dc.g g0, int v, String s) {
        ((q)this.Y).b0(t.a);
        ((i)this.Z).k(new U3.g("WebSocket Closed code=\'" + v + "\' reason=\'" + s + '\'', null), false);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    }

    public void w(G1.h h0) {
        int v = h0.b;
        G1.m m0 = (G1.m)this.Z;
        i.s s0 = (i.s)this.Y;
        if(v == 0) {
            m0.execute(new Y6.b(s0, 1, h0.a));
            return;
        }
        m0.execute(new G1.a(v, 0, s0));
    }

    public void x(J2.k k0, int v) {
        j.f(k0, "workSpecId");
        S2.j j0 = new S2.j(((e)this.Y), k0, false, v);
        ((a)this.Z).a(j0);
    }
}

