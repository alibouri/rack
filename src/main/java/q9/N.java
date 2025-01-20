package q9;

import Eb.a;
import Fb.c;
import H9.d;
import N2.l;
import Nb.j;
import Vb.q;
import W5.f;
import Y2.m;
import a8.Q;
import ac.e0;
import ac.o0;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.sendwave.backend.fragment.PayableWalletFragment;
import i3.e;
import i3.h;
import i3.i;
import i3.p;

public final class n {
    public final Context a;

    public n(Context context0) {
        this.a = context0;
        super();
    }

    public String a(String s) {
        j.f(s, "url");
        if(q.O(s, "/", false)) {
            String s1 = this.b();
            String s2 = s.substring(1);
            j.e(s2, "substring(...)");
            return s1 + s2;
        }
        return s;
    }

    public String b() {
        d d0 = r1.b(this.a).b0;
        if(d0 != null) {
            return d0.k;
        }
        j.p("apolloDi");
        throw null;
    }

    public String c(PayableWalletFragment payableWalletFragment0) {
        j.f(payableWalletFragment0, "pwf");
        return payableWalletFragment0.n == null ? this.d(payableWalletFragment0.c) : payableWalletFragment0.n;
    }

    public String d(String s) {
        return s == null ? null : this.b() + "/static/billpay/" + this.f() + "/logo_" + s + ".png";
    }

    public Object e(String s, c c0) {
        n n0;
        m0 m00;
        if(c0 instanceof m0) {
            m00 = (m0)c0;
            int v = m00.f0;
            if((v & 0x80000000) == 0) {
                m00 = new m0(this, c0);
            }
            else {
                m00.f0 = v ^ 0x80000000;
            }
        }
        else {
            m00 = new m0(this, c0);
        }
        Object object0 = m00.d0;
        Object object1 = a.X;
        switch(m00.f0) {
            case 0: {
                f.b0(object0);
                h h0 = new h(this.a);
                h0.c = this.a(s);
                i i0 = h0.a();
                m m0 = Y2.a.a(this.a);
                m00.b0 = this;
                m00.c0 = s;
                m00.f0 = 1;
                object0 = m0.c(i0, m00);
                if(object0 == object1) {
                    return object1;
                }
                n0 = this;
                break;
            }
            case 1: {
                s = m00.c0;
                n0 = m00.b0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((i3.j)object0) instanceof p) {
            hd.c.a.n("AssetLoader");
            hd.c.a.a("Posting value", new Object[0]);
            n0.getClass();
            j.d(((p)(((i3.j)object0))).a, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            return ((BitmapDrawable)((p)(((i3.j)object0))).a).getBitmap();
        }
        if(!(((i3.j)object0) instanceof e)) {
            throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        n0.getClass();
        n.i(s, ((e)(((i3.j)object0))).c);
        return null;
    }

    public String f() {
        int v = this.a.getResources().getDisplayMetrics().densityDpi;
        if(v >= 0 && v < 0x79) {
            return "ldpi";
        }
        if(120 <= v && v < 0xA1) {
            return "mdpi";
        }
        if(0xA0 <= v && v < 0xF1) {
            return "hdpi";
        }
        if(0xF0 <= v && v < 321) {
            return "xhdpi";
        }
        if(320 <= v && v < 481) {
            return "xxhdpi";
        }
        return 480 > v || v >= 641 ? "xhdpi" : "xxxhdpi";
    }

    public Na.f g(int v, String s) {
        Drawable drawable0 = this.a.getDrawable(v);
        return s == null ? new Na.f(5, new l(4, drawable0)) : new Na.f(5, new e0(o0.n(new l(new l0(this, s, null))), drawable0, this, 2));
    }

    public String h(String s) {
        return s == null ? null : this.b() + "/static/linked-account/" + this.f() + "/logo_" + s + ".png";
    }

    public static void i(String s, Throwable throwable0) {
        hd.c.a.n("AssetLoader");
        hd.c.a.a("There was an error fetching " + s + ": " + throwable0.getLocalizedMessage(), new Object[0]);
    }

    public void j(String s) {
        j.f(s, "imageUrl");
        h h0 = new h(this.a);
        h0.c = this.a(s);
        h0.e = new Q(this, s, s, 22);
        i i0 = h0.a();
        Y2.a.a(this.a).b(i0);
    }
}

