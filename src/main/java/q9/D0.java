package q9;

import Bb.B;
import Bb.F;
import Bb.p;
import Bb.r;
import Bb.v;
import G9.b;
import Ha.S;
import K9.K;
import Nb.j;
import V8.c;
import W5.f;
import Y8.G6;
import Y8.N;
import Y8.O;
import Y8.R6;
import Y8.f6;
import Y8.g6;
import Y8.i6;
import Y8.t;
import Y8.y6;
import a8.Q;
import a9.C4;
import a9.D4;
import a9.R0;
import a9.T0;
import a9.u;
import a9.x;
import ac.B0;
import ac.e0;
import ac.j0;
import ac.o0;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SubViewModel;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.fragment.AnnouncementsFragment;
import com.sendwave.backend.fragment.CustomerAnnouncementsFragment;
import com.sendwave.backend.fragment.NonTimelyAnnouncementsFragment;
import com.sendwave.backend.type.AnnouncementEventType.DISMISSED;
import com.sendwave.backend.type.AnnouncementEventType.SEEN;
import com.sendwave.backend.type.AnnouncementEventType.TAPPED;
import com.sendwave.backend.type.AnnouncementEventType;
import com.sendwave.util.AnnouncementEventData;
import e8.k;
import ha.S2;
import io.sentry.i1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o9.m0;
import r9.a;
import yc.d;

public final class d0 extends SubViewModel implements DefaultLifecycleObserver {
    public final A1 Y;
    public final R6 Z;
    public final n b0;
    public final c c0;
    public final G9.c d0;
    public final b e0;
    public final a f0;
    public final boolean g0;
    public final w h0;
    public final Q i0;
    public final LinkedHashSet j0;
    public final B0 k0;
    public ArrayList l0;
    public final B0 m0;
    public final ac.w n0;
    public final S o0;
    public final B0 p0;
    public final S q0;
    public D4 r0;
    public final B0 s0;
    public final j0 t0;
    public final B0 u0;
    public final j0 v0;
    public boolean w0;

    public d0(A1 a10, R6 r60, n n0, c c0, S2 s20, G9.c c1, b b0, a a0) {
        j.f(r60, "repo");
        j.f(c1, "announcementsFragmentSource");
        j.f(b0, "eventsTracker");
        super(s20);
        this.Y = a10;
        this.Z = r60;
        this.b0 = n0;
        this.c0 = c0;
        this.d0 = c1;
        this.e0 = b0;
        this.f0 = a0;
        this.g0 = true;
        this.h0 = new w(c0, s20);
        this.i0 = new Q(FlowWatcherKt.a(this), 21, new m0(2, this));
        this.j0 = new LinkedHashSet();
        Boolean boolean0 = Boolean.FALSE;
        this.k0 = o0.c(boolean0);
        B0 b00 = o0.c(null);
        this.m0 = b00;
        K k0 = new K(3, null, 12);
        ac.w w0 = new ac.w(new e0(a10.d, b00, k0, 0), new J(this, null), 4);
        this.n0 = w0;
        S s0 = new S(w0, 26, this);
        this.o0 = s0;
        B0 b01 = o0.c(null);
        this.p0 = b01;
        this.q0 = new S(b01, 27, this);
        q9.o0.b0(this, new s(1, s0), boolean0);
        B0 b02 = o0.c(null);
        this.s0 = b02;
        this.t0 = new j0(b02);
        B0 b03 = o0.c(null);
        this.u0 = b03;
        this.v0 = new j0(b03);
        Xb.J.q(FlowWatcherKt.a(this), null, null, new M(this, null), 3);
        Xb.J.q(FlowWatcherKt.a(this), null, null, new G(this, null), 3);
        Xb.J.q(FlowWatcherKt.a(this), null, null, new H(this, null), 3);
    }

    public final void c(String s) {
        j.f(s, "announcementId");
        A1 a10 = this.Y;
        a10.getClass();
        m m0 = a10.a;
        y1 y10 = A1.e;
        Set set0 = m0.n(y10);
        if(set0 == null) {
            set0 = B.X;
        }
        Iterable iterable0 = d.C(s);
        Set set1 = p.T0(set0);
        v.f0(set1, iterable0);
        m0.getClass();
        l l0 = new l(m0);
        q9.o0.O(l0, y10, set1);
        l0.apply();
        a10.c.getClass();
        a10.c.l(null, set1);
        a10.b(new AnnouncementEventData(DISMISSED.X, s));
        this.l();
    }

    public final Object d(Fb.c c0) {
        B0 b00;
        d0 d00;
        q9.K k0;
        if(c0 instanceof q9.K) {
            k0 = (q9.K)c0;
            int v = k0.e0;
            if((v & 0x80000000) == 0) {
                k0 = new q9.K(this, c0);
            }
            else {
                k0.e0 = v ^ 0x80000000;
            }
        }
        else {
            k0 = new q9.K(this, c0);
        }
        Object object0 = k0.c0;
        Object object1 = Eb.a.X;
    alab1:
        switch(k0.e0) {
            case 0: {
                f.b0(object0);
                try {
                    Y8.w w0 = new Y8.w(this.g0);
                    k0.b0 = this;
                    k0.e0 = 1;
                    object0 = R6.d(this.Z, w0, null, null, k0, 6);
                }
                catch(Exception unused_ex) {
                    d00 = this;
                    goto label_46;
                }
                catch(Throwable throwable0) {
                    d00 = this;
                    goto label_55;
                }
                if(object0 == object1) {
                    return object1;
                }
                d00 = this;
                goto label_30;
            }
            case 1: {
                try {
                    try {
                        d00 = k0.b0;
                        f.b0(object0);
                    label_30:
                        AnnouncementsFragment announcementsFragment0 = ((t)((y6)object0).b).a.a.b;
                        if(announcementsFragment0 != null) {
                            d00.m(announcementsFragment0);
                        }
                        if(announcementsFragment0 != null) {
                            x x0 = announcementsFragment0.b.b;
                            if(x0 != null) {
                                FragmentHandle fragmentHandle0 = ((y6)object0).a(x0.b);
                                d00.Y.c(fragmentHandle0, x0.b.getId());
                            }
                        }
                        CustomerAnnouncementsFragment customerAnnouncementsFragment0 = ((t)((y6)object0).b).a.a.c;
                        if(customerAnnouncementsFragment0 != null) {
                            d00.d0.getClass();
                            d00.d0.b = customerAnnouncementsFragment0;
                            d00.d0.c.q(customerAnnouncementsFragment0);
                            d00.n(customerAnnouncementsFragment0);
                        }
                        b00 = d00.k0;
                        goto label_60;
                    }
                    catch(Exception unused_ex) {
                    }
                label_46:
                    B0 b01 = d00.k0;
                    while(true) {
                        Object object2 = b01.getValue();
                        ((Boolean)object2).getClass();
                        if(!b01.j(object2, Boolean.TRUE)) {
                            continue;
                        }
                        break alab1;
                    }
                }
                catch(Throwable throwable0) {
                    goto label_55;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            Object object3 = d00.k0.getValue();
            ((Boolean)object3).getClass();
        }
        while(!d00.k0.j(object3, Boolean.TRUE));
        return Ab.t.a;
    label_55:
        B0 b02 = d00.k0;
        do {
            Object object4 = b02.getValue();
            ((Boolean)object4).getClass();
        }
        while(!b02.j(object4, Boolean.TRUE));
        throw throwable0;
        do {
        label_60:
            Object object5 = b00.getValue();
            ((Boolean)object5).getClass();
        }
        while(!b00.j(object5, Boolean.TRUE));
        return Ab.t.a;
    }

    public final Object e(Fb.c c0) {
        d0 d00;
        L l0;
        if(c0 instanceof L) {
            l0 = (L)c0;
            int v = l0.e0;
            if((v & 0x80000000) == 0) {
                l0 = new L(this, c0);
            }
            else {
                l0.e0 = v ^ 0x80000000;
            }
        }
        else {
            l0 = new L(this, c0);
        }
        Object object0 = l0.c0;
        Object object1 = Eb.a.X;
        switch(l0.e0) {
            case 0: {
                f.b0(object0);
                l0.b0 = this;
                l0.e0 = 1;
                if(this.d(l0) == object1) {
                    return object1;
                }
                d00 = this;
                break;
            }
            case 1: {
                d00 = l0.b0;
                f.b0(object0);
                break;
            }
            case 2: {
                f.b0(object0);
                return Ab.t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        l0.b0 = null;
        l0.e0 = 2;
        return d00.k(l0) == object1 ? object1 : Ab.t.a;
    }

    public final void g(String s) {
        j.f(s, "announcementId");
        A1 a10 = this.Y;
        if(!this.g0 || !this.j0.contains(s)) {
            a10.b(new AnnouncementEventData(SEEN.X, s));
        }
        a10.b(new AnnouncementEventData(TAPPED.X, s));
        this.l();
    }

    public final void i(String s) {
        j.f(s, "announcementId");
        AnnouncementEventData announcementEventData0 = new AnnouncementEventData(TAPPED.X, s);
        this.Y.b(announcementEventData0);
        this.l();
    }

    public final Object j(AnnouncementEventData announcementEventData0, Fb.c c0) {
        d0 d00;
        T t0;
        if(c0 instanceof T) {
            t0 = (T)c0;
            int v = t0.e0;
            if((v & 0x80000000) == 0) {
                t0 = new T(this, c0);
            }
            else {
                t0.e0 = v ^ 0x80000000;
            }
        }
        else {
            t0 = new T(this, c0);
        }
        Object object0 = t0.c0;
        Object object1 = Eb.a.X;
        switch(t0.e0) {
            case 0: {
                f.b0(object0);
                i6 i60 = new i6(announcementEventData0.Y, announcementEventData0.X);
                t0.b0 = this;
                t0.e0 = 1;
                object0 = this.Z.f(i60, G6.X, t0);
                if(object0 == object1) {
                    return object1;
                }
                d00 = this;
                break;
            }
            case 1: {
                d00 = t0.b0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        g6 g60 = ((f6)((y6)object0).b).a;
        if(g60 != null) {
            d00.m(g60.a.b);
        }
        return Ab.t.a;
    }

    public final Object k(Fb.c c0) {
        AnnouncementEventData announcementEventData0;
        Iterator iterator1;
        d0 d00;
        U u0;
        if(c0 instanceof U) {
            u0 = (U)c0;
            int v = u0.g0;
            if((v & 0x80000000) == 0) {
                u0 = new U(this, c0);
            }
            else {
                u0.g0 = v ^ 0x80000000;
            }
        }
        else {
            u0 = new U(this, c0);
        }
        Object object0 = u0.e0;
        Object object1 = Eb.a.X;
    alab1:
        switch(u0.g0) {
            case 0: {
                f.b0(object0);
                A1 a10 = this.Y;
                m m0 = a10.a;
                y1 y10 = A1.f;
                Set set0 = m0.n(y10);
                B b0 = B.X;
                if(set0 == null) {
                    set0 = b0;
                }
                LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                for(Object object2: set0) {
                    String s = (String)object2;
                    try {
                        D d0 = (D)((k)a10.b.getValue()).b(s);
                        j.c(d0);
                        AnnouncementEventType.n.getClass();
                        linkedHashSet0.add(new AnnouncementEventData(com.sendwave.backend.type.p.a(d0.b), d0.a));
                    }
                    catch(Exception unused_ex) {
                        Set set1 = a10.a.n(y10);
                        if(set1 == null) {
                            set1 = b0;
                        }
                        Iterable iterable0 = d.C(s);
                        Set set2 = p.T0(set1);
                        set2.removeAll(v.g0(iterable0));
                        l l0 = new l(m0);
                        q9.o0.O(l0, y10, set2);
                        l0.apply();
                    }
                }
                d00 = this;
                iterator1 = p.U0(linkedHashSet0).iterator();
                break;
            }
            case 1: {
                try {
                    announcementEventData0 = u0.d0;
                    iterator1 = u0.c0;
                    d00 = u0.b0;
                    f.b0(object0);
                    while(true) {
                    label_48:
                        d00.Y.a(announcementEventData0);
                        break alab1;
                    }
                }
                catch(O o0) {
                    goto label_59;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    label_49:
        if(iterator1.hasNext()) {
            Object object3 = iterator1.next();
            announcementEventData0 = (AnnouncementEventData)object3;
            try {
                u0.b0 = d00;
                u0.c0 = iterator1;
                u0.d0 = announcementEventData0;
                u0.g0 = 1;
                if(d00.j(announcementEventData0, u0) != object1) {
                    goto label_48;
                }
                return object1;
            }
            catch(O o0) {
            label_59:
                if(o0 instanceof Y8.T) {
                    goto label_49;
                }
                Ab.k k0 = new Ab.k("announcementId", announcementEventData0.X);
                Ab.k k1 = new Ab.k("errorMessage", o0.X);
                hb.n.d("Record announcement event failed", i1.WARNING, F.K(new Ab.k[]{k0, new Ab.k("eventType", announcementEventData0.Y.toString()), k1}), false, 8);
                goto label_49;
            }
        }
        return Ab.t.a;
    }

    public final void l() {
        V v0 = new V(this, null);
        N.j(this, this.c0, false, v0);
    }

    public final void m(AnnouncementsFragment announcementsFragment0) {
        j.f(announcementsFragment0, "fragment");
        ArrayList arrayList0 = new ArrayList(r.b0(announcementsFragment0.b.a));
        for(Object object0: announcementsFragment0.b.a) {
            arrayList0.add(((u)object0).b);
        }
        this.l0 = arrayList0;
        B0 b00 = this.m0;
        if(b00.getValue() != null || !this.g0 || this.w0) {
            while(true) {
                Object object1 = b00.getValue();
                List list0 = (List)object1;
                if(b00.j(object1, arrayList0)) {
                    break;
                }
            }
        }
    }

    public final void n(CustomerAnnouncementsFragment customerAnnouncementsFragment0) {
        j.f(customerAnnouncementsFragment0, "fragment");
        ArrayList arrayList0 = new ArrayList(r.b0(customerAnnouncementsFragment0.b.a));
        for(Object object0: customerAnnouncementsFragment0.b.a) {
            arrayList0.add(((R0)object0).b);
        }
        this.l0 = arrayList0;
        B0 b00 = this.m0;
        if(b00.getValue() != null || !this.g0 || this.w0) {
            while(true) {
                Object object1 = b00.getValue();
                List list0 = (List)object1;
                if(b00.j(object1, arrayList0)) {
                    break;
                }
            }
        }
        T0 t00 = customerAnnouncementsFragment0.c;
        NonTimelyAnnouncementsFragment nonTimelyAnnouncementsFragment0 = t00.b;
        D4 d40 = nonTimelyAnnouncementsFragment0.a == null ? null : nonTimelyAnnouncementsFragment0.a.b.c;
        this.r0 = d40;
        if(this.w0) {
            while(true) {
                Object object2 = this.s0.getValue();
                D4 d41 = (D4)object2;
                if(this.s0.j(object2, d40)) {
                    break;
                }
            }
        }
        do {
            Object object3 = this.p0.getValue();
            C4 c40 = (C4)object3;
        }
        while(!this.p0.j(object3, (nonTimelyAnnouncementsFragment0.a == null ? null : nonTimelyAnnouncementsFragment0.a.b.b)));
        do {
            Object object4 = this.u0.getValue();
            List list1 = (List)object4;
        }
        while(!this.u0.j(object4, t00.c.a));
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner0) {
        androidx.lifecycle.a.a(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner0) {
        androidx.lifecycle.a.b(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner0) {
        androidx.lifecycle.a.c(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner0) {
        androidx.lifecycle.a.d(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner0) {
        j.f(lifecycleOwner0, "owner");
        this.w0 = false;
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner0) {
        j.f(lifecycleOwner0, "owner");
        this.w0 = true;
        this.j0.clear();
        ArrayList arrayList0 = this.l0;
        if(arrayList0 != null) {
            while(true) {
                Object object0 = this.m0.getValue();
                List list0 = (List)object0;
                if(this.m0.j(object0, arrayList0)) {
                    break;
                }
            }
        }
        do {
            Object object1 = this.s0.getValue();
            D4 d40 = (D4)object1;
        }
        while(!this.s0.j(object1, this.r0));
    }
}

