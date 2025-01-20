package E7;

import Bb.r;
import C9.f;
import J1.o;
import J3.b;
import M4.B;
import M4.q;
import M4.x;
import N4.n;
import Nb.j;
import T7.t;
import T9.c;
import a5.g;
import a5.m;
import a5.p;
import a5.w;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import androidx.core.view.WindowInsetsCompat;
import com.google.firebase.perf.FirebasePerfRegistrar;
import io.sentry.hints.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import m7.e;
import o6.a;
import o6.h;
import org.json.JSONException;
import pc.v;

public final class l implements o, b, c, g, e, o5.e, a, u7.a {
    public final int X;

    public l(int v) {
        this.X = v;
        super();
    }

    @Override  // T9.c
    public String a(f f0) {
        j.f(f0, "property");
        if(f0 instanceof C9.e) {
            return "currency";
        }
        return f0 instanceof C9.c ? "value" : null;
    }

    @Override  // o5.e
    public Object apply(Object object0) {
        switch(this.X) {
            case 3: {
                F7.e e0 = (F7.e)object0;
                y.a.getClass();
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                try {
                    y.a.k(e0, byteArrayOutputStream0);
                }
                catch(IOException unused_ex) {
                }
                return byteArrayOutputStream0.toByteArray();
            }
            case 26: {
                if(((List)object0) != null) {
                    Object object1 = new ArrayList(r.b0(((List)object0)));
                    for(Object object2: ((List)object0)) {
                        ((ArrayList)object1).add(((R2.o)object2).a());
                    }
                    return object1;
                }
                return null;
            }
            default: {
                t t0 = (t)object0;
                try {
                    int v = t0.h(null);
                    byte[] arr_b = new byte[v];
                    com.google.protobuf.f f0 = new com.google.protobuf.f(v, arr_b);
                    t0.i(f0);
                    if(v - f0.f != 0) {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                    return arr_b;
                }
                catch(IOException iOException0) {
                    throw new RuntimeException("Serializing " + t.class.getName() + " to a byte array threw an IOException (should never happen).", iOException0);
                }
            }
        }
    }

    @Override  // m7.e
    public Object d(C c0) {
        return FirebasePerfRegistrar.providesFirebasePerformance(c0);
    }

    @Override  // J3.b
    public Object get() {
        return new v();
    }

    @Override  // o6.a
    public Object j(h h0) {
        return this.X == 0 ? 403 : -1;
    }

    @Override  // a5.g
    public void k(boolean z) {
        U4.a a0;
        U4.c c0;
        M4.y y0;
        switch(this.X) {
            case 9: {
                if(z && B.c()) {
                    a5.j.a(new T9.b(17), a5.h.v0);
                    a5.j.a(new T9.b(18), a5.h.y0);
                    a5.j.a(new T9.b(19), a5.h.z0);
                }
                return;
            }
            case 10: {
                if(z) {
                    Class class1 = N4.o.class;
                    if(!f5.a.b(class1)) {
                        try {
                            n n0 = new n();  // initializer: Ljava/lang/Object;-><init>()V
                            p.e.add(n0);
                            p.d();
                            return;
                        }
                        catch(Throwable throwable1) {
                            f5.a.a(throwable1, class1);
                        }
                    }
                }
                return;
            }
            case 11: {
                return;
            }
            case 12: {
                if(z) {
                    Class class2 = O4.a.class;
                    if(!f5.a.b(class2)) {
                        try {
                            M4.l.c().execute(new N4.c(4));
                            return;
                        }
                        catch(Exception unused_ex) {
                            return;
                        }
                        catch(Throwable throwable2) {
                            f5.a.a(throwable2, class2);
                        }
                    }
                }
                return;
            }
            case 13: {
                if(z) {
                    Class class3 = U4.g.class;
                    if(!f5.a.b(class3)) {
                        try {
                            U4.g.a.a();
                            if((U4.g.c == null || U4.g.c.isEmpty()) && (U4.g.d != null || U4.g.d.isEmpty())) {
                                U4.g.b = false;
                                return;
                            }
                            U4.g.b = true;
                            return;
                        }
                        catch(Throwable throwable3) {
                        }
                        f5.a.a(throwable3, class3);
                    }
                }
                return;
            }
            case 14: {
                if(z) {
                    try {
                        y0 = M4.y.b0;
                        q q0 = new q(1);
                        M4.t t0 = new M4.t(null, j.m("/cloudbridge_settings", M4.l.b()), null, x.X, q0);
                        i.D(y0, "P4.c", " \n\nCreating Graph Request: \n=============\n%s\n\n ", new Object[]{t0});
                        t0.d();
                        return;
                    }
                    catch(JSONException jSONException0) {
                        i.D(y0, "P4.c", " \n\nGraph Request Exception: \n=============\n%s\n\n ", new Object[]{U5.a.U(jSONException0)});
                    }
                }
                return;
            }
            case 15: {
                if(z) {
                    Class class4 = Y4.b.class;
                    if(!f5.a.b(class4)) {
                        try {
                            Y4.b.b = true;
                            Y4.b.a.b();
                            return;
                        }
                        catch(Throwable throwable4) {
                            f5.a.a(throwable4, class4);
                        }
                    }
                }
                return;
            }
            case 16: {
                if(z) {
                    Class class5 = W4.e.class;
                    if(!f5.a.b(class5)) {
                        try {
                            w.g0(new N4.c(11));
                            return;
                        }
                        catch(Throwable throwable5) {
                            f5.a.a(throwable5, class5);
                        }
                    }
                }
                return;
            }
            case 17: {
                if(z) {
                    Class class6 = S4.b.class;
                    if(!f5.a.b(class6)) {
                        try {
                            S4.b.b = true;
                            S4.b.a.a();
                            return;
                        }
                        catch(Throwable throwable6) {
                            f5.a.a(throwable6, class6);
                        }
                    }
                }
                return;
            }
            case 18: {
                if(z) {
                    Class class7 = T4.j.class;
                    if(!f5.a.b(class7)) {
                        try {
                            T4.j.b.set(true);
                            T4.j.a();
                            return;
                        }
                        catch(Throwable throwable7) {
                            f5.a.a(throwable7, class7);
                        }
                    }
                }
                return;
            }
            case 19: {
                if(z) {
                    Class class8 = U4.e.class;
                    if(!f5.a.b(class8)) {
                        try {
                            U4.e.b = true;
                            U4.e.a.a();
                            return;
                        }
                        catch(Throwable throwable8) {
                            f5.a.a(throwable8, class8);
                        }
                    }
                }
                return;
            }
            case 20: {
                if(z) {
                    Class class9 = U4.c.class;
                    if(!f5.a.b(class9)) {
                        try {
                            c0 = U4.c.a;
                            if(!f5.a.b(c0)) {
                                goto label_107;
                            }
                            goto label_113;
                        }
                        catch(Throwable throwable9) {
                            f5.a.a(throwable9, class9);
                            return;
                        }
                        try {
                        label_107:
                            m m0 = p.h(M4.l.b(), false);
                            if(m0 != null) {
                                U4.c.c = m0.m;
                            }
                            goto label_113;
                        }
                        catch(Throwable throwable10) {
                            try {
                                f5.a.a(throwable10, c0);
                            label_113:
                                if(U4.c.c != null) {
                                    U4.c.b = true;
                                    return;
                                }
                                return;
                            }
                            catch(Throwable throwable9) {
                            }
                        }
                        f5.a.a(throwable9, class9);
                    }
                }
                return;
            }
            case 21: {
                if(z) {
                    Class class10 = U4.a.class;
                    if(!f5.a.b(class10)) {
                        try {
                            a0 = U4.a.a;
                            if(!f5.a.b(a0)) {
                                goto label_124;
                            }
                            goto label_132;
                        }
                        catch(Throwable throwable11) {
                            f5.a.a(throwable11, class10);
                            return;
                        }
                        try {
                        label_124:
                            m m1 = p.h(M4.l.b(), false);
                            if(m1 != null) {
                                HashSet hashSet0 = w.s(m1.n);
                                if(hashSet0 != null) {
                                    U4.a.c = hashSet0;
                                }
                            }
                            goto label_132;
                        }
                        catch(Throwable throwable12) {
                            try {
                                f5.a.a(throwable12, a0);
                            label_132:
                                if(U4.a.c != null && !U4.a.c.isEmpty()) {
                                    U4.a.b = true;
                                    return;
                                }
                                return;
                            }
                            catch(Throwable throwable11) {
                            }
                        }
                        f5.a.a(throwable11, class10);
                    }
                }
                return;
            }
            default: {
                if(z) {
                    Class class0 = U4.f.class;
                    if(!f5.a.b(class0)) {
                        try {
                            U4.f.a.a();
                            if(!U4.f.c.isEmpty()) {
                                U4.f.b = true;
                            }
                        }
                        catch(Throwable throwable0) {
                            f5.a.a(throwable0, class0);
                        }
                    }
                }
            }
        }
    }

    @Override  // J1.o
    public WindowInsetsCompat l(View view0, WindowInsetsCompat windowInsetsCompat0) {
        j.f(view0, "view");
        z1.b b0 = windowInsetsCompat0.a.f(7);
        j.e(b0, "getInsets(...)");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).leftMargin = b0.a;
        ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).topMargin = b0.b;
        ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).rightMargin = b0.c;
        ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).bottomMargin = b0.d;
        view0.setLayoutParams(((FrameLayout.LayoutParams)viewGroup$LayoutParams0));
        return windowInsetsCompat0;
    }
}

