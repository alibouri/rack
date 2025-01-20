package ca;

import Nb.j;
import R1.g;
import W4.f;
import Y8.N;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.textfield.TextInputLayout;
import fa.c;
import j9.a;
import ma.p;
import o9.X;
import o9.r;
import p9.c0;
import p9.j0;
import q9.U0;

public final class t extends g implements c, a {
    public final int q;
    public long r;
    public Object s;
    public Object t;
    public Object u;

    public t(R1.c c0, View view0, View view1, int v) {
        this.q = v;
        super(c0, view0, 0);
        this.s = view1;
    }

    public t(R1.c c0, View view0, AppCompatImageView appCompatImageView0, TextView textView0) {
        this.q = 3;
        super(c0, view0, 0);
        this.t = appCompatImageView0;
        this.s = textView0;
    }

    public t(View view0, int v) {
        this.q = v;
        switch(v) {
            case 1: {
                Object[] arr_object = g.l(view0, 2, null, null);
                super(null, view0, 0);
                this.r = -1L;
                ((LinearLayout)arr_object[0]).setTag(null);
                this.t = (LinearLayout)arr_object[1];
                ((LinearLayout)arr_object[1]).setTag(null);
                this.s(view0);
                this.u = new M9.c(1, 2, this);
                this.j();
                return;
            }
            case 2: {
                Object[] arr_object1 = g.l(view0, 3, null, null);
                this(null, view0, ((TextInputLayout)arr_object1[1]), 2);
                this.r = -1L;
                ((TextInputLayout)this.s).setTag(null);
                ((FrameLayout)arr_object1[0]).setTag(null);
                this.u = (EditText)arr_object1[2];
                ((EditText)arr_object1[2]).setTag(null);
                this.s(view0);
                this.j();
                return;
            }
            default: {
                this(null, view0, ((TextView)g.l(view0, 1, null, null)[0]), 0);
                this.r = -1L;
                ((TextView)this.s).setTag(null);
                this.s(view0);
                this.u = new M9.c(1, 1, this);
                this.j();
            }
        }
    }

    private final void A() {
        synchronized(this) {
            this.r = 2L;
        }
        this.o();
    }

    private final void B() {
        synchronized(this) {
            this.r = 2L;
        }
        this.o();
    }

    private final void C() {
        synchronized(this) {
            this.r = 2L;
        }
        this.o();
    }

    private final boolean D(int v, Object object0) {
        if(16 == v) {
            this.t = (p)object0;
            synchronized(this) {
                this.r |= 1L;
            }
            this.o();
            return true;
        }
        return false;
    }

    private final boolean E(int v, Object object0) {
        if(16 == v) {
            this.s = (j0)object0;
            synchronized(this) {
                this.r |= 1L;
            }
            this.o();
            return true;
        }
        return false;
    }

    private final boolean F(int v, Object object0) {
        if(16 == v) {
            this.t = (r)object0;
            synchronized(this) {
                this.r |= 1L;
            }
            this.o();
            return true;
        }
        return false;
    }

    @Override  // fa.c, j9.a
    public void a(View view0, int v) {
        if(this.q != 0) {
            j0 j00 = (j0)this.s;
            if(j00 != null) {
                c0 c00 = new c0(j00, null);
                N.k(j00, j00.b0, true, c00);
            }
            return;
        }
        p p0 = (p)this.t;
        if(p0 != null) {
            ma.g g0 = new ma.g(p0, null);
            N.k(p0, p0.b0, true, g0);
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        int v1;
        switch(this.q) {
            case 0: {
                this.u();
                return;
            }
            case 1: {
                this.v();
                return;
            }
            case 2: {
                this.w();
                return;
            }
            default: {
                synchronized(this) {
                    v = this.r;
                    this.r = 0L;
                }
                X x0 = (X)this.u;
                if(Long.compare(v & 3L, 0L) == 0) {
                    v1 = 0;
                }
                else {
                    v1 = x0 == null ? 0 : x0.k0;
                    v |= 4L;
                }
                String s = null;
                String s1 = Long.compare(v & 4L, 0L) == 0 || x0 == null ? null : ((String)x0.o0.a(X.D0[0], x0));
                int v2 = Long.compare(v & 3L, 0L);
                if(v2 != 0) {
                    s = s1;
                }
                if(v2 != 0) {
                    AppCompatImageView appCompatImageView0 = (AppCompatImageView)this.t;
                    j.f(appCompatImageView0, "<this>");
                    appCompatImageView0.setImageResource(v1);
                    f.M(((TextView)this.s), s);
                }
            }
        }
    }

    @Override  // R1.g
    public final boolean i() {
        switch(this.q) {
            case 0: {
                return this.x();
            }
            case 1: {
                return this.y();
            }
            case 2: {
                return this.z();
            }
            default: {
                synchronized(this) {
                    if(this.r != 0L) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @Override  // R1.g
    public final void j() {
        switch(this.q) {
            case 0: {
                this.A();
                return;
            }
            case 1: {
                this.B();
                return;
            }
            case 2: {
                this.C();
                return;
            }
            default: {
                synchronized(this) {
                    this.r = 2L;
                }
                this.o();
            }
        }
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        switch(this.q) {
            case 0: {
                return false;
            }
            case 1: {
                return false;
            }
            case 2: {
                return false;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        switch(this.q) {
            case 0: {
                return this.D(v, object0);
            }
            case 1: {
                return this.E(v, object0);
            }
            case 2: {
                return this.F(v, object0);
            }
            default: {
                if(16 == v) {
                    this.u = (X)object0;
                    synchronized(this) {
                        this.r |= 1L;
                    }
                    this.o();
                    return true;
                }
                return false;
            }
        }
    }

    private final void u() {
        synchronized(this) {
            long v = this.r;
            this.r = 0L;
        }
        if((v & 2L) != 0L) {
            ((TextView)this.s).setOnClickListener(((M9.c)this.u));
        }
    }

    private final void v() {
        synchronized(this) {
            long v = this.r;
            this.r = 0L;
        }
        if((v & 2L) != 0L) {
            ((LinearLayout)this.t).setOnClickListener(((M9.c)this.u));
        }
    }

    private final void w() {
        long v;
        String s1;
        int v2;
        String s;
        synchronized(this) {
            v = this.r;
            this.r = 0L;
        }
        r r0 = (r)this.t;
        int v1 = Long.compare(v & 3L, 0L);
        if(v1 == 0 || r0 == null) {
            s = null;
            v2 = 0;
            s1 = null;
        }
        else {
            s = r0.Z.c;
            v2 = r0.c0;
            s1 = r0.c();
        }
        if(v1 != 0) {
            ((TextInputLayout)this.s).setHint(s);
            f.M(((EditText)this.u), s1);
            U0.m(((EditText)this.u), v2);
        }
    }

    private final boolean x() {
        synchronized(this) {
            if(this.r != 0L) {
                return true;
            }
        }
        return false;
    }

    private final boolean y() {
        synchronized(this) {
            if(this.r != 0L) {
                return true;
            }
        }
        return false;
    }

    private final boolean z() {
        synchronized(this) {
            if(this.r != 0L) {
                return true;
            }
        }
        return false;
    }
}

