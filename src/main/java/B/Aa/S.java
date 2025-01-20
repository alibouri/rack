package Aa;

import Ab.t;
import Ba.k;
import Ba.q;
import Bb.F;
import Ca.z;
import Da.m;
import Ea.O0;
import Ea.P0;
import Ea.S;
import Ea.r;
import Ha.H;
import Ha.T;
import I.C0;
import I.W;
import I.X0;
import I2.J;
import M.m0;
import M.t0;
import N4.o;
import Nb.h;
import Nb.j;
import P.n;
import Q4.i;
import Qa.A;
import Qa.I;
import Qa.Y;
import Qa.e;
import R.W0;
import R9.t3;
import R9.y3;
import U0.B;
import W.d;
import W4.f;
import Wc.b;
import Xb.I0;
import Xb.n0;
import Y8.N;
import Y8.V8;
import Yc.p;
import a8.Q;
import a9.E2;
import a9.F2;
import ac.B0;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.net.Uri;
import android.view.FocusFinder;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.sendwave.backend.fragment.AnnouncementFragment;
import com.sendwave.backend.type.AnnouncementEventType.SEEN;
import com.sendwave.backend.type.AnnouncementEventType.TAPPED;
import com.sendwave.models.CurrencyAmount;
import com.wave.customer.SignupSuccess;
import com.wave.customer.receipts.HistoryEntryId;
import f9.v;
import ha.S2;
import ha.V0;
import java.util.Calendar;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m0.c;
import n0.M;
import q9.M0;
import q9.O;
import q9.d0;
import q9.r1;
import q9.t1;
import q9.x;
import y.w0;

public final class s extends h implements Function1 {
    public final int g0;

    public s(int v, Object object0, Class class0, String s, String s1, int v1, int v2) {
        this.g0 = v2;
        super(v, v1, class0, object0, s, s1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        float f5;
        boolean z4;
        Object object7;
        Integer integer1;
        boolean z = false;
        Rect rect0 = null;
        switch(this.g0) {
            case 0: {
                j.f(((HistoryEntryId)object0).X, "p0");
                ((u0)this.Y).getClass();
                o0 o00 = new o0(((HistoryEntryId)object0).X, ((u0)this.Y), null);
                N.k(((u0)this.Y), ((u0)this.Y).l0, true, o00);
                return t.a;
            }
            case 1: {
                B0 b00 = ((q)this.Y).b0;
                do {
                    Object object1 = b00.getValue();
                }
                while(!b00.j(object1, k.a(((k)object1), false, null, null, null, null, null, null, ((CurrencyAmount)object0), a.b(((CurrencyAmount)object0), ((k)object1).e), false, 0x27F)));
                return t.a;
            }
            case 2: {
                j.f(((Ca.q)object0), "p0");
                z z1 = (z)this.Y;
                z1.getClass();
                B0 b01 = z1.d0;
                if(((Ca.q)object0) == Ca.q.e0) {
                    j.f(z1.b0, "<this>");
                    i.y(z1.b0, x0.b0, "tap open calendar", null);
                    do {
                        Object object2 = b01.getValue();
                    }
                    while(!b01.j(object2, Ca.t.a(((Ca.t)object2), null, ((Ca.q)object0), null, null, false, true, null, null, null, 477)));
                    return t.a;
                }
                b b0 = (b)z1.c0.invoke();
                b b1 = o.M(((Ca.q)object0).X, b0);
                do {
                    Object object3 = b01.getValue();
                }
                while(!b01.j(object3, Ca.t.a(((Ca.t)object3), null, ((Ca.q)object0), b1, null, false, false, null, null, null, 505)));
                return t.a;
            }
            case 3: {
                z z2 = (z)this.Y;
                z2.getClass();
                if(((Long)object0) != null) {
                    Calendar calendar0 = Calendar.getInstance();
                    calendar0.clear();
                    calendar0.setTimeInMillis(((b)z2.c0.invoke()).X);
                    calendar0.add(5, 1);
                    b b2 = new b(Math.max(((long)(((Long)object0))), calendar0.getTime().getTime()), p.Q());  // initializer: LXc/d;-><init>(JLWc/a;)V
                    B0 b02 = z2.d0;
                    while(true) {
                        Object object4 = b02.getValue();
                        if(b02.j(object4, Ca.t.a(((Ca.t)object4), null, null, o.M(0L, b2), null, false, false, null, null, null, 507))) {
                            break;
                        }
                    }
                }
                return t.a;
            }
            case 4: {
                B0 b03 = ((m)this.Y).b0;
                do {
                    Object object5 = b03.getValue();
                    CurrencyAmount currencyAmount0 = ((Da.i)object5).d;
                }
                while(!b03.j(object5, Da.i.a(((Da.i)object5), false, null, null, null, ((CurrencyAmount)object0), (((CurrencyAmount)object0) == null || currencyAmount0 == null || ((CurrencyAmount)object0).b(currencyAmount0) <= 0 ? null : r1.d(0x7F120396, new Object[]{M0.a(currencyAmount0)})), 15)));  // string:savings_balance_x_insufficient "Vault balance: %s. Insufficient balance."
                return t.a;
            }
            case 5: {
                S s1 = (S)object0;
                j.f(s1, "p0");
                O0 o01 = (O0)this.Y;
                o01.getClass();
                while(true) {
                    Object object6 = o01.f0.getValue();
                    P0 p00 = P0.a(((P0)object6), null, s1, false, false, null, null, null, null, null, null, 0x3FD);
                    if(o01.f0.j(object6, p00)) {
                        break;
                    }
                    s1 = s1;
                }
                return t.a;
            }
            case 6: {
                d d0 = ((AndroidComposeView)this.Y).q1;
                if(!d0.j(((Function0)object0))) {
                    d0.c(((Function0)object0));
                }
                return t.a;
            }
            case 7: {
                int v = ((l0.b)object0).a;
                AndroidComposeView androidComposeView0 = (AndroidComposeView)this.Y;
                androidComposeView0.getClass();
                if(v != 7 && v != 8) {
                    Integer integer0 = l0.d.H(v);
                    if(integer0 == null) {
                        throw new IllegalStateException("Invalid focus direction");
                    }
                    int v1 = integer0.intValue();
                    c c0 = androidComposeView0.y();
                    if(c0 != null) {
                        rect0 = M.D(c0);
                    }
                    FocusFinder focusFinder0 = FocusFinder.getInstance();
                    View view0 = rect0 == null ? focusFinder0.findNextFocus(androidComposeView0, androidComposeView0.findFocus(), v1) : focusFinder0.findNextFocusFromRect(androidComposeView0, rect0, v1);
                    return view0 == null ? Boolean.valueOf(false) : Boolean.valueOf(l0.d.D(view0, v1, rect0));
                }
                return Boolean.valueOf(false);
            }
            case 8: {
                ((T)this.Y).getClass();
                H h0 = new H(((T)this.Y), ((SignupSuccess)object0), null);
                N.k(((T)this.Y), ((T)this.Y).g0, true, h0);
                return t.a;
            }
            case 9: {
                KeyEvent keyEvent0 = ((x0.b)object0).a;
                C0 c00 = (C0)this.Y;
                c00.getClass();
                if(keyEvent0.getAction() != 0 || Character.isISOControl(keyEvent0.getUnicodeChar())) {
                    object7 = null;
                }
                else {
                    W w0 = c00.i;
                    w0.getClass();
                    int v2 = keyEvent0.getUnicodeChar();
                    if((0x80000000 & v2) == 0) {
                        Integer integer2 = w0.a;
                        if(integer2 == null) {
                            integer1 = v2;
                        }
                        else {
                            w0.a = null;
                            int v3 = KeyCharacterMap.getDeadChar(((int)integer2), v2);
                            integer1 = v3 == 0 ? null : v3;
                            if(integer1 == null) {
                                integer1 = v2;
                            }
                        }
                    }
                    else {
                        w0.a = (int)(v2 & 0x7FFFFFFF);
                        integer1 = null;
                    }
                    object7 = integer1 == null ? null : new U0.a(new StringBuilder().appendCodePoint(((int)integer1)).toString(), 1);
                }
                t0 t00 = c00.f;
                boolean z3 = c00.d;
                if(object7 != null) {
                    if(z3) {
                        c00.a(Bb.q.K(object7));
                        t00.a = null;
                        return Boolean.valueOf(true);
                    }
                }
                else if(f.u(F.C(keyEvent0), 2)) {
                    int v4 = c00.j.a(keyEvent0);
                    if(v4 != 0) {
                        switch(v4) {
                            case 1: 
                            case 2: 
                            case 3: 
                            case 4: 
                            case 5: 
                            case 6: 
                            case 7: 
                            case 8: 
                            case 9: 
                            case 10: 
                            case 11: 
                            case 12: 
                            case 13: 
                            case 14: 
                            case 15: 
                            case 16: 
                            case 17: 
                            case 26: 
                            case 27: 
                            case 28: 
                            case 29: 
                            case 30: 
                            case 0x1F: 
                            case 0x20: 
                            case 33: 
                            case 34: 
                            case 35: 
                            case 36: 
                            case 37: 
                            case 38: 
                            case 39: 
                            case 40: 
                            case 41: 
                            case 42: 
                            case 43: {
                                z4 = false;
                                break;
                            }
                            case 18: 
                            case 19: 
                            case 20: 
                            case 21: 
                            case 22: 
                            case 23: 
                            case 24: 
                            case 25: 
                            case 44: 
                            case 45: 
                            case 46: 
                            case 0x2F: 
                            case 0x30: {
                                z4 = true;
                                break;
                            }
                            default: {
                                throw null;
                            }
                        }
                        if(!z4 || z3) {
                            Nb.s s2 = new Nb.s();  // initializer: Ljava/lang/Object;-><init>()V
                            s2.X = true;
                            I.B0 b04 = new I.B0(v4, c00, s2);
                            I.P0 p01 = c00.a.d();
                            B b3 = c00.c;
                            m0 m00 = new m0(b3, c00.g, p01, t00);
                            b04.n(m00);
                            if(!O0.N.a(m00.f, b3.b) || !j.a(m00.g, b3.a)) {
                                B b4 = B.a(b3, m00.g, m00.f, 4);
                                c00.k.n(b4);
                            }
                            X0 x00 = c00.h;
                            if(x00 != null) {
                                x00.f = true;
                            }
                            z = s2.X;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
            case 10: {
                j.f(((t1)object0), "p0");
                return ((B9.b)this.Y).d(((t1)object0));
            }
            case 11: {
                float f = ((Number)object0).floatValue();
                n n0 = (n)this.Y;
                float f1 = 0.0f;
                if(!n0.b()) {
                    float f2 = J.m(n0.f.k() + f, 0.0f);
                    float f3 = n0.f.k();
                    n0.f.m(f2);
                    float f4 = n0.a();
                    ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState0 = n0.g;
                    if(f4 <= parcelableSnapshotMutableFloatState0.k()) {
                        f5 = n0.a();
                    }
                    else {
                        float f6 = Math.abs(n0.a() / parcelableSnapshotMutableFloatState0.k());
                        if(f6 - 1.0f >= 0.0f) {
                            f1 = f6 - 1.0f;
                        }
                        if(f1 > 2.0f) {
                            f1 = 2.0f;
                        }
                        f5 = parcelableSnapshotMutableFloatState0.k() * (f1 - ((float)Math.pow(f1, 2.0)) / 4.0f) + parcelableSnapshotMutableFloatState0.k();
                    }
                    n0.e.m(f5);
                    f1 = f2 - f3;
                }
                return f1;
            }
            case 12: {
                j.f(((String)object0), "p0");
                Y y0 = (Y)this.Y;
                y0.getClass();
                do {
                    Object object8 = y0.g0.getValue();
                    j.f(((A)object8), "$this$updateState");
                    A a0 = A.a(((A)object8), ((String)object0), null, null, null, false, null, 62);
                    hd.c.a.n("Transactions");
                    hd.c.a.a("update() called with: newState = " + a0, new Object[0]);
                }
                while(!y0.g0.j(object8, a0));
                return t.a;
            }
            case 13: {
                j.f(((e)object0), "p0");
                ((Y)this.Y).getClass();
                r r0 = new r(((e)object0), 4, ((Y)this.Y));
                ((Y)this.Y).q(r0);
                return t.a;
            }
            case 14: {
                j.f(((Qa.c)object0), "p0");
                Y y1 = (Y)this.Y;
                y1.getClass();
                B0 b05 = y1.g0;
                Ab.k k0 = ((A)b05.getValue()).f;
                if((k0 == null ? null : ((W0)k0.Y)) == W0.Y) {
                    Ab.k k1 = ((A)b05.getValue()).f;
                    if(k1 != null) {
                        Qa.c c1 = (Qa.c)k1.X;
                        if(c1 != null) {
                            rect0 = c1.a;
                        }
                    }
                    return Boolean.valueOf(j.a(rect0, ((Qa.c)object0).a));
                }
                I i0 = new I(y1, ((Qa.c)object0), null);
                N.k(y1, y1.f0, true, i0);
                return Boolean.valueOf(true);
            }
            case 15: {
                j.f(((V8)object0), "p0");
                ((y3)this.Y).getClass();
                t3 t30 = new t3(((y3)this.Y), ((V8)object0), null);
                return N.k(((y3)this.Y), ((y3)this.Y).g0, false, t30);
            }
            case 16: {
                d0 d01 = (d0)this.Y;
                I0 i00 = (I0)d01.i0.b0;
                if(i00 != null) {
                    i00.f(null);
                }
                d01.h0.i();
                if(((String)object0) != null) {
                    Q q0 = d01.i0;
                    q0.getClass();
                    I0 i01 = (I0)q0.b0;
                    if(i01 != null) {
                        i01.f(null);
                    }
                    x x0 = new x(q0, ((String)object0), null);
                    q0.b0 = Xb.J.q(((CloseableCoroutineScope)q0.Y), null, null, x0, 3);
                }
                return t.a;
            }
            case 17: {
                j.f(((String)object0), "p0");
                ((d0)this.Y).c(((String)object0));
                return t.a;
            }
            case 18: {
                j.f(((String)object0), "p0");
                ((d0)this.Y).getClass();
                return ((d0)this.Y).b0.a(((String)object0));
            }
            case 19: {
                j.f(((AnnouncementFragment)object0), "p0");
                d0 d02 = (d0)this.Y;
                d02.getClass();
                R2.m m0 = q9.o0.p(((AnnouncementFragment)object0).j);
                V8.c c2 = d02.c0;
                if(m0 != null) {
                    String s3 = ((AnnouncementFragment)object0).getId();
                    j.f(s3, "announcementId");
                    N.j(d02, c2, true, new q9.Q(d02, m0, s3, ((AnnouncementFragment)object0).i, null));
                    return t.a;
                }
                String s4 = ((AnnouncementFragment)object0).f;
                if(s4 != null) {
                    String s5 = ((AnnouncementFragment)object0).getId();
                    j.f(s5, "sourceAnnouncementId");
                    N.j(d02, c2, true, new q9.S(d02, s5, Uri.parse(s4), s4, null));
                }
                return t.a;
            }
            case 20: {
                ((n0)this.Y).c(((Throwable)object0));
                return t.a;
            }
            case 21: {
                j.f(((String)object0), "p0");
                d0 d03 = (d0)this.Y;
                d03.getClass();
                r9.a a1 = d03.f0;
                if(a1 != null) {
                    ((SharedPreferences)a1.a.c).edit().putLong(((String)object0), System.currentTimeMillis()).apply();
                    d03.e0.a(SEEN.X, ((String)object0));
                }
                return t.a;
            }
            case 22: {
                float f7 = ((Number)object0).floatValue();
                return ((w0)this.Y).a(f7);
            }
            case 23: {
                float f8 = ((Number)object0).floatValue();
                return ((w0)this.Y).a(f8);
            }
            case 24: {
                d1.m m1 = (d1.m)this.Y;
                m1.getClass();
                View view1 = d1.j.c(m1);
                return !view1.isFocused() && !view1.hasFocus() && !l0.d.D(view1, l0.d.H(((l0.b)object0).a), d1.j.b(F0.f.w(m1).getFocusOwner(), ((View)F0.f.w(m1)), view1)) ? l0.m.c : l0.m.b;
            }
            case 25: {
                int v5 = ((l0.b)object0).a;
                d1.m m2 = (d1.m)this.Y;
                m2.getClass();
                View view2 = d1.j.c(m2);
                if(!view2.hasFocus()) {
                    return l0.m.b;
                }
                FocusOwner focusOwner0 = F0.f.w(m2).getFocusOwner();
                View view3 = (View)F0.f.w(m2);
                if(!(view2 instanceof ViewGroup)) {
                    if(!view3.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                    return l0.m.b;
                }
                Rect rect1 = d1.j.b(focusOwner0, view3, view2);
                Integer integer3 = l0.d.H(v5);
                int v6 = integer3 == null ? 130 : ((int)integer3);
                FocusFinder focusFinder1 = FocusFinder.getInstance();
                View view4 = m2.l0;
                View view5 = view4 == null ? focusFinder1.findNextFocusFromRect(((ViewGroup)view3), rect1, v6) : focusFinder1.findNextFocus(((ViewGroup)view3), view4, v6);
                if(view5 != null && d1.j.a(view2, view5)) {
                    view5.requestFocus(v6, rect1);
                    return l0.m.c;
                }
                if(!view3.requestFocus()) {
                    throw new IllegalStateException("host view did not take focus");
                }
                return l0.m.b;
            }
            case 26: {
                j.f(((String)object0), "p0");
                return ((v)this.Y).a(((String)object0));
            }
            case 27: {
                j.f(((Qa.c)object0), "p0");
                S2 s20 = (S2)this.Y;
                s20.getClass();
                B0 b06 = s20.r1;
                Ab.k k2 = (Ab.k)b06.getValue();
                if((k2 == null ? null : ((W0)k2.Y)) == W0.Y) {
                    Ab.k k3 = (Ab.k)b06.getValue();
                    if(k3 != null) {
                        Qa.c c3 = (Qa.c)k3.X;
                        if(c3 != null) {
                            rect0 = c3.a;
                        }
                    }
                    return Boolean.valueOf(j.a(rect0, ((Qa.c)object0).a));
                }
                V0 v00 = new V0(s20, ((Qa.c)object0), null);
                N.k(s20, s20.r0, true, v00);
                return Boolean.valueOf(true);
            }
            case 28: {
                j.f(((F2)object0), "p0");
                ((S2)this.Y).getClass();
                d0 d04 = ((S2)this.Y).y0;
                d04.getClass();
                E2 e20 = ((F2)object0).c;
                if(e20 != null) {
                    d04.e0.a(TAPPED.X, ((F2)object0).a);
                    O o0 = new O(d04, e20.a, null);
                    N.j(d04, d04.c0, true, o0);
                }
                return t.a;
            }
            default: {
                j.f(((F2)object0), "p0");
                ((S2)this.Y).getClass();
                d0 d00 = ((S2)this.Y).y0;
                d00.getClass();
                String s = ((F2)object0).a;
                if(d00.j0.add(s)) {
                    d00.e0.a(SEEN.X, s);
                }
                return t.a;
            }
        }
    }
}

